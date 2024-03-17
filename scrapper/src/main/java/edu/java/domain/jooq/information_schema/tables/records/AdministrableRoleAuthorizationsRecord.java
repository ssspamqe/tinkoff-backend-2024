/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.AdministrableRoleAuthorizations;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class AdministrableRoleAuthorizationsRecord extends TableRecordImpl<AdministrableRoleAuthorizationsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public void setGrantee(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public void setRoleName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    @Nullable
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE;
    }

    @Override
    @Nullable
    public String component1() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String component2() {
        return getRoleName();
    }

    @Override
    @Nullable
    public String component3() {
        return getIsGrantable();
    }

    @Override
    @Nullable
    public String value1() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String value2() {
        return getRoleName();
    }

    @Override
    @Nullable
    public String value3() {
        return getIsGrantable();
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizationsRecord value1(@Nullable String value) {
        setGrantee(value);
        return this;
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizationsRecord value2(@Nullable String value) {
        setRoleName(value);
        return this;
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizationsRecord value3(@Nullable String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizationsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord() {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    @ConstructorProperties({ "grantee", "roleName", "isGrantable" })
    public AdministrableRoleAuthorizationsRecord(@Nullable String grantee, @Nullable String roleName, @Nullable String isGrantable) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        setGrantee(grantee);
        setRoleName(roleName);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord(edu.java.domain.jooq.information_schema.tables.pojos.AdministrableRoleAuthorizations value) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        if (value != null) {
            setGrantee(value.getGrantee());
            setRoleName(value.getRoleName());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}
