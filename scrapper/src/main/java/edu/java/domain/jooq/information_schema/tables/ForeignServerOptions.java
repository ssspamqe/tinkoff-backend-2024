/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ForeignServerOptionsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class ForeignServerOptions extends TableImpl<ForeignServerOptionsRecord> {

    private static final long serialVersionUID = 1L;

    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = new ForeignServerOptions();

    @Override
    @NotNull
    public Class<ForeignServerOptionsRecord> getRecordType() {
        return ForeignServerOptionsRecord.class;
    }

    public final TableField<ForeignServerOptionsRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignServerOptionsRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignServerOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignServerOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ForeignServerOptions(Name alias, Table<ForeignServerOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignServerOptions(Name alias, Table<ForeignServerOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "foreign_server_options" as  SELECT foreign_server_catalog,
         foreign_server_name,
         ((pg_options_to_table(srvoptions)).option_name)::information_schema.sql_identifier AS option_name,
         ((pg_options_to_table(srvoptions)).option_value)::information_schema.character_data AS option_value
        FROM information_schema._pg_foreign_servers s;
        """));
    }

    public ForeignServerOptions(String alias) {
        this(DSL.name(alias), FOREIGN_SERVER_OPTIONS);
    }

    public ForeignServerOptions(Name alias) {
        this(alias, FOREIGN_SERVER_OPTIONS);
    }

    public ForeignServerOptions() {
        this(DSL.name("foreign_server_options"), null);
    }

    public <O extends Record> ForeignServerOptions(Table<O> child, ForeignKey<O, ForeignServerOptionsRecord> key) {
        super(child, key, FOREIGN_SERVER_OPTIONS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ForeignServerOptions as(String alias) {
        return new ForeignServerOptions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ForeignServerOptions as(Name alias) {
        return new ForeignServerOptions(alias, this);
    }

    @Override
    @NotNull
    public ForeignServerOptions as(Table<?> alias) {
        return new ForeignServerOptions(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ForeignServerOptions rename(String name) {
        return new ForeignServerOptions(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ForeignServerOptions rename(Name name) {
        return new ForeignServerOptions(name, null);
    }

    @Override
    @NotNull
    public ForeignServerOptions rename(Table<?> name) {
        return new ForeignServerOptions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
