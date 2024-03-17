/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgRange;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgRangeRecord extends UpdatableRecordImpl<PgRangeRecord> implements Record7<Long, Long, Long, Long, Long, String, String> {

    private static final long serialVersionUID = 1L;

    public void setRngtypid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRngtypid() {
        return (Long) get(0);
    }

    public void setRngsubtype(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRngsubtype() {
        return (Long) get(1);
    }

    public void setRngmultitypid(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRngmultitypid() {
        return (Long) get(2);
    }

    public void setRngcollation(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRngcollation() {
        return (Long) get(3);
    }

    public void setRngsubopc(@NotNull Long value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRngsubopc() {
        return (Long) get(4);
    }

    public void setRngcanonical(@NotNull String value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRngcanonical() {
        return (String) get(5);
    }

    public void setRngsubdiff(@NotNull String value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRngsubdiff() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, Long, Long, Long, Long, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<Long, Long, Long, Long, Long, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgRange.PG_RANGE.RNGTYPID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgRange.PG_RANGE.RNGSUBTYPE;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgRange.PG_RANGE.RNGMULTITYPID;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgRange.PG_RANGE.RNGCOLLATION;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgRange.PG_RANGE.RNGSUBOPC;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgRange.PG_RANGE.RNGCANONICAL;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return PgRange.PG_RANGE.RNGSUBDIFF;
    }

    @Override
    @NotNull
    public Long component1() {
        return getRngtypid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getRngsubtype();
    }

    @Override
    @NotNull
    public Long component3() {
        return getRngmultitypid();
    }

    @Override
    @NotNull
    public Long component4() {
        return getRngcollation();
    }

    @Override
    @NotNull
    public Long component5() {
        return getRngsubopc();
    }

    @Override
    @NotNull
    public String component6() {
        return getRngcanonical();
    }

    @Override
    @NotNull
    public String component7() {
        return getRngsubdiff();
    }

    @Override
    @NotNull
    public Long value1() {
        return getRngtypid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getRngsubtype();
    }

    @Override
    @NotNull
    public Long value3() {
        return getRngmultitypid();
    }

    @Override
    @NotNull
    public Long value4() {
        return getRngcollation();
    }

    @Override
    @NotNull
    public Long value5() {
        return getRngsubopc();
    }

    @Override
    @NotNull
    public String value6() {
        return getRngcanonical();
    }

    @Override
    @NotNull
    public String value7() {
        return getRngsubdiff();
    }

    @Override
    @NotNull
    public PgRangeRecord value1(@NotNull Long value) {
        setRngtypid(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value2(@NotNull Long value) {
        setRngsubtype(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value3(@NotNull Long value) {
        setRngmultitypid(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value4(@NotNull Long value) {
        setRngcollation(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value5(@NotNull Long value) {
        setRngsubopc(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value6(@NotNull String value) {
        setRngcanonical(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord value7(@NotNull String value) {
        setRngsubdiff(value);
        return this;
    }

    @Override
    @NotNull
    public PgRangeRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Long value3, @NotNull Long value4, @NotNull Long value5, @NotNull String value6, @NotNull String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgRangeRecord() {
        super(PgRange.PG_RANGE);
    }

    @ConstructorProperties({ "rngtypid", "rngsubtype", "rngmultitypid", "rngcollation", "rngsubopc", "rngcanonical", "rngsubdiff" })
    public PgRangeRecord(@NotNull Long rngtypid, @NotNull Long rngsubtype, @NotNull Long rngmultitypid, @NotNull Long rngcollation, @NotNull Long rngsubopc, @NotNull String rngcanonical, @NotNull String rngsubdiff) {
        super(PgRange.PG_RANGE);

        setRngtypid(rngtypid);
        setRngsubtype(rngsubtype);
        setRngmultitypid(rngmultitypid);
        setRngcollation(rngcollation);
        setRngsubopc(rngsubopc);
        setRngcanonical(rngcanonical);
        setRngsubdiff(rngsubdiff);
        resetChangedOnNotNull();
    }

    public PgRangeRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgRange value) {
        super(PgRange.PG_RANGE);

        if (value != null) {
            setRngtypid(value.getRngtypid());
            setRngsubtype(value.getRngsubtype());
            setRngmultitypid(value.getRngmultitypid());
            setRngcollation(value.getRngcollation());
            setRngsubopc(value.getRngsubopc());
            setRngcanonical(value.getRngcanonical());
            setRngsubdiff(value.getRngsubdiff());
            resetChangedOnNotNull();
        }
    }
}
