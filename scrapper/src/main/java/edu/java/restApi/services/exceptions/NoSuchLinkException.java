package edu.java.restApi.services.exceptions;

public class NoSuchLinkException extends RuntimeException {
    public NoSuchLinkException(String message) {
        super(message);
    }
}
