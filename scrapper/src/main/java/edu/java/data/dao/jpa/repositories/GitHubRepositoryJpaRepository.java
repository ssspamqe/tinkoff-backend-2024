package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubRepositoryJpaRepository extends JpaRepository<GitHubRepositoryJpaEntity, Long> {
}
