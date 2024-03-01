package edu.java.restApi.services;

import edu.java.data.models.Link;
import edu.java.data.models.TelegramChat;
import edu.java.data.models.TelegramChatLink;
import edu.java.data.repositories.LinkRepository;
import edu.java.data.repositories.TelegramChatLinkRepository;
import edu.java.data.repositories.TelegramChatRepository;
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

    public Set<Link> getTrackedLinks(long chatId) {
        if (!chatWithIdWasRegistered(chatId)) {
            throw new NoSuchChatException(STR."There is no chat with id \{chatId}");
        }

        Set<Long> linkIds = telegramChatLinkRepository
            .findAllByChatId(chatId)
            .stream()
            .map(TelegramChatLink::linkId)
            .collect(Collectors.toSet());

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

        if (!chatWithIdWasRegistered(chatId)) {
            throw new NoSuchChatException(STR."There is no registered chat with id \{chatId}");
        }

        assignLinkToChat(chatId, linkId);
        return link;
    }

    private void assignLinkToChat(long chatId, long linkId) {
        telegramChatLinkRepository.save(new TelegramChatLink(chatId, linkId));
    }

    public Link untrackLink(long chatId, String linkUrl) {
        Link link = findOrThrowException(linkUrl);
        long linkId = link.id();

        if (!chatWithIdWasRegistered(chatId)) {
            throw new NoSuchChatException(STR."There is no registered chat with id \{chatId}");
        }

        telegramChatLinkRepository.removeByChatIdAndLinkId(chatId, linkId);
        return link;
    }

    private boolean chatWithIdWasRegistered(long chatId) {
        return telegramChatRepository.findById(chatId).isPresent();
    }

    private Link findOrSave(String linkUrl) {
        Optional<Link> optionalLink = linkRepository.findByUrl(linkUrl);
        if (optionalLink.isEmpty()) {
            Link newLink = new Link(linkUrl);
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
