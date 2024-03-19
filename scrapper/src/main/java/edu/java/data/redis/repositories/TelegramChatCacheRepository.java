package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.CachedTelegramChat;
import java.util.Optional;

public interface TelegramChatCacheRepository extends RedisDocumentRepository<CachedTelegramChat, String> {
    Optional<CachedTelegramChat> findByApiId(long id);
}

