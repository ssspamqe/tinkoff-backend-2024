package edu.java.data.repositories;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TelegramChatLinksRepository {

    private final RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public TelegramChatLinksRepository(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void addLinkToChat(long chatId, long linkId) {
        redisTemplate.opsForSet().add(STR."telegramChat_links:\{chatId}", linkId);
        redisTemplate.opsForSet().add(STR."link_telegramChats:\{linkId}", chatId);
    }

    public void removeLinkFromChat(long chatId, long linkId) {
        redisTemplate.opsForSet().remove(STR."telegramChat_links:\{chatId}", linkId);
        redisTemplate.opsForSet().remove(STR."link_telegramChats:\{linkId}", chatId);
    }

    public Set<Long> findAllLinksByChatId(long chatId) {
        return redisTemplate.opsForSet().members(STR."telegramChat_links:\{chatId}").stream()
            .map(item -> (long) item).collect(Collectors.toSet());
    }

    public Set<Long> findAllChatsByLinkId(long linkId) {
        return redisTemplate.opsForSet().members(STR."link_telegramChats:\{linkId}").stream()
            .map(item -> (long) item).collect(Collectors.toSet());
    }
}
