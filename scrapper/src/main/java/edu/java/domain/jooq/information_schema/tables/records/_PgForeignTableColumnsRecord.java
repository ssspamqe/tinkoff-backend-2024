/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables._PgForeignTableColumns;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>information_schema._pg_foreign_table_columns</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgForeignTableColumnsRecord extends TableRecordImpl<_PgForeignTableColumnsRecord> implements Record4<String, String, String, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public void setNspname(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    @Nullable
    public String getNspname() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public void setRelname(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public void setAttname(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    @Nullable
    public String getAttname() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public void setAttfdwoptions(@Nullable String[] value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    @Nullable
    public String[] getAttfdwoptions() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<String, String, String, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.NSPNAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.RELNAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.ATTNAME;
    }

    @Override
    @NotNull
    public Field<String[]> field4() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.ATTFDWOPTIONS;
    }

    @Override
    @Nullable
    public String component1() {
        return getNspname();
    }

    @Override
    @Nullable
    public String component2() {
        return getRelname();
    }

    @Override
    @Nullable
    public String component3() {
        return getAttname();
    }

    @Override
    @Nullable
    public String[] component4() {
        return getAttfdwoptions();
    }

    @Override
    @Nullable
    public String value1() {
        return getNspname();
    }

    @Override
    @Nullable
    public String value2() {
        return getRelname();
    }

    @Override
    @Nullable
    public String value3() {
        return getAttname();
    }

    @Override
    @Nullable
    public String[] value4() {
        return getAttfdwoptions();
    }

    @Override
    @NotNull
    public _PgForeignTableColumnsRecord value1(@Nullable String value) {
        setNspname(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignTableColumnsRecord value2(@Nullable String value) {
        setRelname(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignTableColumnsRecord value3(@Nullable String value) {
        setAttname(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignTableColumnsRecord value4(@Nullable String[] value) {
        setAttfdwoptions(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignTableColumnsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgForeignTableColumnsRecord
     */
    public _PgForeignTableColumnsRecord() {
        super(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create a detached, initialised _PgForeignTableColumnsRecord
     */
    @ConstructorProperties({ "nspname", "relname", "attname", "attfdwoptions" })
    public _PgForeignTableColumnsRecord(@Nullable String nspname, @Nullable String relname, @Nullable String attname, @Nullable String[] attfdwoptions) {
        super(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS);

        setNspname(nspname);
        setRelname(relname);
        setAttname(attname);
        setAttfdwoptions(attfdwoptions);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised _PgForeignTableColumnsRecord
     */
    public _PgForeignTableColumnsRecord(edu.java.domain.jooq.information_schema.tables.pojos._PgForeignTableColumns value) {
        super(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS);

        if (value != null) {
            setNspname(value.getNspname());
            setRelname(value.getRelname());
            setAttname(value.getAttname());
            setAttfdwoptions(value.getAttfdwoptions());
            resetChangedOnNotNull();
        }
    }
}
