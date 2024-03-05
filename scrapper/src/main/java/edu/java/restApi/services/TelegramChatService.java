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
            throw new DoubleChatRegistrationException(apiId);
        }
        TelegramChat newChat = new TelegramChat(apiId);
        telegramChatRepository.save(newChat);
    }

    public void deleteChat(long apiId) {
        TelegramChat chat = telegramChatRepository.findByApiId(apiId)
            .orElseThrow(() -> new NoSuchChatException(apiId));
        telegramChatRepository.deleteById(chat.getId());
    }
}
