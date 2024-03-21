package edu.java.data.dao.jpa.entities.mappers;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dto.GitHubRepository;
import java.util.Set;

public class GitHubRepositoryEntityMapper implements EntityMapper<GitHubRepositoryJpaEntity, GitHubRepository> {

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
        Set<Long> activitiesIds = jpaEntity.getActivitiesIds();

        return new GitHubRepository(
            id,
            linkId,
            name,
            owner,
            descriptionMd5Hash,
            activitiesIds
        );
    }
}
