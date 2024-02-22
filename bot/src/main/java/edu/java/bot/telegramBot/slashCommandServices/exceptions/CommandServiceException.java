package edu.java.bot.telegramBot.slashCommandServices.exceptions;

public class CommandServiceException extends RuntimeException {
    public CommandServiceException(String message) {
        super(message);
    }

}
