package edu.java.webClients.gitHub;

import edu.java.webClients.gitHub.dto.GitHubRepository;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivity;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    GitHubRepository findRepository(@PathVariable String owner, @PathVariable String repoName);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<GitHubRepositoryActivity> findRepositoryActivities(@PathVariable String owner, @PathVariable String repoName);
}
