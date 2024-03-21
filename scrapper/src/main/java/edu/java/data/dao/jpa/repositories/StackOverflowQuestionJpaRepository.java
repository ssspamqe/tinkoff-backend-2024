package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StackOverflowQuestionJpaRepository extends JpaRepository<StackOverflowQuestionJpaEntity, Long> {

    Optional<StackOverflowQuestionJpaEntity> findByLinkId(long linkId);

    @Transactional
    @Modifying
    @Query("""
        update StackOverflowQuestionJpaEntity s
        set s.link = :link,
        s.descriptionMd5Hash = :descriptionMd5Hash,
        s.answersIds = :answersIds
        where s.id = :id""")
    void updateAllFieldsById(
        @Param("link") LinkJpaEntity link,
        @Param("descriptionMd5Hash") String descriptionMd5Hash,
        @Param("answersIds") Set<Long> answersIds,
        @Param("id") long id
    );
}
