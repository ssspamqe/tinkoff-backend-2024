/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SpgQuadInnerConsistent extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    @Deprecated
    public static final Parameter<Object> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    public SpgQuadInnerConsistent() {
        super("spg_quad_inner_consistent", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__2(Object value) {
        setValue(_2, value);
    }
}
