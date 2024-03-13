package edu.java.data.postgres.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class StackOverflowQuestion {

    @Id
    long id;
    long linkId;
    String descriptionMd5Hash;
    long[] answerApiIds;

    public StackOverflowQuestion(long linkId, String descriptionMd5Hash, long[] answerApiIds) {
        this.linkId = linkId;
        this.descriptionMd5Hash = descriptionMd5Hash;
        this.answerApiIds = answerApiIds;
    }
}
