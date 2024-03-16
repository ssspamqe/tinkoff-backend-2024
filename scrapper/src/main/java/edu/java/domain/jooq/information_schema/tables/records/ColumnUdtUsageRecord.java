/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ColumnUdtUsage;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class ColumnUdtUsageRecord extends TableRecordImpl<ColumnUdtUsageRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public void setUdtCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    @Nullable
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public void setUdtSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    @Nullable
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public void setUdtName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_name</code>.
     */
    @Nullable
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.column_name</code>.
     */
    public void setColumnName(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.COLUMN_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getUdtCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getUdtSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getUdtName();
    }

    @Override
    @Nullable
    public String component4() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getTableName();
    }

    @Override
    @Nullable
    public String component7() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String value1() {
        return getUdtCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getUdtSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getUdtName();
    }

    @Override
    @Nullable
    public String value4() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getTableName();
    }

    @Override
    @Nullable
    public String value7() {
        return getColumnName();
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value1(@Nullable String value) {
        setUdtCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value2(@Nullable String value) {
        setUdtSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value3(@Nullable String value) {
        setUdtName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value4(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value5(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value6(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord value7(@Nullable String value) {
        setColumnName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnUdtUsageRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnUdtUsageRecord
     */
    public ColumnUdtUsageRecord() {
        super(ColumnUdtUsage.COLUMN_UDT_USAGE);
    }

    /**
     * Create a detached, initialised ColumnUdtUsageRecord
     */
    @ConstructorProperties({ "udtCatalog", "udtSchema", "udtName", "tableCatalog", "tableSchema", "tableName", "columnName" })
    public ColumnUdtUsageRecord(@Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String columnName) {
        super(ColumnUdtUsage.COLUMN_UDT_USAGE);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ColumnUdtUsageRecord
     */
    public ColumnUdtUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.ColumnUdtUsage value) {
        super(ColumnUdtUsage.COLUMN_UDT_USAGE);

        if (value != null) {
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            resetChangedOnNotNull();
        }
    }
}
