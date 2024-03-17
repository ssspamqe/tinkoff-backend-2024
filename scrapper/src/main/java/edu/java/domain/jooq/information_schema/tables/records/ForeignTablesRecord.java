/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignTables;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ForeignTablesRecord extends TableRecordImpl<ForeignTablesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    public void setForeignTableCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getForeignTableCatalog() {
        return (String) get(0);
    }

    public void setForeignTableSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getForeignTableSchema() {
        return (String) get(1);
    }

    public void setForeignTableName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getForeignTableName() {
        return (String) get(2);
    }

    public void setForeignServerCatalog(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(3);
    }

    public void setForeignServerName(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getForeignServerName() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_SERVER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_SERVER_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getForeignTableCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getForeignTableSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getForeignTableName();
    }

    @Override
    @Nullable
    public String component4() {
        return getForeignServerCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getForeignServerName();
    }

    @Override
    @Nullable
    public String value1() {
        return getForeignTableCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getForeignTableSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getForeignTableName();
    }

    @Override
    @Nullable
    public String value4() {
        return getForeignServerCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getForeignServerName();
    }

    @Override
    @NotNull
    public ForeignTablesRecord value1(@Nullable String value) {
        setForeignTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignTablesRecord value2(@Nullable String value) {
        setForeignTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignTablesRecord value3(@Nullable String value) {
        setForeignTableName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignTablesRecord value4(@Nullable String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignTablesRecord value5(@Nullable String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignTablesRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ForeignTablesRecord() {
        super(ForeignTables.FOREIGN_TABLES);
    }

    @ConstructorProperties({ "foreignTableCatalog", "foreignTableSchema", "foreignTableName", "foreignServerCatalog", "foreignServerName" })
    public ForeignTablesRecord(@Nullable String foreignTableCatalog, @Nullable String foreignTableSchema, @Nullable String foreignTableName, @Nullable String foreignServerCatalog, @Nullable String foreignServerName) {
        super(ForeignTables.FOREIGN_TABLES);

        setForeignTableCatalog(foreignTableCatalog);
        setForeignTableSchema(foreignTableSchema);
        setForeignTableName(foreignTableName);
        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        resetChangedOnNotNull();
    }

    public ForeignTablesRecord(edu.java.domain.jooq.information_schema.tables.pojos.ForeignTables value) {
        super(ForeignTables.FOREIGN_TABLES);

        if (value != null) {
            setForeignTableCatalog(value.getForeignTableCatalog());
            setForeignTableSchema(value.getForeignTableSchema());
            setForeignTableName(value.getForeignTableName());
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            resetChangedOnNotNull();
        }
    }
}
