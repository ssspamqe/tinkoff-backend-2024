package edu.java.webClients.telegramBot.dto.requests;

import java.net.URI;
import java.util.Set;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType type,
    Set<Long> tgChatIds
) {
}
