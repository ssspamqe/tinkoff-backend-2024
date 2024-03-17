/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatioSysIndexesRecord;

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


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatioSysIndexes extends TableImpl<PgStatioSysIndexesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatioSysIndexes PG_STATIO_SYS_INDEXES = new PgStatioSysIndexes();

    @Override
    @NotNull
    public Class<PgStatioSysIndexesRecord> getRecordType() {
        return PgStatioSysIndexesRecord.class;
    }

    public final TableField<PgStatioSysIndexesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioSysIndexesRecord, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioSysIndexesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioSysIndexesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioSysIndexesRecord, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioSysIndexesRecord, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioSysIndexesRecord, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioSysIndexes(Name alias, Table<PgStatioSysIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysIndexes(Name alias, Table<PgStatioSysIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_statio_sys_indexes" as  SELECT relid,
          indexrelid,
          schemaname,
          relname,
          indexrelname,
          idx_blks_read,
          idx_blks_hit
         FROM pg_statio_all_indexes
        WHERE ((schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (schemaname ~ '^pg_toast'::text));
        """));
    }

    public PgStatioSysIndexes(String alias) {
        this(DSL.name(alias), PG_STATIO_SYS_INDEXES);
    }

    public PgStatioSysIndexes(Name alias) {
        this(alias, PG_STATIO_SYS_INDEXES);
    }

    public PgStatioSysIndexes() {
        this(DSL.name("pg_statio_sys_indexes"), null);
    }

    public <O extends Record> PgStatioSysIndexes(Table<O> child, ForeignKey<O, PgStatioSysIndexesRecord> key) {
        super(child, key, PG_STATIO_SYS_INDEXES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatioSysIndexes as(String alias) {
        return new PgStatioSysIndexes(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatioSysIndexes as(Name alias) {
        return new PgStatioSysIndexes(alias, this);
    }

    @Override
    @NotNull
    public PgStatioSysIndexes as(Table<?> alias) {
        return new PgStatioSysIndexes(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatioSysIndexes rename(String name) {
        return new PgStatioSysIndexes(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatioSysIndexes rename(Name name) {
        return new PgStatioSysIndexes(name, null);
    }

    @Override
    @NotNull
    public PgStatioSysIndexes rename(Table<?> name) {
        return new PgStatioSysIndexes(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, Long, String, String, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function7<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
