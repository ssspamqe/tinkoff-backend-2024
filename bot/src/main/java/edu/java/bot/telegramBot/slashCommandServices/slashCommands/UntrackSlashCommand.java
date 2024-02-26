package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UntrackSlashCommand implements ExecutableWithUserParametersSlashCommand {

    private static final String TEXT_COMMAND = "/untrack";
    private static final String DESCRIPTION = "Stop tracking updates from given link";
    private static final String PARAMETERS_REQUEST_MESSAGE = "Reply to this message with link to /untrack it!";
    private static final String NO_SUCH_SUBSCRIPTION_MESSAGE = "You don't have such subscription";
    private static final String SUCCESSFULLY_UNTRACKED_MESSAGE = "/unrack command succeed!";

    private final SubscriptionRepository subscriptionRepository;
    private final Validator validator;

    @Autowired
    public UntrackSlashCommand(SubscriptionRepository subscriptionRepository, Validator validator) {
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
    public String executeAndGetResponse(Message message) {
        String username = message.from().username();
        return STR."\{username},\n\{PARAMETERS_REQUEST_MESSAGE}";
    }

    @Override
    public String executeWithUserParametersAndGetResponse(Message message) {
        Long userId = message.from().id();
        String link = message.text();
        Subscription subscriptionToDelete = new Subscription(0L, userId, link);

        var triggeredViolations = validator.validate(subscriptionToDelete);
        if (!triggeredViolations.isEmpty()) {
            return buildErrorResponse(triggeredViolations);
        }

        var userSubscriptions = subscriptionRepository.findAllByUserId(userId);
        Optional<Subscription> oldSubscription =
            userSubscriptions.stream()
                .filter(
                    subscription -> link.equals(subscription.getLink())
                ).findFirst();
        if (oldSubscription.isEmpty()) {
            return NO_SUCH_SUBSCRIPTION_MESSAGE;
        }

        subscriptionRepository.deleteById(oldSubscription.get().getId());
        return SUCCESSFULLY_UNTRACKED_MESSAGE;
    }

    private String buildErrorResponse(Set<ConstraintViolation<Subscription>> violations) {
        var violationList = violations.stream().toList();

        StringBuilder response = new StringBuilder();
        response.append("Can't /untrack link because:\n");
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
