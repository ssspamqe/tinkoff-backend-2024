package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GitHubRepositoryJpaRepository extends JpaRepository<GitHubRepositoryJpaEntity, Long> {

    Optional<GitHubRepositoryJpaEntity> findByNameAndOwner(String name, String owner);
}
