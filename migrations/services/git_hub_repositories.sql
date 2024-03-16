CREATE TABLE git_hub_repositories
(
    id                   BIGINT,
    link_id              BIGINT       NOT NULL REFERENCES links (id) ON DELETE CASCADE,
    name                 VARCHAR(128) NOT NULL,
    owner                VARCHAR(128) NOT NULL,
    description_md5_hash TEXT         NOT NULL,
    activities_ids       BIGINT[]     NOT NULL,

    UNIQUE (name, owner),
    PRIMARY KEY (id)
)
