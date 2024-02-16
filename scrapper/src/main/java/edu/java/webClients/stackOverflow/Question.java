package edu.java.webClients.stackOverflow;

import java.util.List;

public record Question(
    List<String> tags,
    Owner owner,
    String title,
    boolean is_answered,
    int answer_count,
    String body
) {
}
