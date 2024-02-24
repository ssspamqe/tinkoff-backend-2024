package edu.java.data.repositories;

import edu.java.data.entities.TelegramChat;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelegramChatRepository extends CrudRepository<TelegramChat, UUID> {
    Optional<TelegramChat> findByTelegramChatId(long telegramChatId);
}
