package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.EntityMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkMapper;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class LinkJpaDAO implements LinkDataAccessObject {

    private static final EntityMapper<LinkJpaEntity, Link> LINK_MAPPER = new LinkMapper();

    private final LinkJpaRepository linkRepository;
    private final UniversalInitialStateScreener initialStateScreener;

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
                newLink = linkRepository.save(newLink);
                initialStateScreener.saveInitialState(LINK_MAPPER.toDto(newLink));
                return newLink;
            });
    }

    @Override
    public Set<Link> findByLastCheckedAtBefore(LocalDateTime borderDateTime) {
        return linkRepository.findByLastCheckedAtBefore(borderDateTime).stream()
            .map(LINK_MAPPER::toDto)
            .collect(Collectors.toSet());
    }

    @Override
    public Set<Long> findAssociatedChatsIdsByLinkId(long id) {
        var jpaLink = findJpaByIdOrThrowException(id);

        return jpaLink
            .getAssociations().stream()
            .map(pair -> pair.getChat().getId())
            .collect(Collectors.toSet());
    }

    @Override
    public void updateLastCheckedAtById(LocalDateTime lastChecked, long id) {
        var link = findJpaByIdOrThrowException(id);

        link.setLastCheckedAt(lastChecked);
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
