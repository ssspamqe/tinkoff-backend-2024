package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.SingleUpdateChecker;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;

public interface GitHubRepositorySingleUpdateChecker
    extends SingleUpdateChecker<GitHubRepositoryEntity, GitHubRepositoryBody> {
}
