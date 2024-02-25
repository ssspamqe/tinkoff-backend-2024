package edu.java.restApi.services;

import edu.java.data.entities.Link;
import edu.java.data.entities.TelegramChat;
import edu.java.data.repositories.LinkRepository;
import edu.java.data.repositories.TelegramChatLinksRepository;
import edu.java.data.repositories.TelegramChatRepository;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import edu.java.restApi.services.exceptions.NoSuchLinkException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    private final LinkRepository linkRepository;
    private final TelegramChatLinksRepository telegramChatLinksRepository;
    private final TelegramChatRepository telegramChatRepository;

    @Autowired
    public LinkService(
        LinkRepository linkRepository,
        TelegramChatLinksRepository telegramChatLinksRepository,
        TelegramChatRepository telegramChatRepository
    ) {
        this.linkRepository = linkRepository;
        this.telegramChatLinksRepository = telegramChatLinksRepository;
        this.telegramChatRepository = telegramChatRepository;
    }

    public Set<Link> getTrackedLinks(int chatApiId) {
        TelegramChat chat = findOrThrowException(chatApiId);

        Set<Long> linkIds = telegramChatLinksRepository.findAllLinksByChatId(chat.id());

        return buildSetOfLinks(linkIds);
    }

    private Set<Link> buildSetOfLinks(Set<Long> linkIds) {
        return linkIds.stream()
            .map(id ->
                linkRepository.findById(id).orElse(null)
            ).filter(Objects::nonNull)
            .collect(Collectors.toSet());
    }

    public Link addLinkToTrack(long chatId, String linkUrl) {
        Link link = findOrSave(linkUrl);
        long linkId = link.id();

        if (chatWasNotRegistered(chatId)) {
            throw new NoSuchChatException(STR."There is no registered chat with id \{chatId}");
        }

        telegramChatLinksRepository.addLinkToChat(chatId, linkId);
        return link;
    }

    public Link untrackLink(long chatId, String linkUrl) {
        Link link = findOrThrowException(linkUrl);
        long linkId = link.id();

        if (chatWasNotRegistered(chatId)) {
            throw new NoSuchChatException(STR."There is no registered chat with id \{chatId}");
        }

        telegramChatLinksRepository.removeLinkFromChat(chatId, linkId);
        return link;
    }

    private boolean chatWasNotRegistered(long chatId) {
        return telegramChatRepository.findById(chatId).isEmpty();
    }

    private Link findOrSave(String linkUrl) {
        Optional<Link> optionalLink = linkRepository.findByUrl(linkUrl);
        if (linkUrl.isEmpty()) {
            Link newLink = new Link(ThreadLocalRandom.current().nextLong(1), linkUrl);
            linkRepository.save(newLink);
            return newLink;
        }
        return optionalLink.get();
    }

    private TelegramChat findOrThrowException(long chatApiId) {
        Optional<TelegramChat> telegramChat = telegramChatRepository.findById(chatApiId);
        if (telegramChat.isEmpty()) {
            throw new NoSuchChatException(STR."There is no such chat with id \{chatApiId}");
        }
        return telegramChat.get();
    }

    private Link findOrThrowException(String linkUrl) {
        Optional<Link> link = linkRepository.findByUrl(linkUrl);
        if (link.isEmpty()) {
            throw new NoSuchLinkException(STR."There is no link with such url: \{linkUrl}");
        }
        return link.get();
    }
}
