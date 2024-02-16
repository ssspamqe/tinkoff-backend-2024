package edu.java.webClients;

import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class BeanConfiguration {
    @Bean
    public StackOverflowClient stackOverflowClient() {
        WebClient webClient = WebClient.builder().baseUrl("https://api.stackexchange.com/").build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(StackOverflowClient.class);
    }

    @Bean
    public GitHubClient gitHubClient() {
        WebClient webClient = WebClient.builder().baseUrl("https://api.github.com/").build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(GitHubClient.class);
    }
}
