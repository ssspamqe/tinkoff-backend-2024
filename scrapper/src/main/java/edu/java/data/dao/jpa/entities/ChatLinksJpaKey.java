package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;

@Embeddable
@Data
public class ChatLinksJpaKey implements Serializable {

    @Column(name = "chat_id")
    long chatId;

    @Column(name = "link_id")
    long linkId;

}
