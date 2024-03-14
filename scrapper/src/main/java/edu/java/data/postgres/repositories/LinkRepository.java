package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.LinkEntity;

import java.util.Collection;
import java.util.Optional;

public interface LinkRepository {
    LinkEntity save(LinkEntity linkEntity);

    Collection<LinkEntity> findByLastCheckDelayFromNowInSeconds(long seconds);

    void update(LinkEntity linkEntity);

    Optional<LinkEntity> findById(long id);

    Optional<LinkEntity> findByUrl(String url);

    boolean removeById(long id);
}
