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
import org.jooq.types.YearToSecond;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class IntervalSmaller extends AbstractRoutine<YearToSecond> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<YearToSecond> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false);

    public static final Parameter<YearToSecond> _1 = Internal.createParameter("_1", SQLDataType.INTERVAL, false, true);

    public static final Parameter<YearToSecond> _2 = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true);

    public IntervalSmaller() {
        super("interval_smaller", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(YearToSecond value) {
        setValue(_1, value);
    }

    public void set__1(Field<YearToSecond> field) {
        setField(_1, field);
    }

    public void set__2(YearToSecond value) {
        setValue(_2, value);
    }

    public void set__2(Field<YearToSecond> field) {
        setField(_2, field);
    }
}
