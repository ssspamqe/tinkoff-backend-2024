package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.SingleUpdateChecker;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;

public interface StackOverflowQuestionSingleUpdateChecker
    extends SingleUpdateChecker<StackOverflowQuestion, StackOverflowQuestionBody> {
}
