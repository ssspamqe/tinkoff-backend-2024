package edu.java.configuration.databaseAccessConfigurations.jpa;

import edu.java.data.dao.jpa.entities.utils.mappers.ChatMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.GitHubRepositoryMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.StackOverflowQuestionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jpa")
public class JpaBeanConfiguration {

    @Bean
    public ChatMapper jpaChatMapper() {
        return new ChatMapper();
    }

    @Bean
    public GitHubRepositoryMapper jpaGitHubRepositoryMapper() {
        return new GitHubRepositoryMapper();
    }

    @Bean
    public LinkMapper jpaLinkMapper() {
        return new LinkMapper();
    }

    @Bean
    public StackOverflowQuestionMapper jpaStackOverflowQuestionMapper() {
        return new StackOverflowQuestionMapper();
    }
}
