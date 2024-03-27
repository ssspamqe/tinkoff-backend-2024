package edu.java.data.dao.jdbc.repositories;

import edu.java.data.dao.jdbc.repositories.rowMappers.ChatRowMapper;
import edu.java.data.dto.Chat;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;

@RequiredArgsConstructor
public class ChatJdbcRepository {

    private static final String TABLE_NAME = "chats";
    private static final RowMapper<Chat> ROW_MAPPER = new ChatRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (id, created_at) VALUES (:id, :created_at)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String DELETE_BY_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE id = :id";


    private final JdbcClient jdbcClient;

    @SuppressWarnings("MultipleStringLiterals")
    public void save(Chat chat) {
        jdbcClient.sql(SAVE_QUERY)
            .param("id", chat.getId())
            .param("created_at", chat.getCreatedAt())
            .update();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public Optional<Chat> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public boolean removeById(long id) {
        return jdbcClient.sql(DELETE_BY_ID_QUERY)
            .param("id", id)
            .update() != 0;
    }
}
