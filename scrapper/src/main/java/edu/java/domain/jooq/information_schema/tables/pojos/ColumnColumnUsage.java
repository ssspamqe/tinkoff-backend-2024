/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>information_schema.column_column_usage</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ColumnColumnUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private String dependentColumn;

    public ColumnColumnUsage() {}

    public ColumnColumnUsage(ColumnColumnUsage value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.dependentColumn = value.dependentColumn;
    }

    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "columnName", "dependentColumn" })
    public ColumnColumnUsage(
        @Nullable String tableCatalog,
        @Nullable String tableSchema,
        @Nullable String tableName,
        @Nullable String columnName,
        @Nullable String dependentColumn
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.dependentColumn = dependentColumn;
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    public void setTableSchema(@Nullable String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    public void setTableName(@Nullable String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    public void setColumnName(@Nullable String columnName) {
        this.columnName = columnName;
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    @Nullable
    public String getDependentColumn() {
        return this.dependentColumn;
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    public void setDependentColumn(@Nullable String dependentColumn) {
        this.dependentColumn = dependentColumn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ColumnColumnUsage other = (ColumnColumnUsage) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.dependentColumn == null) {
            if (other.dependentColumn != null)
                return false;
        }
        else if (!this.dependentColumn.equals(other.dependentColumn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.dependentColumn == null) ? 0 : this.dependentColumn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnColumnUsage (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(dependentColumn);

        sb.append(")");
        return sb.toString();
    }
}
