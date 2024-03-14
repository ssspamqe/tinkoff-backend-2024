package edu.java.data.dao;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import edu.java.data.postgres.repositories.ChatRepository;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChatDAO implements ChatDataAccessObject {
    private final ChatRepository chatRepository;
    private final ChatLinksRepository chatLinksRepository;
    private final LinkDAO linkDao;

    public Optional<Chat> findById(long id) {
        return chatRepository.findById(id);
    }

    public Optional<Chat> findByApiId(long apiId) {
        return chatRepository.findByTelegramApiId(apiId);
    }

    public Set<Link> getTrackedLinksByApiId(long chatApiId) {
        Chat chat = chatRepository.findByTelegramApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
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

    public Link associateUrlByApiId(String url, long chatApiId) {
        long chatId = chatRepository.findByTelegramApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId))
            .getId();

        Link link = linkDao.saveOrFindByUrl(url);

        assignLinkToChat(link.getId(), chatId);
        return link;
    }

    private void assignLinkToChat(long linkId, long chatId) {
        ChatLink chatLinkCouple = new ChatLink(chatId, linkId);
        chatLinksRepository.save(chatLinkCouple);
    }

    public Link dissociateUrlByApiId(String url, long chatApiId) {
        Link link = linkDao.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(URI.create(url)));

        long chatId = chatRepository.findByTelegramApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId))
            .getId();

        chatLinksRepository.removeByChatIdAndLinkId(chatId, link.getId());
        return link;
    }

    public Chat registerChatWithApiId(long apiId) {
        Optional<Chat> oldChat = chatRepository.findByTelegramApiId(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(apiId);
        }
        Chat newChat = new Chat(apiId);
        chatRepository.save(newChat);
        return newChat;
    }

    public void deleteChatWithApiId(long apiId) {
        if (chatRepository.findByTelegramApiId(apiId).isEmpty()) {
            throw new NoSuchChatException(apiId);
        }
        chatRepository.removeByTelegramApiId(apiId);
    }
}
