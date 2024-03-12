package edu.java.scrapper.jdbc;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ExampleTest extends JdbcIntegrationEnvironment {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    @Order(1)
    public void sampleTest() throws Exception {
        jdbcTemplate.update("INSERT INTO links (url,created_at) VALUES ('https://sample/url','2011-05-16 15:36:38')");

        int actual = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM links", Integer.class);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    @Order(2)
    public void sampleTest2() throws Exception {
        int actual = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM links", Integer.class);

        assertThat(actual).isNotEqualTo(1);
    }
}
