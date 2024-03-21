package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LinkJpaRepository extends JpaRepository<LinkJpaEntity, Long> {
    Optional<LinkJpaEntity> findByUrl(URI url);

    Set<LinkJpaEntity> findByLastCheckedAtBefore(LocalDateTime lastCheckedAt);

    boolean existsById(Long id);

    @Transactional @Modifying @Query("update LinkJpaEntity l set l.lastCheckedAt = ?1 where l.id = ?2")
    void updateLastCheckedAtById(LocalDateTime lastCheckedAt, long id);
}
