package edu.java.data.repositories;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChatLinks {

    private final RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public ChatLinks(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void addLinkToChat(long chatId, long linkId) {
        redisTemplate.opsForSet().add(STR."chat_links:\{chatId}", linkId);
        redisTemplate.opsForSet().add(STR."link_chats:\{linkId}", chatId);
    }

    public Set<Long> getChatLinks(long chatId) {
        return redisTemplate.opsForSet().members(STR."chat_links:\{chatId}").stream()
            .map(item -> (Long) item).collect(Collectors.toSet());
    }

    public Set<Long> getChatsByLink(long linkId) {
        return redisTemplate.opsForSet().members(STR."link_chats:\{linkId}").stream()
            .map(item -> (Long) item).collect(Collectors.toSet());
    }
}
