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
import org.jooq.impl.DSL;
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
public class JsonbSetLax extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false);

    public static final Parameter<JSONB> JSONB_IN = Internal.createParameter("jsonb_in", SQLDataType.JSONB, false, false);

    public static final Parameter<String[]> PATH = Internal.createParameter("path", SQLDataType.CLOB.array(), false, false);

    public static final Parameter<JSONB> REPLACEMENT = Internal.createParameter("replacement", SQLDataType.JSONB, false, false);

    public static final Parameter<Boolean> CREATE_IF_MISSING = Internal.createParameter("create_if_missing", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false);

    public static final Parameter<String> NULL_VALUE_TREATMENT = Internal.createParameter("null_value_treatment", SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'use_json_null'::text"), SQLDataType.CLOB)), true, false);

    public JsonbSetLax() {
        super("jsonb_set_lax", PgCatalog.PG_CATALOG, SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(JSONB_IN);
        addInParameter(PATH);
        addInParameter(REPLACEMENT);
        addInParameter(CREATE_IF_MISSING);
        addInParameter(NULL_VALUE_TREATMENT);
    }

    public void setJsonbIn(JSONB value) {
        setValue(JSONB_IN, value);
    }

    public void setJsonbIn(Field<JSONB> field) {
        setField(JSONB_IN, field);
    }

    public void setPath(String[] value) {
        setValue(PATH, value);
    }

    public void setPath(Field<String[]> field) {
        setField(PATH, field);
    }

    public void setReplacement(JSONB value) {
        setValue(REPLACEMENT, value);
    }

    public void setReplacement(Field<JSONB> field) {
        setField(REPLACEMENT, field);
    }

    public void setCreateIfMissing(Boolean value) {
        setValue(CREATE_IF_MISSING, value);
    }

    public void setCreateIfMissing(Field<Boolean> field) {
        setField(CREATE_IF_MISSING, field);
    }

    public void setNullValueTreatment(String value) {
        setValue(NULL_VALUE_TREATMENT, value);
    }

    public void setNullValueTreatment(Field<String> field) {
        setField(NULL_VALUE_TREATMENT, field);
    }
}
