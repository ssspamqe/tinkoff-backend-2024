package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TrackSlashCommand implements ParameterizedSlashCommand {

    private static final String TEXT_COMMAND = "/track";
    private static final String DESCRIPTION = "Start tracking updates from given link";
    private static final String LINK_SUCCESSFULLY_ADDED_MESSAGE = "Given link was successfully added to /track it!";
    private static final String PARAMETERS_REQUEST_MESSAGE = "Reply to this message with link to /track it!";
    private static final String SUBSCRIPTION_WAS_PREVIOUSLY_ADDED = "This link was already added to /track it";

    private final Validator validator;
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

    @Override //TODO add exception handling
    public String executeWithUserParametersAndGetResponse(Message message) {
        Long chatId = message.chat().id();
        String url = message.text();

        sendToScrapperNewUrlChatIdAssociation(url, chatId);

        return LINK_SUCCESSFULLY_ADDED_MESSAGE;
    }

    public void sendToScrapperNewUrlChatIdAssociation(String url, long chatId) {
        AddLinkRequest addLinkRequest = new AddLinkRequest(url);
        scrapperLinksClient.trackLinkByChatId(addLinkRequest, chatId);
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
