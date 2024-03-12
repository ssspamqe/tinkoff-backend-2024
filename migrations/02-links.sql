create table links
(
    id  bigint generated always as identity,
    url text not null unique ,
    created_at timestamp with time zone not null,

    primary key (id),
    unique (url)
)
