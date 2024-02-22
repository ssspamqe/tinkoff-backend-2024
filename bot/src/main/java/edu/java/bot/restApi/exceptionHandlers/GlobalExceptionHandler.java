package edu.java.bot.restApi.exceptionHandlers;

import edu.java.bot.restApi.dto.errorResponse.ApiErrorResponse;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String INCORRECT_REQUEST_PARAMETERS_DESCRIPTION = "Incorrect request parameters";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        HttpStatusCode statusCode = exception.getStatusCode();
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionMessage = exception.getMessage();
        List<String> stacktrace = Arrays.stream(exception.getStackTrace()).map(StackTraceElement::toString).toList();

        ApiErrorResponse errorResponse = new ApiErrorResponse(
            INCORRECT_REQUEST_PARAMETERS_DESCRIPTION,
            statusCode.toString(),
            exceptionName,
            exceptionMessage,
            stacktrace
        );

        LOGGER.warn("Incorrect request parameters: {}", errorResponse);
        return ResponseEntity.status(statusCode).body(errorResponse);
    }

}

