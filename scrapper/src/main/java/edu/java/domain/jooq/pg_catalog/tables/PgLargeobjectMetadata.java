/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLargeobjectMetadataRecord;

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
 * The table <code>pg_catalog.pg_largeobject_metadata</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLargeobjectMetadata extends TableImpl<PgLargeobjectMetadataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_largeobject_metadata</code>
     */
    public static final PgLargeobjectMetadata PG_LARGEOBJECT_METADATA = new PgLargeobjectMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLargeobjectMetadataRecord> getRecordType() {
        return PgLargeobjectMetadataRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    public final TableField<PgLargeobjectMetadataRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public final TableField<PgLargeobjectMetadataRecord, Long> LOMOWNER = createField(DSL.name("lomowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public final TableField<PgLargeobjectMetadataRecord, String[]> LOMACL = createField(DSL.name("lomacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgLargeobjectMetadata(Name alias, Table<PgLargeobjectMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLargeobjectMetadata(Name alias, Table<PgLargeobjectMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject_metadata</code> table
     * reference
     */
    public PgLargeobjectMetadata(String alias) {
        this(DSL.name(alias), PG_LARGEOBJECT_METADATA);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject_metadata</code> table
     * reference
     */
    public PgLargeobjectMetadata(Name alias) {
        this(alias, PG_LARGEOBJECT_METADATA);
    }

    /**
     * Create a <code>pg_catalog.pg_largeobject_metadata</code> table reference
     */
    public PgLargeobjectMetadata() {
        this(DSL.name("pg_largeobject_metadata"), null);
    }

    public <O extends Record> PgLargeobjectMetadata(Table<O> child, ForeignKey<O, PgLargeobjectMetadataRecord> key) {
        super(child, key, PG_LARGEOBJECT_METADATA);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgLargeobjectMetadataRecord> getPrimaryKey() {
        return Keys.PG_LARGEOBJECT_METADATA_OID_INDEX;
    }

    @Override
    @NotNull
    public PgLargeobjectMetadata as(String alias) {
        return new PgLargeobjectMetadata(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgLargeobjectMetadata as(Name alias) {
        return new PgLargeobjectMetadata(alias, this);
    }

    @Override
    @NotNull
    public PgLargeobjectMetadata as(Table<?> alias) {
        return new PgLargeobjectMetadata(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLargeobjectMetadata rename(String name) {
        return new PgLargeobjectMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLargeobjectMetadata rename(Name name) {
        return new PgLargeobjectMetadata(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLargeobjectMetadata rename(Table<?> name) {
        return new PgLargeobjectMetadata(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
