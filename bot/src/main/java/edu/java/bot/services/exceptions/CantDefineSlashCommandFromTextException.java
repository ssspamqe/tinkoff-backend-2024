package edu.java.bot.services.exceptions;

public class CantDefineSlashCommandFromTextException extends RuntimeException {
    public CantDefineSlashCommandFromTextException(String message) {
        super(message);
    }
}
