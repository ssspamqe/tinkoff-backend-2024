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



@Deprecated
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Int2MulCash extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"money\""), false, false);

    public static final Parameter<Short> _1 = Internal.createParameter("_1", SQLDataType.SMALLINT, false, true);

    @Deprecated
    public static final Parameter<Object> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"money\""), false, true);

    public Int2MulCash() {
        super("int2_mul_cash", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"money\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(Short value) {
        setValue(_1, value);
    }

    public void set__1(Field<Short> field) {
        setField(_1, field);
    }

    public void set__2(Object value) {
        setValue(_2, value);
    }

    public void set__2(Field<Object> field) {
        setField(_2, field);
    }
}
