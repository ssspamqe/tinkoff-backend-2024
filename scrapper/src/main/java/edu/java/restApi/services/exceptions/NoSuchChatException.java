package edu.java.restApi.services.exceptions;

public class NoSuchChatException extends RuntimeException {
    public NoSuchChatException(String message) {
        super(message);
    }
}
