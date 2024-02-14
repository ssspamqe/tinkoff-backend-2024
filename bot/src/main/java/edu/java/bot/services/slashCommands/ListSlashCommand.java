package edu.java.bot.services.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import edu.java.bot.services.exceptions.BadLinkException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListSlashCommand implements ExecuableWithArgumentsSlashCommand {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String TEXT_COMMAND = "/list";
    private static final String DESCRIPTION = "Get list of subscriptions";
    private static final String NO_SUBSCRIPTIONS_RESPONSE = "There is no active subscriptions";

    private static final boolean NEED_ADDITIONAL_USER_PARAMETERS = false;

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
    public String executeAndGetResponse(Message message) {
        Long userId = message.from().id();
        List<Subscription> userSubscriptions = subscriptionRepository.findAllByUserId(userId);
        if (userSubscriptions.isEmpty()) {
            return NO_SUBSCRIPTIONS_RESPONSE;
        }
        return buildResponseFromSubscriptionList(userSubscriptions);
    }

    private String buildResponseFromSubscriptionList(List<Subscription> subscriptionList) {
        StringBuilder response = new StringBuilder();
        response.append("Here are your current subscriptions:\n");
        for (int i = 0; i < subscriptionList.size(); i++) {
            String link = subscriptionList.get(i).getLink();
            String host = parseHostFromLink(link);
            response.append(STR."\{i + 1})\{host}\n\{link}");
        }
        return response.toString();
    }

    private String parseHostFromLink(String link) {
        try {
            return new URI(link).getHost();
        } catch (URISyntaxException e) {
            throw new BadLinkException(STR."Cant parse host (link: \{link})");
        }
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
