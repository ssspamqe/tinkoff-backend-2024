package edu.java.scrapper.integrational.dao.jpa;

import edu.java.data.dao.jpa.dao.ChatJpaDAO;
import edu.java.data.dao.jpa.dao.GitHubRepositoryJpaDAO;
import edu.java.data.dao.jpa.dao.LinkJpaDAO;
import edu.java.data.dao.jpa.dao.StackOverflowQuestionJpaDAO;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class JpaDataAccessConfiguration {
    @Bean
    public ChatJpaDAO chatJpaDAO(
        ChatJpaRepository chatRepository,
        LinkJpaDAO linkDao
    ) {
        return new ChatJpaDAO(chatRepository, linkDao);
    }

    @Bean
    public GitHubRepositoryJpaDAO gitHubRepositoryJpaDAO(
        GitHubRepositoryJpaRepository gitHubRepoRepository,
        LinkJpaDAO linkDAO
    ) {
        return new GitHubRepositoryJpaDAO(gitHubRepoRepository, linkDAO);
    }

    @Bean
    public LinkJpaDAO linkJpaDAO(
        LinkJpaRepository linkRepository
    ) {
        return new LinkJpaDAO(linkRepository);
    }

    @Bean
    public StackOverflowQuestionJpaDAO stackOverflowQuestionJpaDAO(
        StackOverflowQuestionJpaRepository questionRepository,
        LinkJpaDAO linkDao
    ) {
        return new StackOverflowQuestionJpaDAO(questionRepository, linkDao);
    }
}
