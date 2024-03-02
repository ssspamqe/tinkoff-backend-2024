package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.TelegramChat;

public interface TelegramChatRepository extends RedisDocumentRepository<TelegramChat, Long> {
}

