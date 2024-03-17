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
public class PgCopyPhysicalReplicationSlot1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    public static final Parameter<String> SRC_SLOT_NAME = Internal.createParameter("src_slot_name", SQLDataType.VARCHAR, false, false);

    public static final Parameter<String> DST_SLOT_NAME = Internal.createParameter("dst_slot_name", SQLDataType.VARCHAR, false, false);

    public static final Parameter<Boolean> TEMPORARY = Internal.createParameter("temporary", SQLDataType.BOOLEAN, false, false);

    public static final Parameter<String> SLOT_NAME = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    public PgCopyPhysicalReplicationSlot1() {
        super("pg_copy_physical_replication_slot", PgCatalog.PG_CATALOG);

        addInParameter(SRC_SLOT_NAME);
        addInParameter(DST_SLOT_NAME);
        addInParameter(TEMPORARY);
        addOutParameter(SLOT_NAME);
        addOutParameter(LSN);
        setOverloaded(true);
    }

    public void setSrcSlotName(String value) {
        setValue(SRC_SLOT_NAME, value);
    }

    public void setDstSlotName(String value) {
        setValue(DST_SLOT_NAME, value);
    }

    public void setTemporary(Boolean value) {
        setValue(TEMPORARY, value);
    }

    public String getSlotName() {
        return get(SLOT_NAME);
    }

    @Deprecated
    public Object getLsn() {
        return get(LSN);
    }
}
