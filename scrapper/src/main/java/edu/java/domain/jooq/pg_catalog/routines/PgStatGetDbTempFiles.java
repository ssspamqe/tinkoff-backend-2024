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


/**
 * The routine <code>pg_catalog.pg_stat_get_db_temp_files</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatGetDbTempFiles extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_stat_get_db_temp_files.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_db_temp_files._1</code>.
     */
    public static final Parameter<Long> _1 = Internal.createParameter("_1", SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public PgStatGetDbTempFiles() {
        super("pg_stat_get_db_temp_files", PgCatalog.PG_CATALOG, SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Long> field) {
        setField(_1, field);
    }
}
