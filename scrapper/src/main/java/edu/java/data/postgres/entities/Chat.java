package edu.java.data.postgres.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Chat {

    @Id
    private long id;
    private long telegramApiId;
    private LocalDateTime createdAt;

    public Chat(long telegramApiId, LocalDateTime createdAt) {
        this.telegramApiId = telegramApiId;
        this.createdAt = createdAt;
    }

    public Chat(long telegramApiId) {
        this(telegramApiId, LocalDateTime.now());
    }
}
