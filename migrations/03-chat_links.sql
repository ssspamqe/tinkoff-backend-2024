CREATE TABLE chat_links
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY,
    chat_id    BIGINT    NOT NULL REFERENCES chats (id) ON DELETE CASCADE,
    link_id    BIGINT    NOT NULL REFERENCES links (id) ON DELETE CASCADE,
    created_at TIMESTAMP NOT NULL,

    PRIMARY KEY (id),
    UNIQUE (chat_id, link_id)
)
