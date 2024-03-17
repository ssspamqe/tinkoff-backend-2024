/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

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
public class PgCreateLogicalReplicationSlot extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<String> SLOT_NAME1 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    public static final Parameter<String> PLUGIN = Internal.createParameter("plugin", SQLDataType.VARCHAR, false, false);

    public static final Parameter<Boolean> TEMPORARY = Internal.createParameter("temporary", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false);

    public static final Parameter<Boolean> TWOPHASE = Internal.createParameter("twophase", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false);

    public static final Parameter<String> SLOT_NAME5 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    public PgCreateLogicalReplicationSlot() {
        super("pg_create_logical_replication_slot", PgCatalog.PG_CATALOG);

        addInOutParameter(SLOT_NAME1);
        addInParameter(PLUGIN);
        addInParameter(TEMPORARY);
        addInParameter(TWOPHASE);
        addInOutParameter(SLOT_NAME5);
        addOutParameter(LSN);
    }

    public void setSlotName1(String value) {
        setValue(SLOT_NAME1, value);
    }

    public void setPlugin(String value) {
        setValue(PLUGIN, value);
    }

    public void setTemporary(Boolean value) {
        setValue(TEMPORARY, value);
    }

    public void setTwophase(Boolean value) {
        setValue(TWOPHASE, value);
    }

    public String getSlotName1() {
        return get(SLOT_NAME1);
    }

    public String getSlotName5() {
        return get(SLOT_NAME5);
    }

    @Deprecated
    public Object getLsn() {
        return get(LSN);
    }
}
