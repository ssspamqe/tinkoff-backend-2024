package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jdbc.repositories.ChatLinksJdbcRepository;
import edu.java.data.dao.jdbc.repositories.LinkJdbcRepository;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class LinkJdbcDAO implements LinkDataAccessObject {

    private final LinkJdbcRepository linkRepository;
    private final ChatLinksJdbcRepository chatLinksRepository;
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
