package edu.java.dao.postgres.repositories.jdbcClient;

import edu.java.dao.postgres.entities.Chat;
import edu.java.dao.postgres.repositories.ChatRepository;
import edu.java.dao.postgres.repositories.jdbcClient.rowMappers.ChatRowMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JdbcClientChatRepository implements ChatRepository {

    private static final String TABLE_NAME = "chats";
    private static final RowMapper<Chat> ROW_MAPPER = new ChatRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (telegram_api_id, created_at) VALUES (:telegram_api_id, :created_at)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String FIND_BY_TELEGRAM_API_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE telegram_api_id = :telegram_api_id";

    private static final String DELETE_BY_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE id = :id";

    private static final String DELETE_BY_TELEGRAM_API_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE telegram_api_id = :telegram_api_id";

    private final JdbcClient jdbcClient;

    @Override
    public void save(Chat chat) {
        jdbcClient.sql(SAVE_QUERY)
            .param("telegram_api_id", chat.getTelegramApiId())
            .param("created_at", chat.getCreatedAt())
            .update();
    }

    @Override
    public Optional<Chat> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public Optional<Chat> findByTelegramApiId(long telegramApiId) {
        return jdbcClient.sql(FIND_BY_TELEGRAM_API_ID_QUERY)
            .param("telegram_api_id", telegramApiId)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public boolean removeById(long id) {
        return jdbcClient.sql(DELETE_BY_ID_QUERY)
            .param("id", id)
            .update() != 0;
    }

    @Override
    public boolean removeByTelegramApiId(long telegramApiId) {
        return jdbcClient.sql(DELETE_BY_TELEGRAM_API_ID_QUERY)
            .param("telegram_api_id", telegramApiId)
            .update() != 0;
    }
}
