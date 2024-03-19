package edu.java.bot.webClients.scrapper;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange("/tg-chat")
public interface ScrapperTelegramChatClient {

    @PostExchange(url = "/{id}")
    void registerNewChat(@PathVariable long id);

    @DeleteExchange(url = "/{id}")
    void deleteChat(@PathVariable long id);
}
