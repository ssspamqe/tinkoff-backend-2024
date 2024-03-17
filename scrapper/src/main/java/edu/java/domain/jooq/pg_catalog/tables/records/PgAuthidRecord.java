/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgAuthid;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * The table <code>pg_catalog.pg_authid</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAuthidRecord extends UpdatableRecordImpl<PgAuthidRecord> implements Record12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public void setRolname(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRolname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public void setRolsuper(@NotNull Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolsuper() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public void setRolinherit(@NotNull Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolinherit() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public void setRolcreaterole(@NotNull Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolcreaterole() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public void setRolcreatedb(@NotNull Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolcreatedb() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public void setRolcanlogin(@NotNull Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolcanlogin() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public void setRolreplication(@NotNull Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolreplication() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public void setRolbypassrls(@NotNull Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRolbypassrls() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public void setRolconnlimit(@NotNull Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getRolconnlimit() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public void setRolpassword(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    @Nullable
    public String getRolpassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(@Nullable OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    @Nullable
    public OffsetDateTime getRolvaliduntil() {
        return (OffsetDateTime) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgAuthid.PG_AUTHID.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgAuthid.PG_AUTHID.ROLNAME;
    }

    @Override
    @NotNull
    public Field<Boolean> field3() {
        return PgAuthid.PG_AUTHID.ROLSUPER;
    }

    @Override
    @NotNull
    public Field<Boolean> field4() {
        return PgAuthid.PG_AUTHID.ROLINHERIT;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgAuthid.PG_AUTHID.ROLCREATEROLE;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgAuthid.PG_AUTHID.ROLCREATEDB;
    }

    @Override
    @NotNull
    public Field<Boolean> field7() {
        return PgAuthid.PG_AUTHID.ROLCANLOGIN;
    }

    @Override
    @NotNull
    public Field<Boolean> field8() {
        return PgAuthid.PG_AUTHID.ROLREPLICATION;
    }

    @Override
    @NotNull
    public Field<Boolean> field9() {
        return PgAuthid.PG_AUTHID.ROLBYPASSRLS;
    }

    @Override
    @NotNull
    public Field<Integer> field10() {
        return PgAuthid.PG_AUTHID.ROLCONNLIMIT;
    }

    @Override
    @NotNull
    public Field<String> field11() {
        return PgAuthid.PG_AUTHID.ROLPASSWORD;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field12() {
        return PgAuthid.PG_AUTHID.ROLVALIDUNTIL;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getRolname();
    }

    @Override
    @NotNull
    public Boolean component3() {
        return getRolsuper();
    }

    @Override
    @NotNull
    public Boolean component4() {
        return getRolinherit();
    }

    @Override
    @NotNull
    public Boolean component5() {
        return getRolcreaterole();
    }

    @Override
    @NotNull
    public Boolean component6() {
        return getRolcreatedb();
    }

    @Override
    @NotNull
    public Boolean component7() {
        return getRolcanlogin();
    }

    @Override
    @NotNull
    public Boolean component8() {
        return getRolreplication();
    }

    @Override
    @NotNull
    public Boolean component9() {
        return getRolbypassrls();
    }

    @Override
    @NotNull
    public Integer component10() {
        return getRolconnlimit();
    }

    @Override
    @Nullable
    public String component11() {
        return getRolpassword();
    }

    @Override
    @Nullable
    public OffsetDateTime component12() {
        return getRolvaliduntil();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getRolname();
    }

    @Override
    @NotNull
    public Boolean value3() {
        return getRolsuper();
    }

    @Override
    @NotNull
    public Boolean value4() {
        return getRolinherit();
    }

    @Override
    @NotNull
    public Boolean value5() {
        return getRolcreaterole();
    }

    @Override
    @NotNull
    public Boolean value6() {
        return getRolcreatedb();
    }

    @Override
    @NotNull
    public Boolean value7() {
        return getRolcanlogin();
    }

    @Override
    @NotNull
    public Boolean value8() {
        return getRolreplication();
    }

    @Override
    @NotNull
    public Boolean value9() {
        return getRolbypassrls();
    }

    @Override
    @NotNull
    public Integer value10() {
        return getRolconnlimit();
    }

    @Override
    @Nullable
    public String value11() {
        return getRolpassword();
    }

    @Override
    @Nullable
    public OffsetDateTime value12() {
        return getRolvaliduntil();
    }

    @Override
    @NotNull
    public PgAuthidRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value2(@NotNull String value) {
        setRolname(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value3(@NotNull Boolean value) {
        setRolsuper(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value4(@NotNull Boolean value) {
        setRolinherit(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value5(@NotNull Boolean value) {
        setRolcreaterole(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value6(@NotNull Boolean value) {
        setRolcreatedb(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value7(@NotNull Boolean value) {
        setRolcanlogin(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value8(@NotNull Boolean value) {
        setRolreplication(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value9(@NotNull Boolean value) {
        setRolbypassrls(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value10(@NotNull Integer value) {
        setRolconnlimit(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value11(@Nullable String value) {
        setRolpassword(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord value12(@Nullable OffsetDateTime value) {
        setRolvaliduntil(value);
        return this;
    }

    @Override
    @NotNull
    public PgAuthidRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Boolean value3, @NotNull Boolean value4, @NotNull Boolean value5, @NotNull Boolean value6, @NotNull Boolean value7, @NotNull Boolean value8, @NotNull Boolean value9, @NotNull Integer value10, @Nullable String value11, @Nullable OffsetDateTime value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAuthidRecord
     */
    public PgAuthidRecord() {
        super(PgAuthid.PG_AUTHID);
    }

    /**
     * Create a detached, initialised PgAuthidRecord
     */
    @ConstructorProperties({ "oid", "rolname", "rolsuper", "rolinherit", "rolcreaterole", "rolcreatedb", "rolcanlogin", "rolreplication", "rolbypassrls", "rolconnlimit", "rolpassword", "rolvaliduntil" })
    public PgAuthidRecord(@NotNull Long oid, @NotNull String rolname, @NotNull Boolean rolsuper, @NotNull Boolean rolinherit, @NotNull Boolean rolcreaterole, @NotNull Boolean rolcreatedb, @NotNull Boolean rolcanlogin, @NotNull Boolean rolreplication, @NotNull Boolean rolbypassrls, @NotNull Integer rolconnlimit, @Nullable String rolpassword, @Nullable OffsetDateTime rolvaliduntil) {
        super(PgAuthid.PG_AUTHID);

        setOid(oid);
        setRolname(rolname);
        setRolsuper(rolsuper);
        setRolinherit(rolinherit);
        setRolcreaterole(rolcreaterole);
        setRolcreatedb(rolcreatedb);
        setRolcanlogin(rolcanlogin);
        setRolreplication(rolreplication);
        setRolbypassrls(rolbypassrls);
        setRolconnlimit(rolconnlimit);
        setRolpassword(rolpassword);
        setRolvaliduntil(rolvaliduntil);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgAuthidRecord
     */
    public PgAuthidRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgAuthid value) {
        super(PgAuthid.PG_AUTHID);

        if (value != null) {
            setOid(value.getOid());
            setRolname(value.getRolname());
            setRolsuper(value.getRolsuper());
            setRolinherit(value.getRolinherit());
            setRolcreaterole(value.getRolcreaterole());
            setRolcreatedb(value.getRolcreatedb());
            setRolcanlogin(value.getRolcanlogin());
            setRolreplication(value.getRolreplication());
            setRolbypassrls(value.getRolbypassrls());
            setRolconnlimit(value.getRolconnlimit());
            setRolpassword(value.getRolpassword());
            setRolvaliduntil(value.getRolvaliduntil());
            resetChangedOnNotNull();
        }
    }
}
