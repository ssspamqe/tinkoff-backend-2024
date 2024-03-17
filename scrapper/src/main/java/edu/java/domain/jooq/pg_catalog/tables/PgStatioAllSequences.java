/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatioAllSequencesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class PgStatioAllSequences extends TableImpl<PgStatioAllSequencesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatioAllSequences PG_STATIO_ALL_SEQUENCES = new PgStatioAllSequences();

    @Override
    @NotNull
    public Class<PgStatioAllSequencesRecord> getRecordType() {
        return PgStatioAllSequencesRecord.class;
    }

    public final TableField<PgStatioAllSequencesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioAllSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioAllSequencesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioAllSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioAllSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioAllSequences(Name alias, Table<PgStatioAllSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioAllSequences(Name alias, Table<PgStatioAllSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_statio_all_sequences" as  SELECT c.oid AS relid,
          n.nspname AS schemaname,
          c.relname,
          (pg_stat_get_blocks_fetched(c.oid) - pg_stat_get_blocks_hit(c.oid)) AS blks_read,
          pg_stat_get_blocks_hit(c.oid) AS blks_hit
         FROM (pg_class c
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE (c.relkind = 'S'::"char");
        """));
    }

    public PgStatioAllSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_ALL_SEQUENCES);
    }

    public PgStatioAllSequences(Name alias) {
        this(alias, PG_STATIO_ALL_SEQUENCES);
    }

    public PgStatioAllSequences() {
        this(DSL.name("pg_statio_all_sequences"), null);
    }

    public <O extends Record> PgStatioAllSequences(Table<O> child, ForeignKey<O, PgStatioAllSequencesRecord> key) {
        super(child, key, PG_STATIO_ALL_SEQUENCES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatioAllSequences as(String alias) {
        return new PgStatioAllSequences(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatioAllSequences as(Name alias) {
        return new PgStatioAllSequences(alias, this);
    }

    @Override
    @NotNull
    public PgStatioAllSequences as(Table<?> alias) {
        return new PgStatioAllSequences(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatioAllSequences rename(String name) {
        return new PgStatioAllSequences(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatioAllSequences rename(Name name) {
        return new PgStatioAllSequences(name, null);
    }

    @Override
    @NotNull
    public PgStatioAllSequences rename(Table<?> name) {
        return new PgStatioAllSequences(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
