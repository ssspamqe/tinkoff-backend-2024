/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

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
public class PgInputErrorInfo extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<String> VALUE = Internal.createParameter("value", SQLDataType.CLOB, false, false);

    public static final Parameter<String> TYPE_NAME = Internal.createParameter("type_name", SQLDataType.CLOB, false, false);

    public static final Parameter<String> MESSAGE = Internal.createParameter("message", SQLDataType.CLOB, false, false);

    public static final Parameter<String> DETAIL = Internal.createParameter("detail", SQLDataType.CLOB, false, false);

    public static final Parameter<String> HINT = Internal.createParameter("hint", SQLDataType.CLOB, false, false);

    public static final Parameter<String> SQL_ERROR_CODE = Internal.createParameter("sql_error_code", SQLDataType.CLOB, false, false);

    public PgInputErrorInfo() {
        super("pg_input_error_info", PgCatalog.PG_CATALOG);

        addInParameter(VALUE);
        addInParameter(TYPE_NAME);
        addOutParameter(MESSAGE);
        addOutParameter(DETAIL);
        addOutParameter(HINT);
        addOutParameter(SQL_ERROR_CODE);
    }

    public void setValue(String value) {
        setValue(VALUE, value);
    }

    public void setTypeName(String value) {
        setValue(TYPE_NAME, value);
    }

    public String getMessage() {
        return get(MESSAGE);
    }

    public String getDetail() {
        return get(DETAIL);
    }

    public String getHint() {
        return get(HINT);
    }

    public String getSqlErrorCode() {
        return get(SQL_ERROR_CODE);
    }
}
