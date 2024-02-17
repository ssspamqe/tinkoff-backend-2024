package edu.java.webClients.gitHub.DTO;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum RepositoryActivityType {
    PUSH,
    FORCE_PUSH,
    BRANCH_CREATION,
    BRANCH_DELETION,
    PR_MERGE,
    MERGE_QUEUE_MERGE;

    @JsonCreator
    public static RepositoryActivityType fromString(String text) {
        for (var type : RepositoryActivityType.values()) {
            if (type.name().equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException(STR."Invalid RepositoryActivityType: \{text} ");
    }
}
