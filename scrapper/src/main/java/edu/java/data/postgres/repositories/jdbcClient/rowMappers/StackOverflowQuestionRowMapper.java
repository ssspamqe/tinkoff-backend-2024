package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.jdbc.core.RowMapper;

public class StackOverflowQuestionRowMapper implements RowMapper<StackOverflowQuestion> {

    @Override
    public StackOverflowQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long linkId = rs.getLong("link_id");
        String descriptionMd5Hash = rs.getString("description_md5_hash");

        Object[] arrayData = (Object[]) rs.getArray("answers_ids").getArray();
        Set<Long> answerApiIds = buildSetLong(arrayData);

        return new StackOverflowQuestion(id, linkId, descriptionMd5Hash, answerApiIds);
    }

    private Set<Long> buildSetLong(Object[] arrayData) {
        Set<Long> result = new HashSet<>();
        for (var data : arrayData) {
            result.add((long) data);
        }
        return result;
    }
}
