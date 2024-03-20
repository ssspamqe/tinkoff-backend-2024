package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dto.Chat;
import edu.java.data.dto.Link;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
public class ChatJpaDAO implements ChatDataAccessObject {

    private

    @Override
    public Optional<Chat> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Set<Link> getTrackedLinksByChatId(long chatId) {
        return null;
    }

    @Override
    public Link associateUrlByChatId(String url, long chatId) {
        return null;
    }

    @Override
    public Link dissociateUrlByChatId(String url, long chatId) {
        return null;
    }

    @Override
    public Chat registerChatWithId(long id) {
        return null;
    }

    @Override
    public void deleteChatWithId(long id) {

    }
}
