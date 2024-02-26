package edu.java.bot.webClients.scrapper.exceptions;

import edu.java.bot.restApi.dto.responses.ApiErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class ClientErrorException extends RuntimeException {
    private final ApiErrorResponse apiErrorResponse;
}
