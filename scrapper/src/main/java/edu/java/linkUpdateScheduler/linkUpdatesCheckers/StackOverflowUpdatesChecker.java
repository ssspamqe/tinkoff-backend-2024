package edu.java.linkUpdateScheduler.linkUpdatesCheckers;

import edu.java.data.dao.LinkDataAccessObject;
import edu.java.data.postgres.entities.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.exceptions.UnsuccessfulStackOverflowQuestionUrlParseException;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.net.URI;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StackOverflowUpdatesChecker implements LinkUpdatesChecker {

    private static final Set<String> HOST_NAMES = Set.of("stackoverflow.com");

    private static final Pattern QUESTION_ID_EXCTRACTOR_PATTERN = Pattern.compile("questions/(\\d+)/");

    private final LinkDataAccessObject linkDao;
    private final StackOverflowClient stackOverflowClient;

    @Override
    public List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException {
        URI url = URI.create(link.getUrl());
        String hostName = url.getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        long questionId = extractQuestionId(url);
        StackOverflowResponseBody<StackOverflowQuestionBody> = stackOverflowClient.findQuestio
    }

    private boolean isIncorrectHostName(String hostName) {
        return !HOST_NAMES.contains(hostName);
    }

    private long extractQuestionId(URI url) {
        Matcher matcher = QUESTION_ID_EXCTRACTOR_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        } else {
            throw new UnsuccessfulStackOverflowQuestionUrlParseException(url);
        }
    }

    private boolean hasDescriptionUpdates()
}
