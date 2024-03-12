package edu.java.restApi.controllers.dto.requests;

import jakarta.validation.constraints.Pattern;

public record RemoveLinkRequest(
    @Pattern(regexp = "https?://.*")
    String url
) {
}
