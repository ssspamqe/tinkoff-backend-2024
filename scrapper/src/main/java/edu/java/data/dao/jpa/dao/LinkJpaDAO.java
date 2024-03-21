package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.mappers.EntityMapper;
import edu.java.data.dao.jpa.entities.mappers.LinkMapper;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class LinkJpaDAO implements LinkDataAccessObject {

    private static final EntityMapper<LinkJpaEntity, Link> LINK_MAPPER = new LinkMapper();

    private final LinkJpaRepository linkRepository;

    @Override
    public Optional<Link> findByUrl(URI url) {
        var jpaLink = findJpaByUrl(url);
        return LINK_MAPPER.toOptionalDto(jpaLink);
    }

    Optional<LinkJpaEntity> findJpaByUrl(URI url) {
        return linkRepository.findByUrl(url);
    }

    @Override
    public Optional<Link> findById(long id) {
        var jpaLink = findJpaById(id);
        return LINK_MAPPER.toOptionalDto(jpaLink);
    }

    Optional<LinkJpaEntity> findJpaById(long id) {
        return linkRepository.findById(id);
    }

    @Override
    public Link saveOrFindByUrl(URI url) {
        var jpaLink = saveJpaOrFindByUrl(url);
        return LINK_MAPPER.toDto(jpaLink);
    }

    LinkJpaEntity saveJpaOrFindByUrl(URI url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                var newLink = new LinkJpaEntity(url);
                return linkRepository.save(newLink);

            });
    }

    @Override
    public Set<Link> findByLastCheckDelayFromNow(Duration duration) {
        var jpaLinks = findJpaByLastCheckedDelayFromNow(duration);
        return jpaLinks.stream()
            .map(LINK_MAPPER::toDto)
            .collect(Collectors.toSet());
    }

    public Set<LinkJpaEntity> findJpaByLastCheckedDelayFromNow(Duration duration) {
        long seconds = duration.getSeconds();
        LocalDateTime borderDateTime = LocalDateTime.now().minusSeconds(seconds);
        return linkRepository.findByLastCheckedAtBefore(borderDateTime);
    }

    @Override
    public List<Long> findAssociatedChatsIdsByLinkId(long id) {
        var jpaLink = findJpaByIdOrThrowException(id);

        return jpaLink
            .getChats().stream()
            .map(ChatJpaEntity::getId)
            .toList();
    }

    @Override
    public void updateLastCheckedAtById(long id) {
        var dateTime = LocalDateTime.now();
        updateLastCheckedAtById(dateTime, id);
    }

    @Override
    public void updateLastCheckedAtById(LocalDateTime lastChecked, long id) {
        if (!linkRepository.existsById(id)) {
            throw new NoSuchLinkException(id);
        }

        linkRepository.updateLastCheckedAtById(lastChecked, id);
    }

    LinkJpaEntity findJpaByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }

    LinkJpaEntity findJpaByUrlOrThrowException(URI url) {
        return linkRepository.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(url));
    }
}
