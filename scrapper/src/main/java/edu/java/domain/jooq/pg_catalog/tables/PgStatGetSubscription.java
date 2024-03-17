/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatGetSubscriptionRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatGetSubscription extends TableImpl<PgStatGetSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatGetSubscription PG_STAT_GET_SUBSCRIPTION = new PgStatGetSubscription();

    @Override
    @NotNull
    public Class<PgStatGetSubscriptionRecord> getRecordType() {
        return PgStatGetSubscriptionRecord.class;
    }

    public final TableField<PgStatGetSubscriptionRecord, Long> SUBID = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSubscriptionRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSubscriptionRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatGetSubscriptionRecord, Integer> LEADER_PID = createField(DSL.name("leader_pid"), SQLDataType.INTEGER, this, "");

    @Deprecated
    public final TableField<PgStatGetSubscriptionRecord, Object> RECEIVED_LSN = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    @Deprecated
    public final TableField<PgStatGetSubscriptionRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetSubscription(Name alias, Table<PgStatGetSubscriptionRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgStatGetSubscription(Name alias, Table<PgStatGetSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgStatGetSubscription(String alias) {
        this(DSL.name(alias), PG_STAT_GET_SUBSCRIPTION);
    }

    public PgStatGetSubscription(Name alias) {
        this(alias, PG_STAT_GET_SUBSCRIPTION);
    }

    public PgStatGetSubscription() {
        this(DSL.name("pg_stat_get_subscription"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatGetSubscription as(String alias) {
        return new PgStatGetSubscription(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSubscription as(Name alias) {
        return new PgStatGetSubscription(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSubscription as(Table<?> alias) {
        return new PgStatGetSubscription(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSubscription rename(String name) {
        return new PgStatGetSubscription(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSubscription rename(Name name) {
        return new PgStatGetSubscription(name, null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSubscription rename(Table<?> name) {
        return new PgStatGetSubscription(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, Long, Integer, Integer, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public PgStatGetSubscription call(
          Long subid
    ) {
        PgStatGetSubscription result = new PgStatGetSubscription(DSL.name("pg_stat_get_subscription"), null, new Field[] {
            DSL.val(subid, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgStatGetSubscription call(
          Field<Long> subid
    ) {
        PgStatGetSubscription result = new PgStatGetSubscription(DSL.name("pg_stat_get_subscription"), null, new Field[] {
            subid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super Integer, ? super Integer, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super Integer, ? super Integer, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
