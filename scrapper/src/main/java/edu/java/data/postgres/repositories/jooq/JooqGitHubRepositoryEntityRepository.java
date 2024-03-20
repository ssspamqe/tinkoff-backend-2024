package edu.java.data.postgres.repositories.jooq;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.data.postgres.repositories.GitHubRepositoryEntityRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.GIT_HUB_REPOSITORIES;

@Repository
@RequiredArgsConstructor
public class JooqGitHubRepositoryEntityRepository implements GitHubRepositoryEntityRepository {

    private final DefaultDSLContext dsl;

    @Override
    public void save(GitHubRepositoryEntity repository) {
        dsl.insertInto(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.ID, repository.getId())
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.DESCRIPTION_MD5_HASH, repository.getDescriptionMd5Hash())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .execute();
    }

    @Override
    public void update(GitHubRepositoryEntity repository) {
        dsl.update(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.DESCRIPTION_MD5_HASH, repository.getDescriptionMd5Hash())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .where(GIT_HUB_REPOSITORIES.ID.eq(repository.getId()))
            .execute();
    }

    @Override
    public Optional<GitHubRepositoryEntity> findById(long id) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.ID.eq(id))
            .fetchOneInto(GitHubRepositoryEntity.class);
        return Optional.ofNullable(repository);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.NAME.eq(name))
            .and(GIT_HUB_REPOSITORIES.OWNER.eq(owner))
            .fetchOneInto(GitHubRepositoryEntity.class);
        return Optional.ofNullable(repository);
    }
}
