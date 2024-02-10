package edu.java.bot.services.exceptions;

public class StrangeSlashCommand extends RuntimeException {
    public StrangeSlashCommand(String message){
        super(message);
    }
}
