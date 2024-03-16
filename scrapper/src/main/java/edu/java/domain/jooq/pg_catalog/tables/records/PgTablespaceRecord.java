/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTablespace;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PgTablespaceRecord extends UpdatableRecordImpl<PgTablespaceRecord> implements Record5<Long, String, Long, String[], String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_tablespace.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    public void setSpcname(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSpcname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    public void setSpcowner(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSpcowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    public void setSpcacl(@Nullable String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    @Nullable
    public String[] getSpcacl() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    public void setSpcoptions(@Nullable String[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    @Nullable
    public String[] getSpcoptions() {
        return (String[]) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, Long, String[], String[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Long, String, Long, String[], String[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgTablespace.PG_TABLESPACE.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgTablespace.PG_TABLESPACE.SPCNAME;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgTablespace.PG_TABLESPACE.SPCOWNER;
    }

    @Override
    @NotNull
    public Field<String[]> field4() {
        return PgTablespace.PG_TABLESPACE.SPCACL;
    }

    @Override
    @NotNull
    public Field<String[]> field5() {
        return PgTablespace.PG_TABLESPACE.SPCOPTIONS;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getSpcname();
    }

    @Override
    @NotNull
    public Long component3() {
        return getSpcowner();
    }

    @Override
    @Nullable
    public String[] component4() {
        return getSpcacl();
    }

    @Override
    @Nullable
    public String[] component5() {
        return getSpcoptions();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getSpcname();
    }

    @Override
    @NotNull
    public Long value3() {
        return getSpcowner();
    }

    @Override
    @Nullable
    public String[] value4() {
        return getSpcacl();
    }

    @Override
    @Nullable
    public String[] value5() {
        return getSpcoptions();
    }

    @Override
    @NotNull
    public PgTablespaceRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgTablespaceRecord value2(@NotNull String value) {
        setSpcname(value);
        return this;
    }

    @Override
    @NotNull
    public PgTablespaceRecord value3(@NotNull Long value) {
        setSpcowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgTablespaceRecord value4(@Nullable String[] value) {
        setSpcacl(value);
        return this;
    }

    @Override
    @NotNull
    public PgTablespaceRecord value5(@Nullable String[] value) {
        setSpcoptions(value);
        return this;
    }

    @Override
    @NotNull
    public PgTablespaceRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Long value3, @Nullable String[] value4, @Nullable String[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTablespaceRecord
     */
    public PgTablespaceRecord() {
        super(PgTablespace.PG_TABLESPACE);
    }

    /**
     * Create a detached, initialised PgTablespaceRecord
     */
    @ConstructorProperties({ "oid", "spcname", "spcowner", "spcacl", "spcoptions" })
    public PgTablespaceRecord(@NotNull Long oid, @NotNull String spcname, @NotNull Long spcowner, @Nullable String[] spcacl, @Nullable String[] spcoptions) {
        super(PgTablespace.PG_TABLESPACE);

        setOid(oid);
        setSpcname(spcname);
        setSpcowner(spcowner);
        setSpcacl(spcacl);
        setSpcoptions(spcoptions);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgTablespaceRecord
     */
    public PgTablespaceRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTablespace value) {
        super(PgTablespace.PG_TABLESPACE);

        if (value != null) {
            setOid(value.getOid());
            setSpcname(value.getSpcname());
            setSpcowner(value.getSpcowner());
            setSpcacl(value.getSpcacl());
            setSpcoptions(value.getSpcoptions());
            resetChangedOnNotNull();
        }
    }
}
