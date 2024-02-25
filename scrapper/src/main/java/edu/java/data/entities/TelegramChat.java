package edu.java.data.entities;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("TelegramChat")
public record TelegramChat(
    @Id
    long id,
    @Indexed
    LocalDateTime registrationDate
) {
}
