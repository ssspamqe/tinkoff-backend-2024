/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgForeignServer;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * The table <code>pg_catalog.pg_foreign_server</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgForeignServerRecord extends UpdatableRecordImpl<PgForeignServerRecord> implements Record8<Long, String, Long, Long, String, String, String[], String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public void setSrvname(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSrvname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public void setSrvowner(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public void setSrvfdw(@NotNull Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvfdw() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public void setSrvtype(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    @Nullable
    public String getSrvtype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public void setSrvversion(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    @Nullable
    public String getSrvversion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public void setSrvacl(@Nullable String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    @Nullable
    public String[] getSrvacl() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public void setSrvoptions(@Nullable String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    @Nullable
    public String[] getSrvoptions() {
        return (String[]) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<Long, String, Long, Long, String, String, String[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row8<Long, String, Long, Long, String, String, String[], String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgForeignServer.PG_FOREIGN_SERVER.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVNAME;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOWNER;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVFDW;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVTYPE;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVVERSION;
    }

    @Override
    @NotNull
    public Field<String[]> field7() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVACL;
    }

    @Override
    @NotNull
    public Field<String[]> field8() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOPTIONS;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getSrvname();
    }

    @Override
    @NotNull
    public Long component3() {
        return getSrvowner();
    }

    @Override
    @NotNull
    public Long component4() {
        return getSrvfdw();
    }

    @Override
    @Nullable
    public String component5() {
        return getSrvtype();
    }

    @Override
    @Nullable
    public String component6() {
        return getSrvversion();
    }

    @Override
    @Nullable
    public String[] component7() {
        return getSrvacl();
    }

    @Override
    @Nullable
    public String[] component8() {
        return getSrvoptions();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getSrvname();
    }

    @Override
    @NotNull
    public Long value3() {
        return getSrvowner();
    }

    @Override
    @NotNull
    public Long value4() {
        return getSrvfdw();
    }

    @Override
    @Nullable
    public String value5() {
        return getSrvtype();
    }

    @Override
    @Nullable
    public String value6() {
        return getSrvversion();
    }

    @Override
    @Nullable
    public String[] value7() {
        return getSrvacl();
    }

    @Override
    @Nullable
    public String[] value8() {
        return getSrvoptions();
    }

    @Override
    @NotNull
    public PgForeignServerRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value2(@NotNull String value) {
        setSrvname(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value3(@NotNull Long value) {
        setSrvowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value4(@NotNull Long value) {
        setSrvfdw(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value5(@Nullable String value) {
        setSrvtype(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value6(@Nullable String value) {
        setSrvversion(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value7(@Nullable String[] value) {
        setSrvacl(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord value8(@Nullable String[] value) {
        setSrvoptions(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignServerRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Long value3, @NotNull Long value4, @Nullable String value5, @Nullable String value6, @Nullable String[] value7, @Nullable String[] value8) {
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
     * Create a detached PgForeignServerRecord
     */
    public PgForeignServerRecord() {
        super(PgForeignServer.PG_FOREIGN_SERVER);
    }

    /**
     * Create a detached, initialised PgForeignServerRecord
     */
    @ConstructorProperties({ "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions" })
    public PgForeignServerRecord(@NotNull Long oid, @NotNull String srvname, @NotNull Long srvowner, @NotNull Long srvfdw, @Nullable String srvtype, @Nullable String srvversion, @Nullable String[] srvacl, @Nullable String[] srvoptions) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        setOid(oid);
        setSrvname(srvname);
        setSrvowner(srvowner);
        setSrvfdw(srvfdw);
        setSrvtype(srvtype);
        setSrvversion(srvversion);
        setSrvacl(srvacl);
        setSrvoptions(srvoptions);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgForeignServerRecord
     */
    public PgForeignServerRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgForeignServer value) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        if (value != null) {
            setOid(value.getOid());
            setSrvname(value.getSrvname());
            setSrvowner(value.getSrvowner());
            setSrvfdw(value.getSrvfdw());
            setSrvtype(value.getSrvtype());
            setSrvversion(value.getSrvversion());
            setSrvacl(value.getSrvacl());
            setSrvoptions(value.getSrvoptions());
            resetChangedOnNotNull();
        }
    }
}
