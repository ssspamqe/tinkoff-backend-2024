package edu.java.dao.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.dao.redis.documents.TelegramChatLink;
import java.util.List;

public interface TelegramChatLinkCachedRepository extends RedisDocumentRepository<TelegramChatLink, String> {
    List<TelegramChatLink> findAllByChatId(String chatId);

    List<TelegramChatLink> findAllByLinkId(String linkId);

    void removeByChatIdAndLinkId(String chatId, String linkId);
}
