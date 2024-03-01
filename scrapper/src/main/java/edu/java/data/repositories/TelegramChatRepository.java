package edu.java.data.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.models.TelegramChat;

public interface TelegramChatRepository extends RedisDocumentRepository<TelegramChat, Long> {
}

