/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatSysTables;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_stat_sys_tables</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatSysTablesRecord extends TableRecordImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public void setRelid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public void setSchemaname(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public void setRelname(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public void setSeqScan(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    @Nullable
    public Long getSeqScan() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_seq_scan</code>.
     */
    public void setLastSeqScan(@Nullable OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_seq_scan</code>.
     */
    @Nullable
    public OffsetDateTime getLastSeqScan() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(@Nullable Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    @Nullable
    public Long getSeqTupRead() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public void setIdxScan(@Nullable Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    @Nullable
    public Long getIdxScan() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_idx_scan</code>.
     */
    public void setLastIdxScan(@Nullable OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_idx_scan</code>.
     */
    @Nullable
    public OffsetDateTime getLastIdxScan() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    @Nullable
    public Long getIdxTupFetch() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public void setNTupIns(@Nullable Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    @Nullable
    public Long getNTupIns() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(@Nullable Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    @Nullable
    public Long getNTupUpd() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public void setNTupDel(@Nullable Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    @Nullable
    public Long getNTupDel() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(@Nullable Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    @Nullable
    public Long getNTupHotUpd() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_newpage_upd</code>.
     */
    public void setNTupNewpageUpd(@Nullable Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_newpage_upd</code>.
     */
    @Nullable
    public Long getNTupNewpageUpd() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public void setNLiveTup(@Nullable Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    @Nullable
    public Long getNLiveTup() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public void setNDeadTup(@Nullable Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    @Nullable
    public Long getNDeadTup() {
        return (Long) get(15);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public void setNModSinceAnalyze(@Nullable Long value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    @Nullable
    public Long getNModSinceAnalyze() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_ins_since_vacuum</code>.
     */
    public void setNInsSinceVacuum(@Nullable Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_ins_since_vacuum</code>.
     */
    @Nullable
    public Long getNInsSinceVacuum() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public void setLastVacuum(@Nullable OffsetDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    @Nullable
    public OffsetDateTime getLastVacuum() {
        return (OffsetDateTime) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public void setLastAutovacuum(@Nullable OffsetDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    @Nullable
    public OffsetDateTime getLastAutovacuum() {
        return (OffsetDateTime) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public void setLastAnalyze(@Nullable OffsetDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    @Nullable
    public OffsetDateTime getLastAnalyze() {
        return (OffsetDateTime) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public void setLastAutoanalyze(@Nullable OffsetDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    @Nullable
    public OffsetDateTime getLastAutoanalyze() {
        return (OffsetDateTime) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public void setVacuumCount(@Nullable Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    @Nullable
    public Long getVacuumCount() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public void setAutovacuumCount(@Nullable Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    @Nullable
    public Long getAutovacuumCount() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public void setAnalyzeCount(@Nullable Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    @Nullable
    public Long getAnalyzeCount() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public void setAutoanalyzeCount(@Nullable Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    @Nullable
    public Long getAutoanalyzeCount() {
        return (Long) get(25);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSysTablesRecord
     */
    public PgStatSysTablesRecord() {
        super(PgStatSysTables.PG_STAT_SYS_TABLES);
    }

    /**
     * Create a detached, initialised PgStatSysTablesRecord
     */
    @ConstructorProperties({ "relid", "schemaname", "relname", "seqScan", "lastSeqScan", "seqTupRead", "idxScan", "lastIdxScan", "idxTupFetch", "nTupIns", "nTupUpd", "nTupDel", "nTupHotUpd", "nTupNewpageUpd", "nLiveTup", "nDeadTup", "nModSinceAnalyze", "nInsSinceVacuum", "lastVacuum", "lastAutovacuum", "lastAnalyze", "lastAutoanalyze", "vacuumCount", "autovacuumCount", "analyzeCount", "autoanalyzeCount" })
    public PgStatSysTablesRecord(@Nullable Long relid, @Nullable String schemaname, @Nullable String relname, @Nullable Long seqScan, @Nullable OffsetDateTime lastSeqScan, @Nullable Long seqTupRead, @Nullable Long idxScan, @Nullable OffsetDateTime lastIdxScan, @Nullable Long idxTupFetch, @Nullable Long nTupIns, @Nullable Long nTupUpd, @Nullable Long nTupDel, @Nullable Long nTupHotUpd, @Nullable Long nTupNewpageUpd, @Nullable Long nLiveTup, @Nullable Long nDeadTup, @Nullable Long nModSinceAnalyze, @Nullable Long nInsSinceVacuum, @Nullable OffsetDateTime lastVacuum, @Nullable OffsetDateTime lastAutovacuum, @Nullable OffsetDateTime lastAnalyze, @Nullable OffsetDateTime lastAutoanalyze, @Nullable Long vacuumCount, @Nullable Long autovacuumCount, @Nullable Long analyzeCount, @Nullable Long autoanalyzeCount) {
        super(PgStatSysTables.PG_STAT_SYS_TABLES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setSeqScan(seqScan);
        setLastSeqScan(lastSeqScan);
        setSeqTupRead(seqTupRead);
        setIdxScan(idxScan);
        setLastIdxScan(lastIdxScan);
        setIdxTupFetch(idxTupFetch);
        setNTupIns(nTupIns);
        setNTupUpd(nTupUpd);
        setNTupDel(nTupDel);
        setNTupHotUpd(nTupHotUpd);
        setNTupNewpageUpd(nTupNewpageUpd);
        setNLiveTup(nLiveTup);
        setNDeadTup(nDeadTup);
        setNModSinceAnalyze(nModSinceAnalyze);
        setNInsSinceVacuum(nInsSinceVacuum);
        setLastVacuum(lastVacuum);
        setLastAutovacuum(lastAutovacuum);
        setLastAnalyze(lastAnalyze);
        setLastAutoanalyze(lastAutoanalyze);
        setVacuumCount(vacuumCount);
        setAutovacuumCount(autovacuumCount);
        setAnalyzeCount(analyzeCount);
        setAutoanalyzeCount(autoanalyzeCount);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatSysTablesRecord
     */
    public PgStatSysTablesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatSysTables value) {
        super(PgStatSysTables.PG_STAT_SYS_TABLES);

        if (value != null) {
            setRelid(value.getRelid());
            setSchemaname(value.getSchemaname());
            setRelname(value.getRelname());
            setSeqScan(value.getSeqScan());
            setLastSeqScan(value.getLastSeqScan());
            setSeqTupRead(value.getSeqTupRead());
            setIdxScan(value.getIdxScan());
            setLastIdxScan(value.getLastIdxScan());
            setIdxTupFetch(value.getIdxTupFetch());
            setNTupIns(value.getNTupIns());
            setNTupUpd(value.getNTupUpd());
            setNTupDel(value.getNTupDel());
            setNTupHotUpd(value.getNTupHotUpd());
            setNTupNewpageUpd(value.getNTupNewpageUpd());
            setNLiveTup(value.getNLiveTup());
            setNDeadTup(value.getNDeadTup());
            setNModSinceAnalyze(value.getNModSinceAnalyze());
            setNInsSinceVacuum(value.getNInsSinceVacuum());
            setLastVacuum(value.getLastVacuum());
            setLastAutovacuum(value.getLastAutovacuum());
            setLastAnalyze(value.getLastAnalyze());
            setLastAutoanalyze(value.getLastAutoanalyze());
            setVacuumCount(value.getVacuumCount());
            setAutovacuumCount(value.getAutovacuumCount());
            setAnalyzeCount(value.getAnalyzeCount());
            setAutoanalyzeCount(value.getAutoanalyzeCount());
            resetChangedOnNotNull();
        }
    }
}
