package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dto.Chat;
import org.springframework.stereotype.Component;

@Component
public class ChatMapper implements EntityMapper<ChatJpaEntity, Chat> {

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