package edu.java.restApi.dto.responses;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    int size
) {

}
