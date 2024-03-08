package edu.java.bot.telegramBot.slashCommandServices.exceptions;

public class NotACommandOrUserParameterException extends CommandServiceException {
    public NotACommandOrUserParameterException(String message) {
        super(message);
    }
}
