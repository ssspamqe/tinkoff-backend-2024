package edu.java.webClients.gitHub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.apache.commons.codec.digest.DigestUtils;

public record GitHubRepositoryBody(
    long id,

    String name,

    String description,

    GitHubOwnerBody owner,

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
    //TODO suggest a better for for hashing
    String getMd5Hash() {
        return DigestUtils.md5Hex(toString());
    }
}
