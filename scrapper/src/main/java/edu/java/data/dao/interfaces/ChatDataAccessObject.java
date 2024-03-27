package edu.java.data.dao.interfaces;

import edu.java.data.dto.Chat;
import edu.java.data.dto.Link;
import java.net.URI;
import java.util.Optional;
import java.util.Set;

public interface ChatDataAccessObject {

    Optional<Chat> findById(long id);

    Set<Link> getTrackedLinksByChatId(long chatId);

    Link associateUrlByChatId(URI url, long chatId);

    Link dissociateUrlByChatId(URI url, long chatId);

    Chat registerChatWithId(long id);

    void deleteChatWithId(long id);
}
