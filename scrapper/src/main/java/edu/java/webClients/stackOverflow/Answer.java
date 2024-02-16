package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Answer(
    Owner owner,

    @JsonProperty("is_accepted")
    boolean isAccepted,

    int score,

    String body
) {
}
