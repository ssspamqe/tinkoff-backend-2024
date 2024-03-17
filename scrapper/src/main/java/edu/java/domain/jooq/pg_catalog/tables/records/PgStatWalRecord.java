/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatWal;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatWalRecord extends TableRecordImpl<PgStatWalRecord> implements Record9<Long, Long, BigDecimal, Long, Long, Long, Double, Double, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    public void setWalRecords(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getWalRecords() {
        return (Long) get(0);
    }

    public void setWalFpi(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getWalFpi() {
        return (Long) get(1);
    }

    public void setWalBytes(@Nullable BigDecimal value) {
        set(2, value);
    }

    @Nullable
    public BigDecimal getWalBytes() {
        return (BigDecimal) get(2);
    }

    public void setWalBuffersFull(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getWalBuffersFull() {
        return (Long) get(3);
    }

    public void setWalWrite(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getWalWrite() {
        return (Long) get(4);
    }

    public void setWalSync(@Nullable Long value) {
        set(5, value);
    }

    @Nullable
    public Long getWalSync() {
        return (Long) get(5);
    }

    public void setWalWriteTime(@Nullable Double value) {
        set(6, value);
    }

    @Nullable
    public Double getWalWriteTime() {
        return (Double) get(6);
    }

    public void setWalSyncTime(@Nullable Double value) {
        set(7, value);
    }

    @Nullable
    public Double getWalSyncTime() {
        return (Double) get(7);
    }

    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(8, value);
    }

    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, Long, BigDecimal, Long, Long, Long, Double, Double, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<Long, Long, BigDecimal, Long, Long, Long, Double, Double, OffsetDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgStatWal.PG_STAT_WAL.WAL_RECORDS;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgStatWal.PG_STAT_WAL.WAL_FPI;
    }

    @Override
    @NotNull
    public Field<BigDecimal> field3() {
        return PgStatWal.PG_STAT_WAL.WAL_BYTES;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatWal.PG_STAT_WAL.WAL_BUFFERS_FULL;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgStatWal.PG_STAT_WAL.WAL_WRITE;
    }

    @Override
    @NotNull
    public Field<Long> field6() {
        return PgStatWal.PG_STAT_WAL.WAL_SYNC;
    }

    @Override
    @NotNull
    public Field<Double> field7() {
        return PgStatWal.PG_STAT_WAL.WAL_WRITE_TIME;
    }

    @Override
    @NotNull
    public Field<Double> field8() {
        return PgStatWal.PG_STAT_WAL.WAL_SYNC_TIME;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field9() {
        return PgStatWal.PG_STAT_WAL.STATS_RESET;
    }

    @Override
    @Nullable
    public Long component1() {
        return getWalRecords();
    }

    @Override
    @Nullable
    public Long component2() {
        return getWalFpi();
    }

    @Override
    @Nullable
    public BigDecimal component3() {
        return getWalBytes();
    }

    @Override
    @Nullable
    public Long component4() {
        return getWalBuffersFull();
    }

    @Override
    @Nullable
    public Long component5() {
        return getWalWrite();
    }

    @Override
    @Nullable
    public Long component6() {
        return getWalSync();
    }

    @Override
    @Nullable
    public Double component7() {
        return getWalWriteTime();
    }

    @Override
    @Nullable
    public Double component8() {
        return getWalSyncTime();
    }

    @Override
    @Nullable
    public OffsetDateTime component9() {
        return getStatsReset();
    }

    @Override
    @Nullable
    public Long value1() {
        return getWalRecords();
    }

    @Override
    @Nullable
    public Long value2() {
        return getWalFpi();
    }

    @Override
    @Nullable
    public BigDecimal value3() {
        return getWalBytes();
    }

    @Override
    @Nullable
    public Long value4() {
        return getWalBuffersFull();
    }

    @Override
    @Nullable
    public Long value5() {
        return getWalWrite();
    }

    @Override
    @Nullable
    public Long value6() {
        return getWalSync();
    }

    @Override
    @Nullable
    public Double value7() {
        return getWalWriteTime();
    }

    @Override
    @Nullable
    public Double value8() {
        return getWalSyncTime();
    }

    @Override
    @Nullable
    public OffsetDateTime value9() {
        return getStatsReset();
    }

    @Override
    @NotNull
    public PgStatWalRecord value1(@Nullable Long value) {
        setWalRecords(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value2(@Nullable Long value) {
        setWalFpi(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value3(@Nullable BigDecimal value) {
        setWalBytes(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value4(@Nullable Long value) {
        setWalBuffersFull(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value5(@Nullable Long value) {
        setWalWrite(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value6(@Nullable Long value) {
        setWalSync(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value7(@Nullable Double value) {
        setWalWriteTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value8(@Nullable Double value) {
        setWalSyncTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord value9(@Nullable OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable BigDecimal value3, @Nullable Long value4, @Nullable Long value5, @Nullable Long value6, @Nullable Double value7, @Nullable Double value8, @Nullable OffsetDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatWalRecord() {
        super(PgStatWal.PG_STAT_WAL);
    }

    @ConstructorProperties({ "walRecords", "walFpi", "walBytes", "walBuffersFull", "walWrite", "walSync", "walWriteTime", "walSyncTime", "statsReset" })
    public PgStatWalRecord(@Nullable Long walRecords, @Nullable Long walFpi, @Nullable BigDecimal walBytes, @Nullable Long walBuffersFull, @Nullable Long walWrite, @Nullable Long walSync, @Nullable Double walWriteTime, @Nullable Double walSyncTime, @Nullable OffsetDateTime statsReset) {
        super(PgStatWal.PG_STAT_WAL);

        setWalRecords(walRecords);
        setWalFpi(walFpi);
        setWalBytes(walBytes);
        setWalBuffersFull(walBuffersFull);
        setWalWrite(walWrite);
        setWalSync(walSync);
        setWalWriteTime(walWriteTime);
        setWalSyncTime(walSyncTime);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    public PgStatWalRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatWal value) {
        super(PgStatWal.PG_STAT_WAL);

        if (value != null) {
            setWalRecords(value.getWalRecords());
            setWalFpi(value.getWalFpi());
            setWalBytes(value.getWalBytes());
            setWalBuffersFull(value.getWalBuffersFull());
            setWalWrite(value.getWalWrite());
            setWalSync(value.getWalSync());
            setWalWriteTime(value.getWalWriteTime());
            setWalSyncTime(value.getWalSyncTime());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}
