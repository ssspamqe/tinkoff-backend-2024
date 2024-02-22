package edu.java.restApi.dto.requests;

import jakarta.validation.constraints.Pattern;

public record RemoveLinkRequest(
    @Pattern(regexp = "https?://.*")
    String link
) {
}
