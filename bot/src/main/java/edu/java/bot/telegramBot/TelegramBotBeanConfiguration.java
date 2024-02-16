package edu.java.bot.telegramBot;

import com.pengrad.telegrambot.TelegramBot;
import edu.java.bot.configuration.ApplicationConfig;
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
        return new TelegramBot(applicationConfig.telegramToken());
    }
}
