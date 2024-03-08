create table chat_links
(
    id      bigint generated always as identity,
    chat_id bigint not null references chats (id),
    link_id bigint not null references links (id),
    primary key (id)
)
