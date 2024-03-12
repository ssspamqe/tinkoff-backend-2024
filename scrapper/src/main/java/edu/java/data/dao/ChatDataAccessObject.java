package edu.java.data.dao;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.Link;
import java.util.Optional;
import java.util.Set;

public interface ChatDataAccessObject {

    Optional<Chat> findById(long id);

    Optional<Chat> findByApiId(long apiId);

    Set<Link> getTrackedLinksByApiId(long chatApiId);

    Link associateUrlByApiId(String url, long chatApiId);

    Link dissociateUrlByApiId(String url, long chatApiId);

    Chat registerChatWithApiId(long apiId);

    void deleteChatWithApiId(long apiId);
}
