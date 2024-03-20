/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatGetWalSendersRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.YearToSecond;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatGetWalSenders extends TableImpl<PgStatGetWalSendersRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatGetWalSenders PG_STAT_GET_WAL_SENDERS = new PgStatGetWalSenders();

    @Override
    @NotNull
    public Class<PgStatGetWalSendersRecord> getRecordType() {
        return PgStatGetWalSendersRecord.class;
    }

    public final TableField<PgStatGetWalSendersRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatGetWalSendersRecord, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> SENT_LSN = createField(DSL.name("sent_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> WRITE_LSN = createField(DSL.name("write_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> FLUSH_LSN = createField(DSL.name("flush_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> REPLAY_LSN = createField(DSL.name("replay_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgStatGetWalSendersRecord, YearToSecond> WRITE_LAG = createField(DSL.name("write_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatGetWalSendersRecord, YearToSecond> FLUSH_LAG = createField(DSL.name("flush_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatGetWalSendersRecord, YearToSecond> REPLAY_LAG = createField(DSL.name("replay_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatGetWalSendersRecord, Integer> SYNC_PRIORITY = createField(DSL.name("sync_priority"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatGetWalSendersRecord, String> SYNC_STATE = createField(DSL.name("sync_state"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatGetWalSendersRecord, OffsetDateTime> REPLY_TIME = createField(DSL.name("reply_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgStatGetWalSenders(String alias) {
        this(DSL.name(alias), PG_STAT_GET_WAL_SENDERS);
    }

    public PgStatGetWalSenders(Name alias) {
        this(alias, PG_STAT_GET_WAL_SENDERS);
    }

    public PgStatGetWalSenders() {
        this(DSL.name("pg_stat_get_wal_senders"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatGetWalSenders as(String alias) {
        return new PgStatGetWalSenders(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetWalSenders as(Name alias) {
        return new PgStatGetWalSenders(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetWalSenders as(Table<?> alias) {
        return new PgStatGetWalSenders(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetWalSenders rename(String name) {
        return new PgStatGetWalSenders(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetWalSenders rename(Name name) {
        return new PgStatGetWalSenders(name, null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetWalSenders rename(Table<?> name) {
        return new PgStatGetWalSenders(name.getQualifiedName(), null, parameters);
    }

    public PgStatGetWalSenders call() {
        PgStatGetWalSenders result = new PgStatGetWalSenders(DSL.name("pg_stat_get_wal_senders"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}