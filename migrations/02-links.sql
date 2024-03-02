create table links
(
    id  bigint generated always as identity,
    url text not null,

    primary key (id),
    unique (url)
)
