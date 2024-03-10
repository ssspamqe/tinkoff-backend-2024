package edu.java.scrapper.jdbc;

import edu.java.dao.postgres.entities.ChatLink;
import edu.java.dao.postgres.repositories.ChatLinksRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.assertj.core.api.Assertions.assertThat;

public class JdbcClientChatLinksRepositoryTest extends JdbcIntegrationEnvironment {

    @Autowired @Qualifier("jdbcClientChatLinksRepository")
    ChatLinksRepository chatLinksRepository;

    @Test
    public void should_save() throws SQLException {
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (11,'2022-06-16 16:37:23')");
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        ChatLink chatLink = new ChatLink(1, 1);

        chatLinksRepository.save(chatLink);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM chat_links");
        assertThat(resultSet.next()).isTrue();
    }

    @Test
    public void should_findByChatId() throws SQLException {
        //Arrange
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (11,'2022-06-16 16:37:23')");
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (12,'2022-06-16 16:37:23')");

        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link2','2022-06-16 16:37:23')");

        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,2)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (2,1)");

        //Act
        List<Long> actualLinkIds = chatLinksRepository.findByChatId(1)
            .stream().map(ChatLink::getLinkId).toList();

        //Assert
        assertThat(actualLinkIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_findByLinkId() throws SQLException {
        //Arrange
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (11,'2022-06-16 16:37:23')");
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (12,'2022-06-16 16:37:23')");

        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link2','2022-06-16 16:37:23')");

        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (2,1)");
        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,2)");

        //Act
        List<Long> actualChatIds = chatLinksRepository.findByLinkId(1)
            .stream().map(ChatLink::getChatId).toList();

        //Assert
        assertThat(actualChatIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_removeByChatIdAndLinkId() throws SQLException {
        //Arrange
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (11,'2022-06-16 16:37:23')");

        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");

        statement.execute("INSERT INTO chat_links (chat_id, link_id) VALUES (1,1)");

        //Act
        boolean actualResponse = chatLinksRepository.removeByChatIdAndLinkId(1, 1);

        //Assert
        assertThat(actualResponse).isFalse();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM chat_links");
        assertThat(resultSet.next()).isFalse();
    }
}
