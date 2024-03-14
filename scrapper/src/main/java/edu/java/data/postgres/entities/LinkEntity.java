package edu.java.data.postgres.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class LinkEntity {

    @Id
    private long id;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime lastCheckedAt;

    public LinkEntity(String url, LocalDateTime createdAt) {
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = LocalDateTime.MIN;
    }

    public LinkEntity(String url) {
        this(url, LocalDateTime.now());
    }
}
