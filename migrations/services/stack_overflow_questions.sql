CREATE TABLE stack_overflow_questions
(
    id                   BIGINT   NOT NULL,
    link_id              BIGINT   NOT NULL REFERENCES links (id) ON DELETE CASCADE,
    description_md5_hash TEXT     NOT NULL,
    answers_ids          BIGINT[] NOT NULL,

    UNIQUE (link_id),
    PRIMARY KEY (id)
);
