package edu.java.data.dao.jooq.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jdbc.repositories.JdbcGitHubRepoRepository;
import edu.java.data.dto.GitHubRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class JooqGitHubRepositoryDAO implements GitHubRepositoryDataAccessObject {

    private final JdbcGitHubRepoRepository gitHubRepositoryEntityRepository;

    @Override
    public void save(GitHubRepository repository) {
        gitHubRepositoryEntityRepository.save(repository);
    }

    @Override
    public void update(GitHubRepository repository) {
        gitHubRepositoryEntityRepository.update(repository);
    }

    @Override
    public Optional<GitHubRepository> findById(long id) {
        return gitHubRepositoryEntityRepository.findById(id);
    }

    @Override
    public Optional<GitHubRepository> findByNameAndOwner(String name, String owner) {
        return gitHubRepositoryEntityRepository.findByNameAndOwner(name, owner);
    }
}
