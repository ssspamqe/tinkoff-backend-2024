package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

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
    private String url;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "last_checked_at")
    private String lastCheckedAt;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<ChatJpaEntity> chats;

}
