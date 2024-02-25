package edu.java.restApi.controllers.dto.requests;

import jakarta.validation.constraints.Pattern;
import java.net.URI;

public record RemoveLinkRequest(
    @Pattern(regexp = "https?://.*")
    URI link
) {
}
