CREATE TABLE chat_links
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY,
    chat_id    BIGINT    NOT NULL REFERENCES chats (id) ON DELETE CASCADE,
    link_id    BIGINT    NOT NULL REFERENCES links (id) ON DELETE CASCADE,
    created_at TIMESTAMP NOT NULL DEFAULT '1970-01-01 00:00:00',

    PRIMARY KEY (id),
    UNIQUE (chat_id, link_id)
)
