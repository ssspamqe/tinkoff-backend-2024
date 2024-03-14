package edu.java.webClients.stackOverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;

public record StackOverflowResponseBody<T>(
    List<T> items,

    @JsonProperty("has_mor")
    boolean hasMor,

    @JsonProperty("quota_max")
    int quotaMax,

    @JsonProperty("quota_remaining")
    int quotaRemaining
) {
}
