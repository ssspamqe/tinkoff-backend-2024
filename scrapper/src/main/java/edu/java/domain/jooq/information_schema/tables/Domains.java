/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.DomainsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * The table <code>information_schema.domains</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Domains extends TableImpl<DomainsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.domains</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<DomainsRecord> getRecordType() {
        return DomainsRecord.class;
    }

    /**
     * The column <code>information_schema.domains.domain_catalog</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_schema</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_name</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.data_type</code>.
     */
    public final TableField<DomainsRecord, String> DATA_TYPE = createField(DSL.name("data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_catalog</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_schema</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_name</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_catalog</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_schema</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_name</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.numeric_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.numeric_scale</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.datetime_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.interval_type</code>.
     */
    public final TableField<DomainsRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.interval_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_default</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_DEFAULT = createField(DSL.name("domain_default"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_catalog</code>.
     */
    public final TableField<DomainsRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_schema</code>.
     */
    public final TableField<DomainsRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_name</code>.
     */
    public final TableField<DomainsRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_catalog</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_schema</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_name</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.maximum_cardinality</code>.
     */
    public final TableField<DomainsRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.dtd_identifier</code>.
     */
    public final TableField<DomainsRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private Domains(Name alias, Table<DomainsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Domains(Name alias, Table<DomainsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "domains" as  SELECT (current_database())::information_schema.sql_identifier AS domain_catalog,
          (nt.nspname)::information_schema.sql_identifier AS domain_schema,
          (t.typname)::information_schema.sql_identifier AS domain_name,
          (
              CASE
                  WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text
                  WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(t.typbasetype, NULL::integer)
                  ELSE 'USER-DEFINED'::text
              END)::information_schema.character_data AS data_type,
          (information_schema._pg_char_max_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_maximum_length,
          (information_schema._pg_char_octet_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_octet_length,
          (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS character_set_schema,
          (NULL::name)::information_schema.sql_identifier AS character_set_name,
          (
              CASE
                  WHEN (nco.nspname IS NOT NULL) THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS collation_catalog,
          (nco.nspname)::information_schema.sql_identifier AS collation_schema,
          (co.collname)::information_schema.sql_identifier AS collation_name,
          (information_schema._pg_numeric_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision,
          (information_schema._pg_numeric_precision_radix(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision_radix,
          (information_schema._pg_numeric_scale(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_scale,
          (information_schema._pg_datetime_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS datetime_precision,
          (information_schema._pg_interval_type(t.typbasetype, t.typtypmod))::information_schema.character_data AS interval_type,
          (NULL::integer)::information_schema.cardinal_number AS interval_precision,
          (t.typdefault)::information_schema.character_data AS domain_default,
          (current_database())::information_schema.sql_identifier AS udt_catalog,
          (nbt.nspname)::information_schema.sql_identifier AS udt_schema,
          (bt.typname)::information_schema.sql_identifier AS udt_name,
          (NULL::name)::information_schema.sql_identifier AS scope_catalog,
          (NULL::name)::information_schema.sql_identifier AS scope_schema,
          (NULL::name)::information_schema.sql_identifier AS scope_name,
          (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,
          (1)::information_schema.sql_identifier AS dtd_identifier
         FROM (((pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))
           JOIN (pg_type bt
           JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typbasetype = bt.oid) AND (t.typtype = 'd'::"char"))))
           LEFT JOIN (pg_collation co
           JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((t.typcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))
        WHERE (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    /**
     * Create a <code>information_schema.domains</code> table reference
     */
    public Domains() {
        this(DSL.name("domains"), null);
    }

    public <O extends Record> Domains(Table<O> child, ForeignKey<O, DomainsRecord> key) {
        super(child, key, DOMAINS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    @Override
    @NotNull
    public Domains as(Table<?> alias) {
        return new Domains(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Domains rename(String name) {
        return new Domains(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Domains rename(Name name) {
        return new Domains(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Domains rename(Table<?> name) {
        return new Domains(name.getQualifiedName(), null);
    }
}
