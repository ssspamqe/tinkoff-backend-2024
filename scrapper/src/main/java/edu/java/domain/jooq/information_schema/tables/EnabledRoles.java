/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.EnabledRolesRecord;

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
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class EnabledRoles extends TableImpl<EnabledRolesRecord> {

    private static final long serialVersionUID = 1L;

    public static final EnabledRoles ENABLED_ROLES = new EnabledRoles();

    @Override
    @NotNull
    public Class<EnabledRolesRecord> getRecordType() {
        return EnabledRolesRecord.class;
    }

    public final TableField<EnabledRolesRecord, String> ROLE_NAME = createField(DSL.name("role_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public EnabledRoles(String alias) {
        this(DSL.name(alias), ENABLED_ROLES);
    }

    public EnabledRoles(Name alias) {
        this(alias, ENABLED_ROLES);
    }

    public EnabledRoles() {
        this(DSL.name("enabled_roles"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public EnabledRoles as(String alias) {
        return new EnabledRoles(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public EnabledRoles as(Name alias) {
        return new EnabledRoles(alias, this);
    }

    @Override
    @NotNull
    public EnabledRoles as(Table<?> alias) {
        return new EnabledRoles(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public EnabledRoles rename(String name) {
        return new EnabledRoles(DSL.name(name), null);
    }

    @Override
    @NotNull
    public EnabledRoles rename(Name name) {
        return new EnabledRoles(name, null);
    }

    @Override
    @NotNull
    public EnabledRoles rename(Table<?> name) {
        return new EnabledRoles(name.getQualifiedName(), null);
    }
}