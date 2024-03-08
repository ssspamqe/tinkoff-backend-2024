package edu.java.webClients.telegramBot.dto.requests;

import java.net.URI;
import java.util.List;

public record LinkUpdate(
    int id,
    URI url,
    String description,
    List<Integer> tgChatIds
) {
}
