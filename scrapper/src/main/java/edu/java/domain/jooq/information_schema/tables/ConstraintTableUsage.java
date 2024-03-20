/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ConstraintTableUsageRecord;

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
public class ConstraintTableUsage extends TableImpl<ConstraintTableUsageRecord> {

    private static final long serialVersionUID = 1L;

    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = new ConstraintTableUsage();

    @Override
    @NotNull
    public Class<ConstraintTableUsageRecord> getRecordType() {
        return ConstraintTableUsageRecord.class;
    }

    public final TableField<ConstraintTableUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ConstraintTableUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ConstraintTableUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public ConstraintTableUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_TABLE_USAGE);
    }

    public ConstraintTableUsage(Name alias) {
        this(alias, CONSTRAINT_TABLE_USAGE);
    }

    public ConstraintTableUsage() {
        this(DSL.name("constraint_table_usage"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ConstraintTableUsage as(String alias) {
        return new ConstraintTableUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ConstraintTableUsage as(Name alias) {
        return new ConstraintTableUsage(alias, this);
    }

    @Override
    @NotNull
    public ConstraintTableUsage as(Table<?> alias) {
        return new ConstraintTableUsage(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ConstraintTableUsage rename(String name) {
        return new ConstraintTableUsage(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ConstraintTableUsage rename(Name name) {
        return new ConstraintTableUsage(name, null);
    }

    @Override
    @NotNull
    public ConstraintTableUsage rename(Table<?> name) {
        return new ConstraintTableUsage(name.getQualifiedName(), null);
    }
}