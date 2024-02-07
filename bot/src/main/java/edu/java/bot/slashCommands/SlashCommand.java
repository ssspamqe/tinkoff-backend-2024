package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SendMessage;

public interface SlashCommand {

    String getTextCommand();

    String getDescription();

    SendMessage getSendMessageRequest(long chatId);

    BotCommand getBotCommand();
}
