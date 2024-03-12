package edu.java.restApi.services;

import edu.java.data.dao.ChatDataAccessObject;
import edu.java.data.postgres.entities.Chat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TelegramChatService {

    private final ChatDataAccessObject chatDao;

    public Chat registerChat(long apiId) {
        return chatDao.registerChatWithApiId(apiId);
    }

    public void deleteChat(long apiId) {
        chatDao.deleteChatWithApiId(apiId);
    }
}
