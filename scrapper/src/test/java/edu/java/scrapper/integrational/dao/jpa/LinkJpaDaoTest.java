package edu.java.scrapper.integrational.dao.jpa;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jdbc.repositories.rowMappers.LinkRowMapper;
import edu.java.data.dto.Link;
import edu.java.scrapper.integrational.DatabaseIntegrationEnvironment;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class LinkJpaDaoTest extends DatabaseIntegrationEnvironment {

    private static final RowMapper<Link> LINK_JDBC_MAPPER = new LinkRowMapper();

    private LinkDataAccessObject linkDao;

    @BeforeEach
    void assignLinkDao() {
        linkDao = linkJdbcDao;
    }

    @Test
    public void should_findById() {
        long linkId = saveLinkWithUrl("https://example.org");

        var link = linkDao.findById(linkId);

        assertThat(link).isPresent();
        assertThat(link.get().getUrl()).hasToString("https://example.org");
    }

    @Test
    public void should_findByUrl() {
        saveLinkWithUrl("https://example.org");

        Optional<Link> actualLink = linkDao.findByUrl(URI.create("https://example.org"));

        assertThat(actualLink).isPresent();
    }

    @Test
    public void should_beAbleToSave_when_noLinkWithSuchUrl() {
        Link link = linkDao.saveOrFindByUrl(URI.create("https://example.org"));

        int allSavedLinksCount =
            jdbcTemplate.queryForObject("SELECT COUNT(*) FROM links", Integer.class);
        assertThat(allSavedLinksCount).isEqualTo(1);
    }

    @Test
    public void should_beAbleToFind_when_linkWithSuchUrlExists() {
        saveLinkWithUrl("https://example.org");

        Link link = linkDao.saveOrFindByUrl(URI.create("https://example.org"));

        assertThat(link).isNotNull();
        assertThat(link.getUrl()).hasToString("https://example.org");
    }

    @Test
    public void should_findAssociatedChatsByLinkId() {
        //Assert
        saveChatWithId(1);
        saveChatWithId(2);

        long linkId = saveLinkWithUrl("https://example.org");

        saveChatIdLinkId(1, linkId);
        saveChatIdLinkId(2, linkId);

        //Act
        Set<Long> associatedChatsIds = linkDao.findAssociatedChatsIdsByLinkId(linkId);

        assertThat(associatedChatsIds).containsExactlyInAnyOrder(1L, 2L);

    }

    @Test
    public void should_updateLastChecked() {
        long linkId = saveLinkWithUrl("https://example.org");
        LocalDateTime expectedLastChecked = LocalDateTime.of(2000, 1, 1, 1, 1);

        linkDao.updateLastCheckedAtById(expectedLastChecked, linkId);

        Link savedLink = jdbcTemplate.queryForObject("SELECT * FROM links", LINK_JDBC_MAPPER);
        assertThat(savedLink.getLastCheckedAt()).isEqualTo(expectedLastChecked);
    }

    @Test
    public void should_findByLastCheckedAtBefore() {
        jdbcTemplate.update("INSERT INTO links(url, created_at, last_checked_at) VALUES " +
            "('https://example.org', '1970-01-01 00:00:00', '1980-01-01 00:00:00'), " +
            "('https://example2.org', '1970-01-01 00:00:00', '1990-01-01 00:00:00'), " +
            "('https://example3.org', '1970-01-01 00:00:00', '2000-01-01 00:00:00')");
        LocalDateTime borderDateTime = LocalDateTime.of(1996, 1, 1, 0, 0);

        Set<String> actualLinkUrls = linkDao
            .findByLastCheckedAtBefore(borderDateTime).stream()
            .map(i -> i.getUrl().toString())
            .collect(Collectors.toSet());

        assertThat(actualLinkUrls).containsExactlyInAnyOrder("https://example.org", "https://example2.org");
    }
}
