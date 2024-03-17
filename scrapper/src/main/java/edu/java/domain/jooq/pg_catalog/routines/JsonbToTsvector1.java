/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.JSONB;
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
public class JsonbToTsvector1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, false);

    public static final Parameter<JSONB> _1 = Internal.createParameter("_1", SQLDataType.JSONB, false, true);

    public static final Parameter<JSONB> _2 = Internal.createParameter("_2", SQLDataType.JSONB, false, true);

    public JsonbToTsvector1() {
        super("jsonb_to_tsvector", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    public void set__1(JSONB value) {
        setValue(_1, value);
    }

    public void set__1(Field<JSONB> field) {
        setField(_1, field);
    }

    public void set__2(JSONB value) {
        setValue(_2, value);
    }

    public void set__2(Field<JSONB> field) {
        setField(_2, field);
    }
}
