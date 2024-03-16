package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartSlashCommand implements SlashCommand {

    private static final String TEXT_COMMAND = "/start";
    private static final String DESCRIPTION = "Register in app";
    private static final String DEFAULT_RESPONSE = "Registration...";

    private final ScrapperTelegramChatClient scrapperTelegramChatClient;

    @Override
    public String executeAndGetResponse(Message message) {
        long chatId = message.chat().id();
        scrapperTelegramChatClient.registerNewChat(chatId);
        String username = message.from().username();
        return STR."Hello, \{username}!\n" + DEFAULT_RESPONSE;
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


