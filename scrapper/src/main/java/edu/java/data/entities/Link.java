package edu.java.data.entities;

import java.net.URI;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Link")
public record Link(
    long id,
    URI url
) {
}
