package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;

public interface SlashCommand {

    String executeAndGetResponse(Message message);

    String getTextCommand();

    String getDescription();

    BotCommand getBotCommand();
}
