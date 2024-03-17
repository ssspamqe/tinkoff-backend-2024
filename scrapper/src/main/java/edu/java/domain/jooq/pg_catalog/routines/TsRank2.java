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
public class TsRank2 extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Float> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.REAL, false, false);

    public static final Parameter<Float[]> _1 = Internal.createParameter("_1", SQLDataType.REAL.array(), false, true);

    @Deprecated
    public static final Parameter<Object> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, true);

    @Deprecated
    public static final Parameter<Object> _3 = Internal.createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsquery\""), false, true);

    public TsRank2() {
        super("ts_rank", PgCatalog.PG_CATALOG, SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    public void set__1(Float[] value) {
        setValue(_1, value);
    }

    public void set__1(Field<Float[]> field) {
        setField(_1, field);
    }

    public void set__2(Object value) {
        setValue(_2, value);
    }

    public void set__2(Field<Object> field) {
        setField(_2, field);
    }

    public void set__3(Object value) {
        setValue(_3, value);
    }

    public void set__3(Field<Object> field) {
        setField(_3, field);
    }
}
