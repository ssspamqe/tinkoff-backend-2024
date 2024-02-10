package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackSlashSlashCommand implements ParameterizedExecutableSlashCommand, NoParametersExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/track";
    private static final String DESCRIPTION = "Start tracking updates from given link";
    private static final String LINK_SUCCESSFULLY_ADDED = "Given link was successfully added to /track it!";
    private static final String INIT_REQUEST_MESSAGE = "Reply to this message with link to /track it!";

    private final SubscriptionRepository subscriptionRepository;
    private final Validator validator;

    @Autowired
    public TrackSlashSlashCommand(SubscriptionRepository subscriptionRepository, Validator validator) {
        this.subscriptionRepository = subscriptionRepository;
        this.validator = validator;
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
    public String executeAndGetResponse() {
        return INIT_REQUEST_MESSAGE;
    }

    @Override
    public String executeWithParametersAndGetResponse(Message message) {
        Long userId = message.from().id();
        String link = message.text();
        Subscription subscription = new Subscription(0L, userId, link);

        var triggeredViolations = validator.validate(subscription);
        if (!triggeredViolations.isEmpty()) {
            return getErrorResponse(triggeredViolations);
        }

        subscriptionRepository.save(subscription);

        return LINK_SUCCESSFULLY_ADDED;
    }

    private String getErrorResponse(Set<ConstraintViolation<Subscription>> violations) {
        var violationList = violations.stream().toList();

        StringBuilder response = new StringBuilder();
        response.append("Can't /track link because:\n");
        for (int i = 0; i < violationList.size(); i++) {
            response.append(STR."\{i + 1}) \{violationList.get(i).getMessage()}");
        }

        return response.toString();
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }

}
