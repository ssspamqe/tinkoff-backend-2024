/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLanguageRecord;

import java.util.Arrays;
import java.util.List;

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
public class PgLanguage extends TableImpl<PgLanguageRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgLanguage PG_LANGUAGE = new PgLanguage();

    @Override
    @NotNull
    public Class<PgLanguageRecord> getRecordType() {
        return PgLanguageRecord.class;
    }

    public final TableField<PgLanguageRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgLanguageRecord, String> LANNAME = createField(DSL.name("lanname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Long> LANOWNER = createField(DSL.name("lanowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Boolean> LANISPL = createField(DSL.name("lanispl"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Boolean> LANPLTRUSTED = createField(DSL.name("lanpltrusted"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Long> LANPLCALLFOID = createField(DSL.name("lanplcallfoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Long> LANINLINE = createField(DSL.name("laninline"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgLanguageRecord, Long> LANVALIDATOR = createField(DSL.name("lanvalidator"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgLanguageRecord, String[]> LANACL = createField(DSL.name("lanacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgLanguage(Name alias, Table<PgLanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLanguage(Name alias, Table<PgLanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgLanguage(String alias) {
        this(DSL.name(alias), PG_LANGUAGE);
    }

    public PgLanguage(Name alias) {
        this(alias, PG_LANGUAGE);
    }

    public PgLanguage() {
        this(DSL.name("pg_language"), null);
    }

    public <O extends Record> PgLanguage(Table<O> child, ForeignKey<O, PgLanguageRecord> key) {
        super(child, key, PG_LANGUAGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgLanguageRecord> getPrimaryKey() {
        return Keys.PG_LANGUAGE_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgLanguageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_LANGUAGE_NAME_INDEX);
    }

    @Override
    @NotNull
    public PgLanguage as(String alias) {
        return new PgLanguage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgLanguage as(Name alias) {
        return new PgLanguage(alias, this);
    }

    @Override
    @NotNull
    public PgLanguage as(Table<?> alias) {
        return new PgLanguage(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgLanguage rename(String name) {
        return new PgLanguage(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgLanguage rename(Name name) {
        return new PgLanguage(name, null);
    }

    @Override
    @NotNull
    public PgLanguage rename(Table<?> name) {
        return new PgLanguage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, String, Long, Boolean, Boolean, Long, Long, Long, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super Long, ? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
