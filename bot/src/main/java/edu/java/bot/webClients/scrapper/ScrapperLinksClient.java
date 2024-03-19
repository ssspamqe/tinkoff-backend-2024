package edu.java.bot.webClients.scrapper;

import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(url = "/links")
public interface ScrapperLinksClient {

    @GetExchange
    ListLinksResponse fetchTrackedLinksByChatId(@RequestHeader("Tg-Chat-Id") long chatId);

    @PostExchange
    LinkResponse trackLinkByChatId(
        @RequestBody AddLinkRequest addLinkRequest,
        @RequestHeader("Tg-Chat-Id") long chatId
    );

    @DeleteExchange
    LinkResponse untrackLinkByChatId(
        @RequestBody RemoveLinkRequest removeLinkRequest,
        @RequestHeader("Tg-Chat-Id") long chatId
    );
}

