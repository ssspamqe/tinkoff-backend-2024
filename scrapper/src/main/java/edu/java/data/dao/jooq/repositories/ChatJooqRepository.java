package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.Chat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.CHATS;

@Repository
@RequiredArgsConstructor
public class ChatJooqRepository {

    private final DefaultDSLContext dsl;

    public void save(Chat chat) {
        OffsetDateTime offsetCreatedAt =
            chat.getCreatedAt()
                .atZone(ZoneId.systemDefault())
                .toOffsetDateTime();
        dsl.insertInto(CHATS)
            .set(CHATS.ID, chat.getId())
            .set(CHATS.CREATED_AT, offsetCreatedAt)
            .execute();
    }

    public Optional<Chat> findById(long id) {
        Chat chat = dsl.select()
            .from(CHATS)
            .where(CHATS.ID.eq(id))
            .fetchOneInto(Chat.class);
        return Optional.ofNullable(chat);
    }

    public boolean removeById(long id) {
        return dsl.delete(CHATS)
            .where(CHATS.ID.eq(id))
            .execute() != 0;
    }

}
