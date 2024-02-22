package edu.java.restApi.dto.requests;

import jakarta.validation.constraints.Pattern;

public record AddLinkRequest(
    @Pattern(regexp = "https?://.*")
    String link
) {
}
