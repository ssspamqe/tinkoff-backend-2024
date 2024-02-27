package edu.java.restApi.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class NoSuchLinkException extends ScrapperServiceException {

    private static final String DESCRIPTION = "There is no record about such link";
    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.CONFLICT;

    public NoSuchLinkException(String message) {
        super(message);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public HttpStatusCode getHttpStatusCode() {
        return HTTP_STATUS_CODE;
    }
}
