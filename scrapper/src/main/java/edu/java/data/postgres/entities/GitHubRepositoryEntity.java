package edu.java.data.postgres.entities;

import edu.java.bot.data.annotations.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Set;

@Data
@AllArgsConstructor
public class GitHubRepositoryEntity {

    @Id
    long id;
    String name;
    String owner;
    String descriptionMd5Hash;
    Set<Long> activitiesIds;

}
