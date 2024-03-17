/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_stat_xact_all_tables</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatXactAllTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private String schemaname;
    private String relname;
    private Long seqScan;
    private Long seqTupRead;
    private Long idxScan;
    private Long idxTupFetch;
    private Long nTupIns;
    private Long nTupUpd;
    private Long nTupDel;
    private Long nTupHotUpd;
    private Long nTupNewpageUpd;

    public PgStatXactAllTables() {}

    public PgStatXactAllTables(PgStatXactAllTables value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.seqScan = value.seqScan;
        this.seqTupRead = value.seqTupRead;
        this.idxScan = value.idxScan;
        this.idxTupFetch = value.idxTupFetch;
        this.nTupIns = value.nTupIns;
        this.nTupUpd = value.nTupUpd;
        this.nTupDel = value.nTupDel;
        this.nTupHotUpd = value.nTupHotUpd;
        this.nTupNewpageUpd = value.nTupNewpageUpd;
    }

    @ConstructorProperties({ "relid", "schemaname", "relname", "seqScan", "seqTupRead", "idxScan", "idxTupFetch", "nTupIns", "nTupUpd", "nTupDel", "nTupHotUpd", "nTupNewpageUpd" })
    public PgStatXactAllTables(
        @Nullable Long relid,
        @Nullable String schemaname,
        @Nullable String relname,
        @Nullable Long seqScan,
        @Nullable Long seqTupRead,
        @Nullable Long idxScan,
        @Nullable Long idxTupFetch,
        @Nullable Long nTupIns,
        @Nullable Long nTupUpd,
        @Nullable Long nTupDel,
        @Nullable Long nTupHotUpd,
        @Nullable Long nTupNewpageUpd
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.seqScan = seqScan;
        this.seqTupRead = seqTupRead;
        this.idxScan = idxScan;
        this.idxTupFetch = idxTupFetch;
        this.nTupIns = nTupIns;
        this.nTupUpd = nTupUpd;
        this.nTupDel = nTupDel;
        this.nTupHotUpd = nTupHotUpd;
        this.nTupNewpageUpd = nTupNewpageUpd;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public void setRelname(@Nullable String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    @Nullable
    public Long getSeqScan() {
        return this.seqScan;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public void setSeqScan(@Nullable Long seqScan) {
        this.seqScan = seqScan;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    @Nullable
    public Long getSeqTupRead() {
        return this.seqTupRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(@Nullable Long seqTupRead) {
        this.seqTupRead = seqTupRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    @Nullable
    public Long getIdxScan() {
        return this.idxScan;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public void setIdxScan(@Nullable Long idxScan) {
        this.idxScan = idxScan;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    @Nullable
    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(@Nullable Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    @Nullable
    public Long getNTupIns() {
        return this.nTupIns;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public void setNTupIns(@Nullable Long nTupIns) {
        this.nTupIns = nTupIns;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    @Nullable
    public Long getNTupUpd() {
        return this.nTupUpd;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(@Nullable Long nTupUpd) {
        this.nTupUpd = nTupUpd;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    @Nullable
    public Long getNTupDel() {
        return this.nTupDel;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public void setNTupDel(@Nullable Long nTupDel) {
        this.nTupDel = nTupDel;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    @Nullable
    public Long getNTupHotUpd() {
        return this.nTupHotUpd;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(@Nullable Long nTupHotUpd) {
        this.nTupHotUpd = nTupHotUpd;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_xact_all_tables.n_tup_newpage_upd</code>.
     */
    @Nullable
    public Long getNTupNewpageUpd() {
        return this.nTupNewpageUpd;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_xact_all_tables.n_tup_newpage_upd</code>.
     */
    public void setNTupNewpageUpd(@Nullable Long nTupNewpageUpd) {
        this.nTupNewpageUpd = nTupNewpageUpd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatXactAllTables other = (PgStatXactAllTables) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.relname == null) {
            if (other.relname != null)
                return false;
        }
        else if (!this.relname.equals(other.relname))
            return false;
        if (this.seqScan == null) {
            if (other.seqScan != null)
                return false;
        }
        else if (!this.seqScan.equals(other.seqScan))
            return false;
        if (this.seqTupRead == null) {
            if (other.seqTupRead != null)
                return false;
        }
        else if (!this.seqTupRead.equals(other.seqTupRead))
            return false;
        if (this.idxScan == null) {
            if (other.idxScan != null)
                return false;
        }
        else if (!this.idxScan.equals(other.idxScan))
            return false;
        if (this.idxTupFetch == null) {
            if (other.idxTupFetch != null)
                return false;
        }
        else if (!this.idxTupFetch.equals(other.idxTupFetch))
            return false;
        if (this.nTupIns == null) {
            if (other.nTupIns != null)
                return false;
        }
        else if (!this.nTupIns.equals(other.nTupIns))
            return false;
        if (this.nTupUpd == null) {
            if (other.nTupUpd != null)
                return false;
        }
        else if (!this.nTupUpd.equals(other.nTupUpd))
            return false;
        if (this.nTupDel == null) {
            if (other.nTupDel != null)
                return false;
        }
        else if (!this.nTupDel.equals(other.nTupDel))
            return false;
        if (this.nTupHotUpd == null) {
            if (other.nTupHotUpd != null)
                return false;
        }
        else if (!this.nTupHotUpd.equals(other.nTupHotUpd))
            return false;
        if (this.nTupNewpageUpd == null) {
            if (other.nTupNewpageUpd != null)
                return false;
        }
        else if (!this.nTupNewpageUpd.equals(other.nTupNewpageUpd))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.seqScan == null) ? 0 : this.seqScan.hashCode());
        result = prime * result + ((this.seqTupRead == null) ? 0 : this.seqTupRead.hashCode());
        result = prime * result + ((this.idxScan == null) ? 0 : this.idxScan.hashCode());
        result = prime * result + ((this.idxTupFetch == null) ? 0 : this.idxTupFetch.hashCode());
        result = prime * result + ((this.nTupIns == null) ? 0 : this.nTupIns.hashCode());
        result = prime * result + ((this.nTupUpd == null) ? 0 : this.nTupUpd.hashCode());
        result = prime * result + ((this.nTupDel == null) ? 0 : this.nTupDel.hashCode());
        result = prime * result + ((this.nTupHotUpd == null) ? 0 : this.nTupHotUpd.hashCode());
        result = prime * result + ((this.nTupNewpageUpd == null) ? 0 : this.nTupNewpageUpd.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatXactAllTables (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(seqScan);
        sb.append(", ").append(seqTupRead);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(idxTupFetch);
        sb.append(", ").append(nTupIns);
        sb.append(", ").append(nTupUpd);
        sb.append(", ").append(nTupDel);
        sb.append(", ").append(nTupHotUpd);
        sb.append(", ").append(nTupNewpageUpd);

        sb.append(")");
        return sb.toString();
    }
}
