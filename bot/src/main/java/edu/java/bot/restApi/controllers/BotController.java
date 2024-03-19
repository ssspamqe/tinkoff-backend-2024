package edu.java.bot.restApi.controllers;

import edu.java.bot.restApi.dto.requests.LinkUpdate;
import edu.java.bot.restApi.services.LinkUpdateService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot/api/v1")
@RequiredArgsConstructor
public class BotController {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkUpdateService linkUpdateService;

    @PostMapping("/updates")
    public ResponseEntity<?> addUpdate(@Valid @RequestBody List<LinkUpdate> linkUpdates) {
        linkUpdateService.sendUpdatesToBot(linkUpdates);
        return ResponseEntity.ok().build();
    }
}
