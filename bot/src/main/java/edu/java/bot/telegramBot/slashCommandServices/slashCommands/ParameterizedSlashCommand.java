package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.Message;

public interface ParameterizedSlashCommand extends SlashCommand {
    String executeWithUserParametersAndGetResponse(Message message);
}
