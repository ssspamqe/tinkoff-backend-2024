package edu.java.bot.services.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import org.springframework.stereotype.Component;

@Component
public class StartSlashCommand implements NoParametersExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/start";
    private static final String DESCRIPTION = "Register in app";
    private static final String DEFAULT_RESPONSE = "Registration...";

    private static final boolean NEED_ADDITIONAL_USER_PARAMETERS = false;

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String executeAndGetResponse() {
        return DEFAULT_RESPONSE;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }

    @Override
    public boolean needAdditionalUserParameter() {
        return NEED_ADDITIONAL_USER_PARAMETERS;
    }
}


