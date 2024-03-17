/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records._PgForeignServersRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>information_schema._pg_foreign_servers</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgForeignServers extends TableImpl<_PgForeignServersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_servers</code>
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<_PgForeignServersRecord> getRecordType() {
        return _PgForeignServersRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public final TableField<_PgForeignServersRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public final TableField<_PgForeignServersRecord, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public final TableField<_PgForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_foreign_servers" as  SELECT s.oid,
          s.srvoptions,
          (current_database())::information_schema.sql_identifier AS foreign_server_catalog,
          (s.srvname)::information_schema.sql_identifier AS foreign_server_name,
          (current_database())::information_schema.sql_identifier AS foreign_data_wrapper_catalog,
          (w.fdwname)::information_schema.sql_identifier AS foreign_data_wrapper_name,
          (s.srvtype)::information_schema.character_data AS foreign_server_type,
          (s.srvversion)::information_schema.character_data AS foreign_server_version,
          (u.rolname)::information_schema.sql_identifier AS authorization_identifier
         FROM pg_foreign_server s,
          pg_foreign_data_wrapper w,
          pg_authid u
        WHERE ((w.oid = s.srvfdw) AND (u.oid = s.srvowner) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_servers</code> table
     * reference
     */
    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    public <O extends Record> _PgForeignServers(Table<O> child, ForeignKey<O, _PgForeignServersRecord> key) {
        super(child, key, _PG_FOREIGN_SERVERS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    @Override
    @NotNull
    public _PgForeignServers as(Table<?> alias) {
        return new _PgForeignServers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public _PgForeignServers rename(Table<?> name) {
        return new _PgForeignServers(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, String[], String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super String[], ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super String[], ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
