package edu.java.restApi.controllers;

import edu.java.restApi.dto.responses.InformationalResponse;
import jakarta.validation.constraints.Min;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/v1/tg-chat")
public class TelegramChatController {

    private static final Logger LOGGER = LogManager.getLogger();

    @PostMapping("/{id}")
    public ResponseEntity<InformationalResponse> registerChat(@PathVariable @Min(1) int id) {
        LOGGER.debug("Registering chat with id {}...", id);
        return ResponseEntity.ok(new InformationalResponse(STR."Successfully registered chat with id \{id}!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InformationalResponse> deleteChat(@PathVariable @Min(1) int id) {
        LOGGER.debug("Deleting chat with id {}...", id);
        return ResponseEntity.ok(new InformationalResponse(STR."Successfully deleted chat with id \{id}!"));
    }
}
