package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.dto.Link;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GitHubRepositoryJpaMapper extends
    OptionalEntitiesMapper<GitHubRepositoryJpaEntity, GitHubRepository>, TimeMapper{

    @Mapping(target = "linkId", source = "link.id")
    GitHubRepository toDto(GitHubRepositoryJpaEntity jpaRepository);

    @Mapping(target ="id", source = "repository.id")
    GitHubRepositoryJpaEntity toJpaWithLink(GitHubRepository repository, LinkJpaEntity link);
}
