package edu.java.webClients;

import edu.java.configuration.ApplicationConfig;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Autowired
    public WebClientsBeanConfiguration(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @Bean
    public StackOverflowClient stackOverflowClient() {
        WebClient webClient = WebClient.builder().baseUrl(getStackOverflowBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(StackOverflowClient.class);
    }

    private String getStackOverflowBaseUrl() {
        String defaultUrl = applicationConfig.stackOverflowUrl().defaultUrl();
        String configUrl = applicationConfig.stackOverflowUrl().configUrl();
        if (configUrl == null || configUrl.isBlank()) {
            return defaultUrl;
        }
        return configUrl;
    }

    @Bean
    public GitHubClient gitHubClient() {
        WebClient webClient = WebClient.builder().baseUrl(getGitHubBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(GitHubClient.class);
    }

    private String getGitHubBaseUrl() {
        String defaultUrl = applicationConfig.gitHubUrl().defaultUrl();
        String configUrl = applicationConfig.gitHubUrl().configUrl();
        if (configUrl == null || configUrl.isBlank()) {
            return defaultUrl;
        }
        return configUrl;
    }
}