package edu.java.data.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class StackOverflowQuestion {

    @Id
    private long id;
    private long linkId;
    private String descriptionMd5Hash;
    private Set<Long> answerIds;
}
