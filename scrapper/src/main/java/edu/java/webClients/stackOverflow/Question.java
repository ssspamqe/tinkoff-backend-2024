package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

public record Question(
    int id,

    List<String> tags,

    Owner owner,

    String title,

    @JsonProperty("is_answered")
    boolean isAnswered,

    @JsonProperty("answer_count")
    int answerCount,

    String body,

    @JsonProperty("closed_reason")
    String closedReason,

    @JsonProperty("creation_date")
    OffsetDateTime creationDate,

    @JsonProperty("closed_date")
    OffsetDateTime closedDate
) {
}
