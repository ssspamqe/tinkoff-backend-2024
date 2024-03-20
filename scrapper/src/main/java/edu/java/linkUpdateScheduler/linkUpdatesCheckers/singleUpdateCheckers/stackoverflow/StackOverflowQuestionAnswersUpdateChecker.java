package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.data.dto.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdateType;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StackOverflowQuestionAnswersUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {

    private final StackOverflowClient stackOverflowClient;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_ANSWERS;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        Set<Long> oldAnswers = oldState.getAnswerIds();
        Set<Long> newAnswers = fetchAnswersIds(newState.id());

        return !oldAnswers.equals(newAnswers);
    }

    private Set<Long> fetchAnswersIds(long questionId) {
        return stackOverflowClient
            .fetchAnswersByQuestionId(questionId)
            .items().stream()
            .map(StackOverflowAnswerBody::id)
            .collect(Collectors.toSet());
    }

}
