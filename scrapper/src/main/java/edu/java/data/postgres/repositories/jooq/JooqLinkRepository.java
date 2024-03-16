package edu.java.data.postgres.repositories.jooq;

import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.LinkRepository;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.LINKS;

@Repository
@RequiredArgsConstructor
public class JooqLinkRepository implements LinkRepository {

    private final DefaultDSLContext dsl;

    @Override
    public Link save(Link link) {
        long linkId = dsl.insertInto(LINKS)
            .set(LINKS.URL, link.getUrl().toString())
            .set(LINKS.CREATED_AT, link.getCreatedAt())
            .set(LINKS.LAST_CHECKED_AT, link.getLastCheckedAt())
            .returning(LINKS.ID)
            .execute();

        return findById(linkId)
            .orElseThrow(() -> new NoSuchLinkException(linkId));
    }

    @Override
    public Collection<Link> findByLastCheckDelayFromNowInSeconds(long seconds) {
        LocalDateTime borderTime = LocalDateTime.now().minusSeconds(seconds);
        return dsl.select()
            .from(LINKS)
            .where(LINKS.LAST_CHECKED_AT.lessThan(borderTime))
            .fetchInto(Link.class);
    }

    @Override
    public void update(Link link) {
        dsl.update(LINKS)
            .set(LINKS.URL, link.getUrl().toString())
            .set(LINKS.CREATED_AT, link.getCreatedAt())
            .set(LINKS.LAST_CHECKED_AT, link.getLastCheckedAt())
            .where(LINKS.ID.eq(link.getId()))
            .execute();
    }

    @Override
    public Optional<Link> findById(long id) {
        Link link = dsl.select()
            .from(LINKS)
            .where(LINKS.ID.eq(id))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    @Override
    public Optional<Link> findByUrl(String url) {
        Link link = dsl.select()
            .from(LINKS)
            .where(LINKS.URL.eq(url))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    @Override
    public boolean removeById(long id) {
        return dsl.delete(LINKS)
            .where(LINKS.ID.eq(id))
            .execute() != 0;
    }
}
