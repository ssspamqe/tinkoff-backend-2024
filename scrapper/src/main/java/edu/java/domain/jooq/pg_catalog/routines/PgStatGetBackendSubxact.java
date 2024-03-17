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
public class PgStatGetBackendSubxact extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> BID = Internal.createParameter("bid", SQLDataType.INTEGER, false, false);

    public static final Parameter<Integer> SUBXACT_COUNT = Internal.createParameter("subxact_count", SQLDataType.INTEGER, false, false);

    public static final Parameter<Boolean> SUBXACT_OVERFLOWED = Internal.createParameter("subxact_overflowed", SQLDataType.BOOLEAN, false, false);

    public PgStatGetBackendSubxact() {
        super("pg_stat_get_backend_subxact", PgCatalog.PG_CATALOG);

        addInParameter(BID);
        addOutParameter(SUBXACT_COUNT);
        addOutParameter(SUBXACT_OVERFLOWED);
    }

    public void setBid(Integer value) {
        setValue(BID, value);
    }

    public Integer getSubxactCount() {
        return get(SUBXACT_COUNT);
    }

    public Boolean getSubxactOverflowed() {
        return get(SUBXACT_OVERFLOWED);
    }
}
