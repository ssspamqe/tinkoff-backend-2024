package edu.java.restApi.services;

import edu.java.data.entities.TelegramChat;
import edu.java.data.repositories.TelegramChatRepository;
import edu.java.restApi.services.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramChatService {

    private final TelegramChatRepository telegramChatRepository;

    @Autowired
    public TelegramChatService(TelegramChatRepository telegramChatRepository) {
        this.telegramChatRepository = telegramChatRepository;
    }

    public void registerChat(long apiId) {
        Optional<TelegramChat> oldChat = telegramChatRepository.findByApiId(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(STR."Chat with id \{apiId} was alreadyRegistered");
        }
        TelegramChat newChat = new TelegramChat(UUID.randomUUID(), apiId, LocalDateTime.now());
        telegramChatRepository.save(newChat);
    }

    public void deleteChat(long apiId) {
        Optional<TelegramChat> chat = telegramChatRepository.findByApiId(apiId);
        if (chat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{apiId}");
        }
        UUID telegramChatId = chat.get().id();
        telegramChatRepository.deleteById(telegramChatId);
    }
}
