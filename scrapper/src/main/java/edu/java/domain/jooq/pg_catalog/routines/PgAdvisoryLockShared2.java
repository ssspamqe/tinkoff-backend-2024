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
public class PgAdvisoryLockShared2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> _1 = Internal.createParameter("_1", SQLDataType.INTEGER, false, true);

    public static final Parameter<Integer> _2 = Internal.createParameter("_2", SQLDataType.INTEGER, false, true);

    public PgAdvisoryLockShared2() {
        super("pg_advisory_lock_shared", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    public void set__1(Integer value) {
        setValue(_1, value);
    }

    public void set__2(Integer value) {
        setValue(_2, value);
    }
}
