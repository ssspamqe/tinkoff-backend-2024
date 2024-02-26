package edu.java.webClients.telegramBot.dto.responses;

import edu.java.webClients.exceptions.ClientErrorResponseBody;
import java.util.List;

public record TelegramBotApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {
}
