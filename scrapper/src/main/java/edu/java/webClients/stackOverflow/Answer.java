package edu.java.webClients.stackOverflow;

public record Answer(
    Owner owner,
    boolean is_accepted,
    int score,
    String body
) {
}
