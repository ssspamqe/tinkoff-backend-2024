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
public class GinExtractTsquery2 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, false);

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, true);

    @Deprecated
    public static final Parameter<Object> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public static final Parameter<Short> _3 = Internal.createParameter("_3", SQLDataType.SMALLINT, false, true);

    @Deprecated
    public static final Parameter<Object> _4 = Internal.createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    @Deprecated
    public static final Parameter<Object> _5 = Internal.createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    @Deprecated
    public static final Parameter<Object> _6 = Internal.createParameter("_6", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    @Deprecated
    public static final Parameter<Object> _7 = Internal.createParameter("_7", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public GinExtractTsquery2() {
        super("gin_extract_tsquery", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
        addInParameter(_7);
        setOverloaded(true);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    public void set__2(Object value) {
        setValue(_2, value);
    }

    public void set__2(Field<Object> field) {
        setField(_2, field);
    }

    public void set__3(Short value) {
        setValue(_3, value);
    }

    public void set__3(Field<Short> field) {
        setField(_3, field);
    }

    public void set__4(Object value) {
        setValue(_4, value);
    }

    public void set__4(Field<Object> field) {
        setField(_4, field);
    }

    public void set__5(Object value) {
        setValue(_5, value);
    }

    public void set__5(Field<Object> field) {
        setField(_5, field);
    }

    public void set__6(Object value) {
        setValue(_6, value);
    }

    public void set__6(Field<Object> field) {
        setField(_6, field);
    }

    public void set__7(Object value) {
        setValue(_7, value);
    }

    public void set__7(Field<Object> field) {
        setField(_7, field);
    }
}
