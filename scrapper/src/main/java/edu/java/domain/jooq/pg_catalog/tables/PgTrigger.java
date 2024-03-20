/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTriggerRecord;

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
public class PgTrigger extends TableImpl<PgTriggerRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTrigger PG_TRIGGER = new PgTrigger();

    @Override
    @NotNull
    public Class<PgTriggerRecord> getRecordType() {
        return PgTriggerRecord.class;
    }

    public final TableField<PgTriggerRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGRELID = createField(DSL.name("tgrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGPARENTID = createField(DSL.name("tgparentid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, String> TGNAME = createField(DSL.name("tgname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGFOID = createField(DSL.name("tgfoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Short> TGTYPE = createField(DSL.name("tgtype"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, String> TGENABLED = createField(DSL.name("tgenabled"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Boolean> TGISINTERNAL = createField(DSL.name("tgisinternal"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGCONSTRRELID = createField(DSL.name("tgconstrrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGCONSTRINDID = createField(DSL.name("tgconstrindid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Long> TGCONSTRAINT = createField(DSL.name("tgconstraint"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Boolean> TGDEFERRABLE = createField(DSL.name("tgdeferrable"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Boolean> TGINITDEFERRED = createField(DSL.name("tginitdeferred"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Short> TGNARGS = createField(DSL.name("tgnargs"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgTriggerRecord, Object[]> TGATTR = createField(DSL.name("tgattr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "");

    public final TableField<PgTriggerRecord, byte[]> TGARGS = createField(DSL.name("tgargs"), SQLDataType.BLOB.nullable(false), this, "");

    @Deprecated
    public final TableField<PgTriggerRecord, Object> TGQUAL = createField(DSL.name("tgqual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    public final TableField<PgTriggerRecord, String> TGOLDTABLE = createField(DSL.name("tgoldtable"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgTriggerRecord, String> TGNEWTABLE = createField(DSL.name("tgnewtable"), SQLDataType.VARCHAR, this, "");

    private PgTrigger(Name alias, Table<PgTriggerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTrigger(Name alias, Table<PgTriggerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgTrigger(String alias) {
        this(DSL.name(alias), PG_TRIGGER);
    }

    public PgTrigger(Name alias) {
        this(alias, PG_TRIGGER);
    }

    public PgTrigger() {
        this(DSL.name("pg_trigger"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTrigger as(String alias) {
        return new PgTrigger(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgTrigger as(Name alias) {
        return new PgTrigger(alias, this);
    }

    @Override
    @NotNull
    public PgTrigger as(Table<?> alias) {
        return new PgTrigger(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgTrigger rename(String name) {
        return new PgTrigger(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgTrigger rename(Name name) {
        return new PgTrigger(name, null);
    }

    @Override
    @NotNull
    public PgTrigger rename(Table<?> name) {
        return new PgTrigger(name.getQualifiedName(), null);
    }
}