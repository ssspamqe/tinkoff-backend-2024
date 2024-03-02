package edu.java.restApi.services;

import edu.java.data.redis.documents.Link;
import edu.java.data.redis.documents.TelegramChat;
import edu.java.data.redis.documents.TelegramChatLink;
import edu.java.data.redis.repositories.LinkRepository;
import edu.java.data.redis.repositories.TelegramChatLinkRepository;
import edu.java.data.redis.repositories.TelegramChatRepository;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import edu.java.restApi.services.exceptions.NoSuchLinkException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    private final LinkRepository linkRepository;
    private final TelegramChatLinkRepository telegramChatLinkRepository;
    private final TelegramChatRepository telegramChatRepository;

    @Autowired
    public LinkService(
        LinkRepository linkRepository,
        TelegramChatLinkRepository telegramChatLinkRepository,
        TelegramChatRepository telegramChatRepository
    ) {
        this.linkRepository = linkRepository;
        this.telegramChatLinkRepository = telegramChatLinkRepository;
        this.telegramChatRepository = telegramChatRepository;
    }

    public Set<Link> getTrackedLinks(long chatApiId) {
        TelegramChat chat = findChatByApiIdOrThrowException(chatApiId);
        String chatId = chat.getId();

        Set<String> linkIds = telegramChatLinkRepository
            .findAllByChatId(chatId)
            .stream()
            .map(TelegramChatLink::getLinkId)
            .collect(Collectors.toSet());

        return buildSetOfLinks(linkIds);
    }

    private Set<Link> buildSetOfLinks(Set<String> linkIds) {
        return linkIds.stream()
            .map(id ->
                linkRepository.findById(id).orElse(null)
            ).filter(Objects::nonNull)
            .collect(Collectors.toSet());
    }

    public Link addLinkToTrack(long chatApiId, String linkUrl) {
        TelegramChat chat = findChatByApiIdOrThrowException(chatApiId);
        String chatId = chat.getId();

        Link link = findOrSave(linkUrl);
        String linkId = link.getId();

        assignLinkToChat(chatId, linkId);
        return link;
    }

    private void assignLinkToChat(String chatId, String linkId) {
        telegramChatLinkRepository.save(new TelegramChatLink(chatId, linkId));
    }

    public Link untrackLink(long chatApiId, String linkUrl) {
        Link link = findOrThrowException(linkUrl);
        String linkId = link.getId();

        TelegramChat chat = findChatByApiIdOrThrowException(chatApiId);
        String chatId = chat.getId();

        telegramChatLinkRepository.removeByChatIdAndLinkId(chatId, linkId);
        return link;
    }

    private Link findOrSave(String linkUrl) {
        Optional<Link> optionalLink = linkRepository.findByHashedUrl(Link.hash(linkUrl));
        if (optionalLink.isEmpty()) {
            Link newLink = new Link(linkUrl);
            linkRepository.save(newLink);
            return newLink;
        }
        return optionalLink.get();
    }

    private TelegramChat findChatByApiIdOrThrowException(long chatApiId) {
        Optional<TelegramChat> telegramChat = telegramChatRepository.findByApiId(chatApiId);
        if (telegramChat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{chatApiId}");
        }
        return telegramChat.get();
    }

    private Link findOrThrowException(String linkUrl) {
        Optional<Link> link = linkRepository.findByHashedUrl(Link.hash(linkUrl));
        if (link.isEmpty()) {
            throw new NoSuchLinkException(STR."There is no link with such url: \{linkUrl}");
        }
        return link.get();
    }
}
