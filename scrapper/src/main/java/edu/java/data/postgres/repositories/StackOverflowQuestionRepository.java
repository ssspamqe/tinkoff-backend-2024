package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import java.util.Optional;

public interface StackOverflowQuestionRepository {

    Optional<StackOverflowQuestion> findByLinkId(long linkId);

    void update(StackOverflowQuestion stackOverflowQuestion);

}
