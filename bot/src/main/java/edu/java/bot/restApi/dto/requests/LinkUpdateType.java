package edu.java.bot.restApi.dto.requests;

public enum LinkUpdateType {
    STACK_OVERFLOW_DESCRIPTION("Question was updated!"),
    STACK_OVERFLOW_ANSWERS("Answers set was updated!"),
    GIT_HUB_REPOSITORY_DESCRIPTION("New update in repository!"),
    GIT_HUB_REPOSITORY_ACTIVITIES("New activity in repository!");

    private final String message;

    private LinkUpdateType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
