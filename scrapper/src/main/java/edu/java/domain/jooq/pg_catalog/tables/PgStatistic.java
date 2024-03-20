/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatisticRecord;

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
public class PgStatistic extends TableImpl<PgStatisticRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatistic PG_STATISTIC = new PgStatistic();

    @Override
    @NotNull
    public Class<PgStatisticRecord> getRecordType() {
        return PgStatisticRecord.class;
    }

    public final TableField<PgStatisticRecord, Long> STARELID = createField(DSL.name("starelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAATTNUM = createField(DSL.name("staattnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Boolean> STAINHERIT = createField(DSL.name("stainherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Float> STANULLFRAC = createField(DSL.name("stanullfrac"), SQLDataType.REAL.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Integer> STAWIDTH = createField(DSL.name("stawidth"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Float> STADISTINCT = createField(DSL.name("stadistinct"), SQLDataType.REAL.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAKIND1 = createField(DSL.name("stakind1"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAKIND2 = createField(DSL.name("stakind2"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAKIND3 = createField(DSL.name("stakind3"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAKIND4 = createField(DSL.name("stakind4"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Short> STAKIND5 = createField(DSL.name("stakind5"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STAOP1 = createField(DSL.name("staop1"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STAOP2 = createField(DSL.name("staop2"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STAOP3 = createField(DSL.name("staop3"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STAOP4 = createField(DSL.name("staop4"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STAOP5 = createField(DSL.name("staop5"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STACOLL1 = createField(DSL.name("stacoll1"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STACOLL2 = createField(DSL.name("stacoll2"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STACOLL3 = createField(DSL.name("stacoll3"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STACOLL4 = createField(DSL.name("stacoll4"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Long> STACOLL5 = createField(DSL.name("stacoll5"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticRecord, Float[]> STANUMBERS1 = createField(DSL.name("stanumbers1"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatisticRecord, Float[]> STANUMBERS2 = createField(DSL.name("stanumbers2"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatisticRecord, Float[]> STANUMBERS3 = createField(DSL.name("stanumbers3"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatisticRecord, Float[]> STANUMBERS4 = createField(DSL.name("stanumbers4"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatisticRecord, Float[]> STANUMBERS5 = createField(DSL.name("stanumbers5"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatisticRecord, Object[]> STAVALUES1 = createField(DSL.name("stavalues1"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatisticRecord, Object[]> STAVALUES2 = createField(DSL.name("stavalues2"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatisticRecord, Object[]> STAVALUES3 = createField(DSL.name("stavalues3"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatisticRecord, Object[]> STAVALUES4 = createField(DSL.name("stavalues4"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatisticRecord, Object[]> STAVALUES5 = createField(DSL.name("stavalues5"), SQLDataType.OTHER.array(), this, "");

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgStatistic(String alias) {
        this(DSL.name(alias), PG_STATISTIC);
    }

    public PgStatistic(Name alias) {
        this(alias, PG_STATISTIC);
    }

    public PgStatistic() {
        this(DSL.name("pg_statistic"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatistic as(String alias) {
        return new PgStatistic(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatistic as(Name alias) {
        return new PgStatistic(alias, this);
    }

    @Override
    @NotNull
    public PgStatistic as(Table<?> alias) {
        return new PgStatistic(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatistic rename(String name) {
        return new PgStatistic(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatistic rename(Name name) {
        return new PgStatistic(name, null);
    }

    @Override
    @NotNull
    public PgStatistic rename(Table<?> name) {
        return new PgStatistic(name.getQualifiedName(), null);
    }
}