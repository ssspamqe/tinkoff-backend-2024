/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Tables;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TablesRecord extends TableRecordImpl<TablesRecord> {

    private static final long serialVersionUID = 1L;

    public void setTableCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getTableCatalog() {
        return (String) get(0);
    }

    public void setTableSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getTableSchema() {
        return (String) get(1);
    }

    public void setTableName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getTableName() {
        return (String) get(2);
    }

    public void setTableType(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getTableType() {
        return (String) get(3);
    }

    public void setSelfReferencingColumnName(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getSelfReferencingColumnName() {
        return (String) get(4);
    }

    public void setReferenceGeneration(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getReferenceGeneration() {
        return (String) get(5);
    }

    public void setUserDefinedTypeCatalog(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getUserDefinedTypeCatalog() {
        return (String) get(6);
    }

    public void setUserDefinedTypeSchema(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getUserDefinedTypeSchema() {
        return (String) get(7);
    }

    public void setUserDefinedTypeName(@Nullable String value) {
        set(8, value);
    }

    @Nullable
    public String getUserDefinedTypeName() {
        return (String) get(8);
    }

    public void setIsInsertableInto(@Nullable String value) {
        set(9, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsInsertableInto() {
        return (String) get(9);
    }

    public void setIsTyped(@Nullable String value) {
        set(10, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsTyped() {
        return (String) get(10);
    }

    public void setCommitAction(@Nullable String value) {
        set(11, value);
    }

    @Nullable
    public String getCommitAction() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public TablesRecord() {
        super(Tables.TABLES);
    }

    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "tableType", "selfReferencingColumnName", "referenceGeneration", "userDefinedTypeCatalog", "userDefinedTypeSchema", "userDefinedTypeName", "isInsertableInto", "isTyped", "commitAction" })
    public TablesRecord(@Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String tableType, @Nullable String selfReferencingColumnName, @Nullable String referenceGeneration, @Nullable String userDefinedTypeCatalog, @Nullable String userDefinedTypeSchema, @Nullable String userDefinedTypeName, @Nullable String isInsertableInto, @Nullable String isTyped, @Nullable String commitAction) {
        super(Tables.TABLES);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setTableType(tableType);
        setSelfReferencingColumnName(selfReferencingColumnName);
        setReferenceGeneration(referenceGeneration);
        setUserDefinedTypeCatalog(userDefinedTypeCatalog);
        setUserDefinedTypeSchema(userDefinedTypeSchema);
        setUserDefinedTypeName(userDefinedTypeName);
        setIsInsertableInto(isInsertableInto);
        setIsTyped(isTyped);
        setCommitAction(commitAction);
        resetChangedOnNotNull();
    }

    public TablesRecord(edu.java.domain.jooq.information_schema.tables.pojos.Tables value) {
        super(Tables.TABLES);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setTableType(value.getTableType());
            setSelfReferencingColumnName(value.getSelfReferencingColumnName());
            setReferenceGeneration(value.getReferenceGeneration());
            setUserDefinedTypeCatalog(value.getUserDefinedTypeCatalog());
            setUserDefinedTypeSchema(value.getUserDefinedTypeSchema());
            setUserDefinedTypeName(value.getUserDefinedTypeName());
            setIsInsertableInto(value.getIsInsertableInto());
            setIsTyped(value.getIsTyped());
            setCommitAction(value.getCommitAction());
            resetChangedOnNotNull();
        }
    }
}