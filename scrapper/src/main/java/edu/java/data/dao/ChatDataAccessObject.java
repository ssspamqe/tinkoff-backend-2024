package edu.java.data.dao;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.LinkEntity;
import java.util.Optional;
import java.util.Set;

public interface ChatDataAccessObject {

    Optional<Chat> findById(long id);

    Optional<Chat> findByApiId(long apiId);

    Set<LinkEntity> getTrackedLinksByApiId(long chatApiId);

    LinkEntity associateUrlByApiId(String url, long chatApiId);

    LinkEntity dissociateUrlByApiId(String url, long chatApiId);

    Chat registerChatWithApiId(long apiId);

    void deleteChatWithApiId(long apiId);
}
