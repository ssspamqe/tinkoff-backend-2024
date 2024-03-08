package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import org.springframework.stereotype.Component;

@Component
public class StartSlashCommand implements SlashCommand {

    private static final String TEXT_COMMAND = "/start";
    private static final String DESCRIPTION = "Register in app";
    private static final String DEFAULT_RESPONSE = "Registration...";

    @Override
    public String executeAndGetResponse(Message message) {
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


