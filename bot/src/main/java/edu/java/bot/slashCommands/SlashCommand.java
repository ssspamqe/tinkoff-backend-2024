package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;

public interface SlashCommand {

    String getTextCommand();

    String getDescription();

    String getSimpleResponse(Message message);

    BotCommand getBotCommand();
}
