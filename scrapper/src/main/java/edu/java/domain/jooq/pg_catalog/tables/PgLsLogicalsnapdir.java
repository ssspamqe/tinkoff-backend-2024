/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLsLogicalsnapdirRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgLsLogicalsnapdir extends TableImpl<PgLsLogicalsnapdirRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgLsLogicalsnapdir PG_LS_LOGICALSNAPDIR = new PgLsLogicalsnapdir();

    @Override
    @NotNull
    public Class<PgLsLogicalsnapdirRecord> getRecordType() {
        return PgLsLogicalsnapdirRecord.class;
    }

    public final TableField<PgLsLogicalsnapdirRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgLsLogicalsnapdirRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    public final TableField<PgLsLogicalsnapdirRecord, OffsetDateTime> MODIFICATION = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLsLogicalsnapdir(Name alias, Table<PgLsLogicalsnapdirRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgLsLogicalsnapdir(Name alias, Table<PgLsLogicalsnapdirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgLsLogicalsnapdir(String alias) {
        this(DSL.name(alias), PG_LS_LOGICALSNAPDIR);
    }

    public PgLsLogicalsnapdir(Name alias) {
        this(alias, PG_LS_LOGICALSNAPDIR);
    }

    public PgLsLogicalsnapdir() {
        this(DSL.name("pg_ls_logicalsnapdir"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir as(String alias) {
        return new PgLsLogicalsnapdir(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir as(Name alias) {
        return new PgLsLogicalsnapdir(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir as(Table<?> alias) {
        return new PgLsLogicalsnapdir(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir rename(String name) {
        return new PgLsLogicalsnapdir(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir rename(Name name) {
        return new PgLsLogicalsnapdir(name, null, parameters);
    }

    @Override
    @NotNull
    public PgLsLogicalsnapdir rename(Table<?> name) {
        return new PgLsLogicalsnapdir(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, Long, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    public PgLsLogicalsnapdir call() {
        PgLsLogicalsnapdir result = new PgLsLogicalsnapdir(DSL.name("pg_ls_logicalsnapdir"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public <U> SelectField<U> mapping(Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
