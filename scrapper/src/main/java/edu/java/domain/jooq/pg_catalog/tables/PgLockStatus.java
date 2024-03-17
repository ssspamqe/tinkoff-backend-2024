/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLockStatusRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function16;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_lock_status</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLockStatus extends TableImpl<PgLockStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_lock_status</code>
     */
    public static final PgLockStatus PG_LOCK_STATUS = new PgLockStatus();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLockStatusRecord> getRecordType() {
        return PgLockStatusRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public final TableField<PgLockStatusRecord, String> LOCKTYPE = createField(DSL.name("locktype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.database</code>.
     */
    public final TableField<PgLockStatusRecord, Long> DATABASE = createField(DSL.name("database"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public final TableField<PgLockStatusRecord, Long> RELATION = createField(DSL.name("relation"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.page</code>.
     */
    public final TableField<PgLockStatusRecord, Integer> PAGE = createField(DSL.name("page"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public final TableField<PgLockStatusRecord, Short> TUPLE = createField(DSL.name("tuple"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public final TableField<PgLockStatusRecord, String> VIRTUALXID = createField(DSL.name("virtualxid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> TRANSACTIONID = createField(DSL.name("transactionid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public final TableField<PgLockStatusRecord, Short> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public final TableField<PgLockStatusRecord, String> VIRTUALTRANSACTION = createField(DSL.name("virtualtransaction"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public final TableField<PgLockStatusRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public final TableField<PgLockStatusRecord, String> MODE = createField(DSL.name("mode"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public final TableField<PgLockStatusRecord, Boolean> GRANTED = createField(DSL.name("granted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public final TableField<PgLockStatusRecord, Boolean> FASTPATH = createField(DSL.name("fastpath"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public final TableField<PgLockStatusRecord, OffsetDateTime> WAITSTART = createField(DSL.name("waitstart"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLockStatus(Name alias, Table<PgLockStatusRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgLockStatus(Name alias, Table<PgLockStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus(String alias) {
        this(DSL.name(alias), PG_LOCK_STATUS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus(Name alias) {
        this(alias, PG_LOCK_STATUS);
    }

    /**
     * Create a <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus() {
        this(DSL.name("pg_lock_status"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLockStatus as(String alias) {
        return new PgLockStatus(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLockStatus as(Name alias) {
        return new PgLockStatus(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLockStatus as(Table<?> alias) {
        return new PgLockStatus(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLockStatus rename(String name) {
        return new PgLockStatus(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLockStatus rename(Name name) {
        return new PgLockStatus(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLockStatus rename(Table<?> name) {
        return new PgLockStatus(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLockStatus call() {
        PgLockStatus result = new PgLockStatus(DSL.name("pg_lock_status"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function16<? super String, ? super Long, ? super Long, ? super Integer, ? super Short, ? super String, ? super Long, ? super Long, ? super Long, ? super Short, ? super String, ? super Integer, ? super String, ? super Boolean, ? super Boolean, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function16<? super String, ? super Long, ? super Long, ? super Integer, ? super Short, ? super String, ? super Long, ? super Long, ? super Long, ? super Short, ? super String, ? super Integer, ? super String, ? super Boolean, ? super Boolean, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
