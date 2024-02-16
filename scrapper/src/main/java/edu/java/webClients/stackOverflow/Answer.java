package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record Answer(
    long id,

    Owner owner,

    @JsonProperty("is_accepted")
    boolean isAccepted,

    int score,

    String body,

    @JsonProperty("creation_date")
    OffsetDateTime creationDate
) {
}
