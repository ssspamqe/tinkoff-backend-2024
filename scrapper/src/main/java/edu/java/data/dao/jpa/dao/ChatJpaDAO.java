package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.ChatMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.EntityMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkMapper;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dto.Chat;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchChatException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class ChatJpaDAO implements ChatDataAccessObject {

    private static final EntityMapper<ChatJpaEntity, Chat> CHAT_MAPPER = new ChatMapper();
    private static final EntityMapper<LinkJpaEntity, Link> LINK_MAPPER = new LinkMapper();

    private final ChatJpaRepository chatRepository;
    private final LinkJpaDAO linkDao;

    @Override
    public Optional<Chat> findById(long id) {
        var jpaChat = chatRepository.findById(id);
        return CHAT_MAPPER.toOptionalDto(jpaChat);
    }

    @Override
    public Set<Link> getTrackedLinksByChatId(long chatId) {
        var jpaChat = findJpaByIdOrThrowException(chatId);

        return jpaChat
            .getChatLinksPairs().stream()
            .map(pair -> LINK_MAPPER.toDto(pair.getLink()))
            .collect(Collectors.toSet());
    }

    @Override
    public Link associateUrlByChatId(URI url, long chatId) {
        if (!chatRepository.existsById(chatId)) {
            throw new NoSuchChatException(chatId);
        }

        var link = linkDao.saveJpaOrFindByUrl(url);

        chatRepository.associateLinkWithChatById(link.getId(), chatId);

        return LINK_MAPPER.toDto(link);
    }

    @Override
    public Link dissociateUrlByChatId(URI url, long chatId) {
        if (!chatRepository.existsById(chatId)) {
            throw new NoSuchChatException(chatId);
        }

        var link = linkDao.findJpaByUrlOrThrowException(url);

        chatRepository.dissociateLinkWithChatById(link.getId(), chatId);

        return LINK_MAPPER.toDto(link);
    }

    @Override
    public Chat registerChatWithId(long id) {
        var chat = new ChatJpaEntity(id);
        chat = chatRepository.save(chat);
        return CHAT_MAPPER.toDto(chat);
    }

    @Override
    public void deleteChatWithId(long id) {
        var deletedChats = chatRepository.removeById(id);
        if (deletedChats == 0) {
            throw new NoSuchChatException(id);
        }
    }

    ChatJpaEntity findJpaByIdOrThrowException(long id) {
        return chatRepository.findById(id)
            .orElseThrow(() -> new NoSuchChatException(id));
    }
}
