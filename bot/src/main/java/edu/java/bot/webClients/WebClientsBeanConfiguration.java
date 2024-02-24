package edu.java.bot.webClients;

import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    public ScrapperTelegramChatClient scrapperTelegramChatClient() {
        String baseUrl = applicationConfig.scrapperUrl().getBaseUrl();
        return createDefaultWebClient(baseUrl, ScrapperTelegramChatClient.class);
    }

    private <T> T createDefaultWebClient(String url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder().baseUrl(url).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(webClientInterface);
    }
}
