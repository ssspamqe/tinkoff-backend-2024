package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.ServiceEntityMapper;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.exceptions.NoSuchGitHubRepositoryException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.util.ArrayList;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJpaDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryJpaRepository gitHubRepoRepository;
    private final LinkJpaRepository linkRepository;

    private final ServiceEntityMapper<GitHubRepositoryJpaEntity, GitHubRepository> repositoryMapper;

    @Override
    public void save(GitHubRepository repository) {
        var jpaRepository = buildJpaRepository(repository);
        gitHubRepoRepository.saveAndFlush(jpaRepository);
    }

    @Override
    public void update(GitHubRepository repository) {
        var oldRepository = gitHubRepoRepository
            .findById(repository.getId())
            .orElseThrow(() -> new NoSuchGitHubRepositoryException(repository.getName(), repository.getOwner()));

        if (linkIdWasChanged(oldRepository, repository)) {
            var newLink = findJpaLinkByIdOrThrowException(repository.getLinkId());
            oldRepository.setLink(newLink);
        }

        oldRepository.setName(repository.getName());
        oldRepository.setOwner(repository.getOwner());
        oldRepository.setDescriptionMd5Hash(repository.getDescriptionMd5Hash());
        oldRepository.setActivitiesIds(new ArrayList<>(repository.getActivitiesIds()));

        gitHubRepoRepository.flush(); //TODO investigate problems with transaction management
    }

    private boolean linkIdWasChanged(GitHubRepositoryJpaEntity oldRepository, GitHubRepository newRepository) {
        return !oldRepository.getLink().getId().equals(newRepository.getLinkId());
    }

    @Override
    public Optional<GitHubRepository> findById(long id) {
        var jpaRepository = gitHubRepoRepository.findById(id);
        return repositoryMapper.toOptionalDto(jpaRepository);
    }

    @Override
    public Optional<GitHubRepository> findByNameAndOwner(String name, String owner) {
        var jpaRepository = gitHubRepoRepository.findByNameAndOwner(name, owner);
        return repositoryMapper.toOptionalDto(jpaRepository);
    }

    private GitHubRepositoryJpaEntity buildJpaRepository(GitHubRepository repository) {
        var link = findJpaLinkByIdOrThrowException(repository.getLinkId());
        return repositoryMapper.toJpaWithLink(repository, link);
    }

    private LinkJpaEntity findJpaLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }
}
