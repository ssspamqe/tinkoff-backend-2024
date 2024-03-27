package edu.java.scrapper.integrational.dao.jpa.tests;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jdbc.repositories.rowMappers.GitHubRepositoryRowMapper;
import edu.java.data.dao.jdbc.repositories.rowMappers.LinkRowMapper;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.dto.Link;
import edu.java.scrapper.integrational.DatabaseIntegrationEnvironment;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubRepositoryJpaDaoTest extends DatabaseIntegrationEnvironment {
    private static final RowMapper<GitHubRepository> REPOSITORY_JDBC_ROW_MAPPER = new GitHubRepositoryRowMapper();
    private static final RowMapper<Link> LINK_JDBC_ROW_MAPPER = new LinkRowMapper();

    private GitHubRepositoryDataAccessObject repositoryDao;

    @BeforeEach
    void assignDao() {
        repositoryDao = gitHubRepositoryJpaDao;
    }

    @Test
    public void should_saveRepository() {
        long linkId = saveLinkWithUrl("https://example.org");
        GitHubRepository repository = new GitHubRepository(
            1,
            linkId,
            "test-repository",
            "test-owner",
            "test-hash",
            Set.of()
        );

        repositoryDao.save(repository);

        var actualRepository =
            jdbcTemplate.queryForObject("SELECT * from git_hub_repositories", REPOSITORY_JDBC_ROW_MAPPER);
        repositoryDao.findByNameAndOwner("test-repository", "test-owner");
        assertThat(actualRepository).isNotNull();
    }

    @Test
    public void should_updateRepository() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update(
            "INSERT INTO git_hub_repositories VALUES (1, ?, 'test-repository', 'test-owner','aaa123','{}')",
            linkId
        );
        GitHubRepository repository = new GitHubRepository(
            1,
            linkId,
            "test-repository",
            "test-owner",
            "aa5",
            Set.of()
        );

        repositoryDao.update(repository);

        var actualRepository =
            jdbcTemplate.queryForObject("SELECT * FROM git_hub_repositories", REPOSITORY_JDBC_ROW_MAPPER);
        assertThat(actualRepository.getDescriptionMd5Hash()).isEqualTo("aa5");
    }

    @Test
    public void should_findById() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update(
            "INSERT INTO git_hub_repositories VALUES (1, ?, 'test-repository', 'test-owner','aaa123','{}')",
            linkId
        );

        var actualRepository = repositoryDao.findById(1);

        assertThat(actualRepository).isPresent();
    }

    @Test
    public void should_findByNameAndOwner() {
        long linkId = saveLinkWithUrl("https://example.org");
        jdbcTemplate.update(
            "INSERT INTO git_hub_repositories VALUES (1, ?, 'test-repository', 'test-owner','aaa123','{}')",
            linkId
        );

        var actualRepository = repositoryDao.findByNameAndOwner("test-repository", "test-owner");

        assertThat(actualRepository).isPresent();
    }
}
