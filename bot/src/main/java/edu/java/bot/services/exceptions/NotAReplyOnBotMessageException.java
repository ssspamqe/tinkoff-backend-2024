package edu.java.bot.services.exceptions;

public class NotAReplyOnBotMessageException extends CommandServiceException {
    public NotAReplyOnBotMessageException(String message) {
        super(message);
    }
}
