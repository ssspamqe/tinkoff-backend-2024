package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.Message;

public non-sealed interface ParameterizedExecutableSlashCommand extends SlashCommand {
    String executeWithParametersAndGetResponse(Message message);
}

