package edu.java.data.dao.interfaces;

import edu.java.data.dto.GitHubRepository;
import java.util.Optional;

public interface GitHubRepositoryDataAccessObject {

    void save(GitHubRepository repository);

    void update(GitHubRepository repository);

    Optional<GitHubRepository> findById(long id);

    Optional<GitHubRepository> findByNameAndOwner(String name, String owner);
}
