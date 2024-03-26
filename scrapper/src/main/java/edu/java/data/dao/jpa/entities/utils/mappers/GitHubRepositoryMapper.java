package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.GitHubRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

public class GitHubRepositoryMapper implements ServiceEntityMapper<GitHubRepositoryJpaEntity, GitHubRepository> {

    @Override
    public GitHubRepository toDto(GitHubRepositoryJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }

        long id = jpaEntity.getId();
        long linkId = jpaEntity.getLink().getId();
        String name = jpaEntity.getName();
        String owner = jpaEntity.getOwner();
        String descriptionMd5Hash = jpaEntity.getDescriptionMd5Hash();

        Set<Long> activitiesIds = new HashSet<>(jpaEntity.getActivitiesIds());

        return new GitHubRepository(
            id,
            linkId,
            name,
            owner,
            descriptionMd5Hash,
            activitiesIds
        );
    }

    @Override
    public GitHubRepositoryJpaEntity toJpaWithLink(GitHubRepository dtoEntity, LinkJpaEntity link) {
        long id = dtoEntity.getId();
        String name = dtoEntity.getName();
        String owner = dtoEntity.getOwner();
        String descriptionMd5Hash = dtoEntity.getDescriptionMd5Hash();
        List<Long> activitiesIds = new ArrayList<>(dtoEntity.getActivitiesIds());

        return new GitHubRepositoryJpaEntity(
            id,
            link,
            name,
            owner,
            descriptionMd5Hash,
            activitiesIds
        );
    }
}
