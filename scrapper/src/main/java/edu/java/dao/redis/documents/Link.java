package edu.java.dao.redis.documents;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.data.annotation.Id;

@Document
@Getter
@AllArgsConstructor
public class Link {
    @Id
    @Indexed
    private String id;

    private String url;

    @Indexed
    private String hashedUrl;

    public Link(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public Link(String url) {
        setUrl(url);
    }

    public static String hash(String url) {
        return DigestUtils.md5Hex(url);
    }

    public void setUrl(String url) {
        this.url = url;
        this.hashedUrl = hash(url);
    }
}


