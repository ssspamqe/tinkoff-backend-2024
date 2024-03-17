/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.routines;


import edu.java.domain.jooq.information_schema.InformationSchema;

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
public class _PgNumericPrecision extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    public static final Parameter<Long> TYPID = Internal.createParameter("typid", SQLDataType.BIGINT, false, false);

    public static final Parameter<Integer> TYPMOD = Internal.createParameter("typmod", SQLDataType.INTEGER, false, false);

    public _PgNumericPrecision() {
        super("_pg_numeric_precision", InformationSchema.INFORMATION_SCHEMA, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TYPID);
        addInParameter(TYPMOD);
    }

    public void setTypid(Long value) {
        setValue(TYPID, value);
    }

    public void setTypid(Field<Long> field) {
        setField(TYPID, field);
    }

    public void setTypmod(Integer value) {
        setValue(TYPMOD, value);
    }

    public void setTypmod(Field<Integer> field) {
        setField(TYPMOD, field);
    }
}
