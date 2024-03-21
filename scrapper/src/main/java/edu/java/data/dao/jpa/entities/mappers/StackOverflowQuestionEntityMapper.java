package edu.java.data.dao.jpa.entities.mappers;

import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dto.StackOverflowQuestion;
import java.util.Set;

public class StackOverflowQuestionEntityMapper
    implements EntityMapper<StackOverflowQuestionJpaEntity, StackOverflowQuestion> {
    @Override
    public StackOverflowQuestion toDto(StackOverflowQuestionJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }

        long id = jpaEntity.getId();
        long linkId = jpaEntity.getLink().getId();
        String descriptionMd5Hash = jpaEntity.getDescriptionMd5Hash();
        Set<Long> answersIds = jpaEntity.getAnswersIds();

        return new StackOverflowQuestion(
            id,
            linkId,
            descriptionMd5Hash,
            answersIds
        );
    }
}
