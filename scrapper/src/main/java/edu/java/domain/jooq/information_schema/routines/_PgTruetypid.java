/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.routines;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.pg_catalog.tables.records.PgAttributeRecord;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTypeRecord;

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
public class _PgTruetypid extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false);

    public static final Parameter<PgAttributeRecord> _1 = Internal.createParameter("_1", edu.java.domain.jooq.pg_catalog.tables.PgAttribute.PG_ATTRIBUTE.getDataType(), false, true);

    public static final Parameter<PgTypeRecord> _2 = Internal.createParameter("_2", edu.java.domain.jooq.pg_catalog.tables.PgType.PG_TYPE.getDataType(), false, true);

    public _PgTruetypid() {
        super("_pg_truetypid", InformationSchema.INFORMATION_SCHEMA, SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    public void set__1(PgAttributeRecord value) {
        setValue(_1, value);
    }

    public void set__1(Field<PgAttributeRecord> field) {
        setField(_1, field);
    }

    public void set__2(PgTypeRecord value) {
        setValue(_2, value);
    }

    public void set__2(Field<PgTypeRecord> field) {
        setField(_2, field);
    }
}
