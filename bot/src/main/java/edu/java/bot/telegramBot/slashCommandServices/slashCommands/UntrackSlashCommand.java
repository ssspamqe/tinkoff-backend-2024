package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UntrackSlashCommand implements ParameterizedSlashCommand {

    private static final String TEXT_COMMAND = "/untrack";
    private static final String DESCRIPTION = "Stop tracking updates from given link";
    private static final String PARAMETERS_REQUEST_MESSAGE = "Reply to this message with link to /untrack it!";
    private static final String NO_SUCH_SUBSCRIPTION_MESSAGE = "You don't have such subscription";
    private static final String SUCCESSFULLY_UNTRACKED_MESSAGE = "/unrack command succeed!";

    private final ScrapperLinksClient scrapperLinksClient;

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String executeAndGetResponse(Message message) {
        String username = message.from().username();
        return STR."\{username},\n\{PARAMETERS_REQUEST_MESSAGE}";
    }

    @Override
    public String executeWithUserParametersAndGetResponse(Message message) {
        long chatId = message.from().id();
        String url = message.text();

        sendToScrapperNewUrlChatIdDissociation(url, chatId);

        return SUCCESSFULLY_UNTRACKED_MESSAGE;
    }

    private void sendToScrapperNewUrlChatIdDissociation(String url, long chatId) {
        RemoveLinkRequest removeLinkRequest = new RemoveLinkRequest(url);
        scrapperLinksClient.untrackLinkByChatId(removeLinkRequest, chatId);
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
