package edu.java.bot.webClients.scrapper.dto.responses;

import edu.java.bot.webClients.exceptions.ClientErrorResponseBody;
import java.util.List;

public record ScrapperApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {

}
