package edu.java.data.dao;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.data.postgres.repositories.StackOverflowQuestionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StackOverflowQuestionDAO implements StackOverflowQuestionDataAccessObject {

    private final StackOverflowQuestionRepository stackOverflowQuestionRepository;

    public StackOverflowQuestionDAO(
        @Qualifier("jdbcClientStackOverflowRepository") StackOverflowQuestionRepository stackOverflowQuestionRepository
    ) {
        this.stackOverflowQuestionRepository = stackOverflowQuestionRepository;
    }

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        return stackOverflowQuestionRepository.findById(id);
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        return stackOverflowQuestionRepository.findByLinkId(linkId);
    }

    @Override
    public void update(StackOverflowQuestion question) {
        stackOverflowQuestionRepository.update(question);
    }

    @Override
    public void save(StackOverflowQuestion question) {
        stackOverflowQuestionRepository.save(question);
    }

}
