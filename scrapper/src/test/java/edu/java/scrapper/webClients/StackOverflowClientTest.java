package edu.java.scrapper.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswer;
import edu.java.webClients.stackOverflow.dto.StackOverflowOwner;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponse;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.assertj.core.api.Assertions.assertThat;

@WireMockTest(httpPort = 8080)
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StackOverflowClientTest {

    static final String WIRE_MOCK_URL = "http://localhost:8080/";

    @Autowired
    StackOverflowClient stackOverflowClient;

    @Test
    public void should_returnQuestion() {
        //Arrange
        stubFor(get("/questions/123?site=stackoverflow&filter=withbody").
            willReturn(okJson("""
                {
                    "items":[
                                {
                                    "id": 123,
                                    "tags" :[
                                        "Java","Spring"
                                    ],
                                    "owner": {
                                        "display_name" : "customName"
                                    },
                                    "title": "super question!",
                                    "is_answered": true,
                                    "answer_count": 321,
                                    "body": "test question body",
                                    "creation_date": 567,
                                    "closed_date": 890,
                                    "closed_reason": "test closed reason"
                                }
                        ],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        ResponseEntity<StackOverflowResponse<StackOverflowQuestion>> actualResponse =
            stackOverflowClient.findQuestionById(123);

        //Assert
        Instant creationDate = Instant.ofEpochSecond(567);
        Instant closedDate = Instant.ofEpochSecond(890);
        StackOverflowQuestion expectedQuestion = new StackOverflowQuestion(
            123,
            List.of("Java", "Spring"),
            new StackOverflowOwner("customName"),
            "super question!",
            true,
            321,
            "test question body",
            OffsetDateTime.ofInstant(creationDate, ZoneOffset.UTC),
            OffsetDateTime.ofInstant(closedDate, ZoneOffset.UTC),
            "test closed reason"
        );

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isNotNull();
        assertThat(actualResponse.getBody().items()).isNotNull().containsExactly(expectedQuestion);
    }

    @Test
    public void should_returnAnswers() {
        //Arrange
        stubFor(get("/questions/123/answers?site=stackoverflow&filter=withbody")
            .willReturn(okJson("""
                {
                    "items": [
                        {
                           "id": 1,
                           "owner": {
                                "display_name": "customName1"
                           },
                           "is_accepted": true,
                           "score": 123,
                           "body": "This is first answer",
                           "creation_date": 567
                        },
                        {
                           "id": 2,
                           "owner": {
                                "display_name": "customName2"
                           },
                           "is_accepted": false,
                           "score": 456,
                           "body": "This is second answer",
                           "creation_date": 890
                        }
                    ],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        ResponseEntity<StackOverflowResponse<StackOverflowAnswer>> actualResponse =
            stackOverflowClient.findAnswersByQuestionId(123);

        //Assert
        Instant creationDate1 = Instant.ofEpochSecond(567);
        Instant creationDate2 = Instant.ofEpochSecond(890);
        List<StackOverflowAnswer> expectedAnswerList = List.of(
            new StackOverflowAnswer(
                1,
                new StackOverflowOwner("customName1"),
                true,
                123,
                "This is first answer",
                OffsetDateTime.ofInstant(creationDate1, ZoneOffset.UTC)
            ),
            new StackOverflowAnswer(
                2,
                new StackOverflowOwner("customName2"),
                false,
                456,
                "This is second answer",
                OffsetDateTime.ofInstant(creationDate2, ZoneOffset.UTC)
            )
        );

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isNotNull();
        assertThat(actualResponse.getBody().items()).isNotNull()
            .containsExactlyInAnyOrderElementsOf(expectedAnswerList);
    }

    @DynamicPropertySource
    static void jdbcProperties(DynamicPropertyRegistry registry) {
        registry.add("app.stack-overflow-url.default-url", () -> WIRE_MOCK_URL);
    }
}
