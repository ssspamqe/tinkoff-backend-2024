package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.Link;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class LinkRowMapper implements RowMapper<Link> {
    @Override
    public Link mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        String url = rs.getString("url");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();

        return new Link(id, url, createdAt);
    }
}
