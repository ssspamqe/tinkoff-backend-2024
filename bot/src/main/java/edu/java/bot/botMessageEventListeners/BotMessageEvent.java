package edu.java.bot.botMessageEventListeners;

import com.pengrad.telegrambot.model.Message;

public record BotMessageEvent(
    Message message
) {
}

