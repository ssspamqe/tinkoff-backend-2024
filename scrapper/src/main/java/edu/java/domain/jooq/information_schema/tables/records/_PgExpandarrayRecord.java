/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables._PgExpandarray;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgExpandarrayRecord extends TableRecordImpl<_PgExpandarrayRecord> implements Record2<Object, Integer> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public void setX(@Nullable Object value) {
        set(0, value);
    }

    @Deprecated
    @Nullable
    public Object getX() {
        return get(0);
    }

    public void setN(@Nullable Integer value) {
        set(1, value);
    }

    @Nullable
    public Integer getN() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row2<Object, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<Object, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Deprecated
    @Override
    @NotNull
    public Field<Object> field1() {
        return _PgExpandarray._PG_EXPANDARRAY.X;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return _PgExpandarray._PG_EXPANDARRAY.N;
    }

    @Deprecated
    @Override
    @Nullable
    public Object component1() {
        return getX();
    }

    @Override
    @Nullable
    public Integer component2() {
        return getN();
    }

    @Deprecated
    @Override
    @Nullable
    public Object value1() {
        return getX();
    }

    @Override
    @Nullable
    public Integer value2() {
        return getN();
    }

    @Deprecated
    @Override
    @NotNull
    public _PgExpandarrayRecord value1(@Nullable Object value) {
        setX(value);
        return this;
    }

    @Override
    @NotNull
    public _PgExpandarrayRecord value2(@Nullable Integer value) {
        setN(value);
        return this;
    }

    @Override
    @NotNull
    public _PgExpandarrayRecord values(@Nullable Object value1, @Nullable Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public _PgExpandarrayRecord() {
        super(_PgExpandarray._PG_EXPANDARRAY);
    }

    @ConstructorProperties({ "x", "n" })
    public _PgExpandarrayRecord(@Nullable Object x, @Nullable Integer n) {
        super(_PgExpandarray._PG_EXPANDARRAY);

        setX(x);
        setN(n);
        resetChangedOnNotNull();
    }

    public _PgExpandarrayRecord(edu.java.domain.jooq.information_schema.tables.pojos._PgExpandarray value) {
        super(_PgExpandarray._PG_EXPANDARRAY);

        if (value != null) {
            setX(value.getX());
            setN(value.getN());
            resetChangedOnNotNull();
        }
    }
}
