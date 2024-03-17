/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.math.BigDecimal;
import java.time.LocalTime;

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
public class Extract2 extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    public static final Parameter<LocalTime> _2 = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true);

    public Extract2() {
        super("extract", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    public void set__1(String value) {
        setValue(_1, value);
    }

    public void set__1(Field<String> field) {
        setField(_1, field);
    }

    public void set__2(LocalTime value) {
        setValue(_2, value);
    }

    public void set__2(Field<LocalTime> field) {
        setField(_2, field);
    }
}
