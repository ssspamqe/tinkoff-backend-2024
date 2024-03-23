package edu.java.scrapper.integrational.dao.jooq;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jdbc.repositories.rowMappers.LinkRowMapper;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.scrapper.integrational.DatabaseIntegrationEnvironment;
import java.net.URI;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ChatJooqDaoTest extends DatabaseIntegrationEnvironment {

    private static final RowMapper<Link> LINK_JDBC_ROW_MAPPER = new LinkRowMapper();

    private ChatDataAccessObject chatDao;

    @BeforeEach
    void assignChatDao() {
        chatDao = chatJooqDao;
    }

    @Test
    public void should_returnTrackedLinksByChatId() {
        //Arrange
        saveChatWithId(1);

        long link1Id = saveLinkWithUrl("https://example1.com");
        long link2Id = saveLinkWithUrl("https://example2.com");

        saveChatIdLinkId(1, link1Id);
        saveChatIdLinkId(1, link2Id);

        //Act
        Set<String> actualLinkUrls = chatDao
            .getTrackedLinksByChatId(1).stream()
            .map(link -> link.getUrl().toString())
            .collect(Collectors.toSet());

        //Assert
        assertThat(actualLinkUrls).containsExactlyInAnyOrder("https://example1.com", "https://example2.com");
    }

    @Test
    public void should_associateUrlWithChat_when_noLinkWithSuchUrl() {
        saveChatWithId(1);
        URI url = URI.create("https://example.org");

        chatDao.associateUrlByChatId(url, 1);

        Link savedLink = jdbcTemplate.queryForObject("SELECT * FROM links", LINK_JDBC_ROW_MAPPER);
        int chatLinksCouplesCount = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM chat_links WHERE chat_id = ? AND link_id = ?",
            Integer.class,
            1,
            savedLink.getId()
        );
        assertThat(savedLink.getUrl()).hasToString("https://example.org");
        assertThat(chatLinksCouplesCount).isEqualTo(1);
    }

    @Test
    public void should_associateUrlWithChat_when_linkWithSuchUrlExists() {
        saveChatWithId(1);
        long linkId = saveLinkWithUrl("https://example.org");

        chatDao.associateUrlByChatId(URI.create("https://example.org"), 1);

        int chatLinksCouplesCount = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM chat_links WHERE chat_id = ? AND link_id = ?",
            Integer.class,
            1,
            linkId
        );
        assertThat(chatLinksCouplesCount).isEqualTo(1);
    }

    @Test
    public void should_dissociateUrlWithChat_when_linkWithSuchUrlExists() {
        saveChatWithId(1);
        long linkId = saveLinkWithUrl("https://example.org");
        saveChatIdLinkId(1, linkId);

        chatDao.dissociateUrlByChatId(URI.create("https://example.org"), 1);

        int chatLinksCouplesCount = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM chat_links WHERE chat_id = ? AND link_id = ?",
            Integer.class,
            1,
            linkId
        );
        assertThat(chatLinksCouplesCount).isZero();
    }

    @Test
    public void should_throwException_when_dissociatingUnsavedUrlWithChat() {
        saveChatWithId(1);

        assertThatThrownBy(() -> chatDao.dissociateUrlByChatId(URI.create("https://unknow/url"), 1))
            .isInstanceOf(NoSuchLinkException.class);
    }

    @Test
    public void should_throwException_when_noSuchChat() {
        assertThatThrownBy(() -> chatDao.associateUrlByChatId(URI.create("https://example.com"), 1));

    }
}
