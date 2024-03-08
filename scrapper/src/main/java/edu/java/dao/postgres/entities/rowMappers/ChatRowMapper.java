package edu.java.dao.postgres.entities.rowMappers;

import edu.java.dao.postgres.entities.Chat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class ChatRowMapper implements RowMapper<Chat> {

    @Override
    public Chat mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long telegramApiId = rs.getLong("telegram_api_id");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();

        return new Chat(id, telegramApiId, createdAt);
    }
}
