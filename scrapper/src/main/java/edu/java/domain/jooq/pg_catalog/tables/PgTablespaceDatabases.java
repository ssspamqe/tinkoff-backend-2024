/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTablespaceDatabasesRecord;

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
public class PgTablespaceDatabases extends TableImpl<PgTablespaceDatabasesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTablespaceDatabases PG_TABLESPACE_DATABASES = new PgTablespaceDatabases();

    @Override
    @NotNull
    public Class<PgTablespaceDatabasesRecord> getRecordType() {
        return PgTablespaceDatabasesRecord.class;
    }

    public final TableField<PgTablespaceDatabasesRecord, Long> PG_TABLESPACE_DATABASES_ = createField(DSL.name("pg_tablespace_databases"), SQLDataType.BIGINT, this, "");

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgTablespaceDatabases(String alias) {
        this(DSL.name(alias), PG_TABLESPACE_DATABASES);
    }

    public PgTablespaceDatabases(Name alias) {
        this(alias, PG_TABLESPACE_DATABASES);
    }

    public PgTablespaceDatabases() {
        this(DSL.name("pg_tablespace_databases"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTablespaceDatabases as(String alias) {
        return new PgTablespaceDatabases(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgTablespaceDatabases as(Name alias) {
        return new PgTablespaceDatabases(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgTablespaceDatabases as(Table<?> alias) {
        return new PgTablespaceDatabases(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgTablespaceDatabases rename(String name) {
        return new PgTablespaceDatabases(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgTablespaceDatabases rename(Name name) {
        return new PgTablespaceDatabases(name, null, parameters);
    }

    @Override
    @NotNull
    public PgTablespaceDatabases rename(Table<?> name) {
        return new PgTablespaceDatabases(name.getQualifiedName(), null, parameters);
    }

    public PgTablespaceDatabases call(
          Long __1
    ) {
        PgTablespaceDatabases result = new PgTablespaceDatabases(DSL.name("pg_tablespace_databases"), null, new Field[] {
            DSL.val(__1, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgTablespaceDatabases call(
          Field<Long> __1
    ) {
        PgTablespaceDatabases result = new PgTablespaceDatabases(DSL.name("pg_tablespace_databases"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
