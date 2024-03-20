package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.Link;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class JpaLinkDAO implements LinkDataAccessObject {
    @Override
    public Optional<Link> findByUrl(String url) {
        return Optional.empty();
    }

    @Override
    public Optional<Link> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Link saveOrFindByUrl(String url) {
        return null;
    }

    @Override
    public Collection<Link> findByLastCheckDelayFromNow(Duration duration) {
        return null;
    }

    @Override
    public List<Long> findAssociatedChatsIdsById(long id) {
        return null;
    }

    @Override
    public void updateLastCheckedById(long id) {

    }

    @Override
    public void updateLastCheckedById(long id, LocalDateTime lastChecked) {

    }
}
