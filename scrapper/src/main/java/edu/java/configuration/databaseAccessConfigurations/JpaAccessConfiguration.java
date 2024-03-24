package edu.java.configuration.databaseAccessConfigurations;

import edu.java.data.dao.jpa.dao.ChatJpaDAO;
import edu.java.data.dao.jpa.dao.GitHubRepositoryJpaDAO;
import edu.java.data.dao.jpa.dao.LinkJpaDAO;
import edu.java.data.dao.jpa.dao.StackOverflowQuestionJpaDAO;
import edu.java.data.dao.jpa.repositories.AssociationJpaRepository;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jpa")
public class JpaAccessConfiguration {

    @Bean
    public ChatJpaDAO chatJpaDAO(
        ChatJpaRepository chatRepository,
        LinkJpaDAO linkDao,
        AssociationJpaRepository associationRepository
    ) {
        return new ChatJpaDAO(chatRepository, associationRepository, linkDao);
    }

    @Bean
    public GitHubRepositoryJpaDAO gitHubRepositoryJpaDAO(
        GitHubRepositoryJpaRepository gitHubRepoRepository,
        LinkJpaRepository linkRepository
    ) {
        return new GitHubRepositoryJpaDAO(gitHubRepoRepository, linkRepository);
    }

    @Bean
    public LinkJpaDAO linkJpaDAO(
        LinkJpaRepository linkRepository,
        UniversalInitialStateScreener initialStateScreener
    ) {
        return new LinkJpaDAO(linkRepository, initialStateScreener);
    }

    @Bean
    public StackOverflowQuestionJpaDAO stackOverflowQuestionJpaDAO(
        StackOverflowQuestionJpaRepository questionRepository,
        LinkJpaRepository linkRepository
    ) {
        return new StackOverflowQuestionJpaDAO(questionRepository, linkRepository);
    }

}
