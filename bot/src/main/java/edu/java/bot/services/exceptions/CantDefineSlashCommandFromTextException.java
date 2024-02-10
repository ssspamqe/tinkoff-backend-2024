package edu.java.bot.services.exceptions;

public class CantDefineSlashCommandFromTextException extends CommandServiceException {
    public CantDefineSlashCommandFromTextException(String message) {
        super(message);
    }
}
