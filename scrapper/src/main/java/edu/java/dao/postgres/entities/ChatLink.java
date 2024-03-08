package edu.java.dao.postgres.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.jdbc.core.RowMapper;

@Data
@AllArgsConstructor
public class ChatLink {

    private final static RowMapper<ChatLink> ROW_MAPPER = new ChatLinkRowMapper();

    @Id
    private long id;
    private long chatId;
    private long linkId;

    public ChatLink(long chatId, long linkId) {
        this.chatId = chatId;
        this.linkId = linkId;
    }


}
