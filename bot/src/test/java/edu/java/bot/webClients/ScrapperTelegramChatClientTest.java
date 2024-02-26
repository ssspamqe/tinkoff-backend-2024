package edu.java.bot.webClients;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.webClients.exceptions.ClientErrorException;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.webClients.scrapper.dto.responses.ScrapperApiErrorResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@WireMockTest(httpPort = 8080)
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@EnableConfigurationProperties(ApplicationConfig.class)
public class ScrapperTelegramChatClientTest {

    static final String WIRE_MOCK_URL = "http://localhost:8080";

    @Autowired
    ScrapperTelegramChatClient scrapperTelegramChatClient;

    @Test
    public void should_notThrowException_when_postHttpStatus2xx() {
        stubFor(post("/tg-chat/1")
            .willReturn(ok()));

        ResponseEntity<?> actualResponse = scrapperTelegramChatClient.registerNewChat(1);

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
    }


    @Test
    public void should_notThrowException_when_deleteHttpStatus2xx() {
        stubFor(delete("/tg-chat/1")
            .willReturn(ok()));

        ResponseEntity<?> actualResponse = scrapperTelegramChatClient.deleteChat(1);

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
    }

    @Test
    public void should_throwClientErrorException_when_httpStatus4xx() {
        //Arrange
        stubFor(post("/tg-chat/1")
            .willReturn(
                okJson("""
                    {
                        "description": "some description",
                        "code": "400",
                        "exceptionName":"some exception",
                        "exceptionMessage": "some message",
                        "stacktrace":[
                            "frame1",
                            "frame2"
                        ]
                    }"""
                )
                    .withStatus(400)
            )
        );

        //Act, Assert
        ScrapperApiErrorResponse expectedApiErrorResponse = new ScrapperApiErrorResponse(
            "some description",
            "400",
            "some exception",
            "some message",
            List.of("frame1", "frame2")
        );

        assertThatThrownBy(
            () -> scrapperTelegramChatClient.registerNewChat(1)
        )
            .isInstanceOf(ClientErrorException.class)
            .satisfies(actualException ->
                assertThat(
                    ((ClientErrorException) actualException).getErrorResponseBody()
                )
                    .isEqualTo(expectedApiErrorResponse)
            );
    }

    @DynamicPropertySource
    static void jdbcProperties(DynamicPropertyRegistry registry) {
        registry.add("app.scrapper-url.default-url", () -> WIRE_MOCK_URL);
        registry.add("app.telegram-token", () -> "telegramTokenPlaceHolder");
    }

}
