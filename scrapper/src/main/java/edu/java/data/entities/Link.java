package edu.java.data.entities;

import org.springframework.data.redis.core.RedisHash;
import java.net.URI;
import java.util.UUID;

@RedisHash("Link")
public record Link(
    long id,
    String url
) {
}
