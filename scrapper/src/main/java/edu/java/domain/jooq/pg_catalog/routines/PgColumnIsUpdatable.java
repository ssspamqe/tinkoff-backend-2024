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
public class PgColumnIsUpdatable extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, true);

    public static final Parameter<Short> _2 = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true);

    public static final Parameter<Boolean> _3 = Internal.createParameter("_3", SQLDataType.BOOLEAN, false, true);

    public PgColumnIsUpdatable() {
        super("pg_column_is_updatable", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    public void set__2(Short value) {
        setValue(_2, value);
    }

    public void set__2(Field<Short> field) {
        setField(_2, field);
    }

    public void set__3(Boolean value) {
        setValue(_3, value);
    }

    public void set__3(Field<Boolean> field) {
        setField(_3, field);
    }
}
