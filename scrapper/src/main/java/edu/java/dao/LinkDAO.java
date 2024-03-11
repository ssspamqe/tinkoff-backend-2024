package edu.java.dao;

import edu.java.dao.postgres.entities.Link;
import edu.java.dao.postgres.repositories.LinkRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LinkDAO {

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
                linkRepository.save(newLink);
                return newLink;
            });
    }
}
