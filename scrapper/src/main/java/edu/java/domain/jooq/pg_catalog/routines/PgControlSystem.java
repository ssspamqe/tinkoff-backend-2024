/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class PgControlSystem extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<Integer> PG_CONTROL_VERSION = Internal.createParameter("pg_control_version", SQLDataType.INTEGER, false, false);

    public static final Parameter<Integer> CATALOG_VERSION_NO = Internal.createParameter("catalog_version_no", SQLDataType.INTEGER, false, false);

    public static final Parameter<Long> SYSTEM_IDENTIFIER = Internal.createParameter("system_identifier", SQLDataType.BIGINT, false, false);

    public static final Parameter<OffsetDateTime> PG_CONTROL_LAST_MODIFIED = Internal.createParameter("pg_control_last_modified", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    public PgControlSystem() {
        super("pg_control_system", PgCatalog.PG_CATALOG);

        addOutParameter(PG_CONTROL_VERSION);
        addOutParameter(CATALOG_VERSION_NO);
        addOutParameter(SYSTEM_IDENTIFIER);
        addOutParameter(PG_CONTROL_LAST_MODIFIED);
    }

    public Integer getPgControlVersion() {
        return get(PG_CONTROL_VERSION);
    }

    public Integer getCatalogVersionNo() {
        return get(CATALOG_VERSION_NO);
    }

    public Long getSystemIdentifier() {
        return get(SYSTEM_IDENTIFIER);
    }

    public OffsetDateTime getPgControlLastModified() {
        return get(PG_CONTROL_LAST_MODIFIED);
    }
}
