/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatReplication;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.YearToSecond;


/**
 * The table <code>pg_catalog.pg_stat_replication</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatReplicationRecord extends TableRecordImpl<PgStatReplicationRecord> implements Record20<Integer, Long, String, String, Object, String, Integer, OffsetDateTime, Long, String, Object, Object, Object, Object, YearToSecond, YearToSecond, YearToSecond, Integer, String, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public void setPid(@Nullable Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public void setUsesysid(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    @Nullable
    public Long getUsesysid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public void setUsename(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    @Nullable
    public String getUsename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public void setApplicationName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    @Nullable
    public String getApplicationName() {
        return (String) get(3);
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
    public void setClientAddr(@Nullable Object value) {
        set(4, value);
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
    public Object getClientAddr() {
        return get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public void setClientHostname(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    @Nullable
    public String getClientHostname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public void setClientPort(@Nullable Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    @Nullable
    public Integer getClientPort() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public void setBackendStart(@Nullable OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    @Nullable
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public void setBackendXmin(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    @Nullable
    public Long getBackendXmin() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public void setState(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    @Nullable
    public String getState() {
        return (String) get(9);
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
    public void setSentLsn(@Nullable Object value) {
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
    public Object getSentLsn() {
        return get(10);
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
    public void setWriteLsn(@Nullable Object value) {
        set(11, value);
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
    public Object getWriteLsn() {
        return get(11);
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
    public void setFlushLsn(@Nullable Object value) {
        set(12, value);
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
    public Object getFlushLsn() {
        return get(12);
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
    public void setReplayLsn(@Nullable Object value) {
        set(13, value);
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
    public Object getReplayLsn() {
        return get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public void setWriteLag(@Nullable YearToSecond value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    @Nullable
    public YearToSecond getWriteLag() {
        return (YearToSecond) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public void setFlushLag(@Nullable YearToSecond value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    @Nullable
    public YearToSecond getFlushLag() {
        return (YearToSecond) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public void setReplayLag(@Nullable YearToSecond value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    @Nullable
    public YearToSecond getReplayLag() {
        return (YearToSecond) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public void setSyncPriority(@Nullable Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    @Nullable
    public Integer getSyncPriority() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public void setSyncState(@Nullable String value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    @Nullable
    public String getSyncState() {
        return (String) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public void setReplyTime(@Nullable OffsetDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    @Nullable
    public OffsetDateTime getReplyTime() {
        return (OffsetDateTime) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row20<Integer, Long, String, String, Object, String, Integer, OffsetDateTime, Long, String, Object, Object, Object, Object, YearToSecond, YearToSecond, YearToSecond, Integer, String, OffsetDateTime> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row20<Integer, Long, String, String, Object, String, Integer, OffsetDateTime, Long, String, Object, Object, Object, Object, YearToSecond, YearToSecond, YearToSecond, Integer, String, OffsetDateTime> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return PgStatReplication.PG_STAT_REPLICATION.PID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgStatReplication.PG_STAT_REPLICATION.USESYSID;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatReplication.PG_STAT_REPLICATION.USENAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgStatReplication.PG_STAT_REPLICATION.APPLICATION_NAME;
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
    public Field<Object> field5() {
        return PgStatReplication.PG_STAT_REPLICATION.CLIENT_ADDR;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgStatReplication.PG_STAT_REPLICATION.CLIENT_HOSTNAME;
    }

    @Override
    @NotNull
    public Field<Integer> field7() {
        return PgStatReplication.PG_STAT_REPLICATION.CLIENT_PORT;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field8() {
        return PgStatReplication.PG_STAT_REPLICATION.BACKEND_START;
    }

    @Override
    @NotNull
    public Field<Long> field9() {
        return PgStatReplication.PG_STAT_REPLICATION.BACKEND_XMIN;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return PgStatReplication.PG_STAT_REPLICATION.STATE;
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
        return PgStatReplication.PG_STAT_REPLICATION.SENT_LSN;
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
    public Field<Object> field12() {
        return PgStatReplication.PG_STAT_REPLICATION.WRITE_LSN;
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
    public Field<Object> field13() {
        return PgStatReplication.PG_STAT_REPLICATION.FLUSH_LSN;
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
    public Field<Object> field14() {
        return PgStatReplication.PG_STAT_REPLICATION.REPLAY_LSN;
    }

    @Override
    @NotNull
    public Field<YearToSecond> field15() {
        return PgStatReplication.PG_STAT_REPLICATION.WRITE_LAG;
    }

    @Override
    @NotNull
    public Field<YearToSecond> field16() {
        return PgStatReplication.PG_STAT_REPLICATION.FLUSH_LAG;
    }

    @Override
    @NotNull
    public Field<YearToSecond> field17() {
        return PgStatReplication.PG_STAT_REPLICATION.REPLAY_LAG;
    }

    @Override
    @NotNull
    public Field<Integer> field18() {
        return PgStatReplication.PG_STAT_REPLICATION.SYNC_PRIORITY;
    }

    @Override
    @NotNull
    public Field<String> field19() {
        return PgStatReplication.PG_STAT_REPLICATION.SYNC_STATE;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field20() {
        return PgStatReplication.PG_STAT_REPLICATION.REPLY_TIME;
    }

    @Override
    @Nullable
    public Integer component1() {
        return getPid();
    }

    @Override
    @Nullable
    public Long component2() {
        return getUsesysid();
    }

    @Override
    @Nullable
    public String component3() {
        return getUsename();
    }

    @Override
    @Nullable
    public String component4() {
        return getApplicationName();
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
    public Object component5() {
        return getClientAddr();
    }

    @Override
    @Nullable
    public String component6() {
        return getClientHostname();
    }

    @Override
    @Nullable
    public Integer component7() {
        return getClientPort();
    }

    @Override
    @Nullable
    public OffsetDateTime component8() {
        return getBackendStart();
    }

    @Override
    @Nullable
    public Long component9() {
        return getBackendXmin();
    }

    @Override
    @Nullable
    public String component10() {
        return getState();
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
        return getSentLsn();
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
    public Object component12() {
        return getWriteLsn();
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
    public Object component13() {
        return getFlushLsn();
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
    public Object component14() {
        return getReplayLsn();
    }

    @Override
    @Nullable
    public YearToSecond component15() {
        return getWriteLag();
    }

    @Override
    @Nullable
    public YearToSecond component16() {
        return getFlushLag();
    }

    @Override
    @Nullable
    public YearToSecond component17() {
        return getReplayLag();
    }

    @Override
    @Nullable
    public Integer component18() {
        return getSyncPriority();
    }

    @Override
    @Nullable
    public String component19() {
        return getSyncState();
    }

    @Override
    @Nullable
    public OffsetDateTime component20() {
        return getReplyTime();
    }

    @Override
    @Nullable
    public Integer value1() {
        return getPid();
    }

    @Override
    @Nullable
    public Long value2() {
        return getUsesysid();
    }

    @Override
    @Nullable
    public String value3() {
        return getUsename();
    }

    @Override
    @Nullable
    public String value4() {
        return getApplicationName();
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
    public Object value5() {
        return getClientAddr();
    }

    @Override
    @Nullable
    public String value6() {
        return getClientHostname();
    }

    @Override
    @Nullable
    public Integer value7() {
        return getClientPort();
    }

    @Override
    @Nullable
    public OffsetDateTime value8() {
        return getBackendStart();
    }

    @Override
    @Nullable
    public Long value9() {
        return getBackendXmin();
    }

    @Override
    @Nullable
    public String value10() {
        return getState();
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
        return getSentLsn();
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
    public Object value12() {
        return getWriteLsn();
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
    public Object value13() {
        return getFlushLsn();
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
    public Object value14() {
        return getReplayLsn();
    }

    @Override
    @Nullable
    public YearToSecond value15() {
        return getWriteLag();
    }

    @Override
    @Nullable
    public YearToSecond value16() {
        return getFlushLag();
    }

    @Override
    @Nullable
    public YearToSecond value17() {
        return getReplayLag();
    }

    @Override
    @Nullable
    public Integer value18() {
        return getSyncPriority();
    }

    @Override
    @Nullable
    public String value19() {
        return getSyncState();
    }

    @Override
    @Nullable
    public OffsetDateTime value20() {
        return getReplyTime();
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value1(@Nullable Integer value) {
        setPid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value2(@Nullable Long value) {
        setUsesysid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value3(@Nullable String value) {
        setUsename(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value4(@Nullable String value) {
        setApplicationName(value);
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
    public PgStatReplicationRecord value5(@Nullable Object value) {
        setClientAddr(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value6(@Nullable String value) {
        setClientHostname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value7(@Nullable Integer value) {
        setClientPort(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value8(@Nullable OffsetDateTime value) {
        setBackendStart(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value9(@Nullable Long value) {
        setBackendXmin(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value10(@Nullable String value) {
        setState(value);
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
    public PgStatReplicationRecord value11(@Nullable Object value) {
        setSentLsn(value);
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
    public PgStatReplicationRecord value12(@Nullable Object value) {
        setWriteLsn(value);
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
    public PgStatReplicationRecord value13(@Nullable Object value) {
        setFlushLsn(value);
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
    public PgStatReplicationRecord value14(@Nullable Object value) {
        setReplayLsn(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value15(@Nullable YearToSecond value) {
        setWriteLag(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value16(@Nullable YearToSecond value) {
        setFlushLag(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value17(@Nullable YearToSecond value) {
        setReplayLag(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value18(@Nullable Integer value) {
        setSyncPriority(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value19(@Nullable String value) {
        setSyncState(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord value20(@Nullable OffsetDateTime value) {
        setReplyTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatReplicationRecord values(@Nullable Integer value1, @Nullable Long value2, @Nullable String value3, @Nullable String value4, @Nullable Object value5, @Nullable String value6, @Nullable Integer value7, @Nullable OffsetDateTime value8, @Nullable Long value9, @Nullable String value10, @Nullable Object value11, @Nullable Object value12, @Nullable Object value13, @Nullable Object value14, @Nullable YearToSecond value15, @Nullable YearToSecond value16, @Nullable YearToSecond value17, @Nullable Integer value18, @Nullable String value19, @Nullable OffsetDateTime value20) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatReplicationRecord
     */
    public PgStatReplicationRecord() {
        super(PgStatReplication.PG_STAT_REPLICATION);
    }

    /**
     * Create a detached, initialised PgStatReplicationRecord
     */
    @ConstructorProperties({ "pid", "usesysid", "usename", "applicationName", "clientAddr", "clientHostname", "clientPort", "backendStart", "backendXmin", "state", "sentLsn", "writeLsn", "flushLsn", "replayLsn", "writeLag", "flushLag", "replayLag", "syncPriority", "syncState", "replyTime" })
    public PgStatReplicationRecord(@Nullable Integer pid, @Nullable Long usesysid, @Nullable String usename, @Nullable String applicationName, @Nullable Object clientAddr, @Nullable String clientHostname, @Nullable Integer clientPort, @Nullable OffsetDateTime backendStart, @Nullable Long backendXmin, @Nullable String state, @Nullable Object sentLsn, @Nullable Object writeLsn, @Nullable Object flushLsn, @Nullable Object replayLsn, @Nullable YearToSecond writeLag, @Nullable YearToSecond flushLag, @Nullable YearToSecond replayLag, @Nullable Integer syncPriority, @Nullable String syncState, @Nullable OffsetDateTime replyTime) {
        super(PgStatReplication.PG_STAT_REPLICATION);

        setPid(pid);
        setUsesysid(usesysid);
        setUsename(usename);
        setApplicationName(applicationName);
        setClientAddr(clientAddr);
        setClientHostname(clientHostname);
        setClientPort(clientPort);
        setBackendStart(backendStart);
        setBackendXmin(backendXmin);
        setState(state);
        setSentLsn(sentLsn);
        setWriteLsn(writeLsn);
        setFlushLsn(flushLsn);
        setReplayLsn(replayLsn);
        setWriteLag(writeLag);
        setFlushLag(flushLag);
        setReplayLag(replayLag);
        setSyncPriority(syncPriority);
        setSyncState(syncState);
        setReplyTime(replyTime);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatReplicationRecord
     */
    public PgStatReplicationRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatReplication value) {
        super(PgStatReplication.PG_STAT_REPLICATION);

        if (value != null) {
            setPid(value.getPid());
            setUsesysid(value.getUsesysid());
            setUsename(value.getUsename());
            setApplicationName(value.getApplicationName());
            setClientAddr(value.getClientAddr());
            setClientHostname(value.getClientHostname());
            setClientPort(value.getClientPort());
            setBackendStart(value.getBackendStart());
            setBackendXmin(value.getBackendXmin());
            setState(value.getState());
            setSentLsn(value.getSentLsn());
            setWriteLsn(value.getWriteLsn());
            setFlushLsn(value.getFlushLsn());
            setReplayLsn(value.getReplayLsn());
            setWriteLag(value.getWriteLag());
            setFlushLag(value.getFlushLag());
            setReplayLag(value.getReplayLag());
            setSyncPriority(value.getSyncPriority());
            setSyncState(value.getSyncState());
            setReplyTime(value.getReplyTime());
            resetChangedOnNotNull();
        }
    }
}
