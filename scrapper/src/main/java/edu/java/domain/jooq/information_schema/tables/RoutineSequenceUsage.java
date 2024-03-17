/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.RoutineSequenceUsageRecord;

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


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoutineSequenceUsage extends TableImpl<RoutineSequenceUsageRecord> {

    private static final long serialVersionUID = 1L;

    public static final RoutineSequenceUsage ROUTINE_SEQUENCE_USAGE = new RoutineSequenceUsage();

    @Override
    @NotNull
    public Class<RoutineSequenceUsageRecord> getRecordType() {
        return RoutineSequenceUsageRecord.class;
    }

    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_CATALOG = createField(DSL.name("sequence_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("sequence_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_NAME = createField(DSL.name("sequence_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "routine_sequence_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,
          (np.nspname)::information_schema.sql_identifier AS specific_schema,
          (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
          (current_database())::information_schema.sql_identifier AS routine_catalog,
          (np.nspname)::information_schema.sql_identifier AS routine_schema,
          (p.proname)::information_schema.sql_identifier AS routine_name,
          (current_database())::information_schema.sql_identifier AS sequence_catalog,
          (ns.nspname)::information_schema.sql_identifier AS sequence_schema,
          (s.relname)::information_schema.sql_identifier AS sequence_name
         FROM pg_namespace np,
          pg_proc p,
          pg_depend d,
          pg_class s,
          pg_namespace ns
        WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = s.oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (s.relnamespace = ns.oid) AND (s.relkind = 'S'::"char") AND pg_has_role(s.relowner, 'USAGE'::text));
        """));
    }

    public RoutineSequenceUsage(String alias) {
        this(DSL.name(alias), ROUTINE_SEQUENCE_USAGE);
    }

    public RoutineSequenceUsage(Name alias) {
        this(alias, ROUTINE_SEQUENCE_USAGE);
    }

    public RoutineSequenceUsage() {
        this(DSL.name("routine_sequence_usage"), null);
    }

    public <O extends Record> RoutineSequenceUsage(Table<O> child, ForeignKey<O, RoutineSequenceUsageRecord> key) {
        super(child, key, ROUTINE_SEQUENCE_USAGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public RoutineSequenceUsage as(String alias) {
        return new RoutineSequenceUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public RoutineSequenceUsage as(Name alias) {
        return new RoutineSequenceUsage(alias, this);
    }

    @Override
    @NotNull
    public RoutineSequenceUsage as(Table<?> alias) {
        return new RoutineSequenceUsage(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public RoutineSequenceUsage rename(String name) {
        return new RoutineSequenceUsage(DSL.name(name), null);
    }

    @Override
    @NotNull
    public RoutineSequenceUsage rename(Name name) {
        return new RoutineSequenceUsage(name, null);
    }

    @Override
    @NotNull
    public RoutineSequenceUsage rename(Table<?> name) {
        return new RoutineSequenceUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
