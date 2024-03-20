/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.RoleUdtGrants;

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
public class RoleUdtGrantsRecord extends TableRecordImpl<RoleUdtGrantsRecord> {

    private static final long serialVersionUID = 1L;

    public void setGrantor(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getGrantor() {
        return (String) get(0);
    }

    public void setGrantee(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getGrantee() {
        return (String) get(1);
    }

    public void setUdtCatalog(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getUdtCatalog() {
        return (String) get(2);
    }

    public void setUdtSchema(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getUdtSchema() {
        return (String) get(3);
    }

    public void setUdtName(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getUdtName() {
        return (String) get(4);
    }

    public void setPrivilegeType(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getPrivilegeType() {
        return (String) get(5);
    }

    public void setIsGrantable(@Nullable String value) {
        set(6, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public RoleUdtGrantsRecord() {
        super(RoleUdtGrants.ROLE_UDT_GRANTS);
    }

    @ConstructorProperties({ "grantor", "grantee", "udtCatalog", "udtSchema", "udtName", "privilegeType", "isGrantable" })
    public RoleUdtGrantsRecord(@Nullable String grantor, @Nullable String grantee, @Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String privilegeType, @Nullable String isGrantable) {
        super(RoleUdtGrants.ROLE_UDT_GRANTS);

        setGrantor(grantor);
        setGrantee(grantee);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    public RoleUdtGrantsRecord(edu.java.domain.jooq.information_schema.tables.pojos.RoleUdtGrants value) {
        super(RoleUdtGrants.ROLE_UDT_GRANTS);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantee(value.getGrantee());
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}
