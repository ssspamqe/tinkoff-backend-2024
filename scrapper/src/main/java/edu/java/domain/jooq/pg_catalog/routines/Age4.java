/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * The routine <code>pg_catalog.age</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Age4 extends AbstractRoutine<YearToSecond> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.age.RETURN_VALUE</code>.
     */
    public static final Parameter<YearToSecond> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>pg_catalog.age._1</code>.
     */
    public static final Parameter<LocalDateTime> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATETIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.age._2</code>.
     */
    public static final Parameter<LocalDateTime> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATETIME(6), false, true);

    /**
     * Create a new routine call instance
     */
    public Age4() {
        super("age", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDateTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDateTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDateTime> field) {
        setField(_2, field);
    }
}
