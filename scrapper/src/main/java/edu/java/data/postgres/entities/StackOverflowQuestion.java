package edu.java.data.postgres.entities;

import java.util.Set;
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
    Set<Long> answerIds;

    public StackOverflowQuestion(long linkId, String descriptionMd5Hash, Set<Long> answerIds) {
        this.linkId = linkId;
        this.descriptionMd5Hash = descriptionMd5Hash;
        this.answerIds = answerIds;
    }
}
