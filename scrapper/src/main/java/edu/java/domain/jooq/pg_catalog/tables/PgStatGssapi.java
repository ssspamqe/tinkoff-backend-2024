/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatGssapiRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_stat_gssapi</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatGssapi extends TableImpl<PgStatGssapiRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_gssapi</code>
     */
    public static final PgStatGssapi PG_STAT_GSSAPI = new PgStatGssapi();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatGssapiRecord> getRecordType() {
        return PgStatGssapiRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    public final TableField<PgStatGssapiRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    public final TableField<PgStatGssapiRecord, Boolean> GSS_AUTHENTICATED = createField(DSL.name("gss_authenticated"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    public final TableField<PgStatGssapiRecord, String> PRINCIPAL = createField(DSL.name("principal"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    public final TableField<PgStatGssapiRecord, Boolean> ENCRYPTED = createField(DSL.name("encrypted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.credentials_delegated</code>.
     */
    public final TableField<PgStatGssapiRecord, Boolean> CREDENTIALS_DELEGATED = createField(DSL.name("credentials_delegated"), SQLDataType.BOOLEAN, this, "");

    private PgStatGssapi(Name alias, Table<PgStatGssapiRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatGssapi(Name alias, Table<PgStatGssapiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_gssapi" as  SELECT pid,
          gss_auth AS gss_authenticated,
          gss_princ AS principal,
          gss_enc AS encrypted,
          gss_delegation AS credentials_delegated
         FROM pg_stat_get_activity(NULL::integer) s(datid, pid, usesysid, application_name, state, query, wait_event_type, wait_event, xact_start, query_start, backend_start, state_change, client_addr, client_hostname, client_port, backend_xid, backend_xmin, backend_type, ssl, sslversion, sslcipher, sslbits, ssl_client_dn, ssl_client_serial, ssl_issuer_dn, gss_auth, gss_princ, gss_enc, gss_delegation, leader_pid, query_id)
        WHERE (client_port IS NOT NULL);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_gssapi</code> table reference
     */
    public PgStatGssapi(String alias) {
        this(DSL.name(alias), PG_STAT_GSSAPI);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_gssapi</code> table reference
     */
    public PgStatGssapi(Name alias) {
        this(alias, PG_STAT_GSSAPI);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_gssapi</code> table reference
     */
    public PgStatGssapi() {
        this(DSL.name("pg_stat_gssapi"), null);
    }

    public <O extends Record> PgStatGssapi(Table<O> child, ForeignKey<O, PgStatGssapiRecord> key) {
        super(child, key, PG_STAT_GSSAPI);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatGssapi as(String alias) {
        return new PgStatGssapi(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatGssapi as(Name alias) {
        return new PgStatGssapi(alias, this);
    }

    @Override
    @NotNull
    public PgStatGssapi as(Table<?> alias) {
        return new PgStatGssapi(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatGssapi rename(String name) {
        return new PgStatGssapi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatGssapi rename(Name name) {
        return new PgStatGssapi(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatGssapi rename(Table<?> name) {
        return new PgStatGssapi(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Integer, Boolean, String, Boolean, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Boolean, ? super String, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Boolean, ? super String, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
