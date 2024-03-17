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
public class JsonExtractPathText extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    public static final Parameter<JSON> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSON, false, false);

    public static final Parameter<String[]> PATH_ELEMS = Internal.createParameter("path_elems", SQLDataType.CLOB.array(), false, false);

    public JsonExtractPathText() {
        super("json_extract_path_text", PgCatalog.PG_CATALOG, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(PATH_ELEMS);
    }

    public void setFromJson(JSON value) {
        setValue(FROM_JSON, value);
    }

    public void setFromJson(Field<JSON> field) {
        setField(FROM_JSON, field);
    }

    public void setPathElems(String[] value) {
        setValue(PATH_ELEMS, value);
    }

    public void setPathElems(Field<String[]> field) {
        setField(PATH_ELEMS, field);
    }
}
