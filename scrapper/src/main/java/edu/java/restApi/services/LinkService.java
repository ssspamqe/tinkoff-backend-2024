package edu.java.restApi.services;

import edu.java.dao.postgres.repositories.ChatLinksRepository;
import edu.java.dao.postgres.repositories.ChatRepository;
import edu.java.dao.postgres.repositories.LinkRepository;
import edu.java.dao.redis.documents.CachedLink;
import edu.java.dao.redis.documents.CachedTelegramChat;
import edu.java.dao.redis.documents.CachedTelegramChatLink;
import edu.java.dao.redis.repositories.LinkCachedRepository;
import edu.java.dao.redis.repositories.TelegramChatCacheRepository;
import edu.java.dao.redis.repositories.TelegramChatLinkCachedRepository;
import edu.java.restApi.services.exceptions.NoSuchChatException;
import edu.java.restApi.services.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final LinkCachedRepository linkCachedRepository;
    private final TelegramChatLinkCachedRepository telegramChatLinkCachedRepository;
    private final TelegramChatCacheRepository telegramChatCacheRepository;

    private final LinkRepository linkRepository;
    private final ChatRepository chatRepository;
    private final ChatLinksRepository chatLinksRepository;

    public Set<CachedLink> getTrackedLinks(long chatApiId) {
        CachedTelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        return buildSetOfLinks(chatId);
    }

    private Set<CachedLink> buildSetOfLinks(String chatId) {
        return telegramChatLinkCachedRepository.findAllByChatId(chatId)
            .stream()
            .map(chatLinkCouple -> {
                String linkId = chatLinkCouple.getLinkId();
                //TODO if there is no link in redis -> go to postgres
                return linkCachedRepository.findById(linkId).orElse(null);
            }).filter(Objects::nonNull)
            .collect(Collectors.toSet());

    }

    public CachedLink addLinkToTrack(long chatApiId, String linkUrl) {
        CachedTelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        CachedLink link = findOrSave(linkUrl);
        String linkId = link.getId();

        assignLinkToChat(chatId, linkId);
        return link;
    }

    private void assignLinkToChat(String chatId, String linkId) {
        telegramChatLinkCachedRepository.save(new CachedTelegramChatLink(chatId, linkId));
    }

    public CachedLink untrackLink(long chatApiId, String linkUrl) {
        CachedLink link = linkCachedRepository.findByHashedUrl(CachedLink.hash(linkUrl))
            .orElseThrow(() -> new NoSuchLinkException(URI.create(linkUrl)));
        String linkId = link.getId();

        CachedTelegramChat chat = telegramChatCacheRepository.findByApiId(chatApiId)
            .orElseThrow(() -> new NoSuchChatException(chatApiId));
        String chatId = chat.getId();

        telegramChatLinkCachedRepository.removeByChatIdAndLinkId(chatId, linkId);
        return link;
    }

    private CachedLink findOrSave(String linkUrl) {
        Optional<CachedLink> optionalLink = linkCachedRepository.findByHashedUrl(CachedLink.hash(linkUrl));
        if (optionalLink.isEmpty()) {
            CachedLink newLink = new CachedLink(linkUrl);
            linkCachedRepository.save(newLink);
            return newLink;
        }
        return optionalLink.get();
    }
}
