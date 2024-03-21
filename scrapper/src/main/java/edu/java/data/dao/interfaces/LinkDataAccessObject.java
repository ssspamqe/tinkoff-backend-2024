package edu.java.data.dao.interfaces;

import edu.java.data.dto.Link;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface LinkDataAccessObject {

    Optional<Link> findByUrl(URI url);

    Optional<Link> findById(long id);

    Link saveOrFindByUrl(URI url);

    Set<Link> findByLastCheckDelayFromNow(Duration duration);

    List<Long> findAssociatedChatsIdsByLinkId(long id);

    void updateLastCheckedAtById(long id);

    void updateLastCheckedAtById(LocalDateTime lastChecked, long id);
}
