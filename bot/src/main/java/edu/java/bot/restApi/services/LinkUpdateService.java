package edu.java.bot.restApi.services;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.restApi.dto.requests.LinkUpdate;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkUpdateService {

    private final TelegramBot telegramBot;

    public void sendUpdatesToBot(List<LinkUpdate> linkUpdates) {
        linkUpdates.forEach(this::handleLinkUpdate);
    }

    private void handleLinkUpdate(LinkUpdate linkUpdate) {
        String messageText = buildMessageText(linkUpdate);
        List<Long> chats = linkUpdate.tgChatIds();
        chats.forEach(chatId -> sendMessageToChatId(messageText, chatId));
    }

    private void sendMessageToChatId(String message, long chatId) {
        SendMessage sendMessageRequest = new SendMessage(chatId, message);
        telegramBot.execute(sendMessageRequest);
    }

    private String buildMessageText(LinkUpdate linkUpdate) {
        URI url = linkUpdate.url();
        String hostName = url.getHost();
        String updateMessage = linkUpdate.type().getMessage();

        return STR."Hello!\nThere is new update on \{hostName}: \{updateMessage}";
    }

}
