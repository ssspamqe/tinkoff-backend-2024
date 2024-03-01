package edu.java.data.models;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Searchable;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

@Document
public record Link(
    @Id
    @Indexed
    long id,

    @Searchable
    String url
) {

    private static final String ESCAPED_COLON = "\\:";

    public Link(String url) {
        this(ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE), url);
    }

    @Override public String url() {
        return escapeColon(url);
    }

    public String urlWithUnescapedColon() {
        return unescapeColon(url);
    }

    public static String escapeColon(String s) {
        return s.replace(":", ESCAPED_COLON);
    }

    public static String unescapeColon(String s) {
        return s.replace(ESCAPED_COLON, ":");
    }
}
