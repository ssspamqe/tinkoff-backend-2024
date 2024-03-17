/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgForeignDataWrapper;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * The table <code>pg_catalog.pg_foreign_data_wrapper</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgForeignDataWrapperRecord extends UpdatableRecordImpl<PgForeignDataWrapperRecord> implements Record7<Long, String, Long, Long, Long, String[], String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public void setFdwname(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getFdwname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public void setFdwowner(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getFdwowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public void setFdwhandler(@NotNull Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getFdwhandler() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public void setFdwvalidator(@NotNull Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getFdwvalidator() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public void setFdwacl(@Nullable String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    @Nullable
    public String[] getFdwacl() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public void setFdwoptions(@Nullable String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    @Nullable
    public String[] getFdwoptions() {
        return (String[]) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, String, Long, Long, Long, String[], String[]> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<Long, String, Long, Long, Long, String[], String[]> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWNAME;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWOWNER;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWHANDLER;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWVALIDATOR;
    }

    @Override
    @NotNull
    public Field<String[]> field6() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWACL;
    }

    @Override
    @NotNull
    public Field<String[]> field7() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWOPTIONS;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getFdwname();
    }

    @Override
    @NotNull
    public Long component3() {
        return getFdwowner();
    }

    @Override
    @NotNull
    public Long component4() {
        return getFdwhandler();
    }

    @Override
    @NotNull
    public Long component5() {
        return getFdwvalidator();
    }

    @Override
    @Nullable
    public String[] component6() {
        return getFdwacl();
    }

    @Override
    @Nullable
    public String[] component7() {
        return getFdwoptions();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getFdwname();
    }

    @Override
    @NotNull
    public Long value3() {
        return getFdwowner();
    }

    @Override
    @NotNull
    public Long value4() {
        return getFdwhandler();
    }

    @Override
    @NotNull
    public Long value5() {
        return getFdwvalidator();
    }

    @Override
    @Nullable
    public String[] value6() {
        return getFdwacl();
    }

    @Override
    @Nullable
    public String[] value7() {
        return getFdwoptions();
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value2(@NotNull String value) {
        setFdwname(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value3(@NotNull Long value) {
        setFdwowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value4(@NotNull Long value) {
        setFdwhandler(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value5(@NotNull Long value) {
        setFdwvalidator(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value6(@Nullable String[] value) {
        setFdwacl(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord value7(@Nullable String[] value) {
        setFdwoptions(value);
        return this;
    }

    @Override
    @NotNull
    public PgForeignDataWrapperRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Long value3, @NotNull Long value4, @NotNull Long value5, @Nullable String[] value6, @Nullable String[] value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord() {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create a detached, initialised PgForeignDataWrapperRecord
     */
    @ConstructorProperties({ "oid", "fdwname", "fdwowner", "fdwhandler", "fdwvalidator", "fdwacl", "fdwoptions" })
    public PgForeignDataWrapperRecord(@NotNull Long oid, @NotNull String fdwname, @NotNull Long fdwowner, @NotNull Long fdwhandler, @NotNull Long fdwvalidator, @Nullable String[] fdwacl, @Nullable String[] fdwoptions) {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);

        setOid(oid);
        setFdwname(fdwname);
        setFdwowner(fdwowner);
        setFdwhandler(fdwhandler);
        setFdwvalidator(fdwvalidator);
        setFdwacl(fdwacl);
        setFdwoptions(fdwoptions);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgForeignDataWrapper value) {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);

        if (value != null) {
            setOid(value.getOid());
            setFdwname(value.getFdwname());
            setFdwowner(value.getFdwowner());
            setFdwhandler(value.getFdwhandler());
            setFdwvalidator(value.getFdwvalidator());
            setFdwacl(value.getFdwacl());
            setFdwoptions(value.getFdwoptions());
            resetChangedOnNotNull();
        }
    }
}
