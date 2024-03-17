/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgExtensionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
public class PgExtension extends TableImpl<PgExtensionRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgExtension PG_EXTENSION = new PgExtension();

    @Override
    @NotNull
    public Class<PgExtensionRecord> getRecordType() {
        return PgExtensionRecord.class;
    }

    public final TableField<PgExtensionRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgExtensionRecord, String> EXTNAME = createField(DSL.name("extname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgExtensionRecord, Long> EXTOWNER = createField(DSL.name("extowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgExtensionRecord, Long> EXTNAMESPACE = createField(DSL.name("extnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgExtensionRecord, Boolean> EXTRELOCATABLE = createField(DSL.name("extrelocatable"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgExtensionRecord, String> EXTVERSION = createField(DSL.name("extversion"), SQLDataType.CLOB.nullable(false), this, "");

    public final TableField<PgExtensionRecord, Long[]> EXTCONFIG = createField(DSL.name("extconfig"), SQLDataType.BIGINT.array(), this, "");

    public final TableField<PgExtensionRecord, String[]> EXTCONDITION = createField(DSL.name("extcondition"), SQLDataType.CLOB.array(), this, "");

    private PgExtension(Name alias, Table<PgExtensionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgExtension(Name alias, Table<PgExtensionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgExtension(String alias) {
        this(DSL.name(alias), PG_EXTENSION);
    }

    public PgExtension(Name alias) {
        this(alias, PG_EXTENSION);
    }

    public PgExtension() {
        this(DSL.name("pg_extension"), null);
    }

    public <O extends Record> PgExtension(Table<O> child, ForeignKey<O, PgExtensionRecord> key) {
        super(child, key, PG_EXTENSION);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgExtensionRecord> getPrimaryKey() {
        return Keys.PG_EXTENSION_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgExtensionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_EXTENSION_NAME_INDEX);
    }

    @Override
    @NotNull
    public PgExtension as(String alias) {
        return new PgExtension(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgExtension as(Name alias) {
        return new PgExtension(alias, this);
    }

    @Override
    @NotNull
    public PgExtension as(Table<?> alias) {
        return new PgExtension(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgExtension rename(String name) {
        return new PgExtension(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgExtension rename(Name name) {
        return new PgExtension(name, null);
    }

    @Override
    @NotNull
    public PgExtension rename(Table<?> name) {
        return new PgExtension(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<Long, String, Long, Long, Boolean, String, Long[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super Long, ? super Long, ? super Boolean, ? super String, ? super Long[], ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super Long, ? super Long, ? super Boolean, ? super String, ? super Long[], ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
