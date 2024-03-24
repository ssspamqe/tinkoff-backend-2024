package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.ServiceEntityMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.StackOverflowQuestionMapper;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.exceptions.NoSuchStackOverflowQuestionException;
import java.util.ArrayList;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class StackOverflowQuestionJpaDAO implements StackOverflowQuestionDataAccessObject {

    private static final ServiceEntityMapper<StackOverflowQuestionJpaEntity, StackOverflowQuestion> ENTITY_MAPPER =
        new StackOverflowQuestionMapper();

    private final StackOverflowQuestionJpaRepository questionRepository;
    private final LinkJpaRepository linkRepository;

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        var jpaQuestion = questionRepository.findById(id);
        return ENTITY_MAPPER.toOptionalDto(jpaQuestion);
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        var jpaQuestion = questionRepository.findByLinkId(linkId);
        return ENTITY_MAPPER.toOptionalDto(jpaQuestion);
    }

    @Override
    public void update(StackOverflowQuestion question) {
        var oldQuestion = questionRepository
            .findById(question.getId())
            .orElseThrow(() -> new NoSuchStackOverflowQuestionException(question.getId()));

        if (oldQuestion.getLink().getId() != question.getId()) {
            var newLink = findJpaLinkByIdOrThrowException(question.getLinkId());
            oldQuestion.setLink(newLink);
        }


        oldQuestion.setDescriptionMd5Hash(question.getDescriptionMd5Hash());
        oldQuestion.setAnswersIds(new ArrayList<>(question.getAnswerIds()));

        questionRepository.flush();//TODO investigate problems with transaction management
    }

    @Override
    public void save(StackOverflowQuestion question) {
        var jpaQuestion = buildJpaQuestion(question);
        questionRepository.saveAndFlush(jpaQuestion); //TODO investigate problems with transaction management
    }

    private StackOverflowQuestionJpaEntity buildJpaQuestion(StackOverflowQuestion question) {
        var link = findJpaLinkByIdOrThrowException(question.getLinkId());
        return ENTITY_MAPPER.toJpaWithLink(question, link);
    }

    private LinkJpaEntity findJpaLinkByIdOrThrowException(long id){
        return linkRepository.findById(id)
            .orElseThrow(()-> new NoSuchLinkException(id));
    }
}
