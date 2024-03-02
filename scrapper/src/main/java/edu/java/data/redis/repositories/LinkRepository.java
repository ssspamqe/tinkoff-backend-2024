package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.Link;

import java.util.Optional;

public interface LinkRepository extends RedisDocumentRepository<Link, Long> {
    Optional<Link> findByUrl(String url);
}
