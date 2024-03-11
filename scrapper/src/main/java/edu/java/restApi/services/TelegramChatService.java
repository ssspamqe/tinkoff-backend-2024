package edu.java.restApi.services;

import edu.java.dao.redis.documents.CachedTelegramChat;
import edu.java.dao.redis.repositories.TelegramChatCacheRepository;
import edu.java.restApi.services.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramChatService {

    private final TelegramChatCacheRepository telegramChatCacheRepository;

    @Autowired
    public TelegramChatService(TelegramChatCacheRepository telegramChatCacheRepository) {
        this.telegramChatCacheRepository = telegramChatCacheRepository;
    }

    public void registerChat(long apiId) {
        Optional<CachedTelegramChat> oldChat = telegramChatCacheRepository.findByApiId(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(apiId);
        }
        CachedTelegramChat newChat = new CachedTelegramChat(apiId);
        telegramChatCacheRepository.save(newChat);
    }

    public void deleteChat(long apiId) {
        CachedTelegramChat chat = telegramChatCacheRepository.findByApiId(apiId)
            .orElseThrow(() -> new NoSuchChatException(apiId));
        telegramChatCacheRepository.deleteById(chat.getId());
    }
}
