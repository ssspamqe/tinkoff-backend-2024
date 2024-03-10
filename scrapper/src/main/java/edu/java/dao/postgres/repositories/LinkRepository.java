package edu.java.dao.postgres.repositories;

import edu.java.dao.postgres.entities.Link;
import java.util.Optional;

public interface LinkRepository {

    void save(Link link);

    Optional<Link> findById(long id);

    Optional<Link> findByUrl(String url);

    void removeById(long id);
}
