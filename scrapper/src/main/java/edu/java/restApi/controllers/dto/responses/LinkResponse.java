package edu.java.restApi.controllers.dto.responses;

import edu.java.data.dto.Link;
import edu.java.data.redis.documents.CachedLink;
import java.net.URI;

public record LinkResponse(
    Long id,
    URI url
) {
    public LinkResponse(CachedLink cachedLink) {
        this(Long.valueOf(cachedLink.getId()), URI.create(cachedLink.getUrl()));
    }

    public LinkResponse(Link link) {
        this(link.getId(), link.getUrl());
    }
}
