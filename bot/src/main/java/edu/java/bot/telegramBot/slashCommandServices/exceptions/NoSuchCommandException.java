package edu.java.bot.telegramBot.slashCommandServices.exceptions;

public class NoSuchCommandException extends CommandServiceException {
    public NoSuchCommandException(String message) {
        super(message);
    }
}
