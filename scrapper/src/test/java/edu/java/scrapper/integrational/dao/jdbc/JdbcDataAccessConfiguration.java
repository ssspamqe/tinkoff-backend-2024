package edu.java.scrapper.integrational.dao.jdbc;

import edu.java.data.dao.jdbc.dao.ChatJdbcDAO;
import edu.java.data.dao.jdbc.dao.GitHubRepositoryJdbcDAO;
import edu.java.data.dao.jdbc.dao.LinkJdbcDAO;
import edu.java.data.dao.jdbc.dao.StackOverflowQuestionJdbcDAO;
import edu.java.data.dao.jdbc.repositories.ChatJdbcRepository;
import edu.java.data.dao.jdbc.repositories.ChatLinksJdbcRepository;
import edu.java.data.dao.jdbc.repositories.GitHubRepositoryJdbcRepository;
import edu.java.data.dao.jdbc.repositories.LinkJdbcRepository;
import edu.java.data.dao.jdbc.repositories.StackOverflowQuestionJdbcRepository;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;

@TestConfiguration
public class JdbcDataAccessConfiguration {

    @Bean @Primary
    public ChatJdbcRepository chatJdbcRepository(JdbcClient jdbcClient) {
        return new ChatJdbcRepository(jdbcClient);
    }

    @Bean @Primary
    public ChatLinksJdbcRepository chatLinksJdbcRepository(JdbcClient jdbcClient) {
        return new ChatLinksJdbcRepository(jdbcClient);
    }

    @Bean @Primary
    public GitHubRepositoryJdbcRepository gitHubRepositoryJdbcRepository(JdbcClient jdbcClient) {
        return new GitHubRepositoryJdbcRepository(jdbcClient);
    }

    @Bean @Primary
    public LinkJdbcRepository linkJdbcRepository(JdbcClient jdbcClient) {
        return new LinkJdbcRepository(jdbcClient);
    }

    @Bean @Primary
    public StackOverflowQuestionJdbcRepository stackOverflowQuestionJdbcRepository(JdbcClient jdbcClient) {
        return new StackOverflowQuestionJdbcRepository(jdbcClient);
    }

    @Bean @Primary
    public ChatJdbcDAO chatJdbcDAO(
        ChatJdbcRepository chatRepository,
        ChatLinksJdbcRepository chatLinksRepository,
        LinkJdbcDAO linkDao
    ) {
        return new ChatJdbcDAO(chatRepository, chatLinksRepository, linkDao);
    }

    @Bean @Primary
    public GitHubRepositoryJdbcDAO gitHubRepositoryJdbcDAO(
        GitHubRepositoryJdbcRepository gitHubRepositoryJdbcRepository
    ) {
        return new GitHubRepositoryJdbcDAO(gitHubRepositoryJdbcRepository);
    }

    @Bean @Primary
    public LinkJdbcDAO linkJdbcDAO(
        LinkJdbcRepository linkRepository,
        ChatLinksJdbcRepository chatLinksRepository,
        UniversalInitialStateScreener universalInitialStateScreener
    ) {
        return new LinkJdbcDAO(linkRepository, chatLinksRepository, universalInitialStateScreener);
    }

    @Bean @Primary
    public StackOverflowQuestionJdbcDAO stackOverflowQuestionJdbcDAO(
        StackOverflowQuestionJdbcRepository questionRepository
    ) {
        return new StackOverflowQuestionJdbcDAO(questionRepository);
    }
}
