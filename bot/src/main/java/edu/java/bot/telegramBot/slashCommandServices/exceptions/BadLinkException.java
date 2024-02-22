package edu.java.bot.telegramBot.slashCommandServices.exceptions;

public class BadLinkException extends CommandServiceException {
    public BadLinkException(String message) {
        super(message);
    }
}
