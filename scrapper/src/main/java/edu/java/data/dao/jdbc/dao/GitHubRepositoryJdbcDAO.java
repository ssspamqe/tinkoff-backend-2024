package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jdbc.repositories.GitHubRepositoryJdbcRepository;
import edu.java.data.dto.GitHubRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJdbcDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryJdbcRepository gitHubRepositoryEntityRepository;

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
