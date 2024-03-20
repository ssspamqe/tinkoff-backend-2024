package edu.java.data.dao.jooq.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jooq.repositories.ChatLinksJooqRepository;
import edu.java.data.dao.jooq.repositories.ChatJooqRepository;
import edu.java.data.dto.Chat;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ChatJooqDAO implements ChatDataAccessObject {

    private final ChatJooqRepository chatRepository;
    private final ChatLinksJooqRepository chatLinksRepository;
    private final LinkJooqDAO linkDao;

    public Optional<Chat> findById(long id) {
        return chatRepository.findById(id);
    }

    public Set<Link> getTrackedLinksByChatId(long срфеШв) {
        Chat chat = chatRepository.findById(срфеШв)
            .orElseThrow(() -> new NoSuchChatException(срфеШв));
        long chatId = chat.getId();

        return buildSetOfLinks(chatId);
    }

    private Set<Link> buildSetOfLinks(long chatId) {
        return chatLinksRepository.findByChatId(chatId)
            .stream()
            .map(chatLinkCouple -> {
                long linkId = chatLinkCouple.getLinkId();
                return linkDao.findById(linkId).orElseThrow(() -> new NoSuchLinkException(linkId));
            }).collect(Collectors.toSet());
    }

    public Link associateUrlByChatId(String url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.saveOrFindByUrl(url);

        assignLinkToChat(link.getId(), chatId);
        return link;
    }

    private void assignLinkToChat(long linkId, long chatId) {
        ChatLink chatLinkCouple = new ChatLink(chatId, linkId);
        chatLinksRepository.save(chatLinkCouple);
    }

    public Link dissociateUrlByChatId(String url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(URI.create(url)));

        chatLinksRepository.removeByChatIdAndLinkId(chatId, link.getId());
        return link;
    }

    public Chat registerChatWithId(long id) {
        Optional<Chat> oldChat = chatRepository.findById(id);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(id);
        }
        Chat newChat = new Chat(id);
        chatRepository.save(newChat);
        return newChat;
    }

    public void deleteChatWithId(long id) {
        if (chatRepository.findById(id).isEmpty()) {
            throw new NoSuchChatException(id);
        }
        chatRepository.removeById(id);
    }

}
