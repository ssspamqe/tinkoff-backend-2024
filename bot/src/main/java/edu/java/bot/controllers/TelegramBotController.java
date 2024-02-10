package edu.java.bot.controllers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetMyCommands;
import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.services.CommandService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TelegramBotController {

    private static final Logger LOGGER = LogManager.getLogger();

    private final CommandService commandService;
    private final ApplicationConfig config;
    private final LoggingCallback loggingCallback;

    private TelegramBot bot;

    @Autowired
    public TelegramBotController(
        CommandService commandService,
        ApplicationConfig config,
        LoggingCallback loggingCallback
    ) {
        this.commandService = commandService;
        this.config = config;
        this.loggingCallback = loggingCallback;

        initializeBot();
    }

    private void initializeBot() {
        bot = new TelegramBot(config.telegramToken());
        bot.execute(new SetMyCommands(commandService.getAllBotCommands()));
        bot.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                SendMessage response = handleUpdate(update);
                bot.execute(response, loggingCallback);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    private SendMessage handleUpdate(Update update) {
        try {
            return commandService.handleMessage(update.message());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
            Long chatId = update.message().chat().id();
            return new SendMessage(chatId, ex.getMessage());
        }
    }

}
