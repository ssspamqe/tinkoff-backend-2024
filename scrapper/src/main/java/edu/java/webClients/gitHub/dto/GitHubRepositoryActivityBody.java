package edu.java.webClients.gitHub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record GitHubRepositoryActivityBody(
    long id,

    GitHubOwnerBody actor,

    @JsonProperty("ref")
    String reference,

    OffsetDateTime timestamp,

    @JsonProperty("activity_type")
    GitHubRepositoryActivityType type
) {
}
