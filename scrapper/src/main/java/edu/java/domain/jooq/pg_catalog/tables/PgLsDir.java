/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLsDirRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLsDir extends TableImpl<PgLsDirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_dir</code>
     */
    public static final PgLsDir PG_LS_DIR = new PgLsDir();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLsDirRecord> getRecordType() {
        return PgLsDirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_dir.pg_ls_dir</code>.
     */
    public final TableField<PgLsDirRecord, String> PG_LS_DIR_ = createField(DSL.name("pg_ls_dir"), SQLDataType.CLOB, this, "");

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN)
        });
    }

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(String alias) {
        this(DSL.name(alias), PG_LS_DIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(Name alias) {
        this(alias, PG_LS_DIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir() {
        this(DSL.name("pg_ls_dir"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLsDir as(String alias) {
        return new PgLsDir(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLsDir as(Name alias) {
        return new PgLsDir(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLsDir as(Table<?> alias) {
        return new PgLsDir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsDir rename(String name) {
        return new PgLsDir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsDir rename(Name name) {
        return new PgLsDir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsDir rename(Table<?> name) {
        return new PgLsDir(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(
          String __1
        , Boolean __2
        , Boolean __3
    ) {
        PgLsDir result = new PgLsDir(DSL.name("pg_ls_dir"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB),
            DSL.val(__2, SQLDataType.BOOLEAN),
            DSL.val(__3, SQLDataType.BOOLEAN)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(
          Field<String> __1
        , Field<Boolean> __2
        , Field<Boolean> __3
    ) {
        PgLsDir result = new PgLsDir(DSL.name("pg_ls_dir"), null, new Field[] {
            __1,
            __2,
            __3
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
