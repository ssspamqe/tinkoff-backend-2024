package edu.java.restApi.services;

import edu.java.data.dao.ChatDataAccessObject;
import edu.java.data.postgres.entities.Link;
import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final ChatDataAccessObject chatDao;
    private final UniversalInitialStateScreener firstStateScreener;

    public Set<Link> getTrackedLinks(long chatApiId) {
        return chatDao.getTrackedLinksByApiId(chatApiId);
    }

    public Link addLinkToTrack(long chatApiId, String linkUrl) {
        return chatDao.associateUrlByApiId(linkUrl, chatApiId);
    }

    public Link untrackLink(long chatApiId, String linkUrl) {
        return chatDao.dissociateUrlByApiId(linkUrl, chatApiId);
    }
}
