package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.LinkEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

public class LinkRowMapper implements RowMapper<LinkEntity> {
    @Override
    public LinkEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        String url = rs.getString("url");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();
        LocalDateTime lastCheckedAt = rs.getTimestamp("last_checked_at").toLocalDateTime();

        return new LinkEntity(id, url, createdAt, lastCheckedAt);
    }
}
