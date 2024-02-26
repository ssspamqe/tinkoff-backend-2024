package edu.java.bot.webClients.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClientErrorException extends RuntimeException {
    private final ClientErrorResponseBody errorResponseBody;
}
