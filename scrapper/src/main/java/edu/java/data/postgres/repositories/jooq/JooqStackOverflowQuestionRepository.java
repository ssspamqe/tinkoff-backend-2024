package edu.java.data.postgres.repositories.jooq;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.data.postgres.repositories.StackOverflowQuestionRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.STACK_OVERFLOW_QUESTIONS;

@Repository
@RequiredArgsConstructor
public class JooqStackOverflowQuestionRepository implements StackOverflowQuestionRepository {

    private final DefaultDSLContext dsl;

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        var question = dsl.select()
            .from(STACK_OVERFLOW_QUESTIONS)
            .where(STACK_OVERFLOW_QUESTIONS.ID.eq(id))
            .fetchOneInto(StackOverflowQuestion.class);
        return Optional.ofNullable(question);
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        var question = dsl.select()
            .from(STACK_OVERFLOW_QUESTIONS)
            .where(STACK_OVERFLOW_QUESTIONS.LINK_ID.eq(linkId))
            .fetchOneInto(StackOverflowQuestion.class);
        return Optional.ofNullable(question);
    }

    @Override
    public void save(StackOverflowQuestion question) {
        dsl.insertInto(STACK_OVERFLOW_QUESTIONS)
            .set(STACK_OVERFLOW_QUESTIONS.ID, question.getId())
            .set(STACK_OVERFLOW_QUESTIONS.LINK_ID, question.getLinkId())
            .set(STACK_OVERFLOW_QUESTIONS.DESCRIPTION_MD5_HASH, question.getDescriptionMd5Hash())
            .set(STACK_OVERFLOW_QUESTIONS.ANSWERS_IDS, question.getAnswerIds().toArray(new Long[0]))
            .execute();
    }

    @Override
    public void update(StackOverflowQuestion question) {
        dsl.update(STACK_OVERFLOW_QUESTIONS)
            .set(STACK_OVERFLOW_QUESTIONS.LINK_ID, question.getLinkId())
            .set(STACK_OVERFLOW_QUESTIONS.DESCRIPTION_MD5_HASH, question.getDescriptionMd5Hash())
            .set(STACK_OVERFLOW_QUESTIONS.ANSWERS_IDS, question.getAnswerIds().toArray(new Long[0]))
            .where(STACK_OVERFLOW_QUESTIONS.ID.eq(question.getId()))
            .execute();
    }
}
