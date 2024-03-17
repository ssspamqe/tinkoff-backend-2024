/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ForeignTableOptionsRecord;

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
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ForeignTableOptions extends TableImpl<ForeignTableOptionsRecord> {

    private static final long serialVersionUID = 1L;

    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = new ForeignTableOptions();

    @Override
    @NotNull
    public Class<ForeignTableOptionsRecord> getRecordType() {
        return ForeignTableOptionsRecord.class;
    }

    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTableOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTableOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "foreign_table_options" as  SELECT foreign_table_catalog,
         foreign_table_schema,
         foreign_table_name,
         ((pg_options_to_table(ftoptions)).option_name)::information_schema.sql_identifier AS option_name,
         ((pg_options_to_table(ftoptions)).option_value)::information_schema.character_data AS option_value
        FROM information_schema._pg_foreign_tables t;
        """));
    }

    public ForeignTableOptions(String alias) {
        this(DSL.name(alias), FOREIGN_TABLE_OPTIONS);
    }

    public ForeignTableOptions(Name alias) {
        this(alias, FOREIGN_TABLE_OPTIONS);
    }

    public ForeignTableOptions() {
        this(DSL.name("foreign_table_options"), null);
    }

    public <O extends Record> ForeignTableOptions(Table<O> child, ForeignKey<O, ForeignTableOptionsRecord> key) {
        super(child, key, FOREIGN_TABLE_OPTIONS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ForeignTableOptions as(String alias) {
        return new ForeignTableOptions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ForeignTableOptions as(Name alias) {
        return new ForeignTableOptions(alias, this);
    }

    @Override
    @NotNull
    public ForeignTableOptions as(Table<?> alias) {
        return new ForeignTableOptions(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ForeignTableOptions rename(String name) {
        return new ForeignTableOptions(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ForeignTableOptions rename(Name name) {
        return new ForeignTableOptions(name, null);
    }

    @Override
    @NotNull
    public ForeignTableOptions rename(Table<?> name) {
        return new ForeignTableOptions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
