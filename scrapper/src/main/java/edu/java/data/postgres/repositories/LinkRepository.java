package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.Link;
import java.util.Optional;

public interface LinkRepository {
    Link save(Link link);

    Optional<Link> findById(long id);

    Optional<Link> findByUrl(String url);

    boolean removeById(long id);
}
