/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.LocalDate;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * The routine <code>pg_catalog.in_range</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InRange8 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.in_range.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.in_range._1</code>.
     */
    public static final Parameter<LocalDate> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.in_range._2</code>.
     */
    public static final Parameter<LocalDate> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.in_range._3</code>.
     */
    public static final Parameter<YearToSecond> _3 = Internal.createParameter("_3", SQLDataType.INTERVAL, false, true);

    /**
     * The parameter <code>pg_catalog.in_range._4</code>.
     */
    public static final Parameter<Boolean> _4 = Internal.createParameter("_4", SQLDataType.BOOLEAN, false, true);

    /**
     * The parameter <code>pg_catalog.in_range._5</code>.
     */
    public static final Parameter<Boolean> _5 = Internal.createParameter("_5", SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public InRange8() {
        super("in_range", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDate value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDate> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDate value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDate> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(YearToSecond value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__3(Field<YearToSecond> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Boolean value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__4(Field<Boolean> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Boolean value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__5(Field<Boolean> field) {
        setField(_5, field);
    }
}
