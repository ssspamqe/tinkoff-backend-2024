/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatArchiverRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_stat_archiver</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatArchiver extends TableImpl<PgStatArchiverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_archiver</code>
     */
    public static final PgStatArchiver PG_STAT_ARCHIVER = new PgStatArchiver();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatArchiverRecord> getRecordType() {
        return PgStatArchiverRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public final TableField<PgStatArchiverRecord, Long> ARCHIVED_COUNT = createField(DSL.name("archived_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public final TableField<PgStatArchiverRecord, String> LAST_ARCHIVED_WAL = createField(DSL.name("last_archived_wal"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> LAST_ARCHIVED_TIME = createField(DSL.name("last_archived_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public final TableField<PgStatArchiverRecord, Long> FAILED_COUNT = createField(DSL.name("failed_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public final TableField<PgStatArchiverRecord, String> LAST_FAILED_WAL = createField(DSL.name("last_failed_wal"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> LAST_FAILED_TIME = createField(DSL.name("last_failed_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatArchiver(Name alias, Table<PgStatArchiverRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatArchiver(Name alias, Table<PgStatArchiverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_archiver" as  SELECT archived_count,
         last_archived_wal,
         last_archived_time,
         failed_count,
         last_failed_wal,
         last_failed_time,
         stats_reset
        FROM pg_stat_get_archiver() s(archived_count, last_archived_wal, last_archived_time, failed_count, last_failed_wal, last_failed_time, stats_reset);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table
     * reference
     */
    public PgStatArchiver(String alias) {
        this(DSL.name(alias), PG_STAT_ARCHIVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table
     * reference
     */
    public PgStatArchiver(Name alias) {
        this(alias, PG_STAT_ARCHIVER);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_archiver</code> table reference
     */
    public PgStatArchiver() {
        this(DSL.name("pg_stat_archiver"), null);
    }

    public <O extends Record> PgStatArchiver(Table<O> child, ForeignKey<O, PgStatArchiverRecord> key) {
        super(child, key, PG_STAT_ARCHIVER);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatArchiver as(String alias) {
        return new PgStatArchiver(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatArchiver as(Name alias) {
        return new PgStatArchiver(alias, this);
    }

    @Override
    @NotNull
    public PgStatArchiver as(Table<?> alias) {
        return new PgStatArchiver(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatArchiver rename(String name) {
        return new PgStatArchiver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatArchiver rename(Name name) {
        return new PgStatArchiver(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatArchiver rename(Table<?> name) {
        return new PgStatArchiver(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, String, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super String, ? super OffsetDateTime, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super String, ? super OffsetDateTime, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
