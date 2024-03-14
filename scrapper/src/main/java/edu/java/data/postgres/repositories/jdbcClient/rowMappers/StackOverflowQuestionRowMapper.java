package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.StackOverflowQuestionEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StackOverflowQuestionRowMapper implements RowMapper<StackOverflowQuestionEntity> {

    @Override
    public StackOverflowQuestionEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long link_id = rs.getLong("link_id");
        String descriptionMd5Hash = rs.getString("description_md5_hash");
        long[] answerApiIds = (long[]) rs.getArray("answer_api_ids").getArray();

        return new StackOverflowQuestionEntity(id, link_id, descriptionMd5Hash, answerApiIds);
    }
}
