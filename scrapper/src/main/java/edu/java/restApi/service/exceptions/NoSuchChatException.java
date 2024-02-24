package edu.java.restApi.service.exceptions;

public class NoSuchChatException extends RuntimeException {
    public NoSuchChatException(String message) {
        super(message);
    }
}
