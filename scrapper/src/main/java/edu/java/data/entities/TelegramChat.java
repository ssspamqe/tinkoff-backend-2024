package edu.java.data.entities;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("TelegramChat")
public record TelegramChat(
    UUID id,
    long telegramChatId,
    LocalDateTime registrationDate
) {
}
