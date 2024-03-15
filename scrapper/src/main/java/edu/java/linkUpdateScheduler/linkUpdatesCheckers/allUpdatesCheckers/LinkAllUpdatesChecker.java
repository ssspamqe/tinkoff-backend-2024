package edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers;

import edu.java.data.postgres.entities.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.net.URI;
import java.util.List;

public interface LinkAllUpdatesChecker {
    List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException;
}
