package edu.java.data.postgres.repositories.jooq;

import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.CHAT_LINKS;

@Repository
@RequiredArgsConstructor
public class JooqChatLinksRepository implements ChatLinksRepository {

    private final DefaultDSLContext dsl;

    @Override
    public void save(ChatLink chatLink) {
        dsl.insertInto(CHAT_LINKS)
            .set(CHAT_LINKS.CHAT_ID, chatLink.getChatId())
            .set(CHAT_LINKS.LINK_ID, chatLink.getLinkId())
            .set(CHAT_LINKS.CREATED_AT, chatLink.getCreatedAt())
            .execute();

    }

    @Override
    public List<ChatLink> findByChatId(long chatId) {
        return dsl.select()
            .from(CHAT_LINKS)
            .where(CHAT_LINKS.CHAT_ID.eq(chatId))
            .fetchInto(ChatLink.class);
    }

    @Override
    public List<ChatLink> findByLinkId(long linkId) {
        return dsl.select()
            .from(CHAT_LINKS)
            .where(CHAT_LINKS.LINK_ID.eq(linkId))
            .fetchInto(ChatLink.class);
    }

    @Override
    public boolean removeByChatIdAndLinkId(long chatId, long linkId) {
        return dsl.delete(CHAT_LINKS)
            .where(CHAT_LINKS.CHAT_ID.eq(chatId))
            .and(CHAT_LINKS.LINK_ID.eq(linkId))
            .execute() != 0;
    }
}
