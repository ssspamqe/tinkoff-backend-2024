package edu.java.data.repositories;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TelegramChatLinksRepository {

    private static final String CHAT_LINKS_KEY_PREFIX = "telegramChat_links";
    private static final String LINK_CHATS_KEY_PREFIX = "link_telegramChats";

    private final RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public TelegramChatLinksRepository(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void addLinkToChat(Long chatId, Long linkId) {
        redisTemplate.opsForSet().add(buildTelegramChatLinksKey(chatId), linkId);
        redisTemplate.opsForSet().add(buildLinksTelegramChatKey(linkId), chatId);
    }

    public void removeLinkFromChat(long chatId, long linkId) {
        redisTemplate.opsForSet().remove(buildTelegramChatLinksKey(chatId), linkId);
        redisTemplate.opsForSet().remove(buildLinksTelegramChatKey(linkId), chatId);
    }

    public Set<Long> findAllLinksByChatId(long chatId) {
        return redisTemplate.opsForSet().members(buildTelegramChatLinksKey(chatId)).stream()
            .map(item -> (long) item).collect(Collectors.toSet());

    }

    public Set<Long> findAllChatsByLinkId(long linkId) {
        return redisTemplate.opsForSet().members(buildLinksTelegramChatKey(linkId)).stream()
            .map(item -> (long) item).collect(Collectors.toSet());
    }

    private String buildTelegramChatLinksKey(long chatId) {
        return STR."\{CHAT_LINKS_KEY_PREFIX}:\{chatId}";
    }

    private String buildLinksTelegramChatKey(long linkId) {
        return STR."\{LINK_CHATS_KEY_PREFIX}:\{linkId}";
    }
}
