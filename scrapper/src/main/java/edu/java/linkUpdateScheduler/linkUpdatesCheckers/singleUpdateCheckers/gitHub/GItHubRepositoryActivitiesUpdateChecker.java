package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.LinkUpdateType;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GItHubRepositoryActivitiesUpdateChecker implements GitHubRepositorySingleUpdateChecker {

    private final GitHubClient gitHubClient;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_ACTIVITIES;
    }

    @Override
    public boolean hasUpdate(GitHubRepositoryEntity oldState, GitHubRepositoryBody newState) {
        Set<Long> oldActivities = oldState.getActivitiesIds();
        Set<Long> newActivities = fetchActivitiesIds(newState.name(), newState.owner().login());

        return !oldActivities.equals(newActivities);
    }

    private Set<Long> fetchActivitiesIds(String name, String owner) {
        return gitHubClient
            .fetchRepositoryActivities(name, owner)
            .stream()
            .map(GitHubRepositoryActivityBody::id)
            .collect(Collectors.toSet());
    }

}
