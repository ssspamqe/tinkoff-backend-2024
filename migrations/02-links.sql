create table links
(
    id  bigint generated always as identity,
    url text not null unique ,
    created_at timestamp not null,
    last_checked_at timestamp not null,

    primary key (id),
    unique (url)
)
