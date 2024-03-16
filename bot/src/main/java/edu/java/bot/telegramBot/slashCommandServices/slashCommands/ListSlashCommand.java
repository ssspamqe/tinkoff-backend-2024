package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ListSlashCommand implements SlashCommand {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String TEXT_COMMAND = "/list";
    private static final String DESCRIPTION = "Get list of subscriptions";
    private static final String NO_TRACKED_LINKS_RESPONSE = "There is no active subscriptions";

    private final ScrapperLinksClient scrapperLinksClient;

    @Override
    public String executeAndGetResponse(Message message) {
        Long chatId = message.from().id();

        var trackedLinks = scrapperLinksClient.fetchTrackedLinksByChatId(chatId).links();

        return buildResponseFromLinkResponses(trackedLinks);
    }

    private String buildResponseFromLinkResponses(List<LinkResponse> linkResponses) {
        if (linkResponses.isEmpty()) {
            return NO_TRACKED_LINKS_RESPONSE;
        }

        StringBuilder response = new StringBuilder();
        response.append("Here are your current subscriptions:\n");
        for (int i = 0; i < linkResponses.size(); i++) {
            URI url = linkResponses.get(i).url();
            response.append(STR."\{i + 1}) \{url.getHost()}\n\{url}\n");
        }
        return response.toString();
    }

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
