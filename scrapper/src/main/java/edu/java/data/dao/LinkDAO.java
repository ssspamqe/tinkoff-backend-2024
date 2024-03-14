package edu.java.data.dao;

import edu.java.data.postgres.entities.LinkEntity;
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

    public Optional<LinkEntity> findByUrl(String url) {
        return linkRepository.findByUrl(url);
    }

    public Optional<LinkEntity> findById(long id) {
        return linkRepository.findById(id);
    }

    public LinkEntity saveOrFindByUrl(String url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                LinkEntity newLinkEntity = new LinkEntity(url);
                return linkRepository.save(newLinkEntity);
            });
    }

    @Override
    public Collection<LinkEntity> findByLastCheckDelayFromNow(Duration duration) {
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
        LinkEntity linkEntity = linkRepository.findById(id)
            .orElseThrow(()->new NoSuchLinkException(id));
        linkEntity.setLastCheckedAt(lastChecked);
        linkRepository.update(linkEntity);
    }

}
