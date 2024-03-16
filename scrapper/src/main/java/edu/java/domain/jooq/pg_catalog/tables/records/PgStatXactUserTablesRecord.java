/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatXactUserTables;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatXactUserTablesRecord extends TableRecordImpl<PgStatXactUserTablesRecord> implements Record12<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.relid</code>.
     */
    public void setRelid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.schemaname</code>.
     */
    public void setSchemaname(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.relname</code>.
     */
    public void setRelname(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.seq_scan</code>.
     */
    public void setSeqScan(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.seq_scan</code>.
     */
    @Nullable
    public Long getSeqScan() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(@Nullable Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.seq_tup_read</code>.
     */
    @Nullable
    public Long getSeqTupRead() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.idx_scan</code>.
     */
    public void setIdxScan(@Nullable Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.idx_scan</code>.
     */
    @Nullable
    public Long getIdxScan() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_xact_user_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(@Nullable Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_xact_user_tables.idx_tup_fetch</code>.
     */
    @Nullable
    public Long getIdxTupFetch() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_ins</code>.
     */
    public void setNTupIns(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_ins</code>.
     */
    @Nullable
    public Long getNTupIns() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_upd</code>.
     */
    @Nullable
    public Long getNTupUpd() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_del</code>.
     */
    public void setNTupDel(@Nullable Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_user_tables.n_tup_del</code>.
     */
    @Nullable
    public Long getNTupDel() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(@Nullable Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_hot_upd</code>.
     */
    @Nullable
    public Long getNTupHotUpd() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_newpage_upd</code>.
     */
    public void setNTupNewpageUpd(@Nullable Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_newpage_upd</code>.
     */
    @Nullable
    public Long getNTupNewpageUpd() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row12<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row12<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.RELID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.RELNAME;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.SEQ_SCAN;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.SEQ_TUP_READ;
    }

    @Override
    @NotNull
    public Field<Long> field6() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.IDX_SCAN;
    }

    @Override
    @NotNull
    public Field<Long> field7() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.IDX_TUP_FETCH;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.N_TUP_INS;
    }

    @Override
    @NotNull
    public Field<Long> field9() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.N_TUP_UPD;
    }

    @Override
    @NotNull
    public Field<Long> field10() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.N_TUP_DEL;
    }

    @Override
    @NotNull
    public Field<Long> field11() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.N_TUP_HOT_UPD;
    }

    @Override
    @NotNull
    public Field<Long> field12() {
        return PgStatXactUserTables.PG_STAT_XACT_USER_TABLES.N_TUP_NEWPAGE_UPD;
    }

    @Override
    @Nullable
    public Long component1() {
        return getRelid();
    }

    @Override
    @Nullable
    public String component2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component3() {
        return getRelname();
    }

    @Override
    @Nullable
    public Long component4() {
        return getSeqScan();
    }

    @Override
    @Nullable
    public Long component5() {
        return getSeqTupRead();
    }

    @Override
    @Nullable
    public Long component6() {
        return getIdxScan();
    }

    @Override
    @Nullable
    public Long component7() {
        return getIdxTupFetch();
    }

    @Override
    @Nullable
    public Long component8() {
        return getNTupIns();
    }

    @Override
    @Nullable
    public Long component9() {
        return getNTupUpd();
    }

    @Override
    @Nullable
    public Long component10() {
        return getNTupDel();
    }

    @Override
    @Nullable
    public Long component11() {
        return getNTupHotUpd();
    }

    @Override
    @Nullable
    public Long component12() {
        return getNTupNewpageUpd();
    }

    @Override
    @Nullable
    public Long value1() {
        return getRelid();
    }

    @Override
    @Nullable
    public String value2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value3() {
        return getRelname();
    }

    @Override
    @Nullable
    public Long value4() {
        return getSeqScan();
    }

    @Override
    @Nullable
    public Long value5() {
        return getSeqTupRead();
    }

    @Override
    @Nullable
    public Long value6() {
        return getIdxScan();
    }

    @Override
    @Nullable
    public Long value7() {
        return getIdxTupFetch();
    }

    @Override
    @Nullable
    public Long value8() {
        return getNTupIns();
    }

    @Override
    @Nullable
    public Long value9() {
        return getNTupUpd();
    }

    @Override
    @Nullable
    public Long value10() {
        return getNTupDel();
    }

    @Override
    @Nullable
    public Long value11() {
        return getNTupHotUpd();
    }

    @Override
    @Nullable
    public Long value12() {
        return getNTupNewpageUpd();
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value1(@Nullable Long value) {
        setRelid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value2(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value3(@Nullable String value) {
        setRelname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value4(@Nullable Long value) {
        setSeqScan(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value5(@Nullable Long value) {
        setSeqTupRead(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value6(@Nullable Long value) {
        setIdxScan(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value7(@Nullable Long value) {
        setIdxTupFetch(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value8(@Nullable Long value) {
        setNTupIns(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value9(@Nullable Long value) {
        setNTupUpd(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value10(@Nullable Long value) {
        setNTupDel(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value11(@Nullable Long value) {
        setNTupHotUpd(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord value12(@Nullable Long value) {
        setNTupNewpageUpd(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatXactUserTablesRecord values(@Nullable Long value1, @Nullable String value2, @Nullable String value3, @Nullable Long value4, @Nullable Long value5, @Nullable Long value6, @Nullable Long value7, @Nullable Long value8, @Nullable Long value9, @Nullable Long value10, @Nullable Long value11, @Nullable Long value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatXactUserTablesRecord
     */
    public PgStatXactUserTablesRecord() {
        super(PgStatXactUserTables.PG_STAT_XACT_USER_TABLES);
    }

    /**
     * Create a detached, initialised PgStatXactUserTablesRecord
     */
    @ConstructorProperties({ "relid", "schemaname", "relname", "seqScan", "seqTupRead", "idxScan", "idxTupFetch", "nTupIns", "nTupUpd", "nTupDel", "nTupHotUpd", "nTupNewpageUpd" })
    public PgStatXactUserTablesRecord(@Nullable Long relid, @Nullable String schemaname, @Nullable String relname, @Nullable Long seqScan, @Nullable Long seqTupRead, @Nullable Long idxScan, @Nullable Long idxTupFetch, @Nullable Long nTupIns, @Nullable Long nTupUpd, @Nullable Long nTupDel, @Nullable Long nTupHotUpd, @Nullable Long nTupNewpageUpd) {
        super(PgStatXactUserTables.PG_STAT_XACT_USER_TABLES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setSeqScan(seqScan);
        setSeqTupRead(seqTupRead);
        setIdxScan(idxScan);
        setIdxTupFetch(idxTupFetch);
        setNTupIns(nTupIns);
        setNTupUpd(nTupUpd);
        setNTupDel(nTupDel);
        setNTupHotUpd(nTupHotUpd);
        setNTupNewpageUpd(nTupNewpageUpd);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatXactUserTablesRecord
     */
    public PgStatXactUserTablesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatXactUserTables value) {
        super(PgStatXactUserTables.PG_STAT_XACT_USER_TABLES);

        if (value != null) {
            setRelid(value.getRelid());
            setSchemaname(value.getSchemaname());
            setRelname(value.getRelname());
            setSeqScan(value.getSeqScan());
            setSeqTupRead(value.getSeqTupRead());
            setIdxScan(value.getIdxScan());
            setIdxTupFetch(value.getIdxTupFetch());
            setNTupIns(value.getNTupIns());
            setNTupUpd(value.getNTupUpd());
            setNTupDel(value.getNTupDel());
            setNTupHotUpd(value.getNTupHotUpd());
            setNTupNewpageUpd(value.getNTupNewpageUpd());
            resetChangedOnNotNull();
        }
    }
}
