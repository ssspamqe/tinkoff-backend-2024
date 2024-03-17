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
public class Scalarltjoinsel extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false);

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public static final Parameter<Long> _2 = Internal.createParameter("_2", SQLDataType.BIGINT, false, true);

    @Deprecated
    public static final Parameter<Object> _3 = Internal.createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public static final Parameter<Short> _4 = Internal.createParameter("_4", SQLDataType.SMALLINT, false, true);

    @Deprecated
    public static final Parameter<Object> _5 = Internal.createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public Scalarltjoinsel() {
        super("scalarltjoinsel", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    public void set__2(Long value) {
        setValue(_2, value);
    }

    public void set__2(Field<Long> field) {
        setField(_2, field);
    }

    public void set__3(Object value) {
        setValue(_3, value);
    }

    public void set__3(Field<Object> field) {
        setField(_3, field);
    }

    public void set__4(Short value) {
        setValue(_4, value);
    }

    public void set__4(Field<Short> field) {
        setField(_4, field);
    }

    public void set__5(Object value) {
        setValue(_5, value);
    }

    public void set__5(Field<Object> field) {
        setField(_5, field);
    }
}
