/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatXactSysTablesRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_stat_xact_sys_tables</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatXactSysTables extends TableImpl<PgStatXactSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_sys_tables</code>
     */
    public static final PgStatXactSysTables PG_STAT_XACT_SYS_TABLES = new PgStatXactSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatXactSysTablesRecord> getRecordType() {
        return PgStatXactSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.relid</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.relname</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.seq_scan</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.idx_scan</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_del</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_newpage_upd</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_NEWPAGE_UPD = createField(DSL.name("n_tup_newpage_upd"), SQLDataType.BIGINT, this, "");

    private PgStatXactSysTables(Name alias, Table<PgStatXactSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactSysTables(Name alias, Table<PgStatXactSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_xact_sys_tables" as  SELECT relid,
          schemaname,
          relname,
          seq_scan,
          seq_tup_read,
          idx_scan,
          idx_tup_fetch,
          n_tup_ins,
          n_tup_upd,
          n_tup_del,
          n_tup_hot_upd,
          n_tup_newpage_upd
         FROM pg_stat_xact_all_tables
        WHERE ((schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (schemaname ~ '^pg_toast'::text));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_sys_tables</code> table
     * reference
     */
    public PgStatXactSysTables(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_SYS_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_sys_tables</code> table
     * reference
     */
    public PgStatXactSysTables(Name alias) {
        this(alias, PG_STAT_XACT_SYS_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_xact_sys_tables</code> table reference
     */
    public PgStatXactSysTables() {
        this(DSL.name("pg_stat_xact_sys_tables"), null);
    }

    public <O extends Record> PgStatXactSysTables(Table<O> child, ForeignKey<O, PgStatXactSysTablesRecord> key) {
        super(child, key, PG_STAT_XACT_SYS_TABLES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatXactSysTables as(String alias) {
        return new PgStatXactSysTables(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatXactSysTables as(Name alias) {
        return new PgStatXactSysTables(alias, this);
    }

    @Override
    @NotNull
    public PgStatXactSysTables as(Table<?> alias) {
        return new PgStatXactSysTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatXactSysTables rename(String name) {
        return new PgStatXactSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatXactSysTables rename(Name name) {
        return new PgStatXactSysTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatXactSysTables rename(Table<?> name) {
        return new PgStatXactSysTables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row12<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
