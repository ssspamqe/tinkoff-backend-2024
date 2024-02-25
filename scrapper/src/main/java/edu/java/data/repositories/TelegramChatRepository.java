package edu.java.data.repositories;

import edu.java.data.entities.TelegramChat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelegramChatRepository extends CrudRepository<TelegramChat, Long> {
}

