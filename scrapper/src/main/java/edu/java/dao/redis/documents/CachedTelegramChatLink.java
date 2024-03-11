package edu.java.dao.redis.documents;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Document
@Getter
@AllArgsConstructor
public class CachedTelegramChatLink {

    @Id
    @Indexed
    private String id;

    @Indexed
    private String chatId;

    @Indexed
    private String linkId;

    public CachedTelegramChatLink(String chatId, String linkId) {
        this.chatId = chatId;
        this.linkId = linkId;
    }
}
