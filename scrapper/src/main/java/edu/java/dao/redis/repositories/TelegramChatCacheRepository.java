package edu.java.dao.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.dao.redis.documents.TelegramChat;
import java.util.Optional;

public interface TelegramChatCacheRepository extends RedisDocumentRepository<TelegramChat, String> {
    Optional<TelegramChat> findByApiId(long id);
}

