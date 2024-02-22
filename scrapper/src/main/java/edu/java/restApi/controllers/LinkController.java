package edu.java.restApi.controllers;

import jakarta.validation.constraints.Min;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/v1/links")
public class LinkController {

    private static Logger LOGGER = LogManager.getLogger();

    @GetMapping
    public List<String> getAllSubscribedLinks(@RequestHeader("Tg-Chat-Id") @Min(0) int chatId) {
        LOGGER.info("Returning all subscribed links. Chat id: {} ", chatId);
        return List.of("link1", "link2");
    }
}
