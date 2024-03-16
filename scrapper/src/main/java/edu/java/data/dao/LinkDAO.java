package edu.java.data.dao;

import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import edu.java.data.postgres.repositories.LinkRepository;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Transactional
public class LinkDAO implements LinkDataAccessObject {

    private final LinkRepository linkRepository;
    private final ChatLinksRepository chatLinksRepository;
    private final UniversalInitialStateScreener initialStateScreener;

    public Optional<Link> findByUrl(String url) {
        return linkRepository.findByUrl(url);
    }

    public Optional<Link> findById(long id) {
        return linkRepository.findById(id);
    }

    public Link saveOrFindByUrl(String url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                System.out.println(url);
                Link newLink = new Link(URI.create(url));
                newLink = linkRepository.save(newLink);
                initialStateScreener.saveInitialState(newLink);
                return newLink;
            });
    }

    @Override
    public Collection<Link> findByLastCheckDelayFromNow(Duration duration) {
        long seconds = duration.getSeconds();
        return linkRepository.findByLastCheckDelayFromNowInSeconds(seconds);
    }

    @Override
    public List<Long> findAssociatedChatsIdsById(long id) {
        return chatLinksRepository
            .findByLinkId(id)
            .stream()
            .map(ChatLink::getChatId).toList();
    }

    @Override
    public void updateLastCheckedById(long id) {
        LocalDateTime currentTime = LocalDateTime.now();
        updateLastCheckedByIdWithoutTransaction(id, currentTime);
    }

    @Override
    public void updateLastCheckedById(long id, LocalDateTime lastChecked) {
        updateLastCheckedByIdWithoutTransaction(id, lastChecked);
    }

    private void updateLastCheckedByIdWithoutTransaction(long id, LocalDateTime lastChecked) {
        Link link = findLinkByIdOrThrowException(id);
        link.setLastCheckedAt(lastChecked);
        linkRepository.update(link);
    }

    private Link findLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }

}
