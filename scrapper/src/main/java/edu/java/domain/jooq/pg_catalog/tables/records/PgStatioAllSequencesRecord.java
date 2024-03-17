/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatioAllSequences;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatioAllSequencesRecord extends TableRecordImpl<PgStatioAllSequencesRecord> implements Record5<Long, String, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    public void setRelid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(0);
    }

    public void setSchemaname(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(1);
    }

    public void setRelname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getRelname() {
        return (String) get(2);
    }

    public void setBlksRead(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getBlksRead() {
        return (Long) get(3);
    }

    public void setBlksHit(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getBlksHit() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Long, String, String, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES.RELID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES.RELNAME;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES.BLKS_READ;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES.BLKS_HIT;
    }

    @Override
    @Nullable
    public Long component1() {
        return getRelid();
    }

    @Override
    @Nullable
    public String component2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component3() {
        return getRelname();
    }

    @Override
    @Nullable
    public Long component4() {
        return getBlksRead();
    }

    @Override
    @Nullable
    public Long component5() {
        return getBlksHit();
    }

    @Override
    @Nullable
    public Long value1() {
        return getRelid();
    }

    @Override
    @Nullable
    public String value2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value3() {
        return getRelname();
    }

    @Override
    @Nullable
    public Long value4() {
        return getBlksRead();
    }

    @Override
    @Nullable
    public Long value5() {
        return getBlksHit();
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord value1(@Nullable Long value) {
        setRelid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord value2(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord value3(@Nullable String value) {
        setRelname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord value4(@Nullable Long value) {
        setBlksRead(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord value5(@Nullable Long value) {
        setBlksHit(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatioAllSequencesRecord values(@Nullable Long value1, @Nullable String value2, @Nullable String value3, @Nullable Long value4, @Nullable Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatioAllSequencesRecord() {
        super(PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES);
    }

    @ConstructorProperties({ "relid", "schemaname", "relname", "blksRead", "blksHit" })
    public PgStatioAllSequencesRecord(@Nullable Long relid, @Nullable String schemaname, @Nullable String relname, @Nullable Long blksRead, @Nullable Long blksHit) {
        super(PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setBlksRead(blksRead);
        setBlksHit(blksHit);
        resetChangedOnNotNull();
    }

    public PgStatioAllSequencesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatioAllSequences value) {
        super(PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES);

        if (value != null) {
            setRelid(value.getRelid());
            setSchemaname(value.getSchemaname());
            setRelname(value.getRelname());
            setBlksRead(value.getBlksRead());
            setBlksHit(value.getBlksHit());
            resetChangedOnNotNull();
        }
    }
}
