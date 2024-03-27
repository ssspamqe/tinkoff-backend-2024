package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.data.dto.GitHubRepository;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdateType;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryDescriptionUpdateChecker implements GitHubRepositorySingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(GitHubRepository oldState, GitHubRepositoryBody newState) {
        String oldHash = oldState.getDescriptionMd5Hash();
        String newHash = newState.getMd5Hash();
        return !oldHash.equals(newHash);
    }
}
