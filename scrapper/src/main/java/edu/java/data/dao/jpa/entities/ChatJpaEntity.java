package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chats")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatJpaEntity {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToMany(mappedBy = "chats", fetch = FetchType.EAGER)
    private Set<LinkJpaEntity> links;

    public ChatJpaEntity(long id) {
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.links = new HashSet<>();
    }

}
