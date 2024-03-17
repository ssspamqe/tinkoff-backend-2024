/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLargeobjectMetadata;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PgLargeobjectMetadataRecord extends UpdatableRecordImpl<PgLargeobjectMetadataRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public void setLomowner(@NotNull Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getLomowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public void setLomacl(@Nullable String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    @Nullable
    public String[] getLomacl() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.OID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMOWNER;
    }

    @Override
    @NotNull
    public Field<String[]> field3() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMACL;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getLomowner();
    }

    @Override
    @Nullable
    public String[] component3() {
        return getLomacl();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getLomowner();
    }

    @Override
    @Nullable
    public String[] value3() {
        return getLomacl();
    }

    @Override
    @NotNull
    public PgLargeobjectMetadataRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgLargeobjectMetadataRecord value2(@NotNull Long value) {
        setLomowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgLargeobjectMetadataRecord value3(@Nullable String[] value) {
        setLomacl(value);
        return this;
    }

    @Override
    @NotNull
    public PgLargeobjectMetadataRecord values(@NotNull Long value1, @NotNull Long value2, @Nullable String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord() {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);
    }

    /**
     * Create a detached, initialised PgLargeobjectMetadataRecord
     */
    @ConstructorProperties({ "oid", "lomowner", "lomacl" })
    public PgLargeobjectMetadataRecord(@NotNull Long oid, @NotNull Long lomowner, @Nullable String[] lomacl) {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);

        setOid(oid);
        setLomowner(lomowner);
        setLomacl(lomacl);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLargeobjectMetadata value) {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);

        if (value != null) {
            setOid(value.getOid());
            setLomowner(value.getLomowner());
            setLomacl(value.getLomacl());
            resetChangedOnNotNull();
        }
    }
}
