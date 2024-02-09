package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.Message;

public interface ParameterizedSlashCommand extends SlashCommand {
    public String getParameterizedResponse(Message parameterizedMessage);

}
