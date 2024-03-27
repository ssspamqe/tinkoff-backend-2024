package edu.java.data.dao.jdbc.repositories.rowMappers;

import edu.java.data.dto.ChatLink;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class ChatLinkRowMapper implements RowMapper<ChatLink> {
    @Override
    public ChatLink mapRow(ResultSet rs, int rowNum) throws SQLException {
        long chatId = rs.getLong("chat_id");
        long linkId = rs.getLong("link_id");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();

        return new ChatLink(chatId, linkId, createdAt);
    }
}
