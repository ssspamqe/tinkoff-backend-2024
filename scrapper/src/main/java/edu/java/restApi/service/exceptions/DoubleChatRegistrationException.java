package edu.java.restApi.service.exceptions;

public class DoubleChatRegistrationException extends RuntimeException {
    public DoubleChatRegistrationException(String message) {
        super(message);
    }
}
