package edu.java.data.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("Link") 
public record Link(
    @Id
    long id,
    @Indexed
    String url
) {
}
