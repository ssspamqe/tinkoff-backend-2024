package edu.java.scrapper.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.configuration.ApplicationConfig;
import edu.java.webClients.WebClientsBeanConfiguration;
import edu.java.webClients.stackOverflow.DTO.StackOverflowAnswer;
import edu.java.webClients.stackOverflow.DTO.StackOverflowOwner;
import edu.java.webClients.stackOverflow.DTO.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.assertj.core.api.Assertions.assertThat;

@WireMockTest(httpPort = 8080)
@ExtendWith(MockitoExtension.class)
public class StackOverflowClientTest {

    static final String WIRE_MOCK_URL = "http://localhost:8080/";

    @Mock
    ApplicationConfig applicationConfig;

    @InjectMocks
    WebClientsBeanConfiguration webClientsBeanConfiguration;

    StackOverflowClient stackOverflowClient;

    @Test
    public void should_returnQuestion() {
        //Arrange
        Mockito.when(applicationConfig.stackOverflowUrl())
            .thenReturn(new ApplicationConfig.StackOverflowUrl(WIRE_MOCK_URL, WIRE_MOCK_URL));
        stackOverflowClient = webClientsBeanConfiguration.stackOverflowClient();

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
                                    "creation_date": 1314376600,
                                    "closed_date": 1599067756,
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
        List<StackOverflowQuestion> actualQuestionList = stackOverflowClient.findQuestionById(123).items();

        //Assert
        StackOverflowQuestion expectedQuestion = new StackOverflowQuestion(
            123,
            List.of("Java", "Spring"),
            new StackOverflowOwner("customName"),
            "super question!",
            true,
            321,
            "test question body",
            OffsetDateTime.ofInstant(Instant.ofEpochSecond(1314376600), ZoneOffset.UTC),
            OffsetDateTime.ofInstant(Instant.ofEpochSecond(1599067756), ZoneOffset.UTC),
            "test closed reason"
        );
        assertThat(actualQuestionList).containsExactly(expectedQuestion);
    }

    @Test
    public void should_buildWebClient_when_urlInApplicationConfigIsNull() {
        //Arrange
        Mockito.when(applicationConfig.stackOverflowUrl())
            .thenReturn(new ApplicationConfig.StackOverflowUrl(WIRE_MOCK_URL, null));

        stubFor(get("/questions/123?site=stackoverflow&filter=withbody")
            .willReturn(okJson("""
                {
                    "items":[],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        stackOverflowClient = webClientsBeanConfiguration.stackOverflowClient();
        int actualQuotaRemaining = stackOverflowClient.findQuestionById(123).quotaRemaining();

        //Assert
        assertThat(actualQuotaRemaining).isEqualTo(299);
    }

    @Test
    public void should_returnAnswers() {
        //Arrange
        Mockito.when(applicationConfig.stackOverflowUrl())
            .thenReturn(new ApplicationConfig.StackOverflowUrl(WIRE_MOCK_URL, WIRE_MOCK_URL));
        stackOverflowClient = webClientsBeanConfiguration.stackOverflowClient();

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
                           "creation_date": 1314376600
                        },
                        {
                           "id": 2,
                           "owner": {
                                "display_name": "customName2"
                           },
                           "is_accepted": false,
                           "score": 456,
                           "body": "This is second answer",
                           "creation_date": 1599067756
                        }
                    ],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        List<StackOverflowAnswer> actualAnswerList = stackOverflowClient.findAnswersByQuestionId(123).items();

        //Assert
        List<StackOverflowAnswer> expectedAnswerList = List.of(
            new StackOverflowAnswer(
                1,
                new StackOverflowOwner("customName1"),
                true,
                123,
                "This is first answer",
                OffsetDateTime.ofInstant(Instant.ofEpochSecond(1314376600), ZoneOffset.UTC)
            ),
            new StackOverflowAnswer(
                2,
                new StackOverflowOwner("customName2"),
                false,
                456,
                "This is second answer",
                OffsetDateTime.ofInstant(Instant.ofEpochSecond(1599067756), ZoneOffset.UTC)
            )
        );
        assertThat(actualAnswerList).isEqualTo(expectedAnswerList);
    }
}
