/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgFileSettingsRecord;

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
public class PgFileSettings extends TableImpl<PgFileSettingsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgFileSettings PG_FILE_SETTINGS = new PgFileSettings();

    @Override
    @NotNull
    public Class<PgFileSettingsRecord> getRecordType() {
        return PgFileSettingsRecord.class;
    }

    public final TableField<PgFileSettingsRecord, String> SOURCEFILE = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "");

    public final TableField<PgFileSettingsRecord, Integer> SOURCELINE = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "");

    public final TableField<PgFileSettingsRecord, Integer> SEQNO = createField(DSL.name("seqno"), SQLDataType.INTEGER, this, "");

    public final TableField<PgFileSettingsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgFileSettingsRecord, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    public final TableField<PgFileSettingsRecord, Boolean> APPLIED = createField(DSL.name("applied"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgFileSettingsRecord, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgFileSettings(String alias) {
        this(DSL.name(alias), PG_FILE_SETTINGS);
    }

    public PgFileSettings(Name alias) {
        this(alias, PG_FILE_SETTINGS);
    }

    public PgFileSettings() {
        this(DSL.name("pg_file_settings"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgFileSettings as(String alias) {
        return new PgFileSettings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgFileSettings as(Name alias) {
        return new PgFileSettings(alias, this);
    }

    @Override
    @NotNull
    public PgFileSettings as(Table<?> alias) {
        return new PgFileSettings(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgFileSettings rename(String name) {
        return new PgFileSettings(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgFileSettings rename(Name name) {
        return new PgFileSettings(name, null);
    }

    @Override
    @NotNull
    public PgFileSettings rename(Table<?> name) {
        return new PgFileSettings(name.getQualifiedName(), null);
    }
}
