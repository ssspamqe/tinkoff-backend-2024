package edu.java.data.postgres.repositories.jdbcClient;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import edu.java.data.postgres.repositories.StackOverflowQuestionRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.StackOverflowQuestionRowMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JdbcClientStackOverflowRepository implements StackOverflowQuestionRepository {

    private static final RowMapper<StackOverflowQuestion> ROW_MAPPER = new StackOverflowQuestionRowMapper();

    private static final String TABLE_NAME = "stack_overflow_questions";

    private static final String FIND_BY_LINK_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String UPDATE_QUERY =
        STR."UPDATE \{TABLE_NAME} SET "
            + "link_id = :link_id "
            + "description_md5_hash = :description_md5_hash "
            + "answer_api_ids = :answer_api_ids";

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} VALUES (:id, :link_id, :description_md5_hash, :answer_api_ids)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private final JdbcClient jdbcClient;

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        return jdbcClient.sql(FIND_BY_LINK_ID_QUERY)
            .param("link_id", linkId)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    public void save(StackOverflowQuestion question) {
        jdbcClient.sql(SAVE_QUERY)
            .param("id", question.getId())
            .param("link_id", question.getLinkId())
            .param("description_md5_hash", question.getDescriptionMd5Hash())
            .param("answer_api_ids", question.getAnswerIds())
            .update();
    }

    @Override
    public void update(StackOverflowQuestion question) {
        jdbcClient.sql(UPDATE_QUERY)
            .param("link_id", question.getLinkId())
            .param("description_md5_hash", question.getDescriptionMd5Hash())
            .param("answer_api_ids", question.getAnswerIds())
            .update();
    }
}
