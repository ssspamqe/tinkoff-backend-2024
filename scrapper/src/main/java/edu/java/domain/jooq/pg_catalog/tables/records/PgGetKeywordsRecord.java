/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetKeywords;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_get_keywords</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetKeywordsRecord extends TableRecordImpl<PgGetKeywordsRecord> implements Record5<String, String, Boolean, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_keywords.word</code>.
     */
    public void setWord(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_keywords.word</code>.
     */
    @Nullable
    public String getWord() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_keywords.catcode</code>.
     */
    public void setCatcode(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_keywords.catcode</code>.
     */
    @Nullable
    public String getCatcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_keywords.barelabel</code>.
     */
    public void setBarelabel(@Nullable Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_keywords.barelabel</code>.
     */
    @Nullable
    public Boolean getBarelabel() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_keywords.catdesc</code>.
     */
    public void setCatdesc(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_keywords.catdesc</code>.
     */
    @Nullable
    public String getCatdesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_keywords.baredesc</code>.
     */
    public void setBaredesc(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_keywords.baredesc</code>.
     */
    @Nullable
    public String getBaredesc() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, Boolean, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<String, String, Boolean, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgGetKeywords.PG_GET_KEYWORDS.WORD;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgGetKeywords.PG_GET_KEYWORDS.CATCODE;
    }

    @Override
    @NotNull
    public Field<Boolean> field3() {
        return PgGetKeywords.PG_GET_KEYWORDS.BARELABEL;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgGetKeywords.PG_GET_KEYWORDS.CATDESC;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgGetKeywords.PG_GET_KEYWORDS.BAREDESC;
    }

    @Override
    @Nullable
    public String component1() {
        return getWord();
    }

    @Override
    @Nullable
    public String component2() {
        return getCatcode();
    }

    @Override
    @Nullable
    public Boolean component3() {
        return getBarelabel();
    }

    @Override
    @Nullable
    public String component4() {
        return getCatdesc();
    }

    @Override
    @Nullable
    public String component5() {
        return getBaredesc();
    }

    @Override
    @Nullable
    public String value1() {
        return getWord();
    }

    @Override
    @Nullable
    public String value2() {
        return getCatcode();
    }

    @Override
    @Nullable
    public Boolean value3() {
        return getBarelabel();
    }

    @Override
    @Nullable
    public String value4() {
        return getCatdesc();
    }

    @Override
    @Nullable
    public String value5() {
        return getBaredesc();
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord value1(@Nullable String value) {
        setWord(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord value2(@Nullable String value) {
        setCatcode(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord value3(@Nullable Boolean value) {
        setBarelabel(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord value4(@Nullable String value) {
        setCatdesc(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord value5(@Nullable String value) {
        setBaredesc(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetKeywordsRecord values(@Nullable String value1, @Nullable String value2, @Nullable Boolean value3, @Nullable String value4, @Nullable String value5) {
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

    /**
     * Create a detached PgGetKeywordsRecord
     */
    public PgGetKeywordsRecord() {
        super(PgGetKeywords.PG_GET_KEYWORDS);
    }

    /**
     * Create a detached, initialised PgGetKeywordsRecord
     */
    @ConstructorProperties({ "word", "catcode", "barelabel", "catdesc", "baredesc" })
    public PgGetKeywordsRecord(@Nullable String word, @Nullable String catcode, @Nullable Boolean barelabel, @Nullable String catdesc, @Nullable String baredesc) {
        super(PgGetKeywords.PG_GET_KEYWORDS);

        setWord(word);
        setCatcode(catcode);
        setBarelabel(barelabel);
        setCatdesc(catdesc);
        setBaredesc(baredesc);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetKeywordsRecord
     */
    public PgGetKeywordsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetKeywords value) {
        super(PgGetKeywords.PG_GET_KEYWORDS);

        if (value != null) {
            setWord(value.getWord());
            setCatcode(value.getCatcode());
            setBarelabel(value.getBarelabel());
            setCatdesc(value.getCatdesc());
            setBaredesc(value.getBaredesc());
            resetChangedOnNotNull();
        }
    }
}
