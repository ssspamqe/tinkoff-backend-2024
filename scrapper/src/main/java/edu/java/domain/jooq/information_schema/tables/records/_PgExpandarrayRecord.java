/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables._PgExpandarray;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgExpandarrayRecord extends TableRecordImpl<_PgExpandarrayRecord> {

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
