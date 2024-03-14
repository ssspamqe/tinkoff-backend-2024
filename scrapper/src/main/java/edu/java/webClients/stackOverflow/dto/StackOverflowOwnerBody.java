package edu.java.webClients.stackOverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StackOverflowOwnerBody(
    @JsonProperty("display_name")
    String displayName
) {
}
