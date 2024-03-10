package edu.java.dao.postgres.repositories.jdbcClient.rowMappers;

import edu.java.dao.postgres.entities.ChatLink;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ChatLinkRowMapper implements RowMapper<ChatLink> {
    @Override
    public ChatLink mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long chatId = rs.getLong("chat_id");
        long linkId = rs.getLong("link_id");

        return new ChatLink(id, chatId, linkId);
    }
}
