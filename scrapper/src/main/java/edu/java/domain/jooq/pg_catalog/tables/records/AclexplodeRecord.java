/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.Aclexplode;

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
public class AclexplodeRecord extends TableRecordImpl<AclexplodeRecord> {

    private static final long serialVersionUID = 1L;

    public void setGrantor(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getGrantor() {
        return (Long) get(0);
    }

    public void setGrantee(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getGrantee() {
        return (Long) get(1);
    }

    public void setPrivilegeType(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getPrivilegeType() {
        return (String) get(2);
    }

    public void setIsGrantable(@Nullable Boolean value) {
        set(3, value);
    }

    @Nullable
    public Boolean getIsGrantable() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public AclexplodeRecord() {
        super(Aclexplode.ACLEXPLODE);
    }

    @ConstructorProperties({ "grantor", "grantee", "privilegeType", "isGrantable" })
    public AclexplodeRecord(@Nullable Long grantor, @Nullable Long grantee, @Nullable String privilegeType, @Nullable Boolean isGrantable) {
        super(Aclexplode.ACLEXPLODE);

        setGrantor(grantor);
        setGrantee(grantee);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    public AclexplodeRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.Aclexplode value) {
        super(Aclexplode.ACLEXPLODE);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantee(value.getGrantee());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}