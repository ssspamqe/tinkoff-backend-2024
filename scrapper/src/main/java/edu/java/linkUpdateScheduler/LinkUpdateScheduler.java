package edu.java.linkUpdateScheduler;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.UniversalLinkUpdatesChecker;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LinkUpdateScheduler {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkDataAccessObject linkDao;
    private final UniversalLinkUpdatesChecker universalLinkUpdatesChecker;
    private final TelegramBotClient telegramBotClient;

    private boolean contextIsLoaded = false;
    @Value("${app.scheduler-config.force-check-delay}")
    private Duration forceCheckDelay;

    @Scheduled(fixedDelayString = "#{schedulerConfig.interval()}")
    @ConditionalOnProperty(value = "app.scheduler.enable", havingValue = "true")
    public void update() {
        if (!contextIsLoaded) {
            LOGGER.warn("Context is not loaded, skipping link updates checking...");
            return;
        }

        LOGGER.debug("LinkUpdateScheduler is looking for updates...");
        Collection<Link> linksToCheck = linkDao.findByLastCheckedAtBefore(buildBorderCheckTime());

        List<LinkUpdate> allLinkUpdates = new ArrayList<>();
        linksToCheck.forEach(link -> {
            List<LinkUpdate> linkUpdates =
                universalLinkUpdatesChecker.getUpdates(link);
            allLinkUpdates.addAll(linkUpdates);
        });

        handleUpdates(allLinkUpdates);
    }

    private LocalDateTime buildBorderCheckTime() {
        return LocalDateTime.now().minusSeconds(forceCheckDelay.getSeconds());
    }

    private void handleUpdates(List<LinkUpdate> allLinkUpdates) {
        if (!allLinkUpdates.isEmpty()) {
            LOGGER.debug(STR."Sending \{allLinkUpdates.size()} updates to bot...");
            try {
                telegramBotClient.sendLinkUpdates(allLinkUpdates);
                LOGGER.debug(STR."Sent \{allLinkUpdates.size()} updates to bot");
            } catch (Exception ex) {
                LOGGER.warn("Can't send updates to bot, because of {}", ex.getMessage());
            }
        } else {
            LOGGER.debug("No updates found...");
        }
    }

    @EventListener
    public void onContextRefreshed(ContextRefreshedEvent event) {
        contextIsLoaded = true;
    }

}
