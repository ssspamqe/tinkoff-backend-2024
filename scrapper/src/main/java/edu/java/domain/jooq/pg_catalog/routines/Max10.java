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
public class Max10 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<OffsetTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMEWITHTIMEZONE(6), false, false);

    public static final Parameter<OffsetTime> _1 = Internal.createParameter("_1", SQLDataType.TIMEWITHTIMEZONE(6), false, true);

    public Max10() {
        super("max", PgCatalog.PG_CATALOG, SQLDataType.TIMEWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    public void set__1(OffsetTime value) {
        setValue(_1, value);
    }

    public void set__1(Field<OffsetTime> field) {
        setField(_1, field);
    }
}
