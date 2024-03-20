package edu.java.data.dao.jdbc.repositories.rowMappers;

import edu.java.data.dto.GitHubRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.jdbc.core.RowMapper;

public class GitHubRepoitoryRowMapper implements RowMapper<GitHubRepository> {
    @Override
    public GitHubRepository mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long linkId = rs.getLong("link_id");
        String name = rs.getString("name");
        String owner = rs.getString("owner");
        String descriptionMd5hash = rs.getString("description_md5_hash");

        Object[] arrayData = (Object[]) rs.getArray("activities_ids").getArray();
        Set<Long> activitiesIds = buildSetLong(arrayData);

        return new GitHubRepository(id, linkId, name, owner, descriptionMd5hash, activitiesIds);
    }

    private Set<Long> buildSetLong(Object[] arrayData) {
        Set<Long> result = new HashSet<>();
        for (var data : arrayData) {
            result.add((long) data);
        }
        return result;
    }
}
