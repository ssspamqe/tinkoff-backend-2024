package edu.java.bot.webClients;

import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.restApi.dto.responses.ApiErrorResponse;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.webClients.exceptions.ClientErrorException;
import edu.java.bot.webClients.scrapper.dto.responses.ScrapperApiErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Autowired
    public WebClientsBeanConfiguration(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    public ScrapperTelegramChatClient scrapperTelegramChatClient() {
        String baseUrl = applicationConfig.scrapperUrl().getBaseUrl();
        return createDefaultScraperWebClient(baseUrl, ScrapperTelegramChatClient.class);
    }

    public ScrapperLinksClient scrapperLinksClient() {
        String baseUrl = applicationConfig.scrapperUrl().getBaseUrl();
        return createDefaultScraperWebClient(baseUrl, ScrapperLinksClient.class);
    }

    private <T> T createDefaultScraperWebClient(String url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder()
            .defaultStatusHandler(HttpStatusCode::is4xxClientError, response ->
                response.bodyToMono(ScrapperApiErrorResponse.class)
                    .flatMap(errorBody -> Mono.error(new ClientErrorException(errorBody)))
            )
            .baseUrl(url)
            .build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(webClientInterface);
    }
}
