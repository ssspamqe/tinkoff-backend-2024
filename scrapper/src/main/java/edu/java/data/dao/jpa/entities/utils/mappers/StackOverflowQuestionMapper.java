package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dto.StackOverflowQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowQuestionMapper
    implements ServiceEntityMapper<StackOverflowQuestionJpaEntity, StackOverflowQuestion> {
    @Override
    public StackOverflowQuestion toDto(StackOverflowQuestionJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }

        long id = jpaEntity.getId();
        long linkId = jpaEntity.getLink().getId();
        String descriptionMd5Hash = jpaEntity.getDescriptionMd5Hash();
        Set<Long> answersIds = new HashSet<>(jpaEntity.getAnswersIds());

        return new StackOverflowQuestion(
            id,
            linkId,
            descriptionMd5Hash,
            answersIds
        );
    }

    @Override
    public StackOverflowQuestionJpaEntity toJpaWithLink(StackOverflowQuestion dtoEntity, LinkJpaEntity link) {
        long id = dtoEntity.getId();
        String descriptionMd5Hash = dtoEntity.getDescriptionMd5Hash();
        List<Long> answersIds = new ArrayList<>(dtoEntity.getAnswerIds());

        return new StackOverflowQuestionJpaEntity(
            id,
            link,
            descriptionMd5Hash,
            answersIds
        );
    }
}
