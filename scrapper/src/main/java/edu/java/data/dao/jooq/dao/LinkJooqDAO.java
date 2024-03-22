package edu.java.data.dao.jooq.dao;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jooq.repositories.ChatLinksJooqRepository;
import edu.java.data.dao.jooq.repositories.LinkJooqRepository;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class LinkJooqDAO implements LinkDataAccessObject {

    private final LinkJooqRepository linkRepository;
    private final ChatLinksJooqRepository chatLinksRepository;
    private final UniversalInitialStateScreener initialStateScreener;

    @Override
    public Optional<Link> findByUrl(URI url) {
        return linkRepository.findByUrl(url);
    }

    @Override
    public Optional<Link> findById(long id) {
        return linkRepository.findById(id);
    }

    @Override
    public Link saveOrFindByUrl(URI url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                Link newLink = new Link(url);
                newLink = linkRepository.save(newLink);
                initialStateScreener.saveInitialState(newLink);
                return newLink;
            });
    }

    @Override
    public Set<Link> findByLastCheckDelayFromNow(Duration duration) {
        long seconds = duration.getSeconds();
        return linkRepository.findByLastCheckDelayFromNowInSeconds(seconds);
    }

    @Override
    public List<Long> findAssociatedChatsIdsByLinkId(long id) {
        return chatLinksRepository
            .findByLinkId(id)
            .stream()
            .map(ChatLink::getChatId).toList();
    }

    @Override
    public void updateLastCheckedAtById(long id) {
        LocalDateTime currentTime = LocalDateTime.now();
        updateLastCheckedByIdWithoutTransaction(currentTime, id);
    }

    @Override
    public void updateLastCheckedAtById(LocalDateTime lastChecked, long id) {
        updateLastCheckedByIdWithoutTransaction(lastChecked, id);
    }

    private void updateLastCheckedByIdWithoutTransaction(LocalDateTime lastChecked, long id) {
        Link link = findLinkByIdOrThrowException(id);
        link.setLastCheckedAt(lastChecked);
        linkRepository.update(link);
    }

    private Link findLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }

}
