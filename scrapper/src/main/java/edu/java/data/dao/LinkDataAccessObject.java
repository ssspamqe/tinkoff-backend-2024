package edu.java.data.dao;

import edu.java.data.postgres.entities.Link;
import java.util.Optional;

public interface LinkDataAccessObject {

    public Optional<Link> findByUrl(String url);

    public Optional<Link> findById(long id);

    public Link saveOrFindByUrl(String url);

}
