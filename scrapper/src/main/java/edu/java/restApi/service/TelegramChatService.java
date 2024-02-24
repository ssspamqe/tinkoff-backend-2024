package edu.java.restApi.service;

import edu.java.data.entities.TelegramChat;
import edu.java.data.repositories.TelegramChatRepository;
import edu.java.restApi.service.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.service.exceptions.NoSuchChatException;
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

    public void registerChat(long telegramChatId) {
        Optional<TelegramChat> oldChat = telegramChatRepository.findByTelegramChatId(telegramChatId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(STR."Chat with id \{telegramChatId} was alreadyRegistered");
        }
        TelegramChat newChat = new TelegramChat(UUID.randomUUID(), telegramChatId, LocalDateTime.now());
        telegramChatRepository.save(newChat);
    }

    public void deleteChat(long telegramChatId) {
        Optional<TelegramChat> chat = telegramChatRepository.findByTelegramChatId(telegramChatId);
        if (chat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{telegramChatId}");
        }
        UUID chatId = chat.get().id();
        telegramChatRepository.deleteById(chatId);
    }
}
