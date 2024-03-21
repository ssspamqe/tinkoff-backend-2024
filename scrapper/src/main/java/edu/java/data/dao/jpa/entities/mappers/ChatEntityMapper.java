package edu.java.data.dao.jpa.entities.mappers;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dto.Chat;

public class ChatEntityMapper implements EntityMapper<ChatJpaEntity, Chat> {

    @Override
    public Chat toDto(ChatJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }
        long id = jpaEntity.getId();
        var createdAt = jpaEntity.getCreatedAt();
        return new Chat(id, createdAt);
    }
}
