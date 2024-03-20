/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ForeignTablesRecord;

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
public class ForeignTables extends TableImpl<ForeignTablesRecord> {

    private static final long serialVersionUID = 1L;

    public static final ForeignTables FOREIGN_TABLES = new ForeignTables();

    @Override
    @NotNull
    public Class<ForeignTablesRecord> getRecordType() {
        return ForeignTablesRecord.class;
    }

    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTablesRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignTablesRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ForeignTables(Name alias, Table<ForeignTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignTables(Name alias, Table<ForeignTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public ForeignTables(String alias) {
        this(DSL.name(alias), FOREIGN_TABLES);
    }

    public ForeignTables(Name alias) {
        this(alias, FOREIGN_TABLES);
    }

    public ForeignTables() {
        this(DSL.name("foreign_tables"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ForeignTables as(String alias) {
        return new ForeignTables(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ForeignTables as(Name alias) {
        return new ForeignTables(alias, this);
    }

    @Override
    @NotNull
    public ForeignTables as(Table<?> alias) {
        return new ForeignTables(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ForeignTables rename(String name) {
        return new ForeignTables(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ForeignTables rename(Name name) {
        return new ForeignTables(name, null);
    }

    @Override
    @NotNull
    public ForeignTables rename(Table<?> name) {
        return new ForeignTables(name.getQualifiedName(), null);
    }
}