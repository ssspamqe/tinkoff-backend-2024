create table chats
(
    id         bigint generated always as identity,
    api_id     bigint,
    created_at timestamp with time zone not null,

    primary key (id)
)
