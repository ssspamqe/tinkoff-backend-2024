package edu.java.restApi.services;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.postgres.entities.Chat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TelegramChatService {

    private final ChatDataAccessObject chatDao;

    public Chat registerChat(long apiId) {
        return chatDao.registerChatWithId(apiId);
    }

    public void deleteChat(long apiId) {
        chatDao.deleteChatWithId(apiId);
    }
}
