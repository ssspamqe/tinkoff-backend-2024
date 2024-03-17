/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetReplicationSlots;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_get_replication_slots</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetReplicationSlotsRecord extends TableRecordImpl<PgGetReplicationSlotsRecord> implements Record15<String, String, String, Long, Boolean, Boolean, Integer, Long, Long, Object, Object, String, Long, Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public void setSlotName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    @Nullable
    public String getSlotName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public void setPlugin(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    @Nullable
    public String getPlugin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public void setSlotType(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    @Nullable
    public String getSlotType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public void setDatoid(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    @Nullable
    public Long getDatoid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public void setTemporary(@Nullable Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    @Nullable
    public Boolean getTemporary() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public void setActive(@Nullable Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    @Nullable
    public Boolean getActive() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public void setActivePid(@Nullable Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    @Nullable
    public Integer getActivePid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public void setXmin(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    @Nullable
    public Long getXmin() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public void setCatalogXmin(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    @Nullable
    public Long getCatalogXmin() {
        return (Long) get(8);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setRestartLsn(@Nullable Object value) {
        set(9, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getRestartLsn() {
        return get(9);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setConfirmedFlushLsn(@Nullable Object value) {
        set(10, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getConfirmedFlushLsn() {
        return get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    public void setWalStatus(@Nullable String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    @Nullable
    public String getWalStatus() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    public void setSafeWalSize(@Nullable Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    @Nullable
    public Long getSafeWalSize() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    public void setTwoPhase(@Nullable Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    @Nullable
    public Boolean getTwoPhase() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    public void setConflicting(@Nullable Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    @Nullable
    public Boolean getConflicting() {
        return (Boolean) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row15<String, String, String, Long, Boolean, Boolean, Integer, Long, Long, Object, Object, String, Long, Boolean, Boolean> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row15<String, String, String, Long, Boolean, Boolean, Integer, Long, Long, Object, Object, String, Long, Boolean, Boolean> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.SLOT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.PLUGIN;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.SLOT_TYPE;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.DATOID;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.TEMPORARY;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.ACTIVE;
    }

    @Override
    @NotNull
    public Field<Integer> field7() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.ACTIVE_PID;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.XMIN;
    }

    @Override
    @NotNull
    public Field<Long> field9() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.CATALOG_XMIN;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field10() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.RESTART_LSN;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field11() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.CONFIRMED_FLUSH_LSN;
    }

    @Override
    @NotNull
    public Field<String> field12() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.WAL_STATUS;
    }

    @Override
    @NotNull
    public Field<Long> field13() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.SAFE_WAL_SIZE;
    }

    @Override
    @NotNull
    public Field<Boolean> field14() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.TWO_PHASE;
    }

    @Override
    @NotNull
    public Field<Boolean> field15() {
        return PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS.CONFLICTING;
    }

    @Override
    @Nullable
    public String component1() {
        return getSlotName();
    }

    @Override
    @Nullable
    public String component2() {
        return getPlugin();
    }

    @Override
    @Nullable
    public String component3() {
        return getSlotType();
    }

    @Override
    @Nullable
    public Long component4() {
        return getDatoid();
    }

    @Override
    @Nullable
    public Boolean component5() {
        return getTemporary();
    }

    @Override
    @Nullable
    public Boolean component6() {
        return getActive();
    }

    @Override
    @Nullable
    public Integer component7() {
        return getActivePid();
    }

    @Override
    @Nullable
    public Long component8() {
        return getXmin();
    }

    @Override
    @Nullable
    public Long component9() {
        return getCatalogXmin();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component10() {
        return getRestartLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component11() {
        return getConfirmedFlushLsn();
    }

    @Override
    @Nullable
    public String component12() {
        return getWalStatus();
    }

    @Override
    @Nullable
    public Long component13() {
        return getSafeWalSize();
    }

    @Override
    @Nullable
    public Boolean component14() {
        return getTwoPhase();
    }

    @Override
    @Nullable
    public Boolean component15() {
        return getConflicting();
    }

    @Override
    @Nullable
    public String value1() {
        return getSlotName();
    }

    @Override
    @Nullable
    public String value2() {
        return getPlugin();
    }

    @Override
    @Nullable
    public String value3() {
        return getSlotType();
    }

    @Override
    @Nullable
    public Long value4() {
        return getDatoid();
    }

    @Override
    @Nullable
    public Boolean value5() {
        return getTemporary();
    }

    @Override
    @Nullable
    public Boolean value6() {
        return getActive();
    }

    @Override
    @Nullable
    public Integer value7() {
        return getActivePid();
    }

    @Override
    @Nullable
    public Long value8() {
        return getXmin();
    }

    @Override
    @Nullable
    public Long value9() {
        return getCatalogXmin();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value10() {
        return getRestartLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value11() {
        return getConfirmedFlushLsn();
    }

    @Override
    @Nullable
    public String value12() {
        return getWalStatus();
    }

    @Override
    @Nullable
    public Long value13() {
        return getSafeWalSize();
    }

    @Override
    @Nullable
    public Boolean value14() {
        return getTwoPhase();
    }

    @Override
    @Nullable
    public Boolean value15() {
        return getConflicting();
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value1(@Nullable String value) {
        setSlotName(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value2(@Nullable String value) {
        setPlugin(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value3(@Nullable String value) {
        setSlotType(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value4(@Nullable Long value) {
        setDatoid(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value5(@Nullable Boolean value) {
        setTemporary(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value6(@Nullable Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value7(@Nullable Integer value) {
        setActivePid(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value8(@Nullable Long value) {
        setXmin(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value9(@Nullable Long value) {
        setCatalogXmin(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value10(@Nullable Object value) {
        setRestartLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value11(@Nullable Object value) {
        setConfirmedFlushLsn(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value12(@Nullable String value) {
        setWalStatus(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value13(@Nullable Long value) {
        setSafeWalSize(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value14(@Nullable Boolean value) {
        setTwoPhase(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord value15(@Nullable Boolean value) {
        setConflicting(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetReplicationSlotsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable Long value4, @Nullable Boolean value5, @Nullable Boolean value6, @Nullable Integer value7, @Nullable Long value8, @Nullable Long value9, @Nullable Object value10, @Nullable Object value11, @Nullable String value12, @Nullable Long value13, @Nullable Boolean value14, @Nullable Boolean value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetReplicationSlotsRecord
     */
    public PgGetReplicationSlotsRecord() {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);
    }

    /**
     * Create a detached, initialised PgGetReplicationSlotsRecord
     */
    @ConstructorProperties({ "slotName", "plugin", "slotType", "datoid", "temporary", "active", "activePid", "xmin", "catalogXmin", "restartLsn", "confirmedFlushLsn", "walStatus", "safeWalSize", "twoPhase", "conflicting" })
    public PgGetReplicationSlotsRecord(@Nullable String slotName, @Nullable String plugin, @Nullable String slotType, @Nullable Long datoid, @Nullable Boolean temporary, @Nullable Boolean active, @Nullable Integer activePid, @Nullable Long xmin, @Nullable Long catalogXmin, @Nullable Object restartLsn, @Nullable Object confirmedFlushLsn, @Nullable String walStatus, @Nullable Long safeWalSize, @Nullable Boolean twoPhase, @Nullable Boolean conflicting) {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);

        setSlotName(slotName);
        setPlugin(plugin);
        setSlotType(slotType);
        setDatoid(datoid);
        setTemporary(temporary);
        setActive(active);
        setActivePid(activePid);
        setXmin(xmin);
        setCatalogXmin(catalogXmin);
        setRestartLsn(restartLsn);
        setConfirmedFlushLsn(confirmedFlushLsn);
        setWalStatus(walStatus);
        setSafeWalSize(safeWalSize);
        setTwoPhase(twoPhase);
        setConflicting(conflicting);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetReplicationSlotsRecord
     */
    public PgGetReplicationSlotsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetReplicationSlots value) {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);

        if (value != null) {
            setSlotName(value.getSlotName());
            setPlugin(value.getPlugin());
            setSlotType(value.getSlotType());
            setDatoid(value.getDatoid());
            setTemporary(value.getTemporary());
            setActive(value.getActive());
            setActivePid(value.getActivePid());
            setXmin(value.getXmin());
            setCatalogXmin(value.getCatalogXmin());
            setRestartLsn(value.getRestartLsn());
            setConfirmedFlushLsn(value.getConfirmedFlushLsn());
            setWalStatus(value.getWalStatus());
            setSafeWalSize(value.getSafeWalSize());
            setTwoPhase(value.getTwoPhase());
            setConflicting(value.getConflicting());
            resetChangedOnNotNull();
        }
    }
}
