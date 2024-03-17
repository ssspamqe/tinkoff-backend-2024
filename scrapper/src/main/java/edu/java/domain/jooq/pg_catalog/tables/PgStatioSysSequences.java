/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatioSysSequencesRecord;

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
public class PgStatioSysSequences extends TableImpl<PgStatioSysSequencesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatioSysSequences PG_STATIO_SYS_SEQUENCES = new PgStatioSysSequences();

    @Override
    @NotNull
    public Class<PgStatioSysSequencesRecord> getRecordType() {
        return PgStatioSysSequencesRecord.class;
    }

    public final TableField<PgStatioSysSequencesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioSysSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioSysSequencesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioSysSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioSysSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioSysSequences(Name alias, Table<PgStatioSysSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysSequences(Name alias, Table<PgStatioSysSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_statio_sys_sequences" as  SELECT relid,
          schemaname,
          relname,
          blks_read,
          blks_hit
         FROM pg_statio_all_sequences
        WHERE ((schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (schemaname ~ '^pg_toast'::text));
        """));
    }

    public PgStatioSysSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_SYS_SEQUENCES);
    }

    public PgStatioSysSequences(Name alias) {
        this(alias, PG_STATIO_SYS_SEQUENCES);
    }

    public PgStatioSysSequences() {
        this(DSL.name("pg_statio_sys_sequences"), null);
    }

    public <O extends Record> PgStatioSysSequences(Table<O> child, ForeignKey<O, PgStatioSysSequencesRecord> key) {
        super(child, key, PG_STATIO_SYS_SEQUENCES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatioSysSequences as(String alias) {
        return new PgStatioSysSequences(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatioSysSequences as(Name alias) {
        return new PgStatioSysSequences(alias, this);
    }

    @Override
    @NotNull
    public PgStatioSysSequences as(Table<?> alias) {
        return new PgStatioSysSequences(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatioSysSequences rename(String name) {
        return new PgStatioSysSequences(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatioSysSequences rename(Name name) {
        return new PgStatioSysSequences(name, null);
    }

    @Override
    @NotNull
    public PgStatioSysSequences rename(Table<?> name) {
        return new PgStatioSysSequences(name.getQualifiedName(), null);
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
