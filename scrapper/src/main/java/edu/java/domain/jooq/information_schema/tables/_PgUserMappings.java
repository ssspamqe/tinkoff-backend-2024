/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records._PgUserMappingsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>information_schema._pg_user_mappings</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgUserMappings extends TableImpl<_PgUserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_user_mappings</code>
     */
    public static final _PgUserMappings _PG_USER_MAPPINGS = new _PgUserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<_PgUserMappingsRecord> getRecordType() {
        return _PgUserMappingsRecord.class;
    }

    /**
     * The column <code>information_schema._pg_user_mappings.oid</code>.
     */
    public final TableField<_PgUserMappingsRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema._pg_user_mappings.umoptions</code>.
     */
    public final TableField<_PgUserMappingsRecord, String[]> UMOPTIONS = createField(DSL.name("umoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>information_schema._pg_user_mappings.umuser</code>.
     */
    public final TableField<_PgUserMappingsRecord, Long> UMUSER = createField(DSL.name("umuser"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_user_mappings.authorization_identifier</code>.
     */
    public final TableField<_PgUserMappingsRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_user_mappings.foreign_server_catalog</code>.
     */
    public final TableField<_PgUserMappingsRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_user_mappings.foreign_server_name</code>.
     */
    public final TableField<_PgUserMappingsRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema._pg_user_mappings.srvowner</code>.
     */
    public final TableField<_PgUserMappingsRecord, String> SRVOWNER = createField(DSL.name("srvowner"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgUserMappings(Name alias, Table<_PgUserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgUserMappings(Name alias, Table<_PgUserMappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_user_mappings" as  SELECT um.oid,
          um.umoptions,
          um.umuser,
          (COALESCE(u.rolname, 'PUBLIC'::name))::information_schema.sql_identifier AS authorization_identifier,
          s.foreign_server_catalog,
          s.foreign_server_name,
          s.authorization_identifier AS srvowner
         FROM (pg_user_mapping um
           LEFT JOIN pg_authid u ON ((u.oid = um.umuser))),
          information_schema._pg_foreign_servers s
        WHERE (s.oid = um.umserver);
        """));
    }

    /**
     * Create an aliased <code>information_schema._pg_user_mappings</code> table
     * reference
     */
    public _PgUserMappings(String alias) {
        this(DSL.name(alias), _PG_USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>information_schema._pg_user_mappings</code> table
     * reference
     */
    public _PgUserMappings(Name alias) {
        this(alias, _PG_USER_MAPPINGS);
    }

    /**
     * Create a <code>information_schema._pg_user_mappings</code> table
     * reference
     */
    public _PgUserMappings() {
        this(DSL.name("_pg_user_mappings"), null);
    }

    public <O extends Record> _PgUserMappings(Table<O> child, ForeignKey<O, _PgUserMappingsRecord> key) {
        super(child, key, _PG_USER_MAPPINGS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public _PgUserMappings as(String alias) {
        return new _PgUserMappings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public _PgUserMappings as(Name alias) {
        return new _PgUserMappings(alias, this);
    }

    @Override
    @NotNull
    public _PgUserMappings as(Table<?> alias) {
        return new _PgUserMappings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgUserMappings rename(String name) {
        return new _PgUserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgUserMappings rename(Name name) {
        return new _PgUserMappings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgUserMappings rename(Table<?> name) {
        return new _PgUserMappings(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, String[], Long, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super String[], ? super Long, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super String[], ? super Long, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
