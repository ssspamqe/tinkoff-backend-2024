package edu.java.data.dao;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.Link;
import java.util.Set;

public interface ChatDataAccessObject {
    Set<Link> getTrackedLinks(long chatApiId);

    Link associateUrl(String url, long chatApiId);

    Link dissociateUrl(String url, long chatApiId);

    Chat registerChat(long apiId);

    void deleteChat(long apiId);
}
