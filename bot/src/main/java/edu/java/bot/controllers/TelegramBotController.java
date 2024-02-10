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

    private TelegramBot bot;

    @Autowired
    public TelegramBotController(
        CommandService commandService,
        ApplicationConfig config
    ) {
        this.commandService = commandService;
        this.config = config;

        initializeBot();
    }

    private void initializeBot() {
        bot = new TelegramBot(config.telegramToken());
        bot.execute(new SetMyCommands(commandService.getAllBotCommands()));
        bot.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                SendMessage response = handleUpdate(update);
                bot.execute(response);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    private SendMessage handleUpdate(Update update) {
        Long chatId = update.message().chat().id();

        try {
            return commandService.handleMessage(update.message());
        } catch (Exception ex) {
            LOGGER.error(ex);
            return new SendMessage(chatId, ex.getMessage());
        }
    }

}
