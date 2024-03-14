package edu.java.webClients.stackOverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;

public record StackOverflowQuestionBody(
    long id,

    List<String> tags,

    StackOverflowOwnerBody owner,

    String title,

    @JsonProperty("is_answered")
    boolean isAnswered,

    @JsonProperty("answer_count")
    int answerCount,

    String body,

    @JsonProperty("creation_date")
    OffsetDateTime creationDate,

    @JsonProperty("closed_date")
    OffsetDateTime closedDate,

    @JsonProperty("closed_reason")
    String closedReason
) {

    //TODO suggest a better way for finding hash
    public String getMd5hash() {
        return DigestUtils.md5Hex(this.toString());
    }
}
