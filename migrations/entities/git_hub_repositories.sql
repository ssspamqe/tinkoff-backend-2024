create table git_hub_repositories
(
    id                   bigint,
    name                 varchar(128) not null,
    owner                varchar(128) not null,
    description_md5_hash text         not null,
    activities_ids       bigint[]     not null,

    unique (name, owner),
    primary key (id)
)
