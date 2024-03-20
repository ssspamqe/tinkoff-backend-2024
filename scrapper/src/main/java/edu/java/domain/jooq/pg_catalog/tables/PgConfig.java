/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgConfigRecord;

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
public class PgConfig extends TableImpl<PgConfigRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgConfig PG_CONFIG = new PgConfig();

    @Override
    @NotNull
    public Class<PgConfigRecord> getRecordType() {
        return PgConfigRecord.class;
    }

    public final TableField<PgConfigRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgConfigRecord, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    private PgConfig(Name alias, Table<PgConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgConfig(Name alias, Table<PgConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgConfig(String alias) {
        this(DSL.name(alias), PG_CONFIG);
    }

    public PgConfig(Name alias) {
        this(alias, PG_CONFIG);
    }

    public PgConfig() {
        this(DSL.name("pg_config"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgConfig as(String alias) {
        return new PgConfig(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgConfig as(Name alias) {
        return new PgConfig(alias, this);
    }

    @Override
    @NotNull
    public PgConfig as(Table<?> alias) {
        return new PgConfig(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgConfig rename(String name) {
        return new PgConfig(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgConfig rename(Name name) {
        return new PgConfig(name, null);
    }

    @Override
    @NotNull
    public PgConfig rename(Table<?> name) {
        return new PgConfig(name.getQualifiedName(), null);
    }
}