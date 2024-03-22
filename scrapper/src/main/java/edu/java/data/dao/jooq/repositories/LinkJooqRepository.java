package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.Link;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.LINKS;

@RequiredArgsConstructor
public class LinkJooqRepository {

    private final DefaultDSLContext dsl;

    public Link save(Link link) {
        return dsl.insertInto(LINKS)
            .set(LINKS.URL, link.getUrl().toString())
            .set(LINKS.CREATED_AT, link.getCreatedAt())
            .set(LINKS.LAST_CHECKED_AT, link.getLastCheckedAt())
            .returning()
            .fetchOneInto(Link.class);
    }

    public Set<Link> findByLastCheckDelayFromNowInSeconds(long seconds) {
        LocalDateTime borderTime = LocalDateTime.now().minusSeconds(seconds);
        return dsl.select()
            .from(LINKS)
            .where(LINKS.LAST_CHECKED_AT.lessThan(borderTime))
            .fetchStreamInto(Link.class)
            .collect(Collectors.toSet());
    }

    public void update(Link link) {
        dsl.update(LINKS)
            .set(LINKS.URL, link.getUrl().toString())
            .set(LINKS.CREATED_AT, link.getCreatedAt())
            .set(LINKS.LAST_CHECKED_AT, link.getLastCheckedAt())
            .where(LINKS.ID.eq(link.getId()))
            .execute();
    }

    public Optional<Link> findById(long id) {
        Link link = dsl.select()
            .from(LINKS)
            .where(LINKS.ID.eq(id))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    public Optional<Link> findByUrl(URI url) {
        Link link = dsl.select()
            .from(LINKS)
            .where(LINKS.URL.eq(url.toString()))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    public boolean removeById(long id) {
        return dsl.delete(LINKS)
            .where(LINKS.ID.eq(id))
            .execute() != 0;
    }
}
