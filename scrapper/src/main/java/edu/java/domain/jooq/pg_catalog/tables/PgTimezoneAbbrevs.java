/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTimezoneAbbrevsRecord;

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
public class PgTimezoneAbbrevs extends TableImpl<PgTimezoneAbbrevsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTimezoneAbbrevs PG_TIMEZONE_ABBREVS = new PgTimezoneAbbrevs();

    @Override
    @NotNull
    public Class<PgTimezoneAbbrevsRecord> getRecordType() {
        return PgTimezoneAbbrevsRecord.class;
    }

    public final TableField<PgTimezoneAbbrevsRecord, String> ABBREV = createField(DSL.name("abbrev"), SQLDataType.CLOB, this, "");

    public final TableField<PgTimezoneAbbrevsRecord, YearToSecond> UTC_OFFSET = createField(DSL.name("utc_offset"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgTimezoneAbbrevsRecord, Boolean> IS_DST = createField(DSL.name("is_dst"), SQLDataType.BOOLEAN, this, "");

    private PgTimezoneAbbrevs(Name alias, Table<PgTimezoneAbbrevsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgTimezoneAbbrevs(Name alias, Table<PgTimezoneAbbrevsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgTimezoneAbbrevs(String alias) {
        this(DSL.name(alias), PG_TIMEZONE_ABBREVS);
    }

    public PgTimezoneAbbrevs(Name alias) {
        this(alias, PG_TIMEZONE_ABBREVS);
    }

    public PgTimezoneAbbrevs() {
        this(DSL.name("pg_timezone_abbrevs"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs as(String alias) {
        return new PgTimezoneAbbrevs(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs as(Name alias) {
        return new PgTimezoneAbbrevs(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs as(Table<?> alias) {
        return new PgTimezoneAbbrevs(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs rename(String name) {
        return new PgTimezoneAbbrevs(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs rename(Name name) {
        return new PgTimezoneAbbrevs(name, null, parameters);
    }

    @Override
    @NotNull
    public PgTimezoneAbbrevs rename(Table<?> name) {
        return new PgTimezoneAbbrevs(name.getQualifiedName(), null, parameters);
    }

    public PgTimezoneAbbrevs call() {
        PgTimezoneAbbrevs result = new PgTimezoneAbbrevs(DSL.name("pg_timezone_abbrevs"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
