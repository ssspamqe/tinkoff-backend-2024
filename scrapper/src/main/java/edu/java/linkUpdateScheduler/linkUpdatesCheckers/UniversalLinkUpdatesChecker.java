package edu.java.linkUpdateScheduler.linkUpdatesCheckers;

import edu.java.data.postgres.entities.Link;
import edu.java.linkUpdateScheduler.exceptions.LinkUpdateSchedulerException;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniversalLinkUpdatesChecker {

    private final List<LinkAllUpdatesChecker> linkAllUpdatesCheckers;

    public List<LinkUpdate> getUpdates(Link link) {
        for (var linkUpdateChecker : linkAllUpdatesCheckers) {
            try {
                return linkUpdateChecker.getUpdates(link);
            } catch (LinkUpdateSchedulerException _) {
            }
        }
        return List.of();
    }
}
