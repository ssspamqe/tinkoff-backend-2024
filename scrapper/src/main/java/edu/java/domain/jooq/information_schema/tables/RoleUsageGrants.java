/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.RoleUsageGrantsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoleUsageGrants extends TableImpl<RoleUsageGrantsRecord> {

    private static final long serialVersionUID = 1L;

    public static final RoleUsageGrants ROLE_USAGE_GRANTS = new RoleUsageGrants();

    @Override
    @NotNull
    public Class<RoleUsageGrantsRecord> getRecordType() {
        return RoleUsageGrantsRecord.class;
    }

    public final TableField<RoleUsageGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoleUsageGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_usage_grants" as  SELECT grantor,
          grantee,
          object_catalog,
          object_schema,
          object_name,
          object_type,
          privilege_type,
          is_grantable
         FROM information_schema.usage_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    public RoleUsageGrants(String alias) {
        this(DSL.name(alias), ROLE_USAGE_GRANTS);
    }

    public RoleUsageGrants(Name alias) {
        this(alias, ROLE_USAGE_GRANTS);
    }

    public RoleUsageGrants() {
        this(DSL.name("role_usage_grants"), null);
    }

    public <O extends Record> RoleUsageGrants(Table<O> child, ForeignKey<O, RoleUsageGrantsRecord> key) {
        super(child, key, ROLE_USAGE_GRANTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public RoleUsageGrants as(String alias) {
        return new RoleUsageGrants(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public RoleUsageGrants as(Name alias) {
        return new RoleUsageGrants(alias, this);
    }

    @Override
    @NotNull
    public RoleUsageGrants as(Table<?> alias) {
        return new RoleUsageGrants(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public RoleUsageGrants rename(String name) {
        return new RoleUsageGrants(DSL.name(name), null);
    }

    @Override
    @NotNull
    public RoleUsageGrants rename(Name name) {
        return new RoleUsageGrants(name, null);
    }

    @Override
    @NotNull
    public RoleUsageGrants rename(Table<?> name) {
        return new RoleUsageGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
