/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetPublicationTablesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row4;
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
public class PgGetPublicationTables extends TableImpl<PgGetPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgGetPublicationTables PG_GET_PUBLICATION_TABLES = new PgGetPublicationTables();

    @Override
    @NotNull
    public Class<PgGetPublicationTablesRecord> getRecordType() {
        return PgGetPublicationTablesRecord.class;
    }

    public final TableField<PgGetPublicationTablesRecord, Long> PUBID = createField(DSL.name("pubid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetPublicationTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGetPublicationTablesRecord, Object[]> ATTRS = createField(DSL.name("attrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").array(), this, "");

    @Deprecated
    public final TableField<PgGetPublicationTablesRecord, Object> QUAL = createField(DSL.name("qual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB.array())
        });
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgGetPublicationTables(String alias) {
        this(DSL.name(alias), PG_GET_PUBLICATION_TABLES);
    }

    public PgGetPublicationTables(Name alias) {
        this(alias, PG_GET_PUBLICATION_TABLES);
    }

    public PgGetPublicationTables() {
        this(DSL.name("pg_get_publication_tables"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(String alias) {
        return new PgGetPublicationTables(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(Name alias) {
        return new PgGetPublicationTables(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(Table<?> alias) {
        return new PgGetPublicationTables(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables rename(String name) {
        return new PgGetPublicationTables(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables rename(Name name) {
        return new PgGetPublicationTables(name, null, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables rename(Table<?> name) {
        return new PgGetPublicationTables(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Object[], Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    public PgGetPublicationTables call(
          String[] pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            DSL.val(pubname, SQLDataType.CLOB.array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgGetPublicationTables call(
          Field<String[]> pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            pubname
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
