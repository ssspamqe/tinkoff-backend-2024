package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.data.dto.GitHubRepository;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.SingleUpdateChecker;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;

public interface GitHubRepositorySingleUpdateChecker
    extends SingleUpdateChecker<GitHubRepository, GitHubRepositoryBody> {
}
