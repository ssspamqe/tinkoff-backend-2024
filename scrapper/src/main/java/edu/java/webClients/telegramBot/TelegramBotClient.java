package edu.java.webClients.telegramBot;

import edu.java.webClients.telegramBot.dto.LinkUpdate;
import org.apache.kafka.clients.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

@HttpExchange
public interface TelegramBotClient {

    @PostExchange(url = "/updates")
    ResponseEntity<?> sendLinkUpdate(@RequestBody LinkUpdate linkUpdate);
}
