package edu.java.restApi.service;

import edu.java.data.entities.Link;
import edu.java.data.entities.TelegramChat;
import edu.java.data.repositories.LinkRepository;
import edu.java.data.repositories.TelegramChatLinksRepository;
import edu.java.data.repositories.TelegramChatRepository;
import edu.java.restApi.service.exceptions.NoSuchChatException;
import edu.java.restApi.service.exceptions.NoSuchLinkException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
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

        Set<UUID> linkIds = telegramChatLinksRepository.findAllLinksByChatId(chat.id());

        return buildSetOfLinks(linkIds);
    }

    private Set<Link> buildSetOfLinks(Set<UUID> linkIds) {
        return linkIds.stream()
            .map(id ->
                linkRepository.findById(id).orElse(null)
            ).filter(Objects::nonNull)
            .collect(Collectors.toSet());
    }

    public void addLinkToTrack(long chatApiId, String linkUrl) {
        Link link = findOrSave(linkUrl);
        UUID linkId = link.id();

        TelegramChat chat = findOrThrowException(chatApiId);
        UUID chatId = chat.id();

        telegramChatLinksRepository.addLinkToChat(chatId, linkId);
    }

    public void untrackLink(long chatApiId, String linkUrl) {
        Link link = findOrThrowException(linkUrl);
        UUID linkId = link.id();

        TelegramChat chat = findOrThrowException(chatApiId);
        UUID chatId = chat.id();

        telegramChatLinksRepository.removeLinkFromChat(chatId, linkId);
    }

    private Link findOrSave(String linkUrl) {
        Optional<Link> optionalLink = linkRepository.findByUrl(linkUrl);
        if (linkUrl.isEmpty()) {
            Link newLink = new Link(UUID.randomUUID(), linkUrl);
            linkRepository.save(newLink);
            return newLink;
        }
        return optionalLink.get();
    }

    private TelegramChat findOrThrowException(long chatApiId) {
        Optional<TelegramChat> telegramChat = telegramChatRepository.findByApiId(chatApiId);
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
