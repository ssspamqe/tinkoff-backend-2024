/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgSettingsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_settings</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSettings extends TableImpl<PgSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_settings</code>
     */
    public static final PgSettings PG_SETTINGS = new PgSettings();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgSettingsRecord> getRecordType() {
        return PgSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_settings.name</code>.
     */
    public final TableField<PgSettingsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.setting</code>.
     */
    public final TableField<PgSettingsRecord, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.unit</code>.
     */
    public final TableField<PgSettingsRecord, String> UNIT = createField(DSL.name("unit"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.category</code>.
     */
    public final TableField<PgSettingsRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.short_desc</code>.
     */
    public final TableField<PgSettingsRecord, String> SHORT_DESC = createField(DSL.name("short_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    public final TableField<PgSettingsRecord, String> EXTRA_DESC = createField(DSL.name("extra_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.context</code>.
     */
    public final TableField<PgSettingsRecord, String> CONTEXT = createField(DSL.name("context"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.vartype</code>.
     */
    public final TableField<PgSettingsRecord, String> VARTYPE = createField(DSL.name("vartype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.source</code>.
     */
    public final TableField<PgSettingsRecord, String> SOURCE = createField(DSL.name("source"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.min_val</code>.
     */
    public final TableField<PgSettingsRecord, String> MIN_VAL = createField(DSL.name("min_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.max_val</code>.
     */
    public final TableField<PgSettingsRecord, String> MAX_VAL = createField(DSL.name("max_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.enumvals</code>.
     */
    public final TableField<PgSettingsRecord, String[]> ENUMVALS = createField(DSL.name("enumvals"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_settings.boot_val</code>.
     */
    public final TableField<PgSettingsRecord, String> BOOT_VAL = createField(DSL.name("boot_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.reset_val</code>.
     */
    public final TableField<PgSettingsRecord, String> RESET_VAL = createField(DSL.name("reset_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    public final TableField<PgSettingsRecord, String> SOURCEFILE = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourceline</code>.
     */
    public final TableField<PgSettingsRecord, Integer> SOURCELINE = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    public final TableField<PgSettingsRecord, Boolean> PENDING_RESTART = createField(DSL.name("pending_restart"), SQLDataType.BOOLEAN, this, "");

    private PgSettings(Name alias, Table<PgSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSettings(Name alias, Table<PgSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_settings" as  SELECT name,
         setting,
         unit,
         category,
         short_desc,
         extra_desc,
         context,
         vartype,
         source,
         min_val,
         max_val,
         enumvals,
         boot_val,
         reset_val,
         sourcefile,
         sourceline,
         pending_restart
        FROM pg_show_all_settings() a(name, setting, unit, category, short_desc, extra_desc, context, vartype, source, min_val, max_val, enumvals, boot_val, reset_val, sourcefile, sourceline, pending_restart);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(String alias) {
        this(DSL.name(alias), PG_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(Name alias) {
        this(alias, PG_SETTINGS);
    }

    /**
     * Create a <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings() {
        this(DSL.name("pg_settings"), null);
    }

    public <O extends Record> PgSettings(Table<O> child, ForeignKey<O, PgSettingsRecord> key) {
        super(child, key, PG_SETTINGS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgSettings as(String alias) {
        return new PgSettings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgSettings as(Name alias) {
        return new PgSettings(alias, this);
    }

    @Override
    @NotNull
    public PgSettings as(Table<?> alias) {
        return new PgSettings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgSettings rename(String name) {
        return new PgSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgSettings rename(Name name) {
        return new PgSettings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgSettings rename(Table<?> name) {
        return new PgSettings(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String[], String, String, String, Integer, Boolean> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String[], ? super String, ? super String, ? super String, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String[], ? super String, ? super String, ? super String, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
