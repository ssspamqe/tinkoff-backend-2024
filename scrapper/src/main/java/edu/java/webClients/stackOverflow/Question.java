package edu.java.webClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record Question(
    List<String> tags,

    Owner owner,

    String title,

    @JsonProperty("is_answered")
    boolean isAnswered,

    @JsonProperty("answer_count")
    int answerCount,

    String body
) {
}
