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


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Variance4 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false);

    public static final Parameter<Float> _1 = Internal.createParameter("_1", SQLDataType.REAL, false, true);

    public Variance4() {
        super("variance", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    public void set__1(Float value) {
        setValue(_1, value);
    }

    public void set__1(Field<Float> field) {
        setField(_1, field);
    }
}
