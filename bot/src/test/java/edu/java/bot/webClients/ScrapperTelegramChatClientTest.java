package edu.java.bot.webClients;

import edu.java.bot.webClients.exceptions.ClientErrorException;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.webClients.scrapper.dto.responses.ScrapperApiErrorResponse;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ScrapperTelegramChatClientTest extends WebClientTest {

    @Autowired
    ScrapperTelegramChatClient scrapperTelegramChatClient;

    @Test
    public void should_notThrowException_when_postHttpStatus2xx() {
        mockServer.stubFor(post("/tg-chat/1")
            .willReturn(ok()));

        ResponseEntity<?> actualResponse = scrapperTelegramChatClient.registerNewChat(1);

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
    }

    @Test
    public void should_notThrowException_when_deleteHttpStatus2xx() {
        mockServer.stubFor(delete("/tg-chat/1")
            .willReturn(ok()));

        ResponseEntity<?> actualResponse = scrapperTelegramChatClient.deleteChat(1);

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
    }

    @Test
    public void should_throwClientErrorException_when_httpStatus4xx() {
        //Arrange
        mockServer.stubFor(post("/tg-chat/1")
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
}
