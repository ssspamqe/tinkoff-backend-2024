package edu.java.webClients.gitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record RepositoryActivity(
    long id,

    Owner actor,

    @JsonProperty("ref")
    String reference,

    OffsetDateTime timestamp,

    @JsonProperty("activity_type")
    RepositoryActivityType type
) {
}
