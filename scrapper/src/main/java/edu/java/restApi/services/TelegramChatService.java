package edu.java.restApi.services;

import edu.java.data.redis.documents.TelegramChat;
import edu.java.data.redis.repositories.TelegramChatRepository;
import edu.java.restApi.services.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.services.exceptions.NoSuchChatException;
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

    public void registerChat(long apiId) {
        Optional<TelegramChat> oldChat = telegramChatRepository.findByApiId(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(STR."Chat with id \{apiId} was alreadyRegistered");
        }
        TelegramChat newChat = new TelegramChat(apiId);
        telegramChatRepository.save(newChat);
    }

    public void deleteChat(long apiId) {
        Optional<TelegramChat> chat = telegramChatRepository.findByApiId(apiId);
        if (chat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{apiId}");
        }
        telegramChatRepository.deleteById(chat.get().getId());
    }
}
