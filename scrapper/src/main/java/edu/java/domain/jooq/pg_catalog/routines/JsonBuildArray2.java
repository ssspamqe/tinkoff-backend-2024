/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

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
public class JsonBuildArray2 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    public JsonBuildArray2() {
        super("json_build_array", PgCatalog.PG_CATALOG, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
