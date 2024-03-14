package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;

public interface StackOverflowQuestionSingleUpdateChecker
    extends SingleUpdateChecker<StackOverflowQuestion, StackOverflowQuestionBody> {
}
