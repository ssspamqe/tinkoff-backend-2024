create table chat_links
(
    id      bigint generated always as identity,
    chat_id bigint not null references chats (id) on delete cascade,
    link_id bigint not null references links (id) on delete cascade,
    created_at timestamp not null,

    primary key (id),
    unique (chat_id, link_id)
)
