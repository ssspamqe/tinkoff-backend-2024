package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.StackOverflowQuestionEntity;
import java.util.Optional;

public interface StackOverflowQuestionRepository {

    Optional<StackOverflowQuestionEntity> findByLinkId(long linkId);

    void update(StackOverflowQuestionEntity stackOverflowQuestionEntity);

}
