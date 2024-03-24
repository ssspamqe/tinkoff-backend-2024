package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ChatJpaRepository extends JpaRepository<ChatJpaEntity, Long> {

    boolean existsById(long id);

    long removeById(long id);

}

