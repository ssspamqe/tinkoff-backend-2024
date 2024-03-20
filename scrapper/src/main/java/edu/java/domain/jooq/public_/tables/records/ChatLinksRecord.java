/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.records;


import edu.java.domain.jooq.public_.tables.ChatLinks;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ChatLinksRecord extends TableRecordImpl<ChatLinksRecord> {

    private static final long serialVersionUID = 1L;

    public void setId(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getId() {
        return (Long) get(0);
    }

    public void setChatId(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getChatId() {
        return (Long) get(1);
    }

    public void setLinkId(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getLinkId() {
        return (Long) get(2);
    }

    public void setCreatedAt(@NotNull LocalDateTime value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ChatLinksRecord() {
        super(ChatLinks.CHAT_LINKS);
    }

    @ConstructorProperties({ "id", "chatId", "linkId", "createdAt" })
    public ChatLinksRecord(@Nullable Long id, @NotNull Long chatId, @NotNull Long linkId, @NotNull LocalDateTime createdAt) {
        super(ChatLinks.CHAT_LINKS);

        setId(id);
        setChatId(chatId);
        setLinkId(linkId);
        setCreatedAt(createdAt);
        resetChangedOnNotNull();
    }

    public ChatLinksRecord(edu.java.domain.jooq.public_.tables.pojos.ChatLinks value) {
        super(ChatLinks.CHAT_LINKS);

        if (value != null) {
            setId(value.getId());
            setChatId(value.getChatId());
            setLinkId(value.getLinkId());
            setCreatedAt(value.getCreatedAt());
            resetChangedOnNotNull();
        }
    }
}
