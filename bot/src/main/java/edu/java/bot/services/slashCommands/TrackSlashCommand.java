package edu.java.bot.services.slashCommands;

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
public class TrackSlashCommand implements ExecuableWithArgumentsSlashCommand, SimplyExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/track";
    private static final String DESCRIPTION = "Start tracking updates from given link";
    private static final String LINK_SUCCESSFULLY_ADDED_MESSAGE = "Given link was successfully added to /track it!";
    private static final String PARAMETERS_REQUEST_MESSAGE = "Reply to this message with link to /track it!";
    private static final String SUBSCRIPTION_WAS_PREVIOUSLY_ADDED = "This link was already added to /track it";

    private static final boolean NEED_ADDITIONAL_USER_PARAMETERS = true;

    private final SubscriptionRepository subscriptionRepository;
    private final Validator validator;

    @Autowired
    public TrackSlashCommand(SubscriptionRepository subscriptionRepository, Validator validator) {
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
        return PARAMETERS_REQUEST_MESSAGE;
    }

    @Override
    public String executeAndGetResponse(Message message) {
        Long userId = message.from().id();
        String link = message.text();

        Subscription subscription = new Subscription(0L, userId, link);

        var triggeredSubscriptionViolations = validator.validate(subscription);
        if (!triggeredSubscriptionViolations.isEmpty()) {
            return buildErrorResponse(triggeredSubscriptionViolations);
        }

        if (subscriptionWasPreviouslyAdded(subscription)) {
            return SUBSCRIPTION_WAS_PREVIOUSLY_ADDED;
        }

        subscriptionRepository.save(subscription);
        return LINK_SUCCESSFULLY_ADDED_MESSAGE;
    }

    private String buildErrorResponse(Set<ConstraintViolation<Subscription>> violations) {
        var violationList = violations.stream().toList();

        StringBuilder response = new StringBuilder();
        response.append("Can't /track link because:\n");
        for (int i = 0; i < violationList.size(); i++) {
            response.append(STR."\{i + 1}) \{violationList.get(i).getMessage()}");
        }

        return response.toString();
    }

    private boolean subscriptionWasPreviouslyAdded(Subscription subscription) {
        var userSubscriptions = subscriptionRepository.findAllByUserId(subscription.getUserId());
        boolean linkWasAlreadyAdded =
            userSubscriptions
                .stream()
                .anyMatch(
                    oldSubscription -> subscription.getLink().equals(oldSubscription.getLink())
                );
        return !userSubscriptions.isEmpty() && linkWasAlreadyAdded;
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
