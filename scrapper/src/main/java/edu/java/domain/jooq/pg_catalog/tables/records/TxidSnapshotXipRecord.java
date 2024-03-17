/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.TxidSnapshotXip;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.txid_snapshot_xip</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TxidSnapshotXipRecord extends TableRecordImpl<TxidSnapshotXipRecord> implements Record1<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public void setTxidSnapshotXip(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    @Nullable
    public Long getTxidSnapshotXip() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return TxidSnapshotXip.TXID_SNAPSHOT_XIP.TXID_SNAPSHOT_XIP_;
    }

    @Override
    @Nullable
    public Long component1() {
        return getTxidSnapshotXip();
    }

    @Override
    @Nullable
    public Long value1() {
        return getTxidSnapshotXip();
    }

    @Override
    @NotNull
    public TxidSnapshotXipRecord value1(@Nullable Long value) {
        setTxidSnapshotXip(value);
        return this;
    }

    @Override
    @NotNull
    public TxidSnapshotXipRecord values(@Nullable Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord() {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);
    }

    /**
     * Create a detached, initialised TxidSnapshotXipRecord
     */
    @ConstructorProperties({ "txidSnapshotXip" })
    public TxidSnapshotXipRecord(@Nullable Long txidSnapshotXip) {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);

        setTxidSnapshotXip(txidSnapshotXip);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.TxidSnapshotXip value) {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);

        if (value != null) {
            setTxidSnapshotXip(value.getTxidSnapshotXip());
            resetChangedOnNotNull();
        }
    }
}
