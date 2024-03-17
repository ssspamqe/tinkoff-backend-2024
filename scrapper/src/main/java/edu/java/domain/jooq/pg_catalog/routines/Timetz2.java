/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.OffsetTime;

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
public class Timetz2 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<OffsetTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMEWITHTIMEZONE(6), false, false);

    public static final Parameter<OffsetTime> _1 = Internal.createParameter("_1", SQLDataType.TIMEWITHTIMEZONE(6), false, true);

    public static final Parameter<Integer> _2 = Internal.createParameter("_2", SQLDataType.INTEGER, false, true);

    public Timetz2() {
        super("timetz", PgCatalog.PG_CATALOG, SQLDataType.TIMEWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    public void set__1(OffsetTime value) {
        setValue(_1, value);
    }

    public void set__1(Field<OffsetTime> field) {
        setField(_1, field);
    }

    public void set__2(Integer value) {
        setValue(_2, value);
    }

    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }
}
