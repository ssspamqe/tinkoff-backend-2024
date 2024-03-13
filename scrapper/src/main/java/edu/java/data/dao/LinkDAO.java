package edu.java.data.dao;

import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.LinkRepository;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import edu.java.restApi.services.exceptions.NoSuchLinkException;
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

    @Override
    public Collection<Link> findByLastCheckDelayFromNow(Duration duration) {
        long seconds = duration.getSeconds();
        return linkRepository.findByLastCheckDelayFromNowInSeconds(seconds);
    }

    @Override
    public void updateLastCheckedById(Collection<Long> ids) {
        LocalDateTime currentLTime = LocalDateTime.now();
        ids.forEach(id -> updateLastCheckedById(id, currentLTime));
    }

    @Override
    public void updateLastCheckedById(long id) {
        LocalDateTime currentTime = LocalDateTime.now();
        updateLastCheckedById(id, currentTime);
    }

    @Override
    public void updateLastCheckedById(Collection<Long> ids, LocalDateTime lastChecked) {
        ids.forEach(id -> updateLastCheckedById(id, lastChecked));
    }

    @Override
    public void updateLastCheckedById(long id, LocalDateTime lastChecked) {
        Link link = linkRepository.findById(id)
            .orElseThrow(()->new NoSuchLinkException(id));
        link.setLastCheckedAt(lastChecked);
        linkRepository.update(link);
    }

}
