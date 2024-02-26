package edu.java.bot.webClients.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ClientErrorException extends RuntimeException {
    ClientErrorResponseBody errorResponseBody;
}
