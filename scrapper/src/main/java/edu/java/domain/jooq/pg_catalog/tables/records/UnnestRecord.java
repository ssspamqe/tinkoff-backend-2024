/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.Unnest;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class UnnestRecord extends TableRecordImpl<UnnestRecord> implements Record1<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public void setUnnest(@Nullable Object value) {
        set(0, value);
    }

    @Deprecated
    @Nullable
    public Object getUnnest() {
        return get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<Object> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Deprecated
    @Override
    @NotNull
    public Field<Object> field1() {
        return Unnest.UNNEST.UNNEST_;
    }

    @Deprecated
    @Override
    @Nullable
    public Object component1() {
        return getUnnest();
    }

    @Deprecated
    @Override
    @Nullable
    public Object value1() {
        return getUnnest();
    }

    @Deprecated
    @Override
    @NotNull
    public UnnestRecord value1(@Nullable Object value) {
        setUnnest(value);
        return this;
    }

    @Override
    @NotNull
    public UnnestRecord values(@Nullable Object value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public UnnestRecord() {
        super(Unnest.UNNEST);
    }

    @ConstructorProperties({ "unnest" })
    public UnnestRecord(@Nullable Object unnest) {
        super(Unnest.UNNEST);

        setUnnest(unnest);
        resetChangedOnNotNull();
    }

    public UnnestRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.Unnest value) {
        super(Unnest.UNNEST);

        if (value != null) {
            setUnnest(value.getUnnest());
            resetChangedOnNotNull();
        }
    }
}
