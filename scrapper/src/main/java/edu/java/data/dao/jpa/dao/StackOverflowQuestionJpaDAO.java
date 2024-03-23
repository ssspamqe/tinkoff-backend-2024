package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.ServiceEntityMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.StackOverflowQuestionMapper;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import edu.java.data.dto.StackOverflowQuestion;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class StackOverflowQuestionJpaDAO implements StackOverflowQuestionDataAccessObject {

    private static final ServiceEntityMapper<StackOverflowQuestionJpaEntity, StackOverflowQuestion> ENTITY_MAPPER =
        new StackOverflowQuestionMapper();

    private final StackOverflowQuestionJpaRepository questionRepository;
    private final LinkJpaDAO linkDao;

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
        var jpaQuestion = buildJpaQuestion(question);
        questionRepository.updateAllFieldsById(
            jpaQuestion.getLink(),
            jpaQuestion.getDescriptionMd5Hash(),
            jpaQuestion.getAnswersIds(),
            jpaQuestion.getId()
        );
    }

    @Override
    public void save(StackOverflowQuestion question) {
        var jpaQuestion = buildJpaQuestion(question);
        questionRepository.save(jpaQuestion);
    }

    private StackOverflowQuestionJpaEntity buildJpaQuestion(StackOverflowQuestion question) {
        var link = linkDao.findJpaByIdOrThrowException(question.getLinkId());
        return ENTITY_MAPPER.toJpaWithLink(question, link);
    }
}
