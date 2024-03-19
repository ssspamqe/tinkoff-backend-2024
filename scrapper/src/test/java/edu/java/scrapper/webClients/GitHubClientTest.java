package edu.java.scrapper.webClients;

import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubOwnerBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityType;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryVisibilityType;
import java.time.OffsetDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubClientTest extends WebClientTest {

    @Autowired
    GitHubClient gitHubClient;

    @Test
    public void should_returnRepository() {
        //Arrange
        mockServer.stubFor(get("/repos/test-user/test-repo")
            .willReturn(okJson(
                    getRepositoryWithNameAndOwnerResponseBody("test-repo", "test-user")
                )
            )
        );

        //Act
        GitHubRepositoryBody actualRepository =
            gitHubClient.fetchRepositoryByNameAndOwner("test-repo", "test-user");

        //Assert
        GitHubRepositoryBody expectedRepository =
            getExpectedGitHubRepositoryWithNameAndOwner("test-repo", "test-user");
        assertThat(actualRepository).isNotNull().isEqualTo(expectedRepository);
    }

    @Test
    public void should_returnRepositoryActivities() {
        //Arrange
        mockServer.stubFor(get("/repos/test-user/test-repo/activity")
            .willReturn(okJson("""
                [
                    {
                        "id": 1,
                        "actor": {
                            "id": 11,
                            "login": "firstTestUser"
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
        List<GitHubRepositoryActivityBody> actualRepositoryActivities =
            gitHubClient.fetchRepositoryActivitiesByRepositoryNameAndOwner("test-repo", "test-user");

        //Assert
        List<GitHubRepositoryActivityBody> expectedActivities = List.of(
            new GitHubRepositoryActivityBody(
                1,
                new GitHubOwnerBody(11, "firstTestUser"),
                "new/branch",
                OffsetDateTime.parse("2023-09-13T21:17:36Z"),
                GitHubRepositoryActivityType.PUSH
            ),
            new GitHubRepositoryActivityBody(
                2,
                new GitHubOwnerBody(123, "secondTestUser"),
                "second/branch",
                OffsetDateTime.parse("2023-09-13T21:17:36Z"),
                GitHubRepositoryActivityType.PR_MERGE
            )
        );

        assertThat(actualRepositoryActivities).containsExactlyInAnyOrderElementsOf(expectedActivities);
    }

    private String getRepositoryWithNameAndOwnerResponseBody(String repoName, String ownerName) {
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

    private GitHubRepositoryBody getExpectedGitHubRepositoryWithNameAndOwner(String repoName, String ownerName) {
        return new GitHubRepositoryBody(
            123,
            repoName,
            "test description",
            new GitHubOwnerBody(
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
}
