package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListSlashCommand implements ParameterizedExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/list";

    private static final String DESCRIPTION = "Get list of subscriptions";

    private static final String NO_SUBSCRIPTIONS_RESPONSE = "There is no active subscription";

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public ListSlashCommand(SubscriptionRepository subscriptionRepository) {
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
    public String executeWithParametersAndGetResponse(Message message) {
        return null;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}
