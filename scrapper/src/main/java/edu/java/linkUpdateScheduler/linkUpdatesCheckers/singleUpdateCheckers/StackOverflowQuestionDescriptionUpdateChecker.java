package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;

public class StackOverflowQuestionDescriptionUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        String oldHash = oldState.getDescriptionMd5Hash();
        String newHash = newState.getMd5hash();
        return !oldHash.equalsIgnoreCase(newHash);
    }
}
