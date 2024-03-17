/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgSequence;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSequenceRecord extends TableRecordImpl<PgSequenceRecord> {

    private static final long serialVersionUID = 1L;

    public void setSeqrelid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqrelid() {
        return (Long) get(0);
    }

    public void setSeqtypid(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqtypid() {
        return (Long) get(1);
    }

    public void setSeqstart(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqstart() {
        return (Long) get(2);
    }

    public void setSeqincrement(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqincrement() {
        return (Long) get(3);
    }

    public void setSeqmax(@NotNull Long value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqmax() {
        return (Long) get(4);
    }

    public void setSeqmin(@NotNull Long value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqmin() {
        return (Long) get(5);
    }

    public void setSeqcache(@NotNull Long value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqcache() {
        return (Long) get(6);
    }

    public void setSeqcycle(@NotNull Boolean value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSeqcycle() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgSequenceRecord() {
        super(PgSequence.PG_SEQUENCE);
    }

    @ConstructorProperties({ "seqrelid", "seqtypid", "seqstart", "seqincrement", "seqmax", "seqmin", "seqcache", "seqcycle" })
    public PgSequenceRecord(@NotNull Long seqrelid, @NotNull Long seqtypid, @NotNull Long seqstart, @NotNull Long seqincrement, @NotNull Long seqmax, @NotNull Long seqmin, @NotNull Long seqcache, @NotNull Boolean seqcycle) {
        super(PgSequence.PG_SEQUENCE);

        setSeqrelid(seqrelid);
        setSeqtypid(seqtypid);
        setSeqstart(seqstart);
        setSeqincrement(seqincrement);
        setSeqmax(seqmax);
        setSeqmin(seqmin);
        setSeqcache(seqcache);
        setSeqcycle(seqcycle);
        resetChangedOnNotNull();
    }

    public PgSequenceRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgSequence value) {
        super(PgSequence.PG_SEQUENCE);

        if (value != null) {
            setSeqrelid(value.getSeqrelid());
            setSeqtypid(value.getSeqtypid());
            setSeqstart(value.getSeqstart());
            setSeqincrement(value.getSeqincrement());
            setSeqmax(value.getSeqmax());
            setSeqmin(value.getSeqmin());
            setSeqcache(value.getSeqcache());
            setSeqcycle(value.getSeqcycle());
            resetChangedOnNotNull();
        }
    }
}
