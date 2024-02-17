package edu.java.webClients.gitHub;

import java.util.List;
import edu.java.webClients.gitHub.DTO.Repository;
import edu.java.webClients.gitHub.DTO.RepositoryActivity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    Repository findRepository(@PathVariable String owner, @PathVariable String repoName);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<RepositoryActivity> findRepositoryActivities(@PathVariable String owner, @PathVariable String repoName);
}
