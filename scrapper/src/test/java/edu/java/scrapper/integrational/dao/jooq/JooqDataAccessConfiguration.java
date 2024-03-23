package edu.java.scrapper.integrational.dao.jooq;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
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
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jooq")
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

    @Bean
    public ChatDataAccessObject chatJooqDAO(
        ChatJooqRepository chatRepository,
        ChatLinksJooqRepository chatLinksRepository,
        LinkJooqDAO linkDao
    ) {
        return new ChatJooqDAO(chatRepository, chatLinksRepository, linkDao);
    }

    @Bean
    public GitHubRepositoryDataAccessObject gitHubRepositoryJooqDAO(
        GitHubRepositoryJooqRepository gitHubRepositoryJooqRepository
    ) {
        return new GitHubRepositoryJooqDAO(gitHubRepositoryJooqRepository);
    }

    @Bean
    public LinkJooqDAO linkJooqDAO(
        LinkJooqRepository linkRepository,
        ChatLinksJooqRepository chatLinksRepository,
        UniversalInitialStateScreener universalInitialStateScreener
    ) {
        return new LinkJooqDAO(linkRepository, chatLinksRepository, universalInitialStateScreener);
    }

    @Bean
    public StackOverflowQuestionDataAccessObject stackOverflowQuestionJooqDAO(
        StackOverflowQuestionJooqRepository questionRepository
    ) {
        return new StackOverflowQuestionJooqDAO(questionRepository);
    }
}
