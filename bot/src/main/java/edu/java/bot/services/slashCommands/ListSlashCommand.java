package edu.java.bot.services.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListSlashCommand implements ParameterizedExecutableSlashCommand {


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
    public String executeWithParametersAndGetResponse(Message message) {
        Long userId = message.from().id();
        List<Subscription> userSubscriptions = subscriptionRepository.findAllByUserId(userId);
        if (userSubscriptions.isEmpty()) {
            return NO_SUBSCRIPTIONS_RESPONSE;
        }
        return getResponseFromSubscriptionList(userSubscriptions);
    }

    private String getResponseFromSubscriptionList(List<Subscription> subscriptionList) {
        StringBuilder response = new StringBuilder();
        response.append("Here are your current subscriptions:\n");
        for (int i = 0; i < subscriptionList.size(); i++) {
            response.append(STR."\{i + 1}) \{subscriptionList.get(i).getLink()}\n");
        }
        return response.toString();
    }

    private String getHost(String s){
        try{
            return new URL(s).getHost();
        } catch (MalformedURLException exception){
            throw new
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
