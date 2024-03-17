/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.RoutineColumnUsage;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>information_schema.routine_column_usage</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoutineColumnUsageRecord extends TableRecordImpl<RoutineColumnUsageRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_catalog</code>.
     */
    @Nullable
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_schema</code>.
     */
    public void setSpecificSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_schema</code>.
     */
    @Nullable
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_name</code>.
     */
    public void setSpecificName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_name</code>.
     */
    @Nullable
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_catalog</code>.
     */
    @Nullable
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_schema</code>.
     */
    public void setRoutineSchema(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_schema</code>.
     */
    @Nullable
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_name</code>.
     */
    public void setRoutineName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_name</code>.
     */
    @Nullable
    public String getRoutineName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.column_name</code>.
     */
    public void setColumnName(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field9() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.COLUMN_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getSpecificName();
    }

    @Override
    @Nullable
    public String component4() {
        return getRoutineCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getRoutineSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getRoutineName();
    }

    @Override
    @Nullable
    public String component7() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String component8() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String component9() {
        return getTableName();
    }

    @Override
    @Nullable
    public String component10() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getSpecificName();
    }

    @Override
    @Nullable
    public String value4() {
        return getRoutineCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getRoutineSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getRoutineName();
    }

    @Override
    @Nullable
    public String value7() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String value8() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String value9() {
        return getTableName();
    }

    @Override
    @Nullable
    public String value10() {
        return getColumnName();
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value1(@Nullable String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value2(@Nullable String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value3(@Nullable String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value4(@Nullable String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value5(@Nullable String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value6(@Nullable String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value7(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value8(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value9(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord value10(@Nullable String value) {
        setColumnName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutineColumnUsageRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable String value8, @Nullable String value9, @Nullable String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutineColumnUsageRecord
     */
    public RoutineColumnUsageRecord() {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised RoutineColumnUsageRecord
     */
    @ConstructorProperties({ "specificCatalog", "specificSchema", "specificName", "routineCatalog", "routineSchema", "routineName", "tableCatalog", "tableSchema", "tableName", "columnName" })
    public RoutineColumnUsageRecord(@Nullable String specificCatalog, @Nullable String specificSchema, @Nullable String specificName, @Nullable String routineCatalog, @Nullable String routineSchema, @Nullable String routineName, @Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String columnName) {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoutineColumnUsageRecord
     */
    public RoutineColumnUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.RoutineColumnUsage value) {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);

        if (value != null) {
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setRoutineCatalog(value.getRoutineCatalog());
            setRoutineSchema(value.getRoutineSchema());
            setRoutineName(value.getRoutineName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            resetChangedOnNotNull();
        }
    }
}
