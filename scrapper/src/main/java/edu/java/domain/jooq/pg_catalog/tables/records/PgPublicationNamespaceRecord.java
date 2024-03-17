/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPublicationNamespace;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PgPublicationNamespaceRecord extends UpdatableRecordImpl<PgPublicationNamespaceRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    public void setPnpubid(@NotNull Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPnpubid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    public void setPnnspid(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPnnspid() {
        return (Long) get(2);
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
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.OID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.PNPUBID;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.PNNSPID;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getPnpubid();
    }

    @Override
    @NotNull
    public Long component3() {
        return getPnnspid();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getPnpubid();
    }

    @Override
    @NotNull
    public Long value3() {
        return getPnnspid();
    }

    @Override
    @NotNull
    public PgPublicationNamespaceRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationNamespaceRecord value2(@NotNull Long value) {
        setPnpubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationNamespaceRecord value3(@NotNull Long value) {
        setPnnspid(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationNamespaceRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationNamespaceRecord
     */
    public PgPublicationNamespaceRecord() {
        super(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgPublicationNamespaceRecord
     */
    @ConstructorProperties({ "oid", "pnpubid", "pnnspid" })
    public PgPublicationNamespaceRecord(@NotNull Long oid, @NotNull Long pnpubid, @NotNull Long pnnspid) {
        super(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE);

        setOid(oid);
        setPnpubid(pnpubid);
        setPnnspid(pnnspid);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgPublicationNamespaceRecord
     */
    public PgPublicationNamespaceRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPublicationNamespace value) {
        super(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE);

        if (value != null) {
            setOid(value.getOid());
            setPnpubid(value.getPnpubid());
            setPnnspid(value.getPnnspid());
            resetChangedOnNotNull();
        }
    }
}
