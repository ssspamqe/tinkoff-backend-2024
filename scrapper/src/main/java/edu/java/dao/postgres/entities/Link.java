package edu.java.dao.postgres.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Link {

    @Id
    private long id;
    private String url;
    private LocalDateTime createdAt;

    public Link(String url, LocalDateTime createdAt) {
        this.url = url;
        this.createdAt = createdAt;
    }
}
