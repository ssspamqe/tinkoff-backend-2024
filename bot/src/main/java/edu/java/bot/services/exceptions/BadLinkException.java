package edu.java.bot.services.exceptions;

public class BadLinkException extends CommandServiceException {
    public BadLinkException(String message) {
        super(message);
    }
}
