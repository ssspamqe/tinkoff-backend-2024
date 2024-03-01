package edu.java.data.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.models.Link;
import java.util.Optional;

public interface LinkRepository extends RedisDocumentRepository<Link, Long> {
    Optional<Link> findByUrl(String url);
}
