package edu.java.data.postgres.repositories.jooq.objectMappers;

import org.jooq.Record;

public interface JooqRecordMapper<C> {
    C mapJooqInstance(Record jooqInstance);
}
