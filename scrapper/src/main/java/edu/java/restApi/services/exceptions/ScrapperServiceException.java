package edu.java.restApi.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class ScrapperServiceException extends RuntimeException {

    private static final String DESCRIPTION = "Some error happened in scrapper services...";

    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.NOT_FOUND;

    ScrapperServiceException(String message) {
        super(message);
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    public HttpStatusCode getHttpStatusCode() {
        return HTTP_STATUS_CODE;
    }

}
