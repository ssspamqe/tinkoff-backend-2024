package edu.java.data.entities;

import java.time.LocalDateTime;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Chat")
public record Chat(
    long id,
    LocalDateTime registrationDate
) {
}
