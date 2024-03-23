package edu.java.scrapper.integrational.dao.jooq;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jooq.dao.ChatJooqDAO;
import edu.java.data.dao.jooq.dao.GitHubRepositoryJooqDAO;
import edu.java.data.dao.jooq.dao.LinkJooqDAO;
import edu.java.data.dao.jooq.dao.StackOverflowQuestionJooqDAO;
import edu.java.data.dao.jooq.repositories.ChatJooqRepository;
import edu.java.data.dao.jooq.repositories.ChatLinksJooqRepository;
import edu.java.data.dao.jooq.repositories.GitHubRepositoryJooqRepository;
import edu.java.data.dao.jooq.repositories.LinkJooqRepository;
import edu.java.data.dao.jooq.repositories.StackOverflowQuestionJooqRepository;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class JooqDataAccessConfiguration {

    @Bean
    public ChatJooqRepository chatJooqRepository(DefaultDSLContext dsl) {
        return new ChatJooqRepository(dsl);
    }

    @Bean
    public ChatLinksJooqRepository chatLinksJooqRepository(DefaultDSLContext dsl) {
        return new ChatLinksJooqRepository(dsl);
    }

    @Bean
    public GitHubRepositoryJooqRepository gitHubRepositoryJooqRepository(DefaultDSLContext dsl) {
        return new GitHubRepositoryJooqRepository(dsl);
    }

    @Bean
    public LinkJooqRepository linkJooqRepository(DefaultDSLContext dsl) {
        return new LinkJooqRepository(dsl);
    }

    @Bean
    public StackOverflowQuestionJooqRepository stackOverflowQuestionJooqRepository(DefaultDSLContext dsl) {
        return new StackOverflowQuestionJooqRepository(dsl);
    }

    @Bean @Primary
    public ChatJooqDAO chatJooqDAO(
        ChatJooqRepository chatRepository,
        ChatLinksJooqRepository chatLinksRepository,
        LinkJooqDAO linkDao
    ) {
        return new ChatJooqDAO(chatRepository, chatLinksRepository, linkDao);
    }

    @Bean @Primary
    public GitHubRepositoryJooqDAO gitHubRepositoryJooqDAO(
        GitHubRepositoryJooqRepository gitHubRepositoryJooqRepository
    ) {
        return new GitHubRepositoryJooqDAO(gitHubRepositoryJooqRepository);
    }

    @Bean @Primary
    public LinkJooqDAO linkJooqDAO(
        LinkJooqRepository linkRepository,
        ChatLinksJooqRepository chatLinksRepository,
        UniversalInitialStateScreener universalInitialStateScreener
    ) {
        return new LinkJooqDAO(linkRepository, chatLinksRepository, universalInitialStateScreener);
    }

    @Bean @Primary
    public StackOverflowQuestionDataAccessObject stackOverflowQuestionJooqDAO(
        StackOverflowQuestionJooqRepository questionRepository
    ) {
        return new StackOverflowQuestionJooqDAO(questionRepository);
    }
}
