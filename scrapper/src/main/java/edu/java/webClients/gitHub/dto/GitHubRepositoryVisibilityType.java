package edu.java.webClients.gitHub.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GitHubRepositoryVisibilityType {
    PUBLIC, PRIVATE;

    @JsonCreator
    public static GitHubRepositoryVisibilityType fromString(String text) {
        for (var type : GitHubRepositoryVisibilityType.values()) {
            if (type.name().equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException(STR."Invalid RepositoryVisibilityType: \{text} ");
    }
}
