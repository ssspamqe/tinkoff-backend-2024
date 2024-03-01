package edu.java.data.models;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import io.netty.util.internal.ThreadLocalRandom;
import org.springframework.data.annotation.Id;

@Document
public record TelegramChatLink(

    @Id
    @Indexed
    long id,

    @Indexed
    long chatId,

    @Indexed
    long linkId
) {
    public TelegramChatLink(long chatId, long linkId) {
        this(ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE), chatId, linkId);
    }
}
