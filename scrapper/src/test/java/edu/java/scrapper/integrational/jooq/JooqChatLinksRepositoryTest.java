package edu.java.scrapper.integrational.jooq;

import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.ChatLinkRowMapper;
import edu.java.scrapper.integrational.DatabaseIntegrationEnvironment;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class JooqChatLinksRepositoryTest extends DatabaseIntegrationEnvironment {
    static final RowMapper<ChatLink> ROW_MAPPER = new ChatLinkRowMapper();

    @Autowired @Qualifier("jooqChatLinksRepository")
    ChatLinksRepository chatLinksRepository;

    @Test
    public void should_save() {
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");
        long linkId = jdbcTemplate.queryForObject(
            "INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23') RETURNING id",
            Long.class
        );
        ChatLink chatLink = new ChatLink(1, linkId);

        chatLinksRepository.save(chatLink);

        Optional<ChatLink> actualChatLink =
            jdbcTemplate.query("SELECT * FROM chat_links", ROW_MAPPER).stream().findFirst();
        assertThat(actualChatLink).isPresent();
    }

    @Test
    public void should_findByChatId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");

        long firstLinkId = jdbcTemplate.queryForObject(
            "INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23') RETURNING id",
            Long.class
        );
        long secondLinkId = jdbcTemplate.queryForObject(
            "INSERT INTO links (url, created_at) VALUES ('https://link2','2022-06-16 16:37:23') RETURNING id",
            Long.class
        );

        jdbcTemplate.update(STR."INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,\{firstLinkId},'2022-06-16 16:37:23')");
        jdbcTemplate.update(STR."INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,\{secondLinkId},'2022-06-16 16:37:23')");

        //Act
        List<Long> actualLinkIds = chatLinksRepository.findByChatId(1)
            .stream().map(ChatLink::getLinkId).toList();

        //Assert
        assertThat(actualLinkIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(firstLinkId, secondLinkId);
    }

    @Test
    public void should_findByLinkId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (2,'2022-06-16 16:37:23')");

        long linkId =
            jdbcTemplate.queryForObject(
                "INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23') RETURNING id",
                Long.class
            );

        jdbcTemplate.update(STR."INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,\{linkId},'2022-06-16 16:37:23')");
        jdbcTemplate.update(STR."INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (2,\{linkId},'2022-06-16 16:37:23')");

        //Act
        List<Long> actualChatIds = chatLinksRepository.findByLinkId(linkId)
            .stream().map(ChatLink::getChatId).toList();

        //Assert
        assertThat(actualChatIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_removeByChatIdAndLinkId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");

        long linkId =
            jdbcTemplate.queryForObject(
                "INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23') RETURNING id",
                Long.class
            );

        jdbcTemplate.update(STR."INSERT INTO chat_links (chat_id, link_id,created_at) VALUES (1,\{linkId},'2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = chatLinksRepository.removeByChatIdAndLinkId(1, linkId);

        //Assert
        assertThat(actualResponse).isTrue();

        Optional<ChatLink> actualChatLink =
            jdbcTemplate.query("SELECT * FROM chat_links", ROW_MAPPER).stream().findFirst();
        assertThat(actualChatLink).isEmpty();
    }
}
