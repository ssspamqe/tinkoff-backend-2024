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
    public ResponseEntity<ListLinksResponse> getTrackedLinksByChatId(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatApiId
    ) {
        List<LinkResponse> trackedLinks =
            linkService.getTrackedLinks(chatApiId).stream().map(LinkResponse::new).toList();
        ListLinksResponse listLinksResponse = new ListLinksResponse(trackedLinks, trackedLinks.size());
        return ResponseEntity.ok(listLinksResponse);
    }

    @PostMapping
    public ResponseEntity<LinkResponse> trackLink(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatId,
        @Valid @RequestBody AddLinkRequest addLinkRequest
    ) {
        String linkUrl = addLinkRequest.url();
        LOGGER.warn(linkUrl);
        LinkResponse linkResponse = new LinkResponse(linkService.addLinkToTrack(chatId, linkUrl));
        return ResponseEntity.ok(linkResponse);
    }

    @DeleteMapping
    public ResponseEntity<LinkResponse> untrackLink(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatId,
        @Valid @RequestBody RemoveLinkRequest removeLinkRequest
    ) {
        String linkUrl = removeLinkRequest.url();
        LinkResponse linkResponse = new LinkResponse(linkService.untrackLink(chatId, linkUrl));
        return ResponseEntity.ok(linkResponse);
    }

}
