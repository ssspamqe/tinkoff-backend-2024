/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLockStatus;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

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
public class PgLockStatusRecord extends TableRecordImpl<PgLockStatusRecord> {

    private static final long serialVersionUID = 1L;

    public void setLocktype(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getLocktype() {
        return (String) get(0);
    }

    public void setDatabase(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getDatabase() {
        return (Long) get(1);
    }

    public void setRelation(@Nullable Long value) {
        set(2, value);
    }

    @Nullable
    public Long getRelation() {
        return (Long) get(2);
    }

    public void setPage(@Nullable Integer value) {
        set(3, value);
    }

    @Nullable
    public Integer getPage() {
        return (Integer) get(3);
    }

    public void setTuple(@Nullable Short value) {
        set(4, value);
    }

    @Nullable
    public Short getTuple() {
        return (Short) get(4);
    }

    public void setVirtualxid(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getVirtualxid() {
        return (String) get(5);
    }

    public void setTransactionid(@Nullable Long value) {
        set(6, value);
    }

    @Nullable
    public Long getTransactionid() {
        return (Long) get(6);
    }

    public void setClassid(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getClassid() {
        return (Long) get(7);
    }

    public void setObjid(@Nullable Long value) {
        set(8, value);
    }

    @Nullable
    public Long getObjid() {
        return (Long) get(8);
    }

    public void setObjsubid(@Nullable Short value) {
        set(9, value);
    }

    @Nullable
    public Short getObjsubid() {
        return (Short) get(9);
    }

    public void setVirtualtransaction(@Nullable String value) {
        set(10, value);
    }

    @Nullable
    public String getVirtualtransaction() {
        return (String) get(10);
    }

    public void setPid(@Nullable Integer value) {
        set(11, value);
    }

    @Nullable
    public Integer getPid() {
        return (Integer) get(11);
    }

    public void setMode(@Nullable String value) {
        set(12, value);
    }

    @Nullable
    public String getMode() {
        return (String) get(12);
    }

    public void setGranted(@Nullable Boolean value) {
        set(13, value);
    }

    @Nullable
    public Boolean getGranted() {
        return (Boolean) get(13);
    }

    public void setFastpath(@Nullable Boolean value) {
        set(14, value);
    }

    @Nullable
    public Boolean getFastpath() {
        return (Boolean) get(14);
    }

    public void setWaitstart(@Nullable OffsetDateTime value) {
        set(15, value);
    }

    @Nullable
    public OffsetDateTime getWaitstart() {
        return (OffsetDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgLockStatusRecord() {
        super(PgLockStatus.PG_LOCK_STATUS);
    }

    @ConstructorProperties({ "locktype", "database", "relation", "page", "tuple", "virtualxid", "transactionid", "classid", "objid", "objsubid", "virtualtransaction", "pid", "mode", "granted", "fastpath", "waitstart" })
    public PgLockStatusRecord(@Nullable String locktype, @Nullable Long database, @Nullable Long relation, @Nullable Integer page, @Nullable Short tuple, @Nullable String virtualxid, @Nullable Long transactionid, @Nullable Long classid, @Nullable Long objid, @Nullable Short objsubid, @Nullable String virtualtransaction, @Nullable Integer pid, @Nullable String mode, @Nullable Boolean granted, @Nullable Boolean fastpath, @Nullable OffsetDateTime waitstart) {
        super(PgLockStatus.PG_LOCK_STATUS);

        setLocktype(locktype);
        setDatabase(database);
        setRelation(relation);
        setPage(page);
        setTuple(tuple);
        setVirtualxid(virtualxid);
        setTransactionid(transactionid);
        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setVirtualtransaction(virtualtransaction);
        setPid(pid);
        setMode(mode);
        setGranted(granted);
        setFastpath(fastpath);
        setWaitstart(waitstart);
        resetChangedOnNotNull();
    }

    public PgLockStatusRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLockStatus value) {
        super(PgLockStatus.PG_LOCK_STATUS);

        if (value != null) {
            setLocktype(value.getLocktype());
            setDatabase(value.getDatabase());
            setRelation(value.getRelation());
            setPage(value.getPage());
            setTuple(value.getTuple());
            setVirtualxid(value.getVirtualxid());
            setTransactionid(value.getTransactionid());
            setClassid(value.getClassid());
            setObjid(value.getObjid());
            setObjsubid(value.getObjsubid());
            setVirtualtransaction(value.getVirtualtransaction());
            setPid(value.getPid());
            setMode(value.getMode());
            setGranted(value.getGranted());
            setFastpath(value.getFastpath());
            setWaitstart(value.getWaitstart());
            resetChangedOnNotNull();
        }
    }
}
