package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ChatJpaRepository extends JpaRepository<ChatJpaEntity, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO chat_links(chat_id, link_id) VALUES (:chat_id, :link_id)", nativeQuery = true)
    void associateLinkWithChatById(@Param("link_id") long linkId, @Param("chat_id") long chatId);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM chat_links WHERE chat_id = :chat_id AND link_id = :link_id", nativeQuery = true)
    void dissociateLinkWithChatById(@Param("link_id") long linkId, @Param("chat_id") long chatId);

    boolean existsById(long id);

    long removeById(long id);
}

