package edu.java.bot.services.exceptions;

public class NotAReplyMessageException extends NullPointerException {
    public NotAReplyMessageException(String message) {
        super(message);
    }
}
