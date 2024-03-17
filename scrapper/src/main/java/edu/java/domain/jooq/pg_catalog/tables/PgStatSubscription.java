/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatSubscriptionRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_stat_subscription</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatSubscription extends TableImpl<PgStatSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_subscription</code>
     */
    public static final PgStatSubscription PG_STAT_SUBSCRIPTION = new PgStatSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatSubscriptionRecord> getRecordType() {
        return PgStatSubscriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> SUBID = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    public final TableField<PgStatSubscriptionRecord, String> SUBNAME = createField(DSL.name("subname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.leader_pid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Integer> LEADER_PID = createField(DSL.name("leader_pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatSubscriptionRecord, Object> RECEIVED_LSN = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatSubscriptionRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatSubscription(Name alias, Table<PgStatSubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSubscription(Name alias, Table<PgStatSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_subscription" as  SELECT su.oid AS subid,
         su.subname,
         st.pid,
         st.leader_pid,
         st.relid,
         st.received_lsn,
         st.last_msg_send_time,
         st.last_msg_receipt_time,
         st.latest_end_lsn,
         st.latest_end_time
        FROM (pg_subscription su
          LEFT JOIN pg_stat_get_subscription(NULL::oid) st(subid, relid, pid, leader_pid, received_lsn, last_msg_send_time, last_msg_receipt_time, latest_end_lsn, latest_end_time) ON ((st.subid = su.oid)));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    public PgStatSubscription(String alias) {
        this(DSL.name(alias), PG_STAT_SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    public PgStatSubscription(Name alias) {
        this(alias, PG_STAT_SUBSCRIPTION);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_subscription</code> table reference
     */
    public PgStatSubscription() {
        this(DSL.name("pg_stat_subscription"), null);
    }

    public <O extends Record> PgStatSubscription(Table<O> child, ForeignKey<O, PgStatSubscriptionRecord> key) {
        super(child, key, PG_STAT_SUBSCRIPTION);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatSubscription as(String alias) {
        return new PgStatSubscription(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatSubscription as(Name alias) {
        return new PgStatSubscription(alias, this);
    }

    @Override
    @NotNull
    public PgStatSubscription as(Table<?> alias) {
        return new PgStatSubscription(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscription rename(String name) {
        return new PgStatSubscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscription rename(Name name) {
        return new PgStatSubscription(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscription rename(Table<?> name) {
        return new PgStatSubscription(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row10<Long, String, Integer, Integer, Long, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super String, ? super Integer, ? super Integer, ? super Long, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super String, ? super Integer, ? super Integer, ? super Long, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
