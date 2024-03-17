/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.Aclexplode;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.aclexplode</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AclexplodeRecord extends TableRecordImpl<AclexplodeRecord> implements Record4<Long, Long, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.aclexplode.grantor</code>.
     */
    public void setGrantor(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.grantor</code>.
     */
    @Nullable
    public Long getGrantor() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.grantee</code>.
     */
    public void setGrantee(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.grantee</code>.
     */
    @Nullable
    public Long getGrantee() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    @Nullable
    public Boolean getIsGrantable() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<Long, Long, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return Aclexplode.ACLEXPLODE.GRANTOR;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return Aclexplode.ACLEXPLODE.GRANTEE;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return Aclexplode.ACLEXPLODE.PRIVILEGE_TYPE;
    }

    @Override
    @NotNull
    public Field<Boolean> field4() {
        return Aclexplode.ACLEXPLODE.IS_GRANTABLE;
    }

    @Override
    @Nullable
    public Long component1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public Long component2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String component3() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public Boolean component4() {
        return getIsGrantable();
    }

    @Override
    @Nullable
    public Long value1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public Long value2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String value3() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public Boolean value4() {
        return getIsGrantable();
    }

    @Override
    @NotNull
    public AclexplodeRecord value1(@Nullable Long value) {
        setGrantor(value);
        return this;
    }

    @Override
    @NotNull
    public AclexplodeRecord value2(@Nullable Long value) {
        setGrantee(value);
        return this;
    }

    @Override
    @NotNull
    public AclexplodeRecord value3(@Nullable String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    @NotNull
    public AclexplodeRecord value4(@Nullable Boolean value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    @NotNull
    public AclexplodeRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable String value3, @Nullable Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AclexplodeRecord
     */
    public AclexplodeRecord() {
        super(Aclexplode.ACLEXPLODE);
    }

    /**
     * Create a detached, initialised AclexplodeRecord
     */
    @ConstructorProperties({ "grantor", "grantee", "privilegeType", "isGrantable" })
    public AclexplodeRecord(@Nullable Long grantor, @Nullable Long grantee, @Nullable String privilegeType, @Nullable Boolean isGrantable) {
        super(Aclexplode.ACLEXPLODE);

        setGrantor(grantor);
        setGrantee(grantee);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AclexplodeRecord
     */
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
