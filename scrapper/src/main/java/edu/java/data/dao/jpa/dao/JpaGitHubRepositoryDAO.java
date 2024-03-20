package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dto.GitHubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class JpaGitHubRepositoryDAO implements GitHubRepositoryDataAccessObject {
    @Override
    public void save(GitHubRepository repository) {

    }

    @Override
    public void update(GitHubRepository repository) {

    }

    @Override
    public Optional<GitHubRepository> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<GitHubRepository> findByNameAndOwner(String name, String owner) {
        return Optional.empty();
    }
}
