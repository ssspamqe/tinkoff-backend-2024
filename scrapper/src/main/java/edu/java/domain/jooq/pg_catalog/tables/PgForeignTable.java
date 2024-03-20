/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgForeignTableRecord;

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
public class PgForeignTable extends TableImpl<PgForeignTableRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgForeignTable PG_FOREIGN_TABLE = new PgForeignTable();

    @Override
    @NotNull
    public Class<PgForeignTableRecord> getRecordType() {
        return PgForeignTableRecord.class;
    }

    public final TableField<PgForeignTableRecord, Long> FTRELID = createField(DSL.name("ftrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgForeignTableRecord, Long> FTSERVER = createField(DSL.name("ftserver"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgForeignTableRecord, String[]> FTOPTIONS = createField(DSL.name("ftoptions"), SQLDataType.CLOB.array(), this, "");

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgForeignTable(String alias) {
        this(DSL.name(alias), PG_FOREIGN_TABLE);
    }

    public PgForeignTable(Name alias) {
        this(alias, PG_FOREIGN_TABLE);
    }

    public PgForeignTable() {
        this(DSL.name("pg_foreign_table"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgForeignTable as(String alias) {
        return new PgForeignTable(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgForeignTable as(Name alias) {
        return new PgForeignTable(alias, this);
    }

    @Override
    @NotNull
    public PgForeignTable as(Table<?> alias) {
        return new PgForeignTable(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgForeignTable rename(String name) {
        return new PgForeignTable(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgForeignTable rename(Name name) {
        return new PgForeignTable(name, null);
    }

    @Override
    @NotNull
    public PgForeignTable rename(Table<?> name) {
        return new PgForeignTable(name.getQualifiedName(), null);
    }
}
