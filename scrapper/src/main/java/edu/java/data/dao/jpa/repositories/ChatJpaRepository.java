package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatJpaRepository extends JpaRepository<ChatJpaEntity, Long> {
}
