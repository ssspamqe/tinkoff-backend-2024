/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgRangeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class PgRange extends TableImpl<PgRangeRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgRange PG_RANGE = new PgRange();

    @Override
    @NotNull
    public Class<PgRangeRecord> getRecordType() {
        return PgRangeRecord.class;
    }

    public final TableField<PgRangeRecord, Long> RNGTYPID = createField(DSL.name("rngtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRangeRecord, Long> RNGSUBTYPE = createField(DSL.name("rngsubtype"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRangeRecord, Long> RNGMULTITYPID = createField(DSL.name("rngmultitypid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRangeRecord, Long> RNGCOLLATION = createField(DSL.name("rngcollation"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRangeRecord, Long> RNGSUBOPC = createField(DSL.name("rngsubopc"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRangeRecord, String> RNGCANONICAL = createField(DSL.name("rngcanonical"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgRangeRecord, String> RNGSUBDIFF = createField(DSL.name("rngsubdiff"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgRange(Name alias, Table<PgRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRange(Name alias, Table<PgRangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgRange(String alias) {
        this(DSL.name(alias), PG_RANGE);
    }

    public PgRange(Name alias) {
        this(alias, PG_RANGE);
    }

    public PgRange() {
        this(DSL.name("pg_range"), null);
    }

    public <O extends Record> PgRange(Table<O> child, ForeignKey<O, PgRangeRecord> key) {
        super(child, key, PG_RANGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgRangeRecord> getPrimaryKey() {
        return Keys.PG_RANGE_RNGTYPID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgRangeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_RANGE_RNGMULTITYPID_INDEX);
    }

    @Override
    @NotNull
    public PgRange as(String alias) {
        return new PgRange(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgRange as(Name alias) {
        return new PgRange(alias, this);
    }

    @Override
    @NotNull
    public PgRange as(Table<?> alias) {
        return new PgRange(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgRange rename(String name) {
        return new PgRange(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgRange rename(Name name) {
        return new PgRange(name, null);
    }

    @Override
    @NotNull
    public PgRange rename(Table<?> name) {
        return new PgRange(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, Long, Long, Long, Long, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function7<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
