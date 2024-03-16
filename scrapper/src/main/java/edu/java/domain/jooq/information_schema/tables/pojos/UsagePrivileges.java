/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


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
public class UsagePrivileges implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grantor;
    private String grantee;
    private String objectCatalog;
    private String objectSchema;
    private String objectName;
    private String objectType;
    private String privilegeType;
    private String isGrantable;

    public UsagePrivileges() {}

    public UsagePrivileges(UsagePrivileges value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.objectCatalog = value.objectCatalog;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.objectType = value.objectType;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    @ConstructorProperties({ "grantor", "grantee", "objectCatalog", "objectSchema", "objectName", "objectType", "privilegeType", "isGrantable" })
    public UsagePrivileges(
        @Nullable String grantor,
        @Nullable String grantee,
        @Nullable String objectCatalog,
        @Nullable String objectSchema,
        @Nullable String objectName,
        @Nullable String objectType,
        @Nullable String privilegeType,
        @Nullable String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.objectCatalog = objectCatalog;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.objectType = objectType;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for <code>information_schema.usage_privileges.grantor</code>.
     */
    @Nullable
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Setter for <code>information_schema.usage_privileges.grantor</code>.
     */
    public void setGrantor(@Nullable String grantor) {
        this.grantor = grantor;
    }

    /**
     * Getter for <code>information_schema.usage_privileges.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Setter for <code>information_schema.usage_privileges.grantee</code>.
     */
    public void setGrantee(@Nullable String grantee) {
        this.grantee = grantee;
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.object_catalog</code>.
     */
    @Nullable
    public String getObjectCatalog() {
        return this.objectCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.object_catalog</code>.
     */
    public void setObjectCatalog(@Nullable String objectCatalog) {
        this.objectCatalog = objectCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.object_schema</code>.
     */
    @Nullable
    public String getObjectSchema() {
        return this.objectSchema;
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.object_schema</code>.
     */
    public void setObjectSchema(@Nullable String objectSchema) {
        this.objectSchema = objectSchema;
    }

    /**
     * Getter for <code>information_schema.usage_privileges.object_name</code>.
     */
    @Nullable
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Setter for <code>information_schema.usage_privileges.object_name</code>.
     */
    public void setObjectName(@Nullable String objectName) {
        this.objectName = objectName;
    }

    /**
     * Getter for <code>information_schema.usage_privileges.object_type</code>.
     */
    @Nullable
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Setter for <code>information_schema.usage_privileges.object_type</code>.
     */
    public void setObjectType(@Nullable String objectType) {
        this.objectType = objectType;
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * Getter for <code>information_schema.usage_privileges.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return this.isGrantable;
    }

    /**
     * Setter for <code>information_schema.usage_privileges.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UsagePrivileges other = (UsagePrivileges) obj;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
        if (this.objectCatalog == null) {
            if (other.objectCatalog != null)
                return false;
        }
        else if (!this.objectCatalog.equals(other.objectCatalog))
            return false;
        if (this.objectSchema == null) {
            if (other.objectSchema != null)
                return false;
        }
        else if (!this.objectSchema.equals(other.objectSchema))
            return false;
        if (this.objectName == null) {
            if (other.objectName != null)
                return false;
        }
        else if (!this.objectName.equals(other.objectName))
            return false;
        if (this.objectType == null) {
            if (other.objectType != null)
                return false;
        }
        else if (!this.objectType.equals(other.objectType))
            return false;
        if (this.privilegeType == null) {
            if (other.privilegeType != null)
                return false;
        }
        else if (!this.privilegeType.equals(other.privilegeType))
            return false;
        if (this.isGrantable == null) {
            if (other.isGrantable != null)
                return false;
        }
        else if (!this.isGrantable.equals(other.isGrantable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.objectCatalog == null) ? 0 : this.objectCatalog.hashCode());
        result = prime * result + ((this.objectSchema == null) ? 0 : this.objectSchema.hashCode());
        result = prime * result + ((this.objectName == null) ? 0 : this.objectName.hashCode());
        result = prime * result + ((this.objectType == null) ? 0 : this.objectType.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsagePrivileges (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(objectCatalog);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(objectType);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
