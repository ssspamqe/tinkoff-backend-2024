package edu.java.data.postgres.repositories.jooq;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.repositories.ChatRepository;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Repository;
import static edu.java.domain.jooq.public_.Tables.CHATS;

@Repository
@RequiredArgsConstructor
public class JooqChatRepository implements ChatRepository {

    private final DefaultDSLContext dsl;

    @Override //TODO fix codegen bug
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

    @Override
    public Optional<Chat> findById(long id) {
        Chat chat = dsl.select()
            .from(CHATS)
            .where(CHATS.ID.eq(id))
            .fetchOneInto(Chat.class);
        return Optional.ofNullable(chat);
    }

    @Override
    public boolean removeById(long id) {
        return dsl.delete(CHATS)
            .where(CHATS.ID.eq(id))
            .execute() != 0;
    }

}
