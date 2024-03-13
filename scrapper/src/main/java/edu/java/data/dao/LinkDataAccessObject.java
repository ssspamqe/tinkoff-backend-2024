package edu.java.data.dao;

import edu.java.data.postgres.entities.Link;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

public interface LinkDataAccessObject {

    Optional<Link> findByUrl(String url);

    Optional<Link> findById(long id);

    Link saveOrFindByUrl(String url);

    Collection<Link> findByLastCheckDelayFromNow(Duration duration);

    void updateLastCheckedById(long id);

    void updateLastCheckedById(Collection<Long> ids);

    void updateLastCheckedById(long id, LocalDateTime lastChecked);

    void updateLastCheckedById(Collection<Long> ids, LocalDateTime lastChecked);
}
