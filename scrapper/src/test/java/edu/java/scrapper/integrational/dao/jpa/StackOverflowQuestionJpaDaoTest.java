package edu.java.scrapper.integrational.dao.jpa;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jdbc.repositories.rowMappers.StackOverflowQuestionRowMapper;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.scrapper.integrational.DatabaseIntegrationEnvironment;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class StackOverflowQuestionJpaDaoTest extends DatabaseIntegrationEnvironment {

    private static final RowMapper<StackOverflowQuestion> QUESTION_JDBC_ROW_MAPPER =
        new StackOverflowQuestionRowMapper();

    private StackOverflowQuestionDataAccessObject questionDao;

    @BeforeEach
    void assignDao() {
        questionDao = stackOverflowQuestionJpaDao;
    }

    @Test
    public void should_findById() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update("INSERT INTO stack_overflow_questions VALUES (1,?,'test-hash','{}')", linkId);

        var actualQuestion = questionDao.findById(1);

        assertThat(actualQuestion).isPresent();
    }

    @Test
    public void should_findByLinkId() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update("INSERT INTO stack_overflow_questions VALUES (1,?,'test-hash','{}')", linkId);

        var actualQuestion = questionDao.findByLinkId(linkId);

        assertThat(actualQuestion).isPresent();
    }

    @Test
    public void should_updateQuestion() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update("INSERT INTO stack_overflow_questions VALUES (1,?,'test-hash','{}')", linkId);
        StackOverflowQuestion modifiedQuestion = new StackOverflowQuestion(
            1,
            linkId,
            "test-modified-hash",
            Set.of()
        );

        questionDao.update(modifiedQuestion);

        var actualQuestion =
            jdbcTemplate.queryForObject("SELECT * FROM stack_overflow_questions", QUESTION_JDBC_ROW_MAPPER);
        assertThat(actualQuestion.getDescriptionMd5Hash()).isEqualTo("test-modified-hash");
    }

    @Test
    public void should_saveQuestion() {
        long linkId = saveLinkWithUrl("https://example.org");
        StackOverflowQuestion question = new StackOverflowQuestion(
            1,
            linkId,
            "test-hash",
            Set.of()
        );

        questionDao.save(question);

        var actualQuestion =
            jdbcTemplate.queryForObject("SELECT * FROM stack_overflow_questions", QUESTION_JDBC_ROW_MAPPER);
        assertThat(actualQuestion).isNotNull();

    }
}
