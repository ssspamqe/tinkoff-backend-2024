package edu.java.data.dao;

import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.LinkRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LinkDAO implements LinkDataAccessObject {

    private final LinkRepository linkRepository;

    public Optional<Link> findByUrl(String url) {
        return linkRepository.findByUrl(url);
    }

    public Optional<Link> findById(long id) {
        return linkRepository.findById(id);
    }

    public Link saveOrFindByUrl(String url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                Link newLink = new Link(url);
                return linkRepository.save(newLink);
            });
    }
}
