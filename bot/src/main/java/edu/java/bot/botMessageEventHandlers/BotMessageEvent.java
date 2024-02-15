package edu.java.bot.botMessageEventHandlers;

import com.pengrad.telegrambot.model.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BotMessageEvent {
    private Message userMessage;
}
