/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CheckConstraintRoutineUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String specificCatalog;
    private String specificSchema;
    private String specificName;

    public CheckConstraintRoutineUsage() {}

    public CheckConstraintRoutineUsage(CheckConstraintRoutineUsage value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
    }

    @ConstructorProperties({ "constraintCatalog", "constraintSchema", "constraintName", "specificCatalog", "specificSchema", "specificName" })
    public CheckConstraintRoutineUsage(
        @Nullable String constraintCatalog,
        @Nullable String constraintSchema,
        @Nullable String constraintName,
        @Nullable String specificCatalog,
        @Nullable String specificSchema,
        @Nullable String specificName
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
    }

    @Nullable
    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public void setConstraintCatalog(@Nullable String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Nullable
    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public void setConstraintSchema(@Nullable String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Nullable
    public String getConstraintName() {
        return this.constraintName;
    }

    public void setConstraintName(@Nullable String constraintName) {
        this.constraintName = constraintName;
    }

    @Nullable
    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    public void setSpecificCatalog(@Nullable String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    @Nullable
    public String getSpecificSchema() {
        return this.specificSchema;
    }

    public void setSpecificSchema(@Nullable String specificSchema) {
        this.specificSchema = specificSchema;
    }

    @Nullable
    public String getSpecificName() {
        return this.specificName;
    }

    public void setSpecificName(@Nullable String specificName) {
        this.specificName = specificName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CheckConstraintRoutineUsage other = (CheckConstraintRoutineUsage) obj;
        if (this.constraintCatalog == null) {
            if (other.constraintCatalog != null)
                return false;
        }
        else if (!this.constraintCatalog.equals(other.constraintCatalog))
            return false;
        if (this.constraintSchema == null) {
            if (other.constraintSchema != null)
                return false;
        }
        else if (!this.constraintSchema.equals(other.constraintSchema))
            return false;
        if (this.constraintName == null) {
            if (other.constraintName != null)
                return false;
        }
        else if (!this.constraintName.equals(other.constraintName))
            return false;
        if (this.specificCatalog == null) {
            if (other.specificCatalog != null)
                return false;
        }
        else if (!this.specificCatalog.equals(other.specificCatalog))
            return false;
        if (this.specificSchema == null) {
            if (other.specificSchema != null)
                return false;
        }
        else if (!this.specificSchema.equals(other.specificSchema))
            return false;
        if (this.specificName == null) {
            if (other.specificName != null)
                return false;
        }
        else if (!this.specificName.equals(other.specificName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.constraintCatalog == null) ? 0 : this.constraintCatalog.hashCode());
        result = prime * result + ((this.constraintSchema == null) ? 0 : this.constraintSchema.hashCode());
        result = prime * result + ((this.constraintName == null) ? 0 : this.constraintName.hashCode());
        result = prime * result + ((this.specificCatalog == null) ? 0 : this.specificCatalog.hashCode());
        result = prime * result + ((this.specificSchema == null) ? 0 : this.specificSchema.hashCode());
        result = prime * result + ((this.specificName == null) ? 0 : this.specificName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CheckConstraintRoutineUsage (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);

        sb.append(")");
        return sb.toString();
    }
}
