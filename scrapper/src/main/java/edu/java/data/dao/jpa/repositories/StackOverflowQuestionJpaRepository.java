package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StackOverflowQuestionJpaRepository extends JpaRepository<LinkJpaEntity, Long> {
}
