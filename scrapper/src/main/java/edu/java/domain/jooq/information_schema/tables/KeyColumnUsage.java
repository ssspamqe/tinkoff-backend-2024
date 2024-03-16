/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.KeyColumnUsageRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
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
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.key_column_usage</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<KeyColumnUsageRecord> getRecordType() {
        return KeyColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.table_catalog</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.table_schema</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.table_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.column_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    public final TableField<KeyColumnUsageRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public final TableField<KeyColumnUsageRecord, Integer> POSITION_IN_UNIQUE_CONSTRAINT = createField(DSL.name("position_in_unique_constraint"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "key_column_usage" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
          (ss.nc_nspname)::information_schema.sql_identifier AS constraint_schema,
          (ss.conname)::information_schema.sql_identifier AS constraint_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (ss.nr_nspname)::information_schema.sql_identifier AS table_schema,
          (ss.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name,
          ((ss.x).n)::information_schema.cardinal_number AS ordinal_position,
          (
              CASE
                  WHEN (ss.contype = 'f'::"char") THEN information_schema._pg_index_position(ss.conindid, ss.confkey[(ss.x).n])
                  ELSE NULL::integer
              END)::information_schema.cardinal_number AS position_in_unique_constraint
         FROM pg_attribute a,
          ( SELECT r.oid AS roid,
                  r.relname,
                  r.relowner,
                  nc.nspname AS nc_nspname,
                  nr.nspname AS nr_nspname,
                  c.oid AS coid,
                  c.conname,
                  c.contype,
                  c.conindid,
                  c.confkey,
                  c.confrelid,
                  information_schema._pg_expandarray(c.conkey) AS x
                 FROM pg_namespace nr,
                  pg_class r,
                  pg_namespace nc,
                  pg_constraint c
                WHERE ((nr.oid = r.relnamespace) AND (r.oid = c.conrelid) AND (nc.oid = c.connamespace) AND (c.contype = ANY (ARRAY['p'::"char", 'u'::"char", 'f'::"char"])) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT pg_is_other_temp_schema(nr.oid)))) ss
        WHERE ((ss.roid = a.attrelid) AND (a.attnum = (ss.x).x) AND (NOT a.attisdropped) AND (pg_has_role(ss.relowner, 'USAGE'::text) OR has_column_privilege(ss.roid, a.attnum, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.key_column_usage</code> table
     * reference
     */
    public KeyColumnUsage(String alias) {
        this(DSL.name(alias), KEY_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.key_column_usage</code> table
     * reference
     */
    public KeyColumnUsage(Name alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.key_column_usage</code> table reference
     */
    public KeyColumnUsage() {
        this(DSL.name("key_column_usage"), null);
    }

    public <O extends Record> KeyColumnUsage(Table<O> child, ForeignKey<O, KeyColumnUsageRecord> key) {
        super(child, key, KEY_COLUMN_USAGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public KeyColumnUsage as(Name alias) {
        return new KeyColumnUsage(alias, this);
    }

    @Override
    @NotNull
    public KeyColumnUsage as(Table<?> alias) {
        return new KeyColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public KeyColumnUsage rename(String name) {
        return new KeyColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public KeyColumnUsage rename(Name name) {
        return new KeyColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public KeyColumnUsage rename(Table<?> name) {
        return new KeyColumnUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, String, String, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
