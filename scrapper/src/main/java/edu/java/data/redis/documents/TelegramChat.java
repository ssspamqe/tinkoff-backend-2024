package edu.java.data.redis.documents;

import com.redis.om.spring.annotations.Document;
import java.time.LocalDateTime;
import com.redis.om.spring.annotations.Indexed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Document
@AllArgsConstructor
@Getter
public class TelegramChat {
    @Id
    @Indexed
    private String id;

    @Indexed
    private long apiId;

    @Indexed
    private LocalDateTime registrationDate;

    public TelegramChat(long apiId, LocalDateTime registrationDate) {
        this.apiId = apiId;
        this.registrationDate = registrationDate;
    }

    public TelegramChat(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public TelegramChat(long apiId) {
        this(apiId, LocalDateTime.now());
    }
}
