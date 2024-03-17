/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgUserRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class PgUser extends TableImpl<PgUserRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgUser PG_USER = new PgUser();

    @Override
    @NotNull
    public Class<PgUserRecord> getRecordType() {
        return PgUserRecord.class;
    }

    public final TableField<PgUserRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgUserRecord, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgUserRecord, Boolean> USECREATEDB = createField(DSL.name("usecreatedb"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgUserRecord, Boolean> USESUPER = createField(DSL.name("usesuper"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgUserRecord, Boolean> USEREPL = createField(DSL.name("userepl"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgUserRecord, Boolean> USEBYPASSRLS = createField(DSL.name("usebypassrls"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgUserRecord, String> PASSWD = createField(DSL.name("passwd"), SQLDataType.CLOB, this, "");

    public final TableField<PgUserRecord, OffsetDateTime> VALUNTIL = createField(DSL.name("valuntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgUserRecord, String[]> USECONFIG = createField(DSL.name("useconfig"), SQLDataType.CLOB.array(), this, "");

    private PgUser(Name alias, Table<PgUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUser(Name alias, Table<PgUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_user" as  SELECT usename,
         usesysid,
         usecreatedb,
         usesuper,
         userepl,
         usebypassrls,
         '********'::text AS passwd,
         valuntil,
         useconfig
        FROM pg_shadow;
        """));
    }

    public PgUser(String alias) {
        this(DSL.name(alias), PG_USER);
    }

    public PgUser(Name alias) {
        this(alias, PG_USER);
    }

    public PgUser() {
        this(DSL.name("pg_user"), null);
    }

    public <O extends Record> PgUser(Table<O> child, ForeignKey<O, PgUserRecord> key) {
        super(child, key, PG_USER);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgUser as(String alias) {
        return new PgUser(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgUser as(Name alias) {
        return new PgUser(alias, this);
    }

    @Override
    @NotNull
    public PgUser as(Table<?> alias) {
        return new PgUser(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgUser rename(String name) {
        return new PgUser(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgUser rename(Name name) {
        return new PgUser(name, null);
    }

    @Override
    @NotNull
    public PgUser rename(Table<?> name) {
        return new PgUser(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
