/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetSubscription;

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
public class PgStatGetSubscriptionRecord extends TableRecordImpl<PgStatGetSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    public void setSubid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getSubid() {
        return (Long) get(0);
    }

    public void setRelid(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(1);
    }

    public void setPid(@Nullable Integer value) {
        set(2, value);
    }

    @Nullable
    public Integer getPid() {
        return (Integer) get(2);
    }

    public void setLeaderPid(@Nullable Integer value) {
        set(3, value);
    }

    @Nullable
    public Integer getLeaderPid() {
        return (Integer) get(3);
    }

    @Deprecated
    public void setReceivedLsn(@Nullable Object value) {
        set(4, value);
    }

    @Deprecated
    @Nullable
    public Object getReceivedLsn() {
        return get(4);
    }

    public void setLastMsgSendTime(@Nullable OffsetDateTime value) {
        set(5, value);
    }

    @Nullable
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(5);
    }

    public void setLastMsgReceiptTime(@Nullable OffsetDateTime value) {
        set(6, value);
    }

    @Nullable
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(6);
    }

    @Deprecated
    public void setLatestEndLsn(@Nullable Object value) {
        set(7, value);
    }

    @Deprecated
    @Nullable
    public Object getLatestEndLsn() {
        return get(7);
    }

    public void setLatestEndTime(@Nullable OffsetDateTime value) {
        set(8, value);
    }

    @Nullable
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatGetSubscriptionRecord() {
        super(PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION);
    }

    @ConstructorProperties({ "subid", "relid", "pid", "leaderPid", "receivedLsn", "lastMsgSendTime", "lastMsgReceiptTime", "latestEndLsn", "latestEndTime" })
    public PgStatGetSubscriptionRecord(@Nullable Long subid, @Nullable Long relid, @Nullable Integer pid, @Nullable Integer leaderPid, @Nullable Object receivedLsn, @Nullable OffsetDateTime lastMsgSendTime, @Nullable OffsetDateTime lastMsgReceiptTime, @Nullable Object latestEndLsn, @Nullable OffsetDateTime latestEndTime) {
        super(PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION);

        setSubid(subid);
        setRelid(relid);
        setPid(pid);
        setLeaderPid(leaderPid);
        setReceivedLsn(receivedLsn);
        setLastMsgSendTime(lastMsgSendTime);
        setLastMsgReceiptTime(lastMsgReceiptTime);
        setLatestEndLsn(latestEndLsn);
        setLatestEndTime(latestEndTime);
        resetChangedOnNotNull();
    }

    public PgStatGetSubscriptionRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetSubscription value) {
        super(PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION);

        if (value != null) {
            setSubid(value.getSubid());
            setRelid(value.getRelid());
            setPid(value.getPid());
            setLeaderPid(value.getLeaderPid());
            setReceivedLsn(value.getReceivedLsn());
            setLastMsgSendTime(value.getLastMsgSendTime());
            setLastMsgReceiptTime(value.getLastMsgReceiptTime());
            setLatestEndLsn(value.getLatestEndLsn());
            setLatestEndTime(value.getLatestEndTime());
            resetChangedOnNotNull();
        }
    }
}
