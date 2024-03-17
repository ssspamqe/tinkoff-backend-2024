/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class TimestamptzSmaller extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<OffsetDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    public static final Parameter<OffsetDateTime> _1 = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    public static final Parameter<OffsetDateTime> _2 = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    public TimestamptzSmaller() {
        super("timestamptz_smaller", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(OffsetDateTime value) {
        setValue(_1, value);
    }

    public void set__1(Field<OffsetDateTime> field) {
        setField(_1, field);
    }

    public void set__2(OffsetDateTime value) {
        setValue(_2, value);
    }

    public void set__2(Field<OffsetDateTime> field) {
        setField(_2, field);
    }
}
