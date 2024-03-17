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
public class Iso8859_1ToUtf8 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    public static final Parameter<Integer> _1 = Internal.createParameter("_1", SQLDataType.INTEGER, false, true);

    public static final Parameter<Integer> _2 = Internal.createParameter("_2", SQLDataType.INTEGER, false, true);

    @Deprecated
    public static final Parameter<Object> _3 = Internal.createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""), false, true);

    @Deprecated
    public static final Parameter<Object> _4 = Internal.createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public static final Parameter<Integer> _5 = Internal.createParameter("_5", SQLDataType.INTEGER, false, true);

    public static final Parameter<Boolean> _6 = Internal.createParameter("_6", SQLDataType.BOOLEAN, false, true);

    public Iso8859_1ToUtf8() {
        super("iso8859_1_to_utf8", PgCatalog.PG_CATALOG, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
    }

    public void set__1(Integer value) {
        setValue(_1, value);
    }

    public void set__1(Field<Integer> field) {
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

    public void set__4(Object value) {
        setValue(_4, value);
    }

    public void set__4(Field<Object> field) {
        setField(_4, field);
    }

    public void set__5(Integer value) {
        setValue(_5, value);
    }

    public void set__5(Field<Integer> field) {
        setField(_5, field);
    }

    public void set__6(Boolean value) {
        setValue(_6, value);
    }

    public void set__6(Field<Boolean> field) {
        setField(_6, field);
    }
}
