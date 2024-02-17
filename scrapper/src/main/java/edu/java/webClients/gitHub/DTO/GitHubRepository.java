package edu.java.webClients.gitHub.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record GitHubRepository(
    long id,

    String name,

    String description,

    GitHubOwner owner,

    String url,

    String language,

    GitHubRepositoryVisibilityType visibility,

    @JsonProperty("created_at")
    OffsetDateTime createdAt,

    @JsonProperty("updated_at")
    OffsetDateTime updatedAt,

    @JsonProperty("pushed_at")
    OffsetDateTime pushedAt,

    @JsonProperty("subscribers_count")
    int subscribersCount,

    boolean archived

) {
}
