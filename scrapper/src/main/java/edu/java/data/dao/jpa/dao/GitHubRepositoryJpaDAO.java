package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.GitHubRepositoryMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.ServiceEntityMapper;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.exceptions.NoSuchGitHubRepositoryException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJpaDAO implements GitHubRepositoryDataAccessObject {

    private static final ServiceEntityMapper<GitHubRepositoryJpaEntity, GitHubRepository> ENTITY_MAPPER =
        new GitHubRepositoryMapper();

    private final GitHubRepositoryJpaRepository gitHubRepoRepository;
    private final LinkJpaDAO linkDao;

    @Override
    public void save(GitHubRepository repository) {
        var jpaRepository = buildJpaRepository(repository);
        gitHubRepoRepository.save(jpaRepository);
    }

    @Override
    public void update(GitHubRepository repository) {
        var oldRepository = gitHubRepoRepository
            .findById(repository.getId())
            .orElseThrow(() -> new NoSuchGitHubRepositoryException(repository.getName(), repository.getOwner()));

        if (oldRepository.getLink().getId() != repository.getLinkId()) {
            var newLink = linkDao.findJpaByIdOrThrowException(repository.getLinkId());
            oldRepository.setLink(newLink);
        }

        oldRepository.setName(repository.getName());
        oldRepository.setOwner(repository.getOwner());
        oldRepository.setDescriptionMd5Hash(repository.getDescriptionMd5Hash());
        oldRepository.setActivitiesIds(repository.getActivitiesIds());
    }

    @Override
    public Optional<GitHubRepository> findById(long id) {
        var jpaRepository = gitHubRepoRepository.findById(id);
        return ENTITY_MAPPER.toOptionalDto(jpaRepository);
    }

    @Override
    public Optional<GitHubRepository> findByNameAndOwner(String name, String owner) {
        var jpaRepository = gitHubRepoRepository.findByNameAndOwner(name, owner);
        return ENTITY_MAPPER.toOptionalDto(jpaRepository);
    }

    private GitHubRepositoryJpaEntity buildJpaRepository(GitHubRepository repository) {
        var link = linkDao.findJpaByIdOrThrowException(repository.getLinkId());
        return ENTITY_MAPPER.toJpaWithLink(repository, link);
    }
}
