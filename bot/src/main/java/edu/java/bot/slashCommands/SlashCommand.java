package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;

public interface SlashCommand {

    String getTextCommand();

    String getDescription();

    String executeAndGetResponse();

    BotCommand getBotCommand();
}
