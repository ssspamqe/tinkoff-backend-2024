package edu.java.scrapper.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubOwner;
import edu.java.webClients.gitHub.dto.GitHubRepository;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivity;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityType;
import edu.java.webClients.gitHub.dto.GitHubRepositoryVisibilityType;
import java.time.OffsetDateTime;
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
public class GitHubClientTest {

    static final String WIRE_MOCK_URL = "http://localhost:8080/";

    @Autowired
    GitHubClient gitHubClient;

    @Test
    public void should_returnRepository() {
        //Arrange
        stubFor(get("/repos/testUser/test-repo")
            .willReturn(okJson(
                    getRepositoryWithOwnerAndNameResponseBody("testUser", "test-repo")
                )
            )
        );

        //Act
        ResponseEntity<GitHubRepository> actualResponse =
            gitHubClient.findRepository("testUser", "test-repo");

        //Assert
        GitHubRepository expectedRepository =
            getExpectedGitHubRepositoryWithOwnerAndName("testUser", "test-repo");

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isNotNull().isEqualTo(expectedRepository);
    }

    @Test
    public void should_returnRepositoryActivities() {
        //Arrange
        stubFor(get("/repos/testUser/test-repo/activity")
            .willReturn(okJson("""
                [
                    {
                        "id": 1,
                        "actor": {
                            "id": 11,
                            "login": "testUser"
                        },
                        "ref" : "new/branch",
                        "timestamp": "2023-09-13T21:17:36Z",
                        "activity_type": "push"
                    },
                    {
                        "id": 2,
                        "actor": {
                            "id": 123,
                            "login": "secondTestUser"
                        },
                        "ref" : "second/branch",
                        "timestamp": "2023-09-13T21:17:36Z",
                        "activity_type": "pr_merge"
                    }
                ]""")
            )
        );

        //Act
        ResponseEntity<List<GitHubRepositoryActivity>> actualResponse =
            gitHubClient.findRepositoryActivities("testUser", "test-repo");

        //Assert
        List<GitHubRepositoryActivity> expectedActivities = List.of(
            new GitHubRepositoryActivity(
                1,
                new GitHubOwner(11, "testUser"),
                "new/branch",
                OffsetDateTime.parse("2023-09-13T21:17:36Z"),
                GitHubRepositoryActivityType.PUSH
            ),
            new GitHubRepositoryActivity(
                2,
                new GitHubOwner(123, "secondTestUser"),
                "second/branch",
                OffsetDateTime.parse("2023-09-13T21:17:36Z"),
                GitHubRepositoryActivityType.PR_MERGE
            )
        );
        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).containsExactlyInAnyOrderElementsOf(expectedActivities);
    }

    private String getRepositoryWithOwnerAndNameResponseBody(String ownerName, String repoName) {
        return STR."""
            {
            "id":123,
            "name":"\{repoName}",
            "description": "test description",
            "owner" : {
                "id":321,
                "login":"\{ownerName}"
            },
            "url":"https://github.com/testUser/test-repo",
            "language":"Java",
            "visibility":"public",
            "created_at" : "2023-09-13T21:17:36Z",
            "updated_at" : "2024-02-06T10:11:48Z",
            "pushed_at": "2024-01-31T22:21:31Z",
            "subscribers_count":345,
            "archived":true
            }""";
    }

    private GitHubRepository getExpectedGitHubRepositoryWithOwnerAndName(String ownerName, String repoName) {
        return new GitHubRepository(
            123,
            repoName,
            "test description",
            new GitHubOwner(
                321,
                ownerName
            ),
            "https://github.com/testUser/test-repo",
            "Java",
            GitHubRepositoryVisibilityType.PUBLIC,
            OffsetDateTime.parse("2023-09-13T21:17:36Z"),
            OffsetDateTime.parse("2024-02-06T10:11:48Z"),
            OffsetDateTime.parse("2024-01-31T22:21:31Z"),
            345,
            true
        );
    }

    @DynamicPropertySource
    static void jdbcProperties(DynamicPropertyRegistry registry) {
        registry.add("app.git-hub-url.default-url", () -> WIRE_MOCK_URL);
    }
}
