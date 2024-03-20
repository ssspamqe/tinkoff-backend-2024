package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.GitHubRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.GIT_HUB_REPOSITORIES;

@Repository
@RequiredArgsConstructor
public class JooqGitHubRepositoryEntityRepository {

    private final DefaultDSLContext dsl;

    public void save(GitHubRepository repository) {
        dsl.insertInto(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.ID, repository.getId())
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.DESCRIPTION_MD5_HASH, repository.getDescriptionMd5Hash())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .execute();
    }

    public void update(GitHubRepository repository) {
        dsl.update(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.DESCRIPTION_MD5_HASH, repository.getDescriptionMd5Hash())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .where(GIT_HUB_REPOSITORIES.ID.eq(repository.getId()))
            .execute();
    }

    public Optional<GitHubRepository> findById(long id) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.ID.eq(id))
            .fetchOneInto(GitHubRepository.class);
        return Optional.ofNullable(repository);
    }

    public Optional<GitHubRepository> findByNameAndOwner(String name, String owner) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.NAME.eq(name))
            .and(GIT_HUB_REPOSITORIES.OWNER.eq(owner))
            .fetchOneInto(GitHubRepository.class);
        return Optional.ofNullable(repository);
    }
}
