/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.routines;


import edu.java.domain.jooq.information_schema.InformationSchema;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * The routine <code>information_schema._pg_numeric_scale</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgNumericScale extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>information_schema._pg_numeric_scale.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>information_schema._pg_numeric_scale.typid</code>.
     */
    public static final Parameter<Long> TYPID = Internal.createParameter("typid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>information_schema._pg_numeric_scale.typmod</code>.
     */
    public static final Parameter<Integer> TYPMOD = Internal.createParameter("typmod", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public _PgNumericScale() {
        super("_pg_numeric_scale", InformationSchema.INFORMATION_SCHEMA, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TYPID);
        addInParameter(TYPMOD);
    }

    /**
     * Set the <code>typid</code> parameter IN value to the routine
     */
    public void setTypid(Long value) {
        setValue(TYPID, value);
    }

    /**
     * Set the <code>typid</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTypid(Field<Long> field) {
        setField(TYPID, field);
    }

    /**
     * Set the <code>typmod</code> parameter IN value to the routine
     */
    public void setTypmod(Integer value) {
        setValue(TYPMOD, value);
    }

    /**
     * Set the <code>typmod</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTypmod(Field<Integer> field) {
        setField(TYPMOD, field);
    }
}
