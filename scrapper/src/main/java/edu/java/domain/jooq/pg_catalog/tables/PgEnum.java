/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgEnumRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_enum</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgEnum extends TableImpl<PgEnumRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_enum</code>
     */
    public static final PgEnum PG_ENUM = new PgEnum();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgEnumRecord> getRecordType() {
        return PgEnumRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_enum.oid</code>.
     */
    public final TableField<PgEnumRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    public final TableField<PgEnumRecord, Long> ENUMTYPID = createField(DSL.name("enumtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    public final TableField<PgEnumRecord, Float> ENUMSORTORDER = createField(DSL.name("enumsortorder"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    public final TableField<PgEnumRecord, String> ENUMLABEL = createField(DSL.name("enumlabel"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgEnum(Name alias, Table<PgEnumRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgEnum(Name alias, Table<PgEnumRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum(String alias) {
        this(DSL.name(alias), PG_ENUM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum(Name alias) {
        this(alias, PG_ENUM);
    }

    /**
     * Create a <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum() {
        this(DSL.name("pg_enum"), null);
    }

    public <O extends Record> PgEnum(Table<O> child, ForeignKey<O, PgEnumRecord> key) {
        super(child, key, PG_ENUM);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgEnumRecord> getPrimaryKey() {
        return Keys.PG_ENUM_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgEnumRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_ENUM_TYPID_LABEL_INDEX, Keys.PG_ENUM_TYPID_SORTORDER_INDEX);
    }

    @Override
    @NotNull
    public PgEnum as(String alias) {
        return new PgEnum(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgEnum as(Name alias) {
        return new PgEnum(alias, this);
    }

    @Override
    @NotNull
    public PgEnum as(Table<?> alias) {
        return new PgEnum(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgEnum rename(String name) {
        return new PgEnum(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgEnum rename(Name name) {
        return new PgEnum(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgEnum rename(Table<?> name) {
        return new PgEnum(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Float, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Float, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Float, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
