package edu.java.bot.data.entities;

import edu.java.bot.data.annotations.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subscription {
    @Id
    private Long id;

    private Long userId;

    @Pattern(regexp = "https?://.*")
    @NotNull
    private String link;
}
