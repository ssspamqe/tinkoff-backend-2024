package edu.java.data.postgres.repositories.jdbcClient;

import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.LinkRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.LinkRowMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JdbcClientLinkRepository implements LinkRepository {

    private static final String TABLE_NAME = "links";
    private static final RowMapper<Link> ROW_MAPPER = new LinkRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (url, created_at) VALUES (:url, :created_at)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String FIND_BY_URL_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE url = :url";

    private static final String DELETE_BY_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE id = :id";

    private final JdbcClient jdbcClient;

    @Override
    public void save(Link link) {
        jdbcClient.sql(SAVE_QUERY)
            .param("url", link.getUrl())
            .param("created_at", link.getCreatedAt())
            .update();
    }

    @Override
    public Optional<Link> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public Optional<Link> findByUrl(String url) {
        return jdbcClient.sql(FIND_BY_URL_QUERY)
            .param("url", url)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public boolean removeById(long id) {
        return jdbcClient.sql(DELETE_BY_ID_QUERY)
            .param("id", id)
            .update() != 0;
    }
}
