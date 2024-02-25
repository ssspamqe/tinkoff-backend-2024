package edu.java.restApi.controllers;

import edu.java.restApi.controllers.dto.requests.AddLinkRequest;
import edu.java.restApi.controllers.dto.requests.RemoveLinkRequest;
import edu.java.restApi.controllers.dto.responses.LinkResponse;
import edu.java.restApi.controllers.dto.responses.ListLinksResponse;
import edu.java.restApi.services.LinkService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/links")
public class LinkController {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    public ResponseEntity<ListLinksResponse> getTrackedLinksByChatId(@RequestHeader("Tg-Chat-Id") @Min(0) int chatId) {
        LOGGER.debug(STR."Returning all subscribed links. Chat id: \{chatId} ");
        return ResponseEntity.ok(new ListLinksResponse(
            List.of(new LinkResponse(1, "some/link")),
            1
        ));
    }

    @PostMapping
    public ResponseEntity<LinkResponse> addLinkToTrack(
        @RequestHeader("Tg-Chat-Id") @Min(0) int chatId,
        @Valid @RequestBody AddLinkRequest addLinkRequest
    ) {
        LOGGER.debug(STR."Adding new link (\{addLinkRequest.link()}) to track by chat with id \{chatId}}");
        return ResponseEntity.ok(new LinkResponse(1, addLinkRequest.link()));
    }

    @DeleteMapping
    public ResponseEntity<LinkResponse> deleteTrackedLink(
        @RequestHeader("Tg-Chat-Id") @Min(0) int chatId,
        @Valid @RequestBody RemoveLinkRequest removeLinkRequest
    ) {
        LOGGER.debug(STR."Delete link \{removeLinkRequest.link()} from tracking of chat with id \{chatId}}");
        return ResponseEntity.ok(new LinkResponse(1, "example/link"));
    }

}
