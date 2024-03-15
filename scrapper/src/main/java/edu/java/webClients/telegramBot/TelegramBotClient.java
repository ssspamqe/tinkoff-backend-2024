package edu.java.webClients.telegramBot;

import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface TelegramBotClient {
    @PostExchange(url = "/updates")
    void sendLinkUpdates(@RequestBody List<LinkUpdate> linkUpdates);
}
