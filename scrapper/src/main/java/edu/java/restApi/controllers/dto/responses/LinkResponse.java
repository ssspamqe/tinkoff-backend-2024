package edu.java.restApi.controllers.dto.responses;

import edu.java.dao.redis.documents.Link;
import java.net.URI;

public record LinkResponse(
    String id,
    URI url
) {
    public LinkResponse(Link link) {
        this(link.getId(), URI.create(link.getUrl()));
    }
}
