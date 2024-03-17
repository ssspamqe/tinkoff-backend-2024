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
public class SchemaToXmlAndXmlschema extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.OTHER, false, false);

    public static final Parameter<String> SCHEMA = Internal.createParameter("schema", SQLDataType.VARCHAR, false, false);

    public static final Parameter<Boolean> NULLS = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false);

    public static final Parameter<Boolean> TABLEFOREST = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false);

    public static final Parameter<String> TARGETNS = Internal.createParameter("targetns", SQLDataType.CLOB, false, false);

    public SchemaToXmlAndXmlschema() {
        super("schema_to_xml_and_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.OTHER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(SCHEMA);
        addInParameter(NULLS);
        addInParameter(TABLEFOREST);
        addInParameter(TARGETNS);
    }

    public void setSchema_(String value) {
        setValue(SCHEMA, value);
    }

    public void setSchema_(Field<String> field) {
        setField(SCHEMA, field);
    }

    public void setNulls(Boolean value) {
        setValue(NULLS, value);
    }

    public void setNulls(Field<Boolean> field) {
        setField(NULLS, field);
    }

    public void setTableforest(Boolean value) {
        setValue(TABLEFOREST, value);
    }

    public void setTableforest(Field<Boolean> field) {
        setField(TABLEFOREST, field);
    }

    public void setTargetns(String value) {
        setValue(TARGETNS, value);
    }

    public void setTargetns(Field<String> field) {
        setField(TARGETNS, field);
    }
}
