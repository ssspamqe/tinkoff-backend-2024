package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdateType;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryDescriptionUpdateChecker implements GitHubRepositorySingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(GitHubRepositoryEntity oldState, GitHubRepositoryBody newState) {
        String oldHash = oldState.getDescriptionMd5Hash();
        String newHash = newState.getMd5Hash();
        return !oldHash.equals(newHash);
    }
}
