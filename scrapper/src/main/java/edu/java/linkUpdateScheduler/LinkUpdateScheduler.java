package edu.java.linkUpdateScheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LinkUpdateScheduler {

    private static final Logger LOGGER = LogManager.getLogger();

    @Scheduled(fixedDelayString = "#{scheduler.forceCheckDelay()}")
    public void update() {
        LOGGER.debug("Looking for updates...");
    }
}
