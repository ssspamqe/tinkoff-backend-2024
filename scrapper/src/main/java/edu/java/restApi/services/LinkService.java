package edu.java.restApi.services;

import edu.java.data.dao.ChatDataAccessObject;
import edu.java.data.postgres.entities.LinkEntity;
import java.util.Set;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final ChatDataAccessObject chatDao;

    public Set<LinkEntity> getTrackedLinks(long chatApiId) {
        return chatDao.getTrackedLinksByApiId(chatApiId);
    }

    public LinkEntity addLinkToTrack(long chatApiId, String linkUrl) {
        return chatDao.associateUrlByApiId(linkUrl, chatApiId);
    }

    public LinkEntity untrackLink(long chatApiId, String linkUrl) {
        return chatDao.dissociateUrlByApiId(linkUrl, chatApiId);
    }
}
