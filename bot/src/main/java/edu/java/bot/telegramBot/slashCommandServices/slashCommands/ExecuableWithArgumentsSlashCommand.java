package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

import com.pengrad.telegrambot.model.Message;

public non-sealed interface ExecuableWithArgumentsSlashCommand extends SlashCommand {
    String executeAndGetResponse(Message message);
}

