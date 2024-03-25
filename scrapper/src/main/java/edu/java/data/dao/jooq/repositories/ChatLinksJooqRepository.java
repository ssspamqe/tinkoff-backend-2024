package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.ChatLink;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.domain.jooq.public_.Tables.CHAT_LINKS;

@RequiredArgsConstructor
public class ChatLinksJooqRepository {

    private final DefaultDSLContext dsl;

    public void save(ChatLink chatLink) {
        dsl.insertInto(CHAT_LINKS)
            .set(CHAT_LINKS.CHAT_ID, chatLink.getChatId())
            .set(CHAT_LINKS.LINK_ID, chatLink.getLinkId())
            .set(CHAT_LINKS.CREATED_AT, chatLink.getCreatedAt())
            .execute();

    }

    public List<ChatLink> findByChatId(long chatId) {
        return dsl.select()
            .from(CHAT_LINKS)
            .where(CHAT_LINKS.CHAT_ID.eq(chatId))
            .fetchInto(ChatLink.class);
    }

    public List<ChatLink> findByLinkId(long linkId) {
        return dsl.select()
            .from(CHAT_LINKS)
            .where(CHAT_LINKS.LINK_ID.eq(linkId))
            .fetchInto(ChatLink.class);
    }

    public boolean removeByChatIdAndLinkId(long chatId, long linkId) {
        return dsl.delete(CHAT_LINKS)
            .where(CHAT_LINKS.CHAT_ID.eq(chatId))
            .and(CHAT_LINKS.LINK_ID.eq(linkId))
            .execute() != 0;
    }
}
