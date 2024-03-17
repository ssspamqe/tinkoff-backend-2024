/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPublication;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * The table <code>pg_catalog.pg_publication</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPublicationRecord extends UpdatableRecordImpl<PgPublicationRecord> implements Record9<Long, String, Long, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public void setPubname(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPubname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public void setPubowner(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPubowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public void setPuballtables(@NotNull Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPuballtables() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public void setPubinsert(@NotNull Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubinsert() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public void setPubupdate(@NotNull Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubupdate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public void setPubdelete(@NotNull Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubdelete() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    public void setPubtruncate(@NotNull Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubtruncate() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubviaroot</code>.
     */
    public void setPubviaroot(@NotNull Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubviaroot</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubviaroot() {
        return (Boolean) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, String, Long, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<Long, String, Long, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgPublication.PG_PUBLICATION.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgPublication.PG_PUBLICATION.PUBNAME;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgPublication.PG_PUBLICATION.PUBOWNER;
    }

    @Override
    @NotNull
    public Field<Boolean> field4() {
        return PgPublication.PG_PUBLICATION.PUBALLTABLES;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgPublication.PG_PUBLICATION.PUBINSERT;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgPublication.PG_PUBLICATION.PUBUPDATE;
    }

    @Override
    @NotNull
    public Field<Boolean> field7() {
        return PgPublication.PG_PUBLICATION.PUBDELETE;
    }

    @Override
    @NotNull
    public Field<Boolean> field8() {
        return PgPublication.PG_PUBLICATION.PUBTRUNCATE;
    }

    @Override
    @NotNull
    public Field<Boolean> field9() {
        return PgPublication.PG_PUBLICATION.PUBVIAROOT;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getPubname();
    }

    @Override
    @NotNull
    public Long component3() {
        return getPubowner();
    }

    @Override
    @NotNull
    public Boolean component4() {
        return getPuballtables();
    }

    @Override
    @NotNull
    public Boolean component5() {
        return getPubinsert();
    }

    @Override
    @NotNull
    public Boolean component6() {
        return getPubupdate();
    }

    @Override
    @NotNull
    public Boolean component7() {
        return getPubdelete();
    }

    @Override
    @NotNull
    public Boolean component8() {
        return getPubtruncate();
    }

    @Override
    @NotNull
    public Boolean component9() {
        return getPubviaroot();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getPubname();
    }

    @Override
    @NotNull
    public Long value3() {
        return getPubowner();
    }

    @Override
    @NotNull
    public Boolean value4() {
        return getPuballtables();
    }

    @Override
    @NotNull
    public Boolean value5() {
        return getPubinsert();
    }

    @Override
    @NotNull
    public Boolean value6() {
        return getPubupdate();
    }

    @Override
    @NotNull
    public Boolean value7() {
        return getPubdelete();
    }

    @Override
    @NotNull
    public Boolean value8() {
        return getPubtruncate();
    }

    @Override
    @NotNull
    public Boolean value9() {
        return getPubviaroot();
    }

    @Override
    @NotNull
    public PgPublicationRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value2(@NotNull String value) {
        setPubname(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value3(@NotNull Long value) {
        setPubowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value4(@NotNull Boolean value) {
        setPuballtables(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value5(@NotNull Boolean value) {
        setPubinsert(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value6(@NotNull Boolean value) {
        setPubupdate(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value7(@NotNull Boolean value) {
        setPubdelete(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value8(@NotNull Boolean value) {
        setPubtruncate(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord value9(@NotNull Boolean value) {
        setPubviaroot(value);
        return this;
    }

    @Override
    @NotNull
    public PgPublicationRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Long value3, @NotNull Boolean value4, @NotNull Boolean value5, @NotNull Boolean value6, @NotNull Boolean value7, @NotNull Boolean value8, @NotNull Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationRecord
     */
    public PgPublicationRecord() {
        super(PgPublication.PG_PUBLICATION);
    }

    /**
     * Create a detached, initialised PgPublicationRecord
     */
    @ConstructorProperties({ "oid", "pubname", "pubowner", "puballtables", "pubinsert", "pubupdate", "pubdelete", "pubtruncate", "pubviaroot" })
    public PgPublicationRecord(@NotNull Long oid, @NotNull String pubname, @NotNull Long pubowner, @NotNull Boolean puballtables, @NotNull Boolean pubinsert, @NotNull Boolean pubupdate, @NotNull Boolean pubdelete, @NotNull Boolean pubtruncate, @NotNull Boolean pubviaroot) {
        super(PgPublication.PG_PUBLICATION);

        setOid(oid);
        setPubname(pubname);
        setPubowner(pubowner);
        setPuballtables(puballtables);
        setPubinsert(pubinsert);
        setPubupdate(pubupdate);
        setPubdelete(pubdelete);
        setPubtruncate(pubtruncate);
        setPubviaroot(pubviaroot);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgPublicationRecord
     */
    public PgPublicationRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPublication value) {
        super(PgPublication.PG_PUBLICATION);

        if (value != null) {
            setOid(value.getOid());
            setPubname(value.getPubname());
            setPubowner(value.getPubowner());
            setPuballtables(value.getPuballtables());
            setPubinsert(value.getPubinsert());
            setPubupdate(value.getPubupdate());
            setPubdelete(value.getPubdelete());
            setPubtruncate(value.getPubtruncate());
            setPubviaroot(value.getPubviaroot());
            resetChangedOnNotNull();
        }
    }
}
