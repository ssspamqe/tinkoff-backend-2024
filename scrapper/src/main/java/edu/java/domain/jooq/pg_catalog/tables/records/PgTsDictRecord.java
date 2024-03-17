/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTsDict;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTsDictRecord extends UpdatableRecordImpl<PgTsDictRecord> implements Record6<Long, String, Long, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setDictname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDictname() {
        return (String) get(1);
    }

    public void setDictnamespace(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDictnamespace() {
        return (Long) get(2);
    }

    public void setDictowner(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDictowner() {
        return (Long) get(3);
    }

    public void setDicttemplate(@NotNull Long value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDicttemplate() {
        return (Long) get(4);
    }

    public void setDictinitoption(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getDictinitoption() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, String, Long, Long, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Long, String, Long, Long, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgTsDict.PG_TS_DICT.OID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgTsDict.PG_TS_DICT.DICTNAME;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgTsDict.PG_TS_DICT.DICTNAMESPACE;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgTsDict.PG_TS_DICT.DICTOWNER;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgTsDict.PG_TS_DICT.DICTTEMPLATE;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgTsDict.PG_TS_DICT.DICTINITOPTION;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public String component2() {
        return getDictname();
    }

    @Override
    @NotNull
    public Long component3() {
        return getDictnamespace();
    }

    @Override
    @NotNull
    public Long component4() {
        return getDictowner();
    }

    @Override
    @NotNull
    public Long component5() {
        return getDicttemplate();
    }

    @Override
    @Nullable
    public String component6() {
        return getDictinitoption();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public String value2() {
        return getDictname();
    }

    @Override
    @NotNull
    public Long value3() {
        return getDictnamespace();
    }

    @Override
    @NotNull
    public Long value4() {
        return getDictowner();
    }

    @Override
    @NotNull
    public Long value5() {
        return getDicttemplate();
    }

    @Override
    @Nullable
    public String value6() {
        return getDictinitoption();
    }

    @Override
    @NotNull
    public PgTsDictRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord value2(@NotNull String value) {
        setDictname(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord value3(@NotNull Long value) {
        setDictnamespace(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord value4(@NotNull Long value) {
        setDictowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord value5(@NotNull Long value) {
        setDicttemplate(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord value6(@Nullable String value) {
        setDictinitoption(value);
        return this;
    }

    @Override
    @NotNull
    public PgTsDictRecord values(@NotNull Long value1, @NotNull String value2, @NotNull Long value3, @NotNull Long value4, @NotNull Long value5, @Nullable String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTsDictRecord() {
        super(PgTsDict.PG_TS_DICT);
    }

    @ConstructorProperties({ "oid", "dictname", "dictnamespace", "dictowner", "dicttemplate", "dictinitoption" })
    public PgTsDictRecord(@NotNull Long oid, @NotNull String dictname, @NotNull Long dictnamespace, @NotNull Long dictowner, @NotNull Long dicttemplate, @Nullable String dictinitoption) {
        super(PgTsDict.PG_TS_DICT);

        setOid(oid);
        setDictname(dictname);
        setDictnamespace(dictnamespace);
        setDictowner(dictowner);
        setDicttemplate(dicttemplate);
        setDictinitoption(dictinitoption);
        resetChangedOnNotNull();
    }

    public PgTsDictRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTsDict value) {
        super(PgTsDict.PG_TS_DICT);

        if (value != null) {
            setOid(value.getOid());
            setDictname(value.getDictname());
            setDictnamespace(value.getDictnamespace());
            setDictowner(value.getDictowner());
            setDicttemplate(value.getDicttemplate());
            setDictinitoption(value.getDictinitoption());
            resetChangedOnNotNull();
        }
    }
}
