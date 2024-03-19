package edu.java.scrapper.webClients;

import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowOwnerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.assertj.core.api.Assertions.assertThat;

public class StackOverflowClientTest extends WebClientTest {

    @Autowired
    StackOverflowClient stackOverflowClient;

    @Test
    public void should_returnQuestion() {
        //Arrange
        mockServer.stubFor(get("/questions/123?site=stackoverflow&filter=withbody").
            willReturn(okJson("""
                {
                    "items":[
                                {
                                    "question_id": 123,
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
        StackOverflowResponseBody<StackOverflowQuestionBody> actualResponse =
            stackOverflowClient.fetchQuestionById(123);

        //Assert
        Instant creationDate = Instant.ofEpochSecond(567);
        Instant closedDate = Instant.ofEpochSecond(890);
        StackOverflowQuestionBody expectedQuestion = new StackOverflowQuestionBody(
            123,
            List.of("Java", "Spring"),
            new StackOverflowOwnerBody("customName"),
            "super question!",
            true,
            321,
            "test question body",
            OffsetDateTime.ofInstant(creationDate, ZoneOffset.UTC),
            OffsetDateTime.ofInstant(closedDate, ZoneOffset.UTC),
            "test closed reason"
        );

        assertThat(actualResponse).isNotNull();
        assertThat(actualResponse.items()).isNotNull().containsExactly(expectedQuestion);
    }

    @Test
    public void should_returnAnswers() {
        //Arrange
        mockServer.stubFor(get("/questions/123/answers?site=stackoverflow&filter=withbody")
            .willReturn(okJson("""
                {
                    "items": [
                        {
                           "answer_id": 1,
                           "owner": {
                                "display_name": "customName1"
                           },
                           "is_accepted": true,
                           "score": 123,
                           "body": "This is first answer",
                           "creation_date": 567
                        },
                        {
                           "answer_id": 2,
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
        StackOverflowResponseBody<StackOverflowAnswerBody> actualResponse =
            stackOverflowClient.fetchAnswersByQuestionId(123);

        //Assert
        Instant creationDate1 = Instant.ofEpochSecond(567);
        Instant creationDate2 = Instant.ofEpochSecond(890);
        List<StackOverflowAnswerBody> expectedAnswerList = List.of(
            new StackOverflowAnswerBody(
                1,
                new StackOverflowOwnerBody("customName1"),
                true,
                123,
                "This is first answer",
                OffsetDateTime.ofInstant(creationDate1, ZoneOffset.UTC)
            ),
            new StackOverflowAnswerBody(
                2,
                new StackOverflowOwnerBody("customName2"),
                false,
                456,
                "This is second answer",
                OffsetDateTime.ofInstant(creationDate2, ZoneOffset.UTC)
            )
        );

        assertThat(actualResponse).isNotNull();
        assertThat(actualResponse.items()).isNotNull()
            .containsExactlyInAnyOrderElementsOf(expectedAnswerList);
    }
}
