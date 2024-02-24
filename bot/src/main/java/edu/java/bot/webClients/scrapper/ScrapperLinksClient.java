package edu.java.bot.webClients.scrapper;

import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(url = "/links")
public interface ScrapperLinksClient {

    @GetExchange
    ResponseEntity<?> getTrackedLinks(@RequestHeader("Tg-Chat-Id") int chatId);

    @PostExchange
    ResponseEntity<?> trackLink(@RequestHeader("Tg-Chat-Id") int chatId, AddLinkRequest addLinkRequest);

    @DeleteExchange
    ResponseEntity<?> untrackLink(@RequestHeader("Tg-Chat-Id") int chatId, RemoveLinkRequest removeLinkRequest);

}

