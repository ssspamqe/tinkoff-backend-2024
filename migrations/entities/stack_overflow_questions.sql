create table stack_overflow_questions
(
    id                   bigint generated always as identity,
    link_id              bigint not null references links (id) on delete cascade,
    description_md5_hash text   not null,
    answer_api_ids       bigint[],

    unique (link_id),
    primary key (id)
)
