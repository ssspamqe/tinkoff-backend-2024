package edu.java.data.dao;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.data.postgres.repositories.StackOverflowQuestionRepository;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StackOverflowQuestionDAO implements StackOverflowQuestionDataAccessObject {

    private final StackOverflowQuestionRepository stackOverflowQuestionRepository;

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

    //TODO finish implementation
    @Override
    public void save(StackOverflowQuestionBody questionBody, long linkId) {
        throw new UnsupportedOperationException();
//        long id = questionBody.id();
//        String descriptionHash = questionBody.getMd5hash();
    }
}
