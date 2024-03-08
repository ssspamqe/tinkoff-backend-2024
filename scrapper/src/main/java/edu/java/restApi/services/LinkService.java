package edu.java.restApi.services;

import edu.java.dao.redis.documents.Link;
import edu.java.dao.redis.documents.TelegramChat;
import edu.java.dao.redis.documents.TelegramChatLink;
import edu.java.dao.redis.repositories.LinkCachedRepository;
import edu.java.dao.redis.repositories.TelegramChatLinkCachedRepository;
import edu.java.dao.redis.repositories.TelegramChatCacheRepository;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import edu.java.restApi.services.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    private final LinkCachedRepository linkCachedRepository;
    private final TelegramChatLinkCachedRepository telegramChatLinkCachedRepository;
    private final TelegramChatCacheRepository telegramChatCacheRepository;

    @Autowired
    public LinkService(
        LinkCachedRepository linkCachedRepository,
        TelegramChatLinkCachedRepository telegramChatLinkCachedRepository,
        TelegramChatCacheRepository telegramChatCacheRepository
    ) {
        this.linkCachedRepository = linkCachedRepository;
        this.telegramChatLinkCachedRepository = telegramChatLinkCachedRepository;
        this.telegramChatCacheRepository = telegramChatCacheRepository;
    }

    public Set<Link> getTrackedLinks(long chatApiId) {
        TelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        return buildSetOfLinks(chatId);
    }

    private Set<Link> buildSetOfLinks(String chatId) {
        return telegramChatLinkCachedRepository.findAllByChatId(chatId)
            .stream()
            .map(chatLinkCouple -> {
                String linkId = chatLinkCouple.getLinkId();
                //TODO if there is no link in redis -> go to postgres
                return linkCachedRepository.findById(linkId).orElse(null);
            }).filter(Objects::nonNull)
            .collect(Collectors.toSet());

    }

    public Link addLinkToTrack(long chatApiId, String linkUrl) {
        TelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        Link link = findOrSave(linkUrl);
        String linkId = link.getId();

        assignLinkToChat(chatId, linkId);
        return link;
    }

    private void assignLinkToChat(String chatId, String linkId) {
        telegramChatLinkCachedRepository.save(new TelegramChatLink(chatId, linkId));
    }

    public Link untrackLink(long chatApiId, String linkUrl) {
        Link link = linkCachedRepository.findByHashedUrl(Link.hash(linkUrl))
            .orElseThrow(() -> new NoSuchLinkException(URI.create(linkUrl)));
        String linkId = link.getId();

        TelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        telegramChatLinkCachedRepository.removeByChatIdAndLinkId(chatId, linkId);
        return link;
    }

    private Link findOrSave(String linkUrl) {
        Optional<Link> optionalLink = linkCachedRepository.findByHashedUrl(Link.hash(linkUrl));
        if (optionalLink.isEmpty()) {
            Link newLink = new Link(linkUrl);
            linkCachedRepository.save(newLink);
            return newLink;
        }
        return optionalLink.get();
    }
}
