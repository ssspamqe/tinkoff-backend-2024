package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "git_hub_repositories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GitHubRepositoryJpaEntity {

    @Id
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "link_id", referencedColumnName = "id")
    private LinkJpaEntity link;

    @Column(name = "name")
    private String name;

    @Column(name = "owner")
    private String owner;

    @Column(name = "description_md5_hash")
    private String descriptionMd5Hash;

    @ElementCollection
    @Column(name = "activities_ids")
    private Set<Long> activitiesIds;

}
