/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgUserMappingsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class PgUserMappings extends TableImpl<PgUserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgUserMappings PG_USER_MAPPINGS = new PgUserMappings();

    @Override
    @NotNull
    public Class<PgUserMappingsRecord> getRecordType() {
        return PgUserMappingsRecord.class;
    }

    public final TableField<PgUserMappingsRecord, Long> UMID = createField(DSL.name("umid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgUserMappingsRecord, Long> SRVID = createField(DSL.name("srvid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgUserMappingsRecord, String> SRVNAME = createField(DSL.name("srvname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgUserMappingsRecord, Long> UMUSER = createField(DSL.name("umuser"), SQLDataType.BIGINT, this, "");

    public final TableField<PgUserMappingsRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgUserMappingsRecord, String[]> UMOPTIONS = createField(DSL.name("umoptions"), SQLDataType.CLOB.array(), this, "");

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_user_mappings" as  SELECT u.oid AS umid,
         s.oid AS srvid,
         s.srvname,
         u.umuser,
             CASE
                 WHEN (u.umuser = (0)::oid) THEN 'public'::name
                 ELSE a.rolname
             END AS usename,
             CASE
                 WHEN (((u.umuser <> (0)::oid) AND (a.rolname = CURRENT_USER) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text))) OR ((u.umuser = (0)::oid) AND pg_has_role(s.srvowner, 'USAGE'::text)) OR ( SELECT pg_authid.rolsuper
                    FROM pg_authid
                   WHERE (pg_authid.rolname = CURRENT_USER))) THEN u.umoptions
                 ELSE NULL::text[]
             END AS umoptions
        FROM ((pg_user_mapping u
          JOIN pg_foreign_server s ON ((u.umserver = s.oid)))
          LEFT JOIN pg_authid a ON ((a.oid = u.umuser)));
        """));
    }

    public PgUserMappings(String alias) {
        this(DSL.name(alias), PG_USER_MAPPINGS);
    }

    public PgUserMappings(Name alias) {
        this(alias, PG_USER_MAPPINGS);
    }

    public PgUserMappings() {
        this(DSL.name("pg_user_mappings"), null);
    }

    public <O extends Record> PgUserMappings(Table<O> child, ForeignKey<O, PgUserMappingsRecord> key) {
        super(child, key, PG_USER_MAPPINGS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgUserMappings as(String alias) {
        return new PgUserMappings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgUserMappings as(Name alias) {
        return new PgUserMappings(alias, this);
    }

    @Override
    @NotNull
    public PgUserMappings as(Table<?> alias) {
        return new PgUserMappings(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgUserMappings rename(String name) {
        return new PgUserMappings(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgUserMappings rename(Name name) {
        return new PgUserMappings(name, null);
    }

    @Override
    @NotNull
    public PgUserMappings rename(Table<?> name) {
        return new PgUserMappings(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, Long, String, Long, String, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function6<? super Long, ? super Long, ? super String, ? super Long, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Long, ? super String, ? super Long, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
