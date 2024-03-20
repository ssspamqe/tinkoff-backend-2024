/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgMatviewsRecord;

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
public class PgMatviews extends TableImpl<PgMatviewsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgMatviews PG_MATVIEWS = new PgMatviews();

    @Override
    @NotNull
    public Class<PgMatviewsRecord> getRecordType() {
        return PgMatviewsRecord.class;
    }

    public final TableField<PgMatviewsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgMatviewsRecord, String> MATVIEWNAME = createField(DSL.name("matviewname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgMatviewsRecord, String> MATVIEWOWNER = createField(DSL.name("matviewowner"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgMatviewsRecord, String> TABLESPACE = createField(DSL.name("tablespace"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgMatviewsRecord, Boolean> HASINDEXES = createField(DSL.name("hasindexes"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgMatviewsRecord, Boolean> ISPOPULATED = createField(DSL.name("ispopulated"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgMatviewsRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB, this, "");

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgMatviews(String alias) {
        this(DSL.name(alias), PG_MATVIEWS);
    }

    public PgMatviews(Name alias) {
        this(alias, PG_MATVIEWS);
    }

    public PgMatviews() {
        this(DSL.name("pg_matviews"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgMatviews as(String alias) {
        return new PgMatviews(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgMatviews as(Name alias) {
        return new PgMatviews(alias, this);
    }

    @Override
    @NotNull
    public PgMatviews as(Table<?> alias) {
        return new PgMatviews(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgMatviews rename(String name) {
        return new PgMatviews(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgMatviews rename(Name name) {
        return new PgMatviews(name, null);
    }

    @Override
    @NotNull
    public PgMatviews rename(Table<?> name) {
        return new PgMatviews(name.getQualifiedName(), null);
    }
}
