package edu.java.webClients.stackOverflow.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StackOverflowOwner(
    @JsonProperty("displayName")
    String displayName
) {
}
