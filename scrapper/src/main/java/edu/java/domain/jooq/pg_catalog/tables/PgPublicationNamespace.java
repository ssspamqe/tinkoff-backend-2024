/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPublicationNamespaceRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table <code>pg_catalog.pg_publication_namespace</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPublicationNamespace extends TableImpl<PgPublicationNamespaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_publication_namespace</code>
     */
    public static final PgPublicationNamespace PG_PUBLICATION_NAMESPACE = new PgPublicationNamespace();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgPublicationNamespaceRecord> getRecordType() {
        return PgPublicationNamespaceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    public final TableField<PgPublicationNamespaceRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    public final TableField<PgPublicationNamespaceRecord, Long> PNPUBID = createField(DSL.name("pnpubid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    public final TableField<PgPublicationNamespaceRecord, Long> PNNSPID = createField(DSL.name("pnnspid"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgPublicationNamespace(Name alias, Table<PgPublicationNamespaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationNamespace(Name alias, Table<PgPublicationNamespaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_namespace</code> table
     * reference
     */
    public PgPublicationNamespace(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_NAMESPACE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_namespace</code> table
     * reference
     */
    public PgPublicationNamespace(Name alias) {
        this(alias, PG_PUBLICATION_NAMESPACE);
    }

    /**
     * Create a <code>pg_catalog.pg_publication_namespace</code> table reference
     */
    public PgPublicationNamespace() {
        this(DSL.name("pg_publication_namespace"), null);
    }

    public <O extends Record> PgPublicationNamespace(Table<O> child, ForeignKey<O, PgPublicationNamespaceRecord> key) {
        super(child, key, PG_PUBLICATION_NAMESPACE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgPublicationNamespaceRecord> getPrimaryKey() {
        return Keys.PG_PUBLICATION_NAMESPACE_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgPublicationNamespaceRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PUBLICATION_NAMESPACE_PNNSPID_PNPUBID_INDEX);
    }

    @Override
    @NotNull
    public PgPublicationNamespace as(String alias) {
        return new PgPublicationNamespace(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgPublicationNamespace as(Name alias) {
        return new PgPublicationNamespace(alias, this);
    }

    @Override
    @NotNull
    public PgPublicationNamespace as(Table<?> alias) {
        return new PgPublicationNamespace(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPublicationNamespace rename(String name) {
        return new PgPublicationNamespace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPublicationNamespace rename(Name name) {
        return new PgPublicationNamespace(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPublicationNamespace rename(Table<?> name) {
        return new PgPublicationNamespace(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
