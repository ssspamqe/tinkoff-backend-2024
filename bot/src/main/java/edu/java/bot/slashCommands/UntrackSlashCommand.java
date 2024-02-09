package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UntrackSlashCommand implements ParameterizedSlashCommand {

    private static final String TEXT_COMMAND = "/unrack";

    private static final String DESCRIPTION = "Stop tracking updates from given link";

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public UntrackSlashCommand(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
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
    public String getSimpleResponse() {
        return null;
    }

    @Override
    public String getParameterizedResponse(Message message) {
        return null;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
