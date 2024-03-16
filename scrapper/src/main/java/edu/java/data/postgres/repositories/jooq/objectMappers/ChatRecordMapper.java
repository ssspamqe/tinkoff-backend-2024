package edu.java.data.postgres.repositories.jooq.objectMappers;

import edu.java.data.postgres.entities.Chat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import org.jooq.Record;
import static edu.java.domain.jooq.public_.Tables.CHATS;

public class ChatRecordMapper implements JooqRecordMapper<Chat> {
    @Override
    public Chat mapJooqInstance(Record jooqInstance) {
        if(jooqInstance == null){
            return null;
        }
        long id = jooqInstance.get(CHATS.ID);
        LocalDateTime createdAt = jooqInstance.get(CHATS.CREATED_AT).toLocalDateTime();
        return new Chat(id, createdAt);
    }
}
