package edu.java.webClients.telegramBot.dto.requests;

import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.LinkUpdateType;
import java.net.URI;
import java.util.List;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType type,
    List<Long> tgChatIds
) {
}
