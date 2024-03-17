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
 * The table <code>information_schema.administrable_role_authorizations</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AdministrableRoleAuthorizations implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grantee;
    private String roleName;
    private String isGrantable;

    public AdministrableRoleAuthorizations() {}

    public AdministrableRoleAuthorizations(AdministrableRoleAuthorizations value) {
        this.grantee = value.grantee;
        this.roleName = value.roleName;
        this.isGrantable = value.isGrantable;
    }

    @ConstructorProperties({ "grantee", "roleName", "isGrantable" })
    public AdministrableRoleAuthorizations(
        @Nullable String grantee,
        @Nullable String roleName,
        @Nullable String isGrantable
    ) {
        this.grantee = grantee;
        this.roleName = roleName;
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public void setGrantee(@Nullable String grantee) {
        this.grantee = grantee;
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    @Nullable
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public void setRoleName(@Nullable String roleName) {
        this.roleName = roleName;
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return this.isGrantable;
    }

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
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
        final AdministrableRoleAuthorizations other = (AdministrableRoleAuthorizations) obj;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
        if (this.roleName == null) {
            if (other.roleName != null)
                return false;
        }
        else if (!this.roleName.equals(other.roleName))
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
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.roleName == null) ? 0 : this.roleName.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AdministrableRoleAuthorizations (");

        sb.append(grantee);
        sb.append(", ").append(roleName);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
