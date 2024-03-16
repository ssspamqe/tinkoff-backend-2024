/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgMcvListItems;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgMcvListItemsRecord extends TableRecordImpl<PgMcvListItemsRecord> implements Record5<Integer, String[], Boolean[], Double, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.index</code>.
     */
    public void setIndex(@Nullable Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.index</code>.
     */
    @Nullable
    public Integer getIndex() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.values</code>.
     */
    public void setValues(@Nullable String[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.values</code>.
     */
    @Nullable
    public String[] getValues() {
        return (String[]) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.nulls</code>.
     */
    public void setNulls(@Nullable Boolean[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.nulls</code>.
     */
    @Nullable
    public Boolean[] getNulls() {
        return (Boolean[]) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.frequency</code>.
     */
    public void setFrequency(@Nullable Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.frequency</code>.
     */
    @Nullable
    public Double getFrequency() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.base_frequency</code>.
     */
    public void setBaseFrequency(@Nullable Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.base_frequency</code>.
     */
    @Nullable
    public Double getBaseFrequency() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Integer, String[], Boolean[], Double, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Integer, String[], Boolean[], Double, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.INDEX;
    }

    @Override
    @NotNull
    public Field<String[]> field2() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.VALUES;
    }

    @Override
    @NotNull
    public Field<Boolean[]> field3() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.NULLS;
    }

    @Override
    @NotNull
    public Field<Double> field4() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.FREQUENCY;
    }

    @Override
    @NotNull
    public Field<Double> field5() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.BASE_FREQUENCY;
    }

    @Override
    @Nullable
    public Integer component1() {
        return getIndex();
    }

    @Override
    @Nullable
    public String[] component2() {
        return getValues();
    }

    @Override
    @Nullable
    public Boolean[] component3() {
        return getNulls();
    }

    @Override
    @Nullable
    public Double component4() {
        return getFrequency();
    }

    @Override
    @Nullable
    public Double component5() {
        return getBaseFrequency();
    }

    @Override
    @Nullable
    public Integer value1() {
        return getIndex();
    }

    @Override
    @Nullable
    public String[] value2() {
        return getValues();
    }

    @Override
    @Nullable
    public Boolean[] value3() {
        return getNulls();
    }

    @Override
    @Nullable
    public Double value4() {
        return getFrequency();
    }

    @Override
    @Nullable
    public Double value5() {
        return getBaseFrequency();
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord value1(@Nullable Integer value) {
        setIndex(value);
        return this;
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord value2(@Nullable String[] value) {
        setValues(value);
        return this;
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord value3(@Nullable Boolean[] value) {
        setNulls(value);
        return this;
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord value4(@Nullable Double value) {
        setFrequency(value);
        return this;
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord value5(@Nullable Double value) {
        setBaseFrequency(value);
        return this;
    }

    @Override
    @NotNull
    public PgMcvListItemsRecord values(@Nullable Integer value1, @Nullable String[] value2, @Nullable Boolean[] value3, @Nullable Double value4, @Nullable Double value5) {
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
     * Create a detached PgMcvListItemsRecord
     */
    public PgMcvListItemsRecord() {
        super(PgMcvListItems.PG_MCV_LIST_ITEMS);
    }

    /**
     * Create a detached, initialised PgMcvListItemsRecord
     */
    @ConstructorProperties({ "index", "values", "nulls", "frequency", "baseFrequency" })
    public PgMcvListItemsRecord(@Nullable Integer index, @Nullable String[] values, @Nullable Boolean[] nulls, @Nullable Double frequency, @Nullable Double baseFrequency) {
        super(PgMcvListItems.PG_MCV_LIST_ITEMS);

        setIndex(index);
        setValues(values);
        setNulls(nulls);
        setFrequency(frequency);
        setBaseFrequency(baseFrequency);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgMcvListItemsRecord
     */
    public PgMcvListItemsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgMcvListItems value) {
        super(PgMcvListItems.PG_MCV_LIST_ITEMS);

        if (value != null) {
            setIndex(value.getIndex());
            setValues(value.getValues());
            setNulls(value.getNulls());
            setFrequency(value.getFrequency());
            setBaseFrequency(value.getBaseFrequency());
            resetChangedOnNotNull();
        }
    }
}
