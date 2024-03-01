package edu.java.data.models;

import com.redis.om.spring.annotations.Document;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

@Document
public record TelegramChat(
    @Id
    @Indexed
    long id,
    @Indexed
    LocalDateTime registrationDate
) {
}
