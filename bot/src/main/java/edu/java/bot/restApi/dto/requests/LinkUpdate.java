package edu.java.bot.restApi.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

public record LinkUpdate(

    int id,

    @NotBlank
    String url,

    @NotBlank
    String description,

    @NotEmpty
    List<Integer> tgChatIds
) {
}
