package edu.java.webClients.gitHub;

import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    GitHubRepositoryBody fetchRepository(@PathVariable String owner, @PathVariable String repoName);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<GitHubRepositoryActivityBody> fetchRepositoryActivities(
        @PathVariable String owner,
        @PathVariable String repoName
    );
}
