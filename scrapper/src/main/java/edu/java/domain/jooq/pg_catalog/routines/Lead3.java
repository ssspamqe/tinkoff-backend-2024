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
public class Lead3 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anycompatible\""), false, false);

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anycompatible\""), false, true);

    public static final Parameter<Integer> _2 = Internal.createParameter("_2", SQLDataType.INTEGER, false, true);

    @Deprecated
    public static final Parameter<Object> _3 = Internal.createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anycompatible\""), false, true);

    public Lead3() {
        super("lead", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anycompatible\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    public void set__2(Integer value) {
        setValue(_2, value);
    }

    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }

    public void set__3(Object value) {
        setValue(_3, value);
    }

    public void set__3(Field<Object> field) {
        setField(_3, field);
    }
}
