package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.Link;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Component;

@Component
public class LinkMapper implements EntityMapper<LinkJpaEntity, Link> {
    @Override
    public Link toDto(LinkJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }

        long id = jpaEntity.getId();
        URI url = jpaEntity.getUrl();
        var createdAt = jpaEntity.getCreatedAt();
        var lastCheckedAt = jpaEntity.getLastCheckedAt();

        return new Link(id, url, toLocalDateTime(createdAt), toLocalDateTime(lastCheckedAt));
    }

    private LocalDateTime toLocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
