package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

public interface SingleUpdateChecker<A, B> {
    LinkUpdateType getType();

    boolean hasUpdate(A oldState, B newState);
}
