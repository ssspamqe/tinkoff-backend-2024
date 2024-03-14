package edu.java.linkUpdateScheduler.linkUpdatesCheckers;

import edu.java.linkUpdateScheduler.exceptions.LinkUpdateSchedulerException;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniversalLinkUpdatesChecker {

    private final List<LinkUpdatesChecker> linkUpdatesCheckers;

    List<LinkUpdate> getUpdate(URI url) {
        for (var linkUpdateChecker : linkUpdatesCheckers) {
            try {
                return linkUpdateChecker.getUpdates(url);
            } catch (LinkUpdateSchedulerException _) {
            }
        }
        return List.of();
    }
}
