package edu.java.bot.services.exceptions;

public class NoSuchCommandException extends CommandServiceException {
    public NoSuchCommandException(String message) {
        super(message);
    }
}
