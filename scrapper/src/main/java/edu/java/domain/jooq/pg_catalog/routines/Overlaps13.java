/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Overlaps13 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    public static final Parameter<LocalDateTime> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATETIME(6), false, true);

    public static final Parameter<YearToSecond> _2 = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true);

    public static final Parameter<LocalDateTime> _3 = Internal.createParameter("_3", SQLDataType.LOCALDATETIME(6), false, true);

    public static final Parameter<LocalDateTime> _4 = Internal.createParameter("_4", SQLDataType.LOCALDATETIME(6), false, true);

    public Overlaps13() {
        super("overlaps", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    public void set__1(LocalDateTime value) {
        setValue(_1, value);
    }

    public void set__1(Field<LocalDateTime> field) {
        setField(_1, field);
    }

    public void set__2(YearToSecond value) {
        setValue(_2, value);
    }

    public void set__2(Field<YearToSecond> field) {
        setField(_2, field);
    }

    public void set__3(LocalDateTime value) {
        setValue(_3, value);
    }

    public void set__3(Field<LocalDateTime> field) {
        setField(_3, field);
    }

    public void set__4(LocalDateTime value) {
        setValue(_4, value);
    }

    public void set__4(Field<LocalDateTime> field) {
        setField(_4, field);
    }
}
