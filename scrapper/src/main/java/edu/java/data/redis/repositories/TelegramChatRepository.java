package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.TelegramChat;
import java.util.Optional;

public interface TelegramChatRepository extends RedisDocumentRepository<TelegramChat, String> {
    Optional<TelegramChat> findByApiId(long id);
}

