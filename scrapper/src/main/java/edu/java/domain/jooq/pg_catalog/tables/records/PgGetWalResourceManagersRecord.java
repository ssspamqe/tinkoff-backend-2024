/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetWalResourceManagers;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_get_wal_resource_managers</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetWalResourceManagersRecord extends TableRecordImpl<PgGetWalResourceManagersRecord> implements Record3<Integer, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    public void setRmId(@Nullable Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    @Nullable
    public Integer getRmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    public void setRmName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    @Nullable
    public String getRmName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    public void setRmBuiltin(@Nullable Boolean value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    @Nullable
    public Boolean getRmBuiltin() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Integer, String, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Integer, String, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_NAME;
    }

    @Override
    @NotNull
    public Field<Boolean> field3() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_BUILTIN;
    }

    @Override
    @Nullable
    public Integer component1() {
        return getRmId();
    }

    @Override
    @Nullable
    public String component2() {
        return getRmName();
    }

    @Override
    @Nullable
    public Boolean component3() {
        return getRmBuiltin();
    }

    @Override
    @Nullable
    public Integer value1() {
        return getRmId();
    }

    @Override
    @Nullable
    public String value2() {
        return getRmName();
    }

    @Override
    @Nullable
    public Boolean value3() {
        return getRmBuiltin();
    }

    @Override
    @NotNull
    public PgGetWalResourceManagersRecord value1(@Nullable Integer value) {
        setRmId(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetWalResourceManagersRecord value2(@Nullable String value) {
        setRmName(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetWalResourceManagersRecord value3(@Nullable Boolean value) {
        setRmBuiltin(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetWalResourceManagersRecord values(@Nullable Integer value1, @Nullable String value2, @Nullable Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetWalResourceManagersRecord
     */
    public PgGetWalResourceManagersRecord() {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);
    }

    /**
     * Create a detached, initialised PgGetWalResourceManagersRecord
     */
    @ConstructorProperties({ "rmId", "rmName", "rmBuiltin" })
    public PgGetWalResourceManagersRecord(@Nullable Integer rmId, @Nullable String rmName, @Nullable Boolean rmBuiltin) {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);

        setRmId(rmId);
        setRmName(rmName);
        setRmBuiltin(rmBuiltin);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetWalResourceManagersRecord
     */
    public PgGetWalResourceManagersRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetWalResourceManagers value) {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);

        if (value != null) {
            setRmId(value.getRmId());
            setRmName(value.getRmName());
            setRmBuiltin(value.getRmBuiltin());
            resetChangedOnNotNull();
        }
    }
}
