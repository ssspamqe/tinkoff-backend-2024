package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

import edu.java.webClients.telegramBot.dto.requests.LinkUpdateType;

public interface SingleUpdateChecker<A, B> {
    LinkUpdateType getType();

    boolean hasUpdate(A oldState, B newState);
}
