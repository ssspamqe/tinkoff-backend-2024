/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatSysIndexes;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatSysIndexesRecord extends TableRecordImpl<PgStatSysIndexesRecord> {

    private static final long serialVersionUID = 1L;

    public void setRelid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(0);
    }

    public void setIndexrelid(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    public void setSchemaname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(2);
    }

    public void setRelname(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getRelname() {
        return (String) get(3);
    }

    public void setIndexrelname(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getIndexrelname() {
        return (String) get(4);
    }

    public void setIdxScan(@Nullable Long value) {
        set(5, value);
    }

    @Nullable
    public Long getIdxScan() {
        return (Long) get(5);
    }

    public void setLastIdxScan(@Nullable OffsetDateTime value) {
        set(6, value);
    }

    @Nullable
    public OffsetDateTime getLastIdxScan() {
        return (OffsetDateTime) get(6);
    }

    public void setIdxTupRead(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getIdxTupRead() {
        return (Long) get(7);
    }

    public void setIdxTupFetch(@Nullable Long value) {
        set(8, value);
    }

    @Nullable
    public Long getIdxTupFetch() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatSysIndexesRecord() {
        super(PgStatSysIndexes.PG_STAT_SYS_INDEXES);
    }

    @ConstructorProperties({ "relid", "indexrelid", "schemaname", "relname", "indexrelname", "idxScan", "lastIdxScan", "idxTupRead", "idxTupFetch" })
    public PgStatSysIndexesRecord(@Nullable Long relid, @Nullable Long indexrelid, @Nullable String schemaname, @Nullable String relname, @Nullable String indexrelname, @Nullable Long idxScan, @Nullable OffsetDateTime lastIdxScan, @Nullable Long idxTupRead, @Nullable Long idxTupFetch) {
        super(PgStatSysIndexes.PG_STAT_SYS_INDEXES);

        setRelid(relid);
        setIndexrelid(indexrelid);
        setSchemaname(schemaname);
        setRelname(relname);
        setIndexrelname(indexrelname);
        setIdxScan(idxScan);
        setLastIdxScan(lastIdxScan);
        setIdxTupRead(idxTupRead);
        setIdxTupFetch(idxTupFetch);
        resetChangedOnNotNull();
    }

    public PgStatSysIndexesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatSysIndexes value) {
        super(PgStatSysIndexes.PG_STAT_SYS_INDEXES);

        if (value != null) {
            setRelid(value.getRelid());
            setIndexrelid(value.getIndexrelid());
            setSchemaname(value.getSchemaname());
            setRelname(value.getRelname());
            setIndexrelname(value.getIndexrelname());
            setIdxScan(value.getIdxScan());
            setLastIdxScan(value.getLastIdxScan());
            setIdxTupRead(value.getIdxTupRead());
            setIdxTupFetch(value.getIdxTupFetch());
            resetChangedOnNotNull();
        }
    }
}
