package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chat_links")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatLinksJpa {

    @EmbeddedId
    private ChatLinksJpaKey id;

    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(name = "chat_id")
    private ChatJpaEntity chat;

    @ManyToOne
    @MapsId("linkId")
    @JoinColumn(name = "link_id")
    private LinkJpaEntity link;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

}
