package edu.java.configuration.databaseAccessConfigurations;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jpa.dao.ChatJpaDAO;
import edu.java.data.dao.jpa.dao.GitHubRepositoryJpaDAO;
import edu.java.data.dao.jpa.dao.LinkJpaDAO;
import edu.java.data.dao.jpa.dao.StackOverflowQuestionJpaDAO;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jpa")
public class JpaAccessConfiguration {

    public ChatDataAccessObject chatJpaDAO(
        ChatJpaRepository chatRepository,
        LinkJpaDAO linkDao
    ) {
        return new ChatJpaDAO(chatRepository, linkDao);
    }

    public GitHubRepositoryDataAccessObject gitHubRepositoryJpaDAO(
        GitHubRepositoryJpaRepository gitHubRepoRepository,
        LinkJpaDAO linkDAO
    ) {
        return new GitHubRepositoryJpaDAO(gitHubRepoRepository, linkDAO);
    }

    public LinkDataAccessObject linkJpaDAO(
        LinkJpaRepository linkRepository
    ) {
        return new LinkJpaDAO(linkRepository);
    }

    public StackOverflowQuestionDataAccessObject stackOverflowQuestionJpaDAO(
        StackOverflowQuestionJpaRepository questionRepository,
        LinkJpaDAO linkDao
    ) {
        return new StackOverflowQuestionJpaDAO(questionRepository, linkDao);
    }

}
