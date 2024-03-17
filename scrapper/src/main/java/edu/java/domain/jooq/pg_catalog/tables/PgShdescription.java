/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgShdescriptionRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
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
public class PgShdescription extends TableImpl<PgShdescriptionRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgShdescription PG_SHDESCRIPTION = new PgShdescription();

    @Override
    @NotNull
    public Class<PgShdescriptionRecord> getRecordType() {
        return PgShdescriptionRecord.class;
    }

    public final TableField<PgShdescriptionRecord, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdescriptionRecord, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdescriptionRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    private PgShdescription(Name alias, Table<PgShdescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShdescription(Name alias, Table<PgShdescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgShdescription(String alias) {
        this(DSL.name(alias), PG_SHDESCRIPTION);
    }

    public PgShdescription(Name alias) {
        this(alias, PG_SHDESCRIPTION);
    }

    public PgShdescription() {
        this(DSL.name("pg_shdescription"), null);
    }

    public <O extends Record> PgShdescription(Table<O> child, ForeignKey<O, PgShdescriptionRecord> key) {
        super(child, key, PG_SHDESCRIPTION);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgShdescriptionRecord> getPrimaryKey() {
        return Keys.PG_SHDESCRIPTION_O_C_INDEX;
    }

    @Override
    @NotNull
    public PgShdescription as(String alias) {
        return new PgShdescription(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgShdescription as(Name alias) {
        return new PgShdescription(alias, this);
    }

    @Override
    @NotNull
    public PgShdescription as(Table<?> alias) {
        return new PgShdescription(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgShdescription rename(String name) {
        return new PgShdescription(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgShdescription rename(Name name) {
        return new PgShdescription(name, null);
    }

    @Override
    @NotNull
    public PgShdescription rename(Table<?> name) {
        return new PgShdescription(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
