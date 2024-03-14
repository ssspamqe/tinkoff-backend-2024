package edu.java.data.dao;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import java.util.Optional;

public interface StackOverflowQuestionDataAccessObject {

    Optional<StackOverflowQuestion> findById(long id);

    Optional<StackOverflowQuestion> findByLinkId(long linkId);

    void update(StackOverflowQuestion question);

    void save(StackOverflowQuestion question);

    void save(StackOverflowQuestionBody questionBody, long linkId);
}