package edu.java.restApi.controllers.dto.responses;

import edu.java.data.models.Link;
import java.net.URI;

public record LinkResponse(
    long id,
    URI url
) {
    public LinkResponse(Link link) {
        this(link.id(), URI.create(link.urlWithUnescapedColon()));
    }
}
