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


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Position2 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    public static final Parameter<byte[]> _1 = Internal.createParameter("_1", SQLDataType.BLOB, false, true);

    public static final Parameter<byte[]> _2 = Internal.createParameter("_2", SQLDataType.BLOB, false, true);

    public Position2() {
        super("position", PgCatalog.PG_CATALOG, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    public void set__1(byte[] value) {
        setValue(_1, value);
    }

    public void set__1(Field<byte[]> field) {
        setField(_1, field);
    }

    public void set__2(byte[] value) {
        setValue(_2, value);
    }

    public void set__2(Field<byte[]> field) {
        setField(_2, field);
    }
}
