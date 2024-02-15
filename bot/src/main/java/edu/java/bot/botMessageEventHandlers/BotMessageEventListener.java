package edu.java.bot.botMessageEventHandlers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.services.CommandService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BotMessageEventListener {

    private final static Logger LOGGER = LogManager.getLogger();

    private final TelegramBot bot;
    private final CommandService commandService;

    public BotMessageEventListener(TelegramBot bot, CommandService commandService) {
        this.bot = bot;
        this.commandService = commandService;
    }

    @EventListener
    private void onBotMessageEvent(BotMessageEvent event) {
        Message message = event.getUserMessage();
        SendMessage response = getResponse(message);
        bot.execute(response);
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
