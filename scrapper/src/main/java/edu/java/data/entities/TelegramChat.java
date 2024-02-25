package edu.java.data.entities;

import java.time.LocalDateTime;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("TelegramChat")
public record TelegramChat(
    long id,
    LocalDateTime registrationDate
) {
}
