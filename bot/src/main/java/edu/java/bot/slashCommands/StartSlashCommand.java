package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import org.springframework.stereotype.Component;

@Component
public class StartSlashCommand implements SlashCommand {

    private static final String TEXT_COMMAND = "/start";

    private static final String DESCRIPTION = "Register in app";

    private static final String DEFAULT_RESPONSE = "Registration...";

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String getSimpleResponse() {
        return DEFAULT_RESPONSE;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
