package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Owner(
    @JsonProperty("displayName")
    String displayName
) {
}
