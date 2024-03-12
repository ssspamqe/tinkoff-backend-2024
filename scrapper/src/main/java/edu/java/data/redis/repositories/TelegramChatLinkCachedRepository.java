package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.CachedTelegramChatLink;
import java.util.List;

public interface TelegramChatLinkCachedRepository extends RedisDocumentRepository<CachedTelegramChatLink, String> {
    List<CachedTelegramChatLink> findAllByChatId(String chatId);

    List<CachedTelegramChatLink> findAllByLinkId(String linkId);

    void removeByChatIdAndLinkId(String chatId, String linkId);
}
