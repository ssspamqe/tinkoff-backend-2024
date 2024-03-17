/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Indexes;
import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatisticExtRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Index;
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


/**
 * The table <code>pg_catalog.pg_statistic_ext</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatisticExt extends TableImpl<PgStatisticExtRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic_ext</code>
     */
    public static final PgStatisticExt PG_STATISTIC_EXT = new PgStatisticExt();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatisticExtRecord> getRecordType() {
        return PgStatisticExtRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic_ext.oid</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXRELID = createField(DSL.name("stxrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    public final TableField<PgStatisticExtRecord, String> STXNAME = createField(DSL.name("stxname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXNAMESPACE = createField(DSL.name("stxnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXOWNER = createField(DSL.name("stxowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxstattarget</code>.
     */
    public final TableField<PgStatisticExtRecord, Integer> STXSTATTARGET = createField(DSL.name("stxstattarget"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    public final TableField<PgStatisticExtRecord, Object[]> STXKEYS = createField(DSL.name("stxkeys"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    public final TableField<PgStatisticExtRecord, String[]> STXKIND = createField(DSL.name("stxkind"), SQLDataType.CHAR.nullable(false).array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtRecord, Object> STXEXPRS = createField(DSL.name("stxexprs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgStatisticExt(Name alias, Table<PgStatisticExtRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatisticExt(Name alias, Table<PgStatisticExtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    public PgStatisticExt(String alias) {
        this(DSL.name(alias), PG_STATISTIC_EXT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    public PgStatisticExt(Name alias) {
        this(alias, PG_STATISTIC_EXT);
    }

    /**
     * Create a <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    public PgStatisticExt() {
        this(DSL.name("pg_statistic_ext"), null);
    }

    public <O extends Record> PgStatisticExt(Table<O> child, ForeignKey<O, PgStatisticExtRecord> key) {
        super(child, key, PG_STATISTIC_EXT);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_STATISTIC_EXT_RELID_INDEX);
    }

    @Override
    @NotNull
    public UniqueKey<PgStatisticExtRecord> getPrimaryKey() {
        return Keys.PG_STATISTIC_EXT_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgStatisticExtRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_STATISTIC_EXT_NAME_INDEX);
    }

    @Override
    @NotNull
    public PgStatisticExt as(String alias) {
        return new PgStatisticExt(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatisticExt as(Name alias) {
        return new PgStatisticExt(alias, this);
    }

    @Override
    @NotNull
    public PgStatisticExt as(Table<?> alias) {
        return new PgStatisticExt(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatisticExt rename(String name) {
        return new PgStatisticExt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatisticExt rename(Name name) {
        return new PgStatisticExt(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatisticExt rename(Table<?> name) {
        return new PgStatisticExt(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, Long, String, Long, Long, Integer, Object[], String[], Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? super Integer, ? super Object[], ? super String[], ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? super Integer, ? super Object[], ? super String[], ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
