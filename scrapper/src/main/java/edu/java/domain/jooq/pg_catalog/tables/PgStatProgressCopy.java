/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatProgressCopyRecord;

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
public class PgStatProgressCopy extends TableImpl<PgStatProgressCopyRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatProgressCopy PG_STAT_PROGRESS_COPY = new PgStatProgressCopy();

    @Override
    @NotNull
    public Class<PgStatProgressCopyRecord> getRecordType() {
        return PgStatProgressCopyRecord.class;
    }

    public final TableField<PgStatProgressCopyRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressCopyRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressCopyRecord, String> COMMAND = createField(DSL.name("command"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatProgressCopyRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> BYTES_PROCESSED = createField(DSL.name("bytes_processed"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> BYTES_TOTAL = createField(DSL.name("bytes_total"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> TUPLES_PROCESSED = createField(DSL.name("tuples_processed"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressCopyRecord, Long> TUPLES_EXCLUDED = createField(DSL.name("tuples_excluded"), SQLDataType.BIGINT, this, "");

    private PgStatProgressCopy(Name alias, Table<PgStatProgressCopyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressCopy(Name alias, Table<PgStatProgressCopyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatProgressCopy(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_COPY);
    }

    public PgStatProgressCopy(Name alias) {
        this(alias, PG_STAT_PROGRESS_COPY);
    }

    public PgStatProgressCopy() {
        this(DSL.name("pg_stat_progress_copy"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatProgressCopy as(String alias) {
        return new PgStatProgressCopy(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatProgressCopy as(Name alias) {
        return new PgStatProgressCopy(alias, this);
    }

    @Override
    @NotNull
    public PgStatProgressCopy as(Table<?> alias) {
        return new PgStatProgressCopy(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatProgressCopy rename(String name) {
        return new PgStatProgressCopy(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatProgressCopy rename(Name name) {
        return new PgStatProgressCopy(name, null);
    }

    @Override
    @NotNull
    public PgStatProgressCopy rename(Table<?> name) {
        return new PgStatProgressCopy(name.getQualifiedName(), null);
    }
}
