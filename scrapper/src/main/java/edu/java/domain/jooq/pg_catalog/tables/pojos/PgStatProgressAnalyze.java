/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_stat_progress_analyze</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatProgressAnalyze implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Long datid;
    private String datname;
    private Long relid;
    private String phase;
    private Long sampleBlksTotal;
    private Long sampleBlksScanned;
    private Long extStatsTotal;
    private Long extStatsComputed;
    private Long childTablesTotal;
    private Long childTablesDone;
    private Long currentChildTableRelid;

    public PgStatProgressAnalyze() {}

    public PgStatProgressAnalyze(PgStatProgressAnalyze value) {
        this.pid = value.pid;
        this.datid = value.datid;
        this.datname = value.datname;
        this.relid = value.relid;
        this.phase = value.phase;
        this.sampleBlksTotal = value.sampleBlksTotal;
        this.sampleBlksScanned = value.sampleBlksScanned;
        this.extStatsTotal = value.extStatsTotal;
        this.extStatsComputed = value.extStatsComputed;
        this.childTablesTotal = value.childTablesTotal;
        this.childTablesDone = value.childTablesDone;
        this.currentChildTableRelid = value.currentChildTableRelid;
    }

    @ConstructorProperties({ "pid", "datid", "datname", "relid", "phase", "sampleBlksTotal", "sampleBlksScanned", "extStatsTotal", "extStatsComputed", "childTablesTotal", "childTablesDone", "currentChildTableRelid" })
    public PgStatProgressAnalyze(
        @Nullable Integer pid,
        @Nullable Long datid,
        @Nullable String datname,
        @Nullable Long relid,
        @Nullable String phase,
        @Nullable Long sampleBlksTotal,
        @Nullable Long sampleBlksScanned,
        @Nullable Long extStatsTotal,
        @Nullable Long extStatsComputed,
        @Nullable Long childTablesTotal,
        @Nullable Long childTablesDone,
        @Nullable Long currentChildTableRelid
    ) {
        this.pid = pid;
        this.datid = datid;
        this.datname = datname;
        this.relid = relid;
        this.phase = phase;
        this.sampleBlksTotal = sampleBlksTotal;
        this.sampleBlksScanned = sampleBlksScanned;
        this.extStatsTotal = extStatsTotal;
        this.extStatsComputed = extStatsComputed;
        this.childTablesTotal = childTablesTotal;
        this.childTablesDone = childTablesDone;
        this.currentChildTableRelid = currentChildTableRelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.pid</code>.
     */
    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.datid</code>.
     */
    @Nullable
    public Long getDatid() {
        return this.datid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.datid</code>.
     */
    public void setDatid(@Nullable Long datid) {
        this.datid = datid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.datname</code>.
     */
    @Nullable
    public String getDatname() {
        return this.datname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.datname</code>.
     */
    public void setDatname(@Nullable String datname) {
        this.datname = datname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.phase</code>.
     */
    @Nullable
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.phase</code>.
     */
    public void setPhase(@Nullable String phase) {
        this.phase = phase;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_total</code>.
     */
    @Nullable
    public Long getSampleBlksTotal() {
        return this.sampleBlksTotal;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_total</code>.
     */
    public void setSampleBlksTotal(@Nullable Long sampleBlksTotal) {
        this.sampleBlksTotal = sampleBlksTotal;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_scanned</code>.
     */
    @Nullable
    public Long getSampleBlksScanned() {
        return this.sampleBlksScanned;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_scanned</code>.
     */
    public void setSampleBlksScanned(@Nullable Long sampleBlksScanned) {
        this.sampleBlksScanned = sampleBlksScanned;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_total</code>.
     */
    @Nullable
    public Long getExtStatsTotal() {
        return this.extStatsTotal;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_total</code>.
     */
    public void setExtStatsTotal(@Nullable Long extStatsTotal) {
        this.extStatsTotal = extStatsTotal;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_computed</code>.
     */
    @Nullable
    public Long getExtStatsComputed() {
        return this.extStatsComputed;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_computed</code>.
     */
    public void setExtStatsComputed(@Nullable Long extStatsComputed) {
        this.extStatsComputed = extStatsComputed;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_total</code>.
     */
    @Nullable
    public Long getChildTablesTotal() {
        return this.childTablesTotal;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_total</code>.
     */
    public void setChildTablesTotal(@Nullable Long childTablesTotal) {
        this.childTablesTotal = childTablesTotal;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_done</code>.
     */
    @Nullable
    public Long getChildTablesDone() {
        return this.childTablesDone;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_done</code>.
     */
    public void setChildTablesDone(@Nullable Long childTablesDone) {
        this.childTablesDone = childTablesDone;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.current_child_table_relid</code>.
     */
    @Nullable
    public Long getCurrentChildTableRelid() {
        return this.currentChildTableRelid;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.current_child_table_relid</code>.
     */
    public void setCurrentChildTableRelid(@Nullable Long currentChildTableRelid) {
        this.currentChildTableRelid = currentChildTableRelid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatProgressAnalyze other = (PgStatProgressAnalyze) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.datid == null) {
            if (other.datid != null)
                return false;
        }
        else if (!this.datid.equals(other.datid))
            return false;
        if (this.datname == null) {
            if (other.datname != null)
                return false;
        }
        else if (!this.datname.equals(other.datname))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.phase == null) {
            if (other.phase != null)
                return false;
        }
        else if (!this.phase.equals(other.phase))
            return false;
        if (this.sampleBlksTotal == null) {
            if (other.sampleBlksTotal != null)
                return false;
        }
        else if (!this.sampleBlksTotal.equals(other.sampleBlksTotal))
            return false;
        if (this.sampleBlksScanned == null) {
            if (other.sampleBlksScanned != null)
                return false;
        }
        else if (!this.sampleBlksScanned.equals(other.sampleBlksScanned))
            return false;
        if (this.extStatsTotal == null) {
            if (other.extStatsTotal != null)
                return false;
        }
        else if (!this.extStatsTotal.equals(other.extStatsTotal))
            return false;
        if (this.extStatsComputed == null) {
            if (other.extStatsComputed != null)
                return false;
        }
        else if (!this.extStatsComputed.equals(other.extStatsComputed))
            return false;
        if (this.childTablesTotal == null) {
            if (other.childTablesTotal != null)
                return false;
        }
        else if (!this.childTablesTotal.equals(other.childTablesTotal))
            return false;
        if (this.childTablesDone == null) {
            if (other.childTablesDone != null)
                return false;
        }
        else if (!this.childTablesDone.equals(other.childTablesDone))
            return false;
        if (this.currentChildTableRelid == null) {
            if (other.currentChildTableRelid != null)
                return false;
        }
        else if (!this.currentChildTableRelid.equals(other.currentChildTableRelid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.datid == null) ? 0 : this.datid.hashCode());
        result = prime * result + ((this.datname == null) ? 0 : this.datname.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.phase == null) ? 0 : this.phase.hashCode());
        result = prime * result + ((this.sampleBlksTotal == null) ? 0 : this.sampleBlksTotal.hashCode());
        result = prime * result + ((this.sampleBlksScanned == null) ? 0 : this.sampleBlksScanned.hashCode());
        result = prime * result + ((this.extStatsTotal == null) ? 0 : this.extStatsTotal.hashCode());
        result = prime * result + ((this.extStatsComputed == null) ? 0 : this.extStatsComputed.hashCode());
        result = prime * result + ((this.childTablesTotal == null) ? 0 : this.childTablesTotal.hashCode());
        result = prime * result + ((this.childTablesDone == null) ? 0 : this.childTablesDone.hashCode());
        result = prime * result + ((this.currentChildTableRelid == null) ? 0 : this.currentChildTableRelid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatProgressAnalyze (");

        sb.append(pid);
        sb.append(", ").append(datid);
        sb.append(", ").append(datname);
        sb.append(", ").append(relid);
        sb.append(", ").append(phase);
        sb.append(", ").append(sampleBlksTotal);
        sb.append(", ").append(sampleBlksScanned);
        sb.append(", ").append(extStatsTotal);
        sb.append(", ").append(extStatsComputed);
        sb.append(", ").append(childTablesTotal);
        sb.append(", ").append(childTablesDone);
        sb.append(", ").append(currentChildTableRelid);

        sb.append(")");
        return sb.toString();
    }
}
