package edu.java.restApi.controllers.dto.responses;

import edu.java.dao.redis.documents.CachedLink;
import java.net.URI;

public record LinkResponse(
    String id,
    URI url
) {
    public LinkResponse(CachedLink link) {
        this(link.getId(), URI.create(link.getUrl()));
    }
}
