package edu.java.scrapper.integrational.dao.jpa.configuration;

import edu.java.data.dao.jpa.dao.ChatJpaDAO;
import edu.java.data.dao.jpa.dao.GitHubRepositoryJpaDAO;
import edu.java.data.dao.jpa.dao.LinkJpaDAO;
import edu.java.data.dao.jpa.dao.StackOverflowQuestionJpaDAO;
import edu.java.data.dao.jpa.entities.utils.mappers.ChatJpaMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.GitHubRepositoryJpaMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkJpaMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.StackOverflowQuestionJpaMapper;
import edu.java.data.dao.jpa.repositories.AssociationJpaRepository;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class JpaTestAccessConfiguration {

    @Bean
    public ChatJpaDAO chatJpaDAO(
        ChatJpaRepository chatRepository,
        LinkJpaDAO linkDao,
        AssociationJpaRepository associationRepository,
        ChatJpaMapper chatMapper,
        LinkJpaMapper linkMapper
    ) {
        return new ChatJpaDAO(chatRepository, associationRepository, linkDao, chatMapper, linkMapper);
    }

    @Bean
    public GitHubRepositoryJpaDAO gitHubRepositoryJpaDAO(
        GitHubRepositoryJpaRepository gitHubRepoRepository,
        LinkJpaRepository linkRepository,
        GitHubRepositoryJpaMapper repositoryMapper
    ) {
        return new GitHubRepositoryJpaDAO(gitHubRepoRepository, linkRepository, repositoryMapper);
    }

    @Bean
    public LinkJpaDAO linkJpaDAO(
        LinkJpaRepository linkRepository,
        UniversalInitialStateScreener initialStateScreener,
        LinkJpaMapper linkMapper
    ) {
        return new LinkJpaDAO(linkRepository, initialStateScreener, linkMapper);
    }

    @Bean
    public StackOverflowQuestionJpaDAO stackOverflowQuestionJpaDAO(
        StackOverflowQuestionJpaRepository questionRepository,
        LinkJpaRepository linkRepository,
        StackOverflowQuestionJpaMapper questionMapper
    ) {
        return new StackOverflowQuestionJpaDAO(questionRepository, linkRepository,questionMapper);
    }

}
