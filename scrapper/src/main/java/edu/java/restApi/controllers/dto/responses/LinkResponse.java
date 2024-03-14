package edu.java.restApi.controllers.dto.responses;

import edu.java.data.postgres.entities.LinkEntity;
import edu.java.data.redis.documents.CachedLink;
import java.net.URI;

public record LinkResponse(
    Long id,
    URI url
) {
    public LinkResponse(CachedLink link) {
        this(Long.valueOf(link.getId()), URI.create(link.getUrl()));
    }

    public LinkResponse(LinkEntity linkEntity) {
        this(linkEntity.getId(), URI.create(linkEntity.getUrl()));
    }
}
