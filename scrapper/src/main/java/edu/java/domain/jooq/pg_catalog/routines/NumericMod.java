/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.math.BigDecimal;

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
public class NumericMod extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    public static final Parameter<BigDecimal> _1 = Internal.createParameter("_1", SQLDataType.NUMERIC, false, true);

    public static final Parameter<BigDecimal> _2 = Internal.createParameter("_2", SQLDataType.NUMERIC, false, true);

    public NumericMod() {
        super("numeric_mod", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }

    public void set__2(BigDecimal value) {
        setValue(_2, value);
    }

    public void set__2(Field<BigDecimal> field) {
        setField(_2, field);
    }
}
