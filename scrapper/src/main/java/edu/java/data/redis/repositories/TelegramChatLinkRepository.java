package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.TelegramChatLink;
import java.util.List;

public interface TelegramChatLinkRepository extends RedisDocumentRepository<TelegramChatLink, String> {
    List<TelegramChatLink> findAllByChatId(String chatId);

    List<TelegramChatLink> findAllByLinkId(String linkId);

    void removeByChatIdAndLinkId(String chatId, String linkId);
}
