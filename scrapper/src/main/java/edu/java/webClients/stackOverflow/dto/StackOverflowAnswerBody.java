package edu.java.webClients.stackOverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record StackOverflowAnswerBody(
    long id,

    StackOverflowOwnerBody owner,

    @JsonProperty("is_accepted")
    boolean isAccepted,

    int score,

    String body,

    @JsonProperty("creation_date")
    OffsetDateTime creationDate
) {
}
