/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLogicalSlotGetBinaryChangesRecord;

import java.util.function.Function;

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


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLogicalSlotGetBinaryChanges extends TableImpl<PgLogicalSlotGetBinaryChangesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code>
     */
    public static final PgLogicalSlotGetBinaryChanges PG_LOGICAL_SLOT_GET_BINARY_CHANGES = new PgLogicalSlotGetBinaryChanges();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLogicalSlotGetBinaryChangesRecord> getRecordType() {
        return PgLogicalSlotGetBinaryChangesRecord.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgLogicalSlotGetBinaryChangesRecord, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.xid</code>.
     */
    public final TableField<PgLogicalSlotGetBinaryChangesRecord, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.data</code>.
     */
    public final TableField<PgLogicalSlotGetBinaryChangesRecord, byte[]> DATA = createField(DSL.name("data"), SQLDataType.BLOB, this, "");

    private PgLogicalSlotGetBinaryChanges(Name alias, Table<PgLogicalSlotGetBinaryChangesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });
    }

    private PgLogicalSlotGetBinaryChanges(Name alias, Table<PgLogicalSlotGetBinaryChangesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_GET_BINARY_CHANGES);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_GET_BINARY_CHANGES);
    }

    /**
     * Create a <code>pg_catalog.pg_logical_slot_get_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotGetBinaryChanges() {
        this(DSL.name("pg_logical_slot_get_binary_changes"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges as(String alias) {
        return new PgLogicalSlotGetBinaryChanges(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges as(Name alias) {
        return new PgLogicalSlotGetBinaryChanges(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges as(Table<?> alias) {
        return new PgLogicalSlotGetBinaryChanges(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges rename(String name) {
        return new PgLogicalSlotGetBinaryChanges(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges rename(Name name) {
        return new PgLogicalSlotGetBinaryChanges(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLogicalSlotGetBinaryChanges rename(Table<?> name) {
        return new PgLogicalSlotGetBinaryChanges(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Object, Long, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetBinaryChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotGetBinaryChanges result = new PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetBinaryChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotGetBinaryChanges result = new PgLogicalSlotGetBinaryChanges(DSL.name("pg_logical_slot_get_binary_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Object, ? super Long, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Object, ? super Long, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
