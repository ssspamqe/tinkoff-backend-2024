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
public class PgControlRecovery extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public static final Parameter<Object> MIN_RECOVERY_END_LSN = Internal.createParameter("min_recovery_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    public static final Parameter<Integer> MIN_RECOVERY_END_TIMELINE = Internal.createParameter("min_recovery_end_timeline", SQLDataType.INTEGER, false, false);

    @Deprecated
    public static final Parameter<Object> BACKUP_START_LSN = Internal.createParameter("backup_start_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    @Deprecated
    public static final Parameter<Object> BACKUP_END_LSN = Internal.createParameter("backup_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    public static final Parameter<Boolean> END_OF_BACKUP_RECORD_REQUIRED = Internal.createParameter("end_of_backup_record_required", SQLDataType.BOOLEAN, false, false);

    public PgControlRecovery() {
        super("pg_control_recovery", PgCatalog.PG_CATALOG);

        addOutParameter(MIN_RECOVERY_END_LSN);
        addOutParameter(MIN_RECOVERY_END_TIMELINE);
        addOutParameter(BACKUP_START_LSN);
        addOutParameter(BACKUP_END_LSN);
        addOutParameter(END_OF_BACKUP_RECORD_REQUIRED);
    }

    @Deprecated
    public Object getMinRecoveryEndLsn() {
        return get(MIN_RECOVERY_END_LSN);
    }

    public Integer getMinRecoveryEndTimeline() {
        return get(MIN_RECOVERY_END_TIMELINE);
    }

    @Deprecated
    public Object getBackupStartLsn() {
        return get(BACKUP_START_LSN);
    }

    @Deprecated
    public Object getBackupEndLsn() {
        return get(BACKUP_END_LSN);
    }

    public Boolean getEndOfBackupRecordRequired() {
        return get(END_OF_BACKUP_RECORD_REQUIRED);
    }
}
