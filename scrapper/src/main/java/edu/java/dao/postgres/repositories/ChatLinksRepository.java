package edu.java.dao.postgres.repositories;

import edu.java.dao.postgres.entities.ChatLink;
import java.util.List;

public interface ChatLinksRepository {
    void save(ChatLink chatLink);
    List<ChatLink> findByChatId(long chatId);
    List<ChatLink> findByLinkId(long linkId);
    void removeByChatIdAndLinkId(long chatId, long linkId);
}

