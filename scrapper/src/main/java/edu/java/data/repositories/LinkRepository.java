package edu.java.data.repositories;

import edu.java.data.entities.Link;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, UUID> {
    Optional<Link> findByUrl(String url);
}
