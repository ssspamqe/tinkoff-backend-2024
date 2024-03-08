package edu.java.scrapper.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest extends JdbcIntegrationEnvironment {

    @Test
    public void sampleTest() throws Exception {
        Connection connection =
            DriverManager.getConnection(POSTGRES.getJdbcUrl(), POSTGRES.getUsername(), POSTGRES.getPassword());
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO links (url,created_at) VALUES ('https://sample/link','2011-05-16 15:36:38')");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");

        String actualUrl = null;
        while (resultSet.next()) {
            actualUrl = resultSet.getString("url");
        }

        assertThat(actualUrl).isEqualTo("https://sample/link");
    }
}
