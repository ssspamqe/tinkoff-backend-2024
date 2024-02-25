package edu.java.restApi.service.exceptions;

import org.springframework.aop.scope.ScopedProxyUtils;

public class NoSuchLinkException extends RuntimeException{
    public NoSuchLinkException(String message){
        super(message);
    }
}
