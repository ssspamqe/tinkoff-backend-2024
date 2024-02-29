package edu.java.scrapper.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.webClients.exceptions.ClientErrorException;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import edu.java.webClients.telegramBot.dto.responses.TelegramBotApiErrorResponse;
import java.net.URI;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
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
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
public class TelegramBotClientTest {

    @Autowired
    TelegramBotClient telegramBotClient;

    @Test
    public void should_notThrowException_when_postHttpStatus2xx() {
        stubFor(post("/updates")
            .willReturn(ok()));

        ResponseEntity<?> actualResponse = telegramBotClient.sendLinkUpdate(new LinkUpdate(
            1, URI.create("http://my/link"), "description", List.of(1)
        ));

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
    }

    @Test
    public void should_throwClientErrorException_when_httpStatus4xx() {
        //Arrange
        stubFor(post("/updates")
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
        TelegramBotApiErrorResponse expectedApiErrorResponse = new TelegramBotApiErrorResponse(
            "some description",
            "400",
            "some exception",
            "some message",
            List.of("frame1", "frame2")
        );

        LinkUpdate linkUpdate = new LinkUpdate(
            1, URI.create("http://my/link"), "discription", List.of(1)
        );

        assertThatThrownBy(
            () -> telegramBotClient.sendLinkUpdate(linkUpdate)
        ).isInstanceOf(ClientErrorException.class)
            .satisfies(actualResponse ->
                assertThat(((ClientErrorException) actualResponse).getErrorResponseBody())
                    .isEqualTo(expectedApiErrorResponse)
            );

    }
}
