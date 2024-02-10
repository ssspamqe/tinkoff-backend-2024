package edu.java.bot.services.exceptions;

public class NotACommandOrUserParameterException extends CommandServiceException {
    public NotACommandOrUserParameterException(String message) {
        super(message);
    }
}
