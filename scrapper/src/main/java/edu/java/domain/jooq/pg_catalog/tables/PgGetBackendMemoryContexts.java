/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetBackendMemoryContextsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetBackendMemoryContexts extends TableImpl<PgGetBackendMemoryContextsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgGetBackendMemoryContexts PG_GET_BACKEND_MEMORY_CONTEXTS = new PgGetBackendMemoryContexts();

    @Override
    @NotNull
    public Class<PgGetBackendMemoryContextsRecord> getRecordType() {
        return PgGetBackendMemoryContextsRecord.class;
    }

    public final TableField<PgGetBackendMemoryContextsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, String> IDENT = createField(DSL.name("ident"), SQLDataType.CLOB, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, String> PARENT = createField(DSL.name("parent"), SQLDataType.CLOB, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Integer> LEVEL = createField(DSL.name("level"), SQLDataType.INTEGER, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Long> TOTAL_BYTES = createField(DSL.name("total_bytes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Long> TOTAL_NBLOCKS = createField(DSL.name("total_nblocks"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Long> FREE_BYTES = createField(DSL.name("free_bytes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Long> FREE_CHUNKS = createField(DSL.name("free_chunks"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetBackendMemoryContextsRecord, Long> USED_BYTES = createField(DSL.name("used_bytes"), SQLDataType.BIGINT, this, "");

    private PgGetBackendMemoryContexts(Name alias, Table<PgGetBackendMemoryContextsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetBackendMemoryContexts(Name alias, Table<PgGetBackendMemoryContextsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgGetBackendMemoryContexts(String alias) {
        this(DSL.name(alias), PG_GET_BACKEND_MEMORY_CONTEXTS);
    }

    public PgGetBackendMemoryContexts(Name alias) {
        this(alias, PG_GET_BACKEND_MEMORY_CONTEXTS);
    }

    public PgGetBackendMemoryContexts() {
        this(DSL.name("pg_get_backend_memory_contexts"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts as(String alias) {
        return new PgGetBackendMemoryContexts(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts as(Name alias) {
        return new PgGetBackendMemoryContexts(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts as(Table<?> alias) {
        return new PgGetBackendMemoryContexts(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts rename(String name) {
        return new PgGetBackendMemoryContexts(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts rename(Name name) {
        return new PgGetBackendMemoryContexts(name, null, parameters);
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContexts rename(Table<?> name) {
        return new PgGetBackendMemoryContexts(name.getQualifiedName(), null, parameters);
    }

    public PgGetBackendMemoryContexts call() {
        PgGetBackendMemoryContexts result = new PgGetBackendMemoryContexts(DSL.name("pg_get_backend_memory_contexts"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}