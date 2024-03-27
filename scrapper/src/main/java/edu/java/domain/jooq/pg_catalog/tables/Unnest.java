/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.UnnestRecord;

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
public class Unnest extends TableImpl<UnnestRecord> {

    private static final long serialVersionUID = 1L;

    public static final Unnest UNNEST = new Unnest();

    @Override
    @NotNull
    public Class<UnnestRecord> getRecordType() {
        return UnnestRecord.class;
    }

    @Deprecated
    public final TableField<UnnestRecord, Object> UNNEST_ = createField(DSL.name("unnest"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"anyrange\""), this, "");

    private Unnest(Name alias, Table<UnnestRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anymultirange\""))
        });
    }

    private Unnest(Name alias, Table<UnnestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public Unnest(String alias) {
        this(DSL.name(alias), UNNEST);
    }

    public Unnest(Name alias) {
        this(alias, UNNEST);
    }

    public Unnest() {
        this(DSL.name("unnest"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public Unnest as(String alias) {
        return new Unnest(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public Unnest as(Name alias) {
        return new Unnest(alias, this, parameters);
    }

    @Override
    @NotNull
    public Unnest as(Table<?> alias) {
        return new Unnest(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public Unnest rename(String name) {
        return new Unnest(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public Unnest rename(Name name) {
        return new Unnest(name, null, parameters);
    }

    @Override
    @NotNull
    public Unnest rename(Table<?> name) {
        return new Unnest(name.getQualifiedName(), null, parameters);
    }

    public Unnest call(
          Object __1
    ) {
        Unnest result = new Unnest(DSL.name("unnest"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anymultirange\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public Unnest call(
          Field<Object> __1
    ) {
        Unnest result = new Unnest(DSL.name("unnest"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
