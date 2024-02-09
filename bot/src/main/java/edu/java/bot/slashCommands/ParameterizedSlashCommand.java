package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;

public interface ParameterizedSlashCommand extends SlashCommand{
    public SendMessage getParameterizedResponse(Message parameterizedMessage);

}
