package edu.java.bot.services.exceptions;

public class NotAReplyMessageException extends CommandServiceException {
    public NotAReplyMessageException(String message) {
        super(message);
    }
}
