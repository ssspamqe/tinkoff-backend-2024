package edu.java.webClients.stackOverflow.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Owner(
    @JsonProperty("displayName")
    String displayName
) {
}
