package edu.java.data.postgres.entities;

import edu.java.bot.data.annotations.Id;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GitHubRepositoryEntity {

    @Id
    long id;
    long linkId;
    String name;
    String owner;
    String descriptionMd5Hash;
    Set<Long> activitiesIds;

}
