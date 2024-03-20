package edu.java.data.dto;

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
}
