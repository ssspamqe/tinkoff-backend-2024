package edu.java.bot.restApi.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

public record LinkUpdate(

    long id,

    @NotBlank
    String url,

    @NotBlank
    LinkUpdateType type,

    @NotEmpty
    List<Long> tgChatIds
) {
}
