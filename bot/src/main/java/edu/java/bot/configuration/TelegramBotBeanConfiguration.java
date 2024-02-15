package edu.java.bot.configuration;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SetMyCommands;
import edu.java.bot.botMessageEventHandlers.BotMessageEvent;
import edu.java.bot.services.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramBotBeanConfiguration {

    private final ApplicationConfig applicationConfig;
    private final CommandService commandService;
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public TelegramBotBeanConfiguration(
        ApplicationConfig applicationConfig,
        CommandService commandService,
        ApplicationEventPublisher eventPublisher
    ) {
        this.applicationConfig = applicationConfig;
        this.commandService = commandService;
        this.eventPublisher = eventPublisher;
    }

    @Bean
    public TelegramBot telegramBot() {
        TelegramBot bot = new TelegramBot(applicationConfig.telegramToken());
        bot.execute(new SetMyCommands(commandService.getAllBotCommands()));
        bot.setUpdatesListener(updates -> {
            updates.forEach(update ->
                eventPublisher.publishEvent(
                    new BotMessageEvent(update.message())
                )
            );
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
        return bot;
    }
}
