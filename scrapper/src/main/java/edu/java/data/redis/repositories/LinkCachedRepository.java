package edu.java.data.redis.repositories;

import com.redis.om.spring.repository.RedisDocumentRepository;
import edu.java.data.redis.documents.CachedLink;
import java.util.Optional;

public interface LinkCachedRepository extends RedisDocumentRepository<CachedLink, String> {
    Optional<CachedLink> findByHashedUrl(String hashedUrl);
}
