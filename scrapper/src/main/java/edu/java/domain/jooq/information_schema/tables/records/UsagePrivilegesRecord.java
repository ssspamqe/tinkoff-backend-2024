/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.UsagePrivileges;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class UsagePrivilegesRecord extends TableRecordImpl<UsagePrivilegesRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.usage_privileges.grantor</code>.
     */
    public void setGrantor(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.usage_privileges.grantor</code>.
     */
    @Nullable
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.usage_privileges.grantee</code>.
     */
    public void setGrantee(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.usage_privileges.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.object_catalog</code>.
     */
    public void setObjectCatalog(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.object_catalog</code>.
     */
    @Nullable
    public String getObjectCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.object_schema</code>.
     */
    public void setObjectSchema(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.object_schema</code>.
     */
    @Nullable
    public String getObjectSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.usage_privileges.object_name</code>.
     */
    public void setObjectName(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.usage_privileges.object_name</code>.
     */
    @Nullable
    public String getObjectName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.usage_privileges.object_type</code>.
     */
    public void setObjectType(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.usage_privileges.object_type</code>.
     */
    @Nullable
    public String getObjectType() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.usage_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.usage_privileges.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.usage_privileges.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.usage_privileges.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return UsagePrivileges.USAGE_PRIVILEGES.GRANTOR;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return UsagePrivileges.USAGE_PRIVILEGES.GRANTEE;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return UsagePrivileges.USAGE_PRIVILEGES.OBJECT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return UsagePrivileges.USAGE_PRIVILEGES.OBJECT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return UsagePrivileges.USAGE_PRIVILEGES.OBJECT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return UsagePrivileges.USAGE_PRIVILEGES.OBJECT_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return UsagePrivileges.USAGE_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return UsagePrivileges.USAGE_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    @Nullable
    public String component1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String component2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String component3() {
        return getObjectCatalog();
    }

    @Override
    @Nullable
    public String component4() {
        return getObjectSchema();
    }

    @Override
    @Nullable
    public String component5() {
        return getObjectName();
    }

    @Override
    @Nullable
    public String component6() {
        return getObjectType();
    }

    @Override
    @Nullable
    public String component7() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String component8() {
        return getIsGrantable();
    }

    @Override
    @Nullable
    public String value1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String value2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String value3() {
        return getObjectCatalog();
    }

    @Override
    @Nullable
    public String value4() {
        return getObjectSchema();
    }

    @Override
    @Nullable
    public String value5() {
        return getObjectName();
    }

    @Override
    @Nullable
    public String value6() {
        return getObjectType();
    }

    @Override
    @Nullable
    public String value7() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String value8() {
        return getIsGrantable();
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value1(@Nullable String value) {
        setGrantor(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value2(@Nullable String value) {
        setGrantee(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value3(@Nullable String value) {
        setObjectCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value4(@Nullable String value) {
        setObjectSchema(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value5(@Nullable String value) {
        setObjectName(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value6(@Nullable String value) {
        setObjectType(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value7(@Nullable String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord value8(@Nullable String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    @NotNull
    public UsagePrivilegesRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsagePrivilegesRecord
     */
    public UsagePrivilegesRecord() {
        super(UsagePrivileges.USAGE_PRIVILEGES);
    }

    /**
     * Create a detached, initialised UsagePrivilegesRecord
     */
    @ConstructorProperties({ "grantor", "grantee", "objectCatalog", "objectSchema", "objectName", "objectType", "privilegeType", "isGrantable" })
    public UsagePrivilegesRecord(@Nullable String grantor, @Nullable String grantee, @Nullable String objectCatalog, @Nullable String objectSchema, @Nullable String objectName, @Nullable String objectType, @Nullable String privilegeType, @Nullable String isGrantable) {
        super(UsagePrivileges.USAGE_PRIVILEGES);

        setGrantor(grantor);
        setGrantee(grantee);
        setObjectCatalog(objectCatalog);
        setObjectSchema(objectSchema);
        setObjectName(objectName);
        setObjectType(objectType);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised UsagePrivilegesRecord
     */
    public UsagePrivilegesRecord(edu.java.domain.jooq.information_schema.tables.pojos.UsagePrivileges value) {
        super(UsagePrivileges.USAGE_PRIVILEGES);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantee(value.getGrantee());
            setObjectCatalog(value.getObjectCatalog());
            setObjectSchema(value.getObjectSchema());
            setObjectName(value.getObjectName());
            setObjectType(value.getObjectType());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}
