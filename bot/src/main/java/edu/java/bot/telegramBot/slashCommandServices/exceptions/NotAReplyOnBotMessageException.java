package edu.java.bot.telegramBot.slashCommandServices.exceptions;

public class NotAReplyOnBotMessageException extends CommandServiceException {
    public NotAReplyOnBotMessageException(String message) {
        super(message);
    }
}
