package edu.java.data.dao;

import edu.java.data.postgres.entities.LinkEntity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

public interface LinkDataAccessObject {

    Optional<LinkEntity> findByUrl(String url);

    Optional<LinkEntity> findById(long id);

    LinkEntity saveOrFindByUrl(String url);

    Collection<LinkEntity> findByLastCheckDelayFromNow(Duration duration);

    void updateLastCheckedById(long id);

    void updateLastCheckedById(Collection<Long> ids);

    void updateLastCheckedById(long id, LocalDateTime lastChecked);

    void updateLastCheckedById(Collection<Long> ids, LocalDateTime lastChecked);
}
