package edu.java.webClients.gitHub;

import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    GitHubRepositoryBody fetchRepository(@PathVariable String repoName, @PathVariable String owner);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<GitHubRepositoryActivityBody> fetchRepositoryActivities(
        @PathVariable String repoName,
        @PathVariable String owner
    );
}
