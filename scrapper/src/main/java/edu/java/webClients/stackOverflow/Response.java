package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record Response<T>(
    List<T> items,

    @JsonProperty("has_mor")
    boolean hasMor,

    @JsonProperty("quota_max")
    int quotaMax,

    @JsonProperty("quota_remaining")
    int quotaRemaining
) {
}
