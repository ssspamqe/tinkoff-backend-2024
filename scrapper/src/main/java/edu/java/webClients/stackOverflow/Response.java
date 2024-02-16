package edu.java.webClients.stackOverflow;

import java.util.List;

public record Response<T>(
    List<T> items,
    boolean has_mor,
    int quota_max,
    int quota_remaining
) {
}
