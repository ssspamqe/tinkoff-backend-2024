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

    @Transactional
    @Modifying
    @Query("""
        update GitHubRepositoryJpaEntity g set
        g.link = :link,
        g.name = :name,
        g.owner = :owner,
        g.descriptionMd5Hash = :descriptionMd5Hash,
        g.activitiesIds = :activitiesIds
        where g.id = :id""")
    void updateAllFieldsById(
        @Param("link") LinkJpaEntity link,
        @Param("name") String name,
        @Param("owner") String owner,
        @Param("descriptionMd5Hash") String descriptionMd5Hash,
        @Param("activitiesIds") Set<Long> activitiesIds,
        @Param("id") long id
    );

    Optional<GitHubRepositoryJpaEntity> findByNameAndOwner(String name, String owner);
}
