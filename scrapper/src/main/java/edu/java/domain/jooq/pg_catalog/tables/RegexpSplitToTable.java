/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.RegexpSplitToTableRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
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
public class RegexpSplitToTable extends TableImpl<RegexpSplitToTableRecord> {

    private static final long serialVersionUID = 1L;

    public static final RegexpSplitToTable REGEXP_SPLIT_TO_TABLE = new RegexpSplitToTable();

    @Override
    @NotNull
    public Class<RegexpSplitToTableRecord> getRecordType() {
        return RegexpSplitToTableRecord.class;
    }

    public final TableField<RegexpSplitToTableRecord, String> REGEXP_SPLIT_TO_TABLE_ = createField(DSL.name("regexp_split_to_table"), SQLDataType.CLOB, this, "");

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public RegexpSplitToTable(String alias) {
        this(DSL.name(alias), REGEXP_SPLIT_TO_TABLE);
    }

    public RegexpSplitToTable(Name alias) {
        this(alias, REGEXP_SPLIT_TO_TABLE);
    }

    public RegexpSplitToTable() {
        this(DSL.name("regexp_split_to_table"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public RegexpSplitToTable as(String alias) {
        return new RegexpSplitToTable(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public RegexpSplitToTable as(Name alias) {
        return new RegexpSplitToTable(alias, this, parameters);
    }

    @Override
    @NotNull
    public RegexpSplitToTable as(Table<?> alias) {
        return new RegexpSplitToTable(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public RegexpSplitToTable rename(String name) {
        return new RegexpSplitToTable(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public RegexpSplitToTable rename(Name name) {
        return new RegexpSplitToTable(name, null, parameters);
    }

    @Override
    @NotNull
    public RegexpSplitToTable rename(Table<?> name) {
        return new RegexpSplitToTable(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    public RegexpSplitToTable call(
          String __1
        , String __2
        , String __3
    ) {
        RegexpSplitToTable result = new RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB),
            DSL.val(__2, SQLDataType.CLOB),
            DSL.val(__3, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public RegexpSplitToTable call(
          Field<String> __1
        , Field<String> __2
        , Field<String> __3
    ) {
        RegexpSplitToTable result = new RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, new Field[] {
            __1,
            __2,
            __3
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public <U> SelectField<U> mapping(Function1<? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
