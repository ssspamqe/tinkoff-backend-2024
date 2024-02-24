package edu.java.bot.webClients.scrapper.dto.responses;

import java.net.URI;

public record LinkResponse(
    int id,
    URI url
) {
}
