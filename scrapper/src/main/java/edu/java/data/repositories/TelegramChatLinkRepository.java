package edu.java.data.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.models.TelegramChatLink;
import java.util.List;

public interface TelegramChatLinkRepository extends RedisDocumentRepository<TelegramChatLink, Long> {
    List<TelegramChatLink> findAllByChatId(long chatId);

    List<TelegramChatLink> findAllByLinkId(long linkId);

    void removeByChatIdAndLinkId(long chatId, long linkId);
}
