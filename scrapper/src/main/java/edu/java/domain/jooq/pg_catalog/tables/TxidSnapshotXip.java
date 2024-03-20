/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.TxidSnapshotXipRecord;

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


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TxidSnapshotXip extends TableImpl<TxidSnapshotXipRecord> {

    private static final long serialVersionUID = 1L;

    public static final TxidSnapshotXip TXID_SNAPSHOT_XIP = new TxidSnapshotXip();

    @Override
    @NotNull
    public Class<TxidSnapshotXipRecord> getRecordType() {
        return TxidSnapshotXipRecord.class;
    }

    public final TableField<TxidSnapshotXipRecord, Long> TXID_SNAPSHOT_XIP_ = createField(DSL.name("txid_snapshot_xip"), SQLDataType.BIGINT, this, "");

    private TxidSnapshotXip(Name alias, Table<TxidSnapshotXipRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"txid_snapshot\""))
        });
    }

    private TxidSnapshotXip(Name alias, Table<TxidSnapshotXipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public TxidSnapshotXip(String alias) {
        this(DSL.name(alias), TXID_SNAPSHOT_XIP);
    }

    public TxidSnapshotXip(Name alias) {
        this(alias, TXID_SNAPSHOT_XIP);
    }

    public TxidSnapshotXip() {
        this(DSL.name("txid_snapshot_xip"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public TxidSnapshotXip as(String alias) {
        return new TxidSnapshotXip(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public TxidSnapshotXip as(Name alias) {
        return new TxidSnapshotXip(alias, this, parameters);
    }

    @Override
    @NotNull
    public TxidSnapshotXip as(Table<?> alias) {
        return new TxidSnapshotXip(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public TxidSnapshotXip rename(String name) {
        return new TxidSnapshotXip(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public TxidSnapshotXip rename(Name name) {
        return new TxidSnapshotXip(name, null, parameters);
    }

    @Override
    @NotNull
    public TxidSnapshotXip rename(Table<?> name) {
        return new TxidSnapshotXip(name.getQualifiedName(), null, parameters);
    }

    public TxidSnapshotXip call(
          Object __1
    ) {
        TxidSnapshotXip result = new TxidSnapshotXip(DSL.name("txid_snapshot_xip"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"txid_snapshot\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public TxidSnapshotXip call(
          Field<Object> __1
    ) {
        TxidSnapshotXip result = new TxidSnapshotXip(DSL.name("txid_snapshot_xip"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
