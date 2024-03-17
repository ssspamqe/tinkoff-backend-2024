/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLocks;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_locks</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLocksRecord extends TableRecordImpl<PgLocksRecord> implements Record16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_locks.locktype</code>.
     */
    public void setLocktype(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.locktype</code>.
     */
    @Nullable
    public String getLocktype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.database</code>.
     */
    public void setDatabase(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.database</code>.
     */
    @Nullable
    public Long getDatabase() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.relation</code>.
     */
    public void setRelation(@Nullable Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.relation</code>.
     */
    @Nullable
    public Long getRelation() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.page</code>.
     */
    public void setPage(@Nullable Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.page</code>.
     */
    @Nullable
    public Integer getPage() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.tuple</code>.
     */
    public void setTuple(@Nullable Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.tuple</code>.
     */
    @Nullable
    public Short getTuple() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    public void setVirtualxid(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    @Nullable
    public String getVirtualxid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.transactionid</code>.
     */
    public void setTransactionid(@Nullable Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.transactionid</code>.
     */
    @Nullable
    public Long getTransactionid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.classid</code>.
     */
    public void setClassid(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.classid</code>.
     */
    @Nullable
    public Long getClassid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.objid</code>.
     */
    public void setObjid(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.objid</code>.
     */
    @Nullable
    public Long getObjid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.objsubid</code>.
     */
    public void setObjsubid(@Nullable Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.objsubid</code>.
     */
    @Nullable
    public Short getObjsubid() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    public void setVirtualtransaction(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    @Nullable
    public String getVirtualtransaction() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.pid</code>.
     */
    public void setPid(@Nullable Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.mode</code>.
     */
    public void setMode(@Nullable String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.mode</code>.
     */
    @Nullable
    public String getMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.granted</code>.
     */
    public void setGranted(@Nullable Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.granted</code>.
     */
    @Nullable
    public Boolean getGranted() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.fastpath</code>.
     */
    public void setFastpath(@Nullable Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.fastpath</code>.
     */
    @Nullable
    public Boolean getFastpath() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.waitstart</code>.
     */
    public void setWaitstart(@Nullable OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.waitstart</code>.
     */
    @Nullable
    public OffsetDateTime getWaitstart() {
        return (OffsetDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgLocks.PG_LOCKS.LOCKTYPE;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgLocks.PG_LOCKS.DATABASE;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgLocks.PG_LOCKS.RELATION;
    }

    @Override
    @NotNull
    public Field<Integer> field4() {
        return PgLocks.PG_LOCKS.PAGE;
    }

    @Override
    @NotNull
    public Field<Short> field5() {
        return PgLocks.PG_LOCKS.TUPLE;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgLocks.PG_LOCKS.VIRTUALXID;
    }

    @Override
    @NotNull
    public Field<Long> field7() {
        return PgLocks.PG_LOCKS.TRANSACTIONID;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgLocks.PG_LOCKS.CLASSID;
    }

    @Override
    @NotNull
    public Field<Long> field9() {
        return PgLocks.PG_LOCKS.OBJID;
    }

    @Override
    @NotNull
    public Field<Short> field10() {
        return PgLocks.PG_LOCKS.OBJSUBID;
    }

    @Override
    @NotNull
    public Field<String> field11() {
        return PgLocks.PG_LOCKS.VIRTUALTRANSACTION;
    }

    @Override
    @NotNull
    public Field<Integer> field12() {
        return PgLocks.PG_LOCKS.PID;
    }

    @Override
    @NotNull
    public Field<String> field13() {
        return PgLocks.PG_LOCKS.MODE;
    }

    @Override
    @NotNull
    public Field<Boolean> field14() {
        return PgLocks.PG_LOCKS.GRANTED;
    }

    @Override
    @NotNull
    public Field<Boolean> field15() {
        return PgLocks.PG_LOCKS.FASTPATH;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field16() {
        return PgLocks.PG_LOCKS.WAITSTART;
    }

    @Override
    @Nullable
    public String component1() {
        return getLocktype();
    }

    @Override
    @Nullable
    public Long component2() {
        return getDatabase();
    }

    @Override
    @Nullable
    public Long component3() {
        return getRelation();
    }

    @Override
    @Nullable
    public Integer component4() {
        return getPage();
    }

    @Override
    @Nullable
    public Short component5() {
        return getTuple();
    }

    @Override
    @Nullable
    public String component6() {
        return getVirtualxid();
    }

    @Override
    @Nullable
    public Long component7() {
        return getTransactionid();
    }

    @Override
    @Nullable
    public Long component8() {
        return getClassid();
    }

    @Override
    @Nullable
    public Long component9() {
        return getObjid();
    }

    @Override
    @Nullable
    public Short component10() {
        return getObjsubid();
    }

    @Override
    @Nullable
    public String component11() {
        return getVirtualtransaction();
    }

    @Override
    @Nullable
    public Integer component12() {
        return getPid();
    }

    @Override
    @Nullable
    public String component13() {
        return getMode();
    }

    @Override
    @Nullable
    public Boolean component14() {
        return getGranted();
    }

    @Override
    @Nullable
    public Boolean component15() {
        return getFastpath();
    }

    @Override
    @Nullable
    public OffsetDateTime component16() {
        return getWaitstart();
    }

    @Override
    @Nullable
    public String value1() {
        return getLocktype();
    }

    @Override
    @Nullable
    public Long value2() {
        return getDatabase();
    }

    @Override
    @Nullable
    public Long value3() {
        return getRelation();
    }

    @Override
    @Nullable
    public Integer value4() {
        return getPage();
    }

    @Override
    @Nullable
    public Short value5() {
        return getTuple();
    }

    @Override
    @Nullable
    public String value6() {
        return getVirtualxid();
    }

    @Override
    @Nullable
    public Long value7() {
        return getTransactionid();
    }

    @Override
    @Nullable
    public Long value8() {
        return getClassid();
    }

    @Override
    @Nullable
    public Long value9() {
        return getObjid();
    }

    @Override
    @Nullable
    public Short value10() {
        return getObjsubid();
    }

    @Override
    @Nullable
    public String value11() {
        return getVirtualtransaction();
    }

    @Override
    @Nullable
    public Integer value12() {
        return getPid();
    }

    @Override
    @Nullable
    public String value13() {
        return getMode();
    }

    @Override
    @Nullable
    public Boolean value14() {
        return getGranted();
    }

    @Override
    @Nullable
    public Boolean value15() {
        return getFastpath();
    }

    @Override
    @Nullable
    public OffsetDateTime value16() {
        return getWaitstart();
    }

    @Override
    @NotNull
    public PgLocksRecord value1(@Nullable String value) {
        setLocktype(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value2(@Nullable Long value) {
        setDatabase(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value3(@Nullable Long value) {
        setRelation(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value4(@Nullable Integer value) {
        setPage(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value5(@Nullable Short value) {
        setTuple(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value6(@Nullable String value) {
        setVirtualxid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value7(@Nullable Long value) {
        setTransactionid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value8(@Nullable Long value) {
        setClassid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value9(@Nullable Long value) {
        setObjid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value10(@Nullable Short value) {
        setObjsubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value11(@Nullable String value) {
        setVirtualtransaction(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value12(@Nullable Integer value) {
        setPid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value13(@Nullable String value) {
        setMode(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value14(@Nullable Boolean value) {
        setGranted(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value15(@Nullable Boolean value) {
        setFastpath(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord value16(@Nullable OffsetDateTime value) {
        setWaitstart(value);
        return this;
    }

    @Override
    @NotNull
    public PgLocksRecord values(@Nullable String value1, @Nullable Long value2, @Nullable Long value3, @Nullable Integer value4, @Nullable Short value5, @Nullable String value6, @Nullable Long value7, @Nullable Long value8, @Nullable Long value9, @Nullable Short value10, @Nullable String value11, @Nullable Integer value12, @Nullable String value13, @Nullable Boolean value14, @Nullable Boolean value15, @Nullable OffsetDateTime value16) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLocksRecord
     */
    public PgLocksRecord() {
        super(PgLocks.PG_LOCKS);
    }

    /**
     * Create a detached, initialised PgLocksRecord
     */
    @ConstructorProperties({ "locktype", "database", "relation", "page", "tuple", "virtualxid", "transactionid", "classid", "objid", "objsubid", "virtualtransaction", "pid", "mode", "granted", "fastpath", "waitstart" })
    public PgLocksRecord(@Nullable String locktype, @Nullable Long database, @Nullable Long relation, @Nullable Integer page, @Nullable Short tuple, @Nullable String virtualxid, @Nullable Long transactionid, @Nullable Long classid, @Nullable Long objid, @Nullable Short objsubid, @Nullable String virtualtransaction, @Nullable Integer pid, @Nullable String mode, @Nullable Boolean granted, @Nullable Boolean fastpath, @Nullable OffsetDateTime waitstart) {
        super(PgLocks.PG_LOCKS);

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

    /**
     * Create a detached, initialised PgLocksRecord
     */
    public PgLocksRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLocks value) {
        super(PgLocks.PG_LOCKS);

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
