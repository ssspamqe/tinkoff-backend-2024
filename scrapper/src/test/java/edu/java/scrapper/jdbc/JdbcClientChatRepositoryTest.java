package edu.java.scrapper.jdbc;

import edu.java.dao.postgres.entities.Chat;
import edu.java.dao.postgres.repositories.ChatRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.assertj.core.api.Assertions.assertThat;

public class JdbcClientChatRepositoryTest extends JdbcIntegrationEnvironment {

    @Autowired @Qualifier("jdbcClientChatRepository")
    ChatRepository chatRepository;

    @Test
    public void should_save() throws SQLException {
        Chat chat = new Chat(1, LocalDateTime.now());

        chatRepository.save(chat);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM chats");
        assertThat(resultSet.next()).isTrue();
    }

    @Test
    public void should_findById() throws SQLException {
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (123,'2022-06-16 16:37:23')");

        Chat actualChat = chatRepository.findById(1L).get();

        assertThat(actualChat.getTelegramApiId()).isEqualTo(123);
    }

    @Test
    public void should_returnEmptyOptional_when_cantFindChat() {
        Optional<Chat> actualChat = chatRepository.findById(1L);

        assertThat(actualChat).isEmpty();
    }

    @Test
    public void should_findByTelegramApiId() throws SQLException {
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (123,'2022-06-16 16:37:23')");

        Chat actualChat = chatRepository.findByTelegramApiId(123).get();

        assertThat(actualChat.getCreatedAt()).isEqualTo(LocalDateTime.parse("2022-06-16T16:37:23"));
    }

    @Test
    public void should_removeById() throws SQLException {
        //Arrange
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (123,'2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = chatRepository.removeById(1L);

        //Assert
        assertThat(actualResponse).isFalse();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM chats");
        assertThat(resultSet.next()).isFalse();
    }

    @Test
    public void should_removeByTelegramApiId() throws SQLException {
        //Arrange
        statement.execute("INSERT INTO chats (telegram_api_id, created_at) VALUES (123,'2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = chatRepository.removeByTelegramApiId(123);

        //Assert
        assertThat(actualResponse).isFalse();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM chats");
        assertThat(resultSet.next()).isFalse();
    }

}
