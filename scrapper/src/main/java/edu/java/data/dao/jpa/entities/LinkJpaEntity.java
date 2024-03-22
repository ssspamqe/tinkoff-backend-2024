package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "links")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinkJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "url")
    private URI url;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "last_checked_at")
    private LocalDateTime lastCheckedAt;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<ChatJpaEntity> chats;

    public LinkJpaEntity(URI url) {
        this.url = url;
        this.createdAt = LocalDateTime.now();
    }

}
