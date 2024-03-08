package edu.java.scrapper.jdbc;

import edu.java.dao.postgres.entities.ChatLink;
import edu.java.dao.postgres.repositories.ChatLinksRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class JdbcClientChatLinksRepositoryTest extends JdbcIntegrationEnvironment {

    @Autowired @Qualifier("jdbcClientChatLinksRepository")
    ChatLinksRepository chatLinksRepository;

    Connection connection;

    @BeforeEach
    void beforeEach() throws SQLException {
        connection =
            DriverManager.getConnection(POSTGRES.getJdbcUrl(), POSTGRES.getUsername(), POSTGRES.getPassword());
    }

    @AfterEach
    void afterEach() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("TRUNCATE chat_links");
        connection.close();
    }

    @Test
    public void should_doNotThrowException_when_saving() {
        ChatLink chatLink = new ChatLink(1, 1);

        assertThatCode(() -> chatLinksRepository.save(chatLink)).doesNotThrowAnyException();
    }

    @Test
    public void should_findByChatId() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,2)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (2,1)");

        List<Long> actualLinkIds = chatLinksRepository.findByChatId(1)
            .stream().map(ChatLink::getLinkId).toList();

        assertThat(actualLinkIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_findByLinkId() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (2,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,2)");

        List<Long> actualChatIds = chatLinksRepository.findByLinkId(1)
            .stream().map(ChatLink::getChatId).toList();

        assertThat(actualChatIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_removeByChatIdAndLinkId() throws SQLException {
        //Assert
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,2)");

        //Act
        chatLinksRepository.removeByChatIdAndLinkId(1, 1);

        //Assert
        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");
        assertThat(resultSet.getInt("recordCount")).isEqualTo(1);

        resultSet.next();
        long actualChatId = resultSet.getLong("chat_id");
        long actualLinkId = resultSet.getLong("link_id");
        assertThat(actualLinkId).isEqualTo(1);
        assertThat(actualChatId).isEqualTo(2);
    }
}
