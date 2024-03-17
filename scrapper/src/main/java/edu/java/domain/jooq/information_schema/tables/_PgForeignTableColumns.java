/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records._PgForeignTableColumnsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>information_schema._pg_foreign_table_columns</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgForeignTableColumns extends TableImpl<_PgForeignTableColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_table_columns</code>
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = new _PgForeignTableColumns();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<_PgForeignTableColumnsRecord> getRecordType() {
        return _PgForeignTableColumnsRecord.class;
    }

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> NSPNAME = createField(DSL.name("nspname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> ATTNAME = createField(DSL.name("attname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String[]> ATTFDWOPTIONS = createField(DSL.name("attfdwoptions"), SQLDataType.CLOB.array(), this, "");

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_foreign_table_columns" as  SELECT n.nspname,
          c.relname,
          a.attname,
          a.attfdwoptions
         FROM pg_foreign_table t,
          pg_authid u,
          pg_namespace n,
          pg_class c,
          pg_attribute a
        WHERE ((u.oid = c.relowner) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_column_privilege(c.oid, a.attnum, 'SELECT, INSERT, UPDATE, REFERENCES'::text)) AND (n.oid = c.relnamespace) AND (c.oid = t.ftrelid) AND (c.relkind = 'f'::"char") AND (a.attrelid = c.oid) AND (a.attnum > 0));
        """));
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(Name alias) {
        this(alias, _PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_table_columns</code> table
     * reference
     */
    public _PgForeignTableColumns() {
        this(DSL.name("_pg_foreign_table_columns"), null);
    }

    public <O extends Record> _PgForeignTableColumns(Table<O> child, ForeignKey<O, _PgForeignTableColumnsRecord> key) {
        super(child, key, _PG_FOREIGN_TABLE_COLUMNS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public _PgForeignTableColumns as(String alias) {
        return new _PgForeignTableColumns(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public _PgForeignTableColumns as(Name alias) {
        return new _PgForeignTableColumns(alias, this);
    }

    @Override
    @NotNull
    public _PgForeignTableColumns as(Table<?> alias) {
        return new _PgForeignTableColumns(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignTableColumns rename(String name) {
        return new _PgForeignTableColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignTableColumns rename(Name name) {
        return new _PgForeignTableColumns(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignTableColumns rename(Table<?> name) {
        return new _PgForeignTableColumns(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
