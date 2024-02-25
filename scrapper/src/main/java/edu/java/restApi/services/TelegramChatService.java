package edu.java.restApi.services;

import edu.java.data.entities.TelegramChat;
import edu.java.data.repositories.TelegramChatRepository;
import edu.java.restApi.services.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramChatService {

    private final TelegramChatRepository telegramChatRepository;

    @Autowired
    public TelegramChatService(TelegramChatRepository telegramChatRepository) {
        this.telegramChatRepository = telegramChatRepository;
    }

    public void registerChat(long id) {
        Optional<TelegramChat> oldChat = telegramChatRepository.findById(id);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(STR."Chat with id \{id} was alreadyRegistered");
        }
        TelegramChat newChat = new TelegramChat(id, LocalDateTime.now());
        telegramChatRepository.save(newChat);
    }

    public void deleteChat(long id) {
        Optional<TelegramChat> chat = telegramChatRepository.findById(id);
        if (chat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{id}");
        }
        telegramChatRepository.deleteById(id);
    }
}
