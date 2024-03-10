package edu.java.scrapper.jdbc;

import edu.java.dao.postgres.entities.Link;
import edu.java.dao.postgres.repositories.LinkRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.assertj.core.api.Assertions.assertThat;

class JdbcClientLinkRepositoryTest extends JdbcIntegrationEnvironment {
    @Autowired @Qualifier("jdbcClientLinkRepository")
    LinkRepository linkRepository;

    @Test
    public void should_notThrowException_when_saving() throws SQLException {
        Link link = new Link("some url", LocalDateTime.now());

        linkRepository.save(link);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");
        assertThat(resultSet.next()).isTrue();
    }

    @Test
    public void should_findByLinkId() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('some url','2022-06-16 16:37:23')");

        Link actualLink = linkRepository.findById(1L).get();

        assertThat(actualLink.getUrl()).isEqualTo("some url");
    }

    @Test
    public void should_returnEmptyOptional_when_cantFindLink() {
        Optional<Link> link = linkRepository.findById(1L);

        assertThat(link.isEmpty()).isTrue();
    }

    @Test
    public void should_findByUrl() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('some url','2022-06-16 16:37:23')");

        Link link = linkRepository.findByUrl("some url").get();
        assertThat(link.getCreatedAt()).isEqualTo(LocalDateTime.parse("2022-06-16T16:37:23"));
    }

    @Test
    public void should_removeById() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('some url','2022-06-16 16:37:23')");

        linkRepository.removeById(1L);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");
        assertThat(resultSet.next()).isFalse();
    }

}
