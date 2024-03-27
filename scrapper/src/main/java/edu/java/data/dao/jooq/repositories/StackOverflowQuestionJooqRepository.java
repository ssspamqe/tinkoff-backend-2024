package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.StackOverflowQuestion;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.domain.jooq.public_.Tables.STACK_OVERFLOW_QUESTIONS;

@RequiredArgsConstructor
public class StackOverflowQuestionJooqRepository {

    private final DefaultDSLContext dsl;

    public Optional<StackOverflowQuestion> findById(long id) {
        var question = dsl.select()
            .from(STACK_OVERFLOW_QUESTIONS)
            .where(STACK_OVERFLOW_QUESTIONS.ID.eq(id))
            .fetchOneInto(StackOverflowQuestion.class);
        return Optional.ofNullable(question);
    }

    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        var question = dsl.select()
            .from(STACK_OVERFLOW_QUESTIONS)
            .where(STACK_OVERFLOW_QUESTIONS.LINK_ID.eq(linkId))
            .fetchOneInto(StackOverflowQuestion.class);
        return Optional.ofNullable(question);
    }

    public void save(StackOverflowQuestion question) {
        dsl.insertInto(STACK_OVERFLOW_QUESTIONS)
            .set(STACK_OVERFLOW_QUESTIONS.ID, question.getId())
            .set(STACK_OVERFLOW_QUESTIONS.LINK_ID, question.getLinkId())
            .set(STACK_OVERFLOW_QUESTIONS.DESCRIPTION_MD5_HASH, question.getDescriptionMd5Hash())
            .set(STACK_OVERFLOW_QUESTIONS.ANSWERS_IDS, question.getAnswersIds().toArray(new Long[0]))
            .execute();
    }

    public void update(StackOverflowQuestion question) {
        dsl.update(STACK_OVERFLOW_QUESTIONS)
            .set(STACK_OVERFLOW_QUESTIONS.LINK_ID, question.getLinkId())
            .set(STACK_OVERFLOW_QUESTIONS.DESCRIPTION_MD5_HASH, question.getDescriptionMd5Hash())
            .set(STACK_OVERFLOW_QUESTIONS.ANSWERS_IDS, question.getAnswersIds().toArray(new Long[0]))
            .where(STACK_OVERFLOW_QUESTIONS.ID.eq(question.getId()))
            .execute();
    }
}
