/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * The routine <code>pg_catalog.float4abs</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Float4abs extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.float4abs.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.REAL, false, false);

    /**
     * The parameter <code>pg_catalog.float4abs._1</code>.
     */
    public static final Parameter<Float> _1 = Internal.createParameter("_1", SQLDataType.REAL, false, true);

    /**
     * Create a new routine call instance
     */
    public Float4abs() {
        super("float4abs", PgCatalog.PG_CATALOG, SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Float value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Float> field) {
        setField(_1, field);
    }
}
