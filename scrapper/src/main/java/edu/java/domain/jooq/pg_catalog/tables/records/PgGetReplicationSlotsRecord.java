/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetReplicationSlots;

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
public class PgGetReplicationSlotsRecord extends TableRecordImpl<PgGetReplicationSlotsRecord> {

    private static final long serialVersionUID = 1L;

    public void setSlotName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getSlotName() {
        return (String) get(0);
    }

    public void setPlugin(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getPlugin() {
        return (String) get(1);
    }

    public void setSlotType(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getSlotType() {
        return (String) get(2);
    }

    public void setDatoid(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getDatoid() {
        return (Long) get(3);
    }

    public void setTemporary(@Nullable Boolean value) {
        set(4, value);
    }

    @Nullable
    public Boolean getTemporary() {
        return (Boolean) get(4);
    }

    public void setActive(@Nullable Boolean value) {
        set(5, value);
    }

    @Nullable
    public Boolean getActive() {
        return (Boolean) get(5);
    }

    public void setActivePid(@Nullable Integer value) {
        set(6, value);
    }

    @Nullable
    public Integer getActivePid() {
        return (Integer) get(6);
    }

    public void setXmin(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getXmin() {
        return (Long) get(7);
    }

    public void setCatalogXmin(@Nullable Long value) {
        set(8, value);
    }

    @Nullable
    public Long getCatalogXmin() {
        return (Long) get(8);
    }

    @Deprecated
    public void setRestartLsn(@Nullable Object value) {
        set(9, value);
    }

    @Deprecated
    @Nullable
    public Object getRestartLsn() {
        return get(9);
    }

    @Deprecated
    public void setConfirmedFlushLsn(@Nullable Object value) {
        set(10, value);
    }

    @Deprecated
    @Nullable
    public Object getConfirmedFlushLsn() {
        return get(10);
    }

    public void setWalStatus(@Nullable String value) {
        set(11, value);
    }

    @Nullable
    public String getWalStatus() {
        return (String) get(11);
    }

    public void setSafeWalSize(@Nullable Long value) {
        set(12, value);
    }

    @Nullable
    public Long getSafeWalSize() {
        return (Long) get(12);
    }

    public void setTwoPhase(@Nullable Boolean value) {
        set(13, value);
    }

    @Nullable
    public Boolean getTwoPhase() {
        return (Boolean) get(13);
    }

    public void setConflicting(@Nullable Boolean value) {
        set(14, value);
    }

    @Nullable
    public Boolean getConflicting() {
        return (Boolean) get(14);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgGetReplicationSlotsRecord() {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);
    }

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
