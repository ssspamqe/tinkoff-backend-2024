/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.JsonbPathQueryRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Schema;
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
public class JsonbPathQuery extends TableImpl<JsonbPathQueryRecord> {

    private static final long serialVersionUID = 1L;

    public static final JsonbPathQuery JSONB_PATH_QUERY = new JsonbPathQuery();

    @Override
    @NotNull
    public Class<JsonbPathQueryRecord> getRecordType() {
        return JsonbPathQueryRecord.class;
    }

    public final TableField<JsonbPathQueryRecord, JSONB> JSONB_PATH_QUERY_ = createField(DSL.name("jsonb_path_query"), SQLDataType.JSONB, this, "");

    private JsonbPathQuery(Name alias, Table<JsonbPathQueryRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
            DSL.val(null, SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB))),
            DSL.val(null, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
        });
    }

    private JsonbPathQuery(Name alias, Table<JsonbPathQueryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public JsonbPathQuery(String alias) {
        this(DSL.name(alias), JSONB_PATH_QUERY);
    }

    public JsonbPathQuery(Name alias) {
        this(alias, JSONB_PATH_QUERY);
    }

    public JsonbPathQuery() {
        this(DSL.name("jsonb_path_query"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public JsonbPathQuery as(String alias) {
        return new JsonbPathQuery(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public JsonbPathQuery as(Name alias) {
        return new JsonbPathQuery(alias, this, parameters);
    }

    @Override
    @NotNull
    public JsonbPathQuery as(Table<?> alias) {
        return new JsonbPathQuery(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public JsonbPathQuery rename(String name) {
        return new JsonbPathQuery(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public JsonbPathQuery rename(Name name) {
        return new JsonbPathQuery(name, null, parameters);
    }

    @Override
    @NotNull
    public JsonbPathQuery rename(Table<?> name) {
        return new JsonbPathQuery(name.getQualifiedName(), null, parameters);
    }

    public JsonbPathQuery call(
          JSONB target
        , Object path
        , JSONB vars
        , Boolean silent
    ) {
        JsonbPathQuery result = new JsonbPathQuery(DSL.name("jsonb_path_query"), null, new Field[] {
            DSL.val(target, SQLDataType.JSONB),
            DSL.val(path, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
            DSL.val(vars, SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB))),
            DSL.val(silent, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public JsonbPathQuery call(
          Field<JSONB> target
        , Field<Object> path
        , Field<JSONB> vars
        , Field<Boolean> silent
    ) {
        JsonbPathQuery result = new JsonbPathQuery(DSL.name("jsonb_path_query"), null, new Field[] {
            target,
            path,
            vars,
            silent
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}