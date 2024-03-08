package edu.java.dao.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.dao.redis.documents.Link;
import java.util.Optional;

public interface LinkCachedRepository extends RedisDocumentRepository<Link, String> {
    Optional<Link> findByHashedUrl(String hashedUrl);
}
