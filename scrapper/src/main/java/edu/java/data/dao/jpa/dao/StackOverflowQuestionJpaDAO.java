package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dto.StackOverflowQuestion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class StackOverflowQuestionJpaDAO implements StackOverflowQuestionDataAccessObject {
    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        return Optional.empty();
    }

    @Override
    public void update(StackOverflowQuestion question) {

    }

    @Override
    public void save(StackOverflowQuestion question) {

    }
}
