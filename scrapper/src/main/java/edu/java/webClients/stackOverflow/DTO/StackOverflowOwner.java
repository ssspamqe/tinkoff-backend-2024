package edu.java.webClients.stackOverflow.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StackOverflowOwner(
    @JsonProperty("display_name")
    String displayName
) {
}
