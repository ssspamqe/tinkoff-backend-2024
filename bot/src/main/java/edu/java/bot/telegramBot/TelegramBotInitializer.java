package edu.java.bot.telegramBot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetMyCommands;
import edu.java.bot.services.CommandService;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TelegramBotInitializer {

    private final static Logger LOGGER = LogManager.getLogger();

    private final TelegramBot bot;
    private final CommandService commandService;

    @Autowired TelegramBotInitializer(TelegramBot bot, CommandService commandService) {
        this.bot = bot;
        this.commandService = commandService;
    }

    @EventListener
    public void onSpringRefreshedEvent(ContextRefreshedEvent event) {
        bot.execute(new SetMyCommands(commandService.getAllBotCommands()));
        bot.setUpdatesListener(this::handleBotUpdates);
    }

    private int handleBotUpdates(List<Update> updates) {
        updates.forEach(update -> {
            SendMessage response = getResponse(update.message());
            bot.execute(response);
        });
        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }

    private SendMessage getResponse(Message message) {
        try {
            return commandService.handleMessage(message);
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
            Long chatId = message.chat().id();
            return new SendMessage(chatId, ex.getMessage());
        }
    }

}
