/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.JSON;
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
public class JsonBuildObject1 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", SQLDataType.OTHER, false, true);

    public JsonBuildObject1() {
        super("json_build_object", PgCatalog.PG_CATALOG, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    public void set__1(Object value) {
        setValue(_1, value);
    }

    public void set__1(Field<Object> field) {
        setField(_1, field);
    }
}
