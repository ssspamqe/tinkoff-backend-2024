package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.Link;
import org.springframework.stereotype.Component;
import java.net.URI;

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

        return new Link(id, url, createdAt, lastCheckedAt);
    }
}
