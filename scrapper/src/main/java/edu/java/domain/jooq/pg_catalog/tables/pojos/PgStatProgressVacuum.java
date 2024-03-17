/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_stat_progress_vacuum</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatProgressVacuum implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Long datid;
    private String datname;
    private Long relid;
    private String phase;
    private Long heapBlksTotal;
    private Long heapBlksScanned;
    private Long heapBlksVacuumed;
    private Long indexVacuumCount;
    private Long maxDeadTuples;
    private Long numDeadTuples;

    public PgStatProgressVacuum() {}

    public PgStatProgressVacuum(PgStatProgressVacuum value) {
        this.pid = value.pid;
        this.datid = value.datid;
        this.datname = value.datname;
        this.relid = value.relid;
        this.phase = value.phase;
        this.heapBlksTotal = value.heapBlksTotal;
        this.heapBlksScanned = value.heapBlksScanned;
        this.heapBlksVacuumed = value.heapBlksVacuumed;
        this.indexVacuumCount = value.indexVacuumCount;
        this.maxDeadTuples = value.maxDeadTuples;
        this.numDeadTuples = value.numDeadTuples;
    }

    @ConstructorProperties({ "pid", "datid", "datname", "relid", "phase", "heapBlksTotal", "heapBlksScanned", "heapBlksVacuumed", "indexVacuumCount", "maxDeadTuples", "numDeadTuples" })
    public PgStatProgressVacuum(
        @Nullable Integer pid,
        @Nullable Long datid,
        @Nullable String datname,
        @Nullable Long relid,
        @Nullable String phase,
        @Nullable Long heapBlksTotal,
        @Nullable Long heapBlksScanned,
        @Nullable Long heapBlksVacuumed,
        @Nullable Long indexVacuumCount,
        @Nullable Long maxDeadTuples,
        @Nullable Long numDeadTuples
    ) {
        this.pid = pid;
        this.datid = datid;
        this.datname = datname;
        this.relid = relid;
        this.phase = phase;
        this.heapBlksTotal = heapBlksTotal;
        this.heapBlksScanned = heapBlksScanned;
        this.heapBlksVacuumed = heapBlksVacuumed;
        this.indexVacuumCount = indexVacuumCount;
        this.maxDeadTuples = maxDeadTuples;
        this.numDeadTuples = numDeadTuples;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    @Nullable
    public Long getDatid() {
        return this.datid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    public void setDatid(@Nullable Long datid) {
        this.datid = datid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    @Nullable
    public String getDatname() {
        return this.datname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    public void setDatname(@Nullable String datname) {
        this.datname = datname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    @Nullable
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    public void setPhase(@Nullable String phase) {
        this.phase = phase;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    @Nullable
    public Long getHeapBlksTotal() {
        return this.heapBlksTotal;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    public void setHeapBlksTotal(@Nullable Long heapBlksTotal) {
        this.heapBlksTotal = heapBlksTotal;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    @Nullable
    public Long getHeapBlksScanned() {
        return this.heapBlksScanned;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    public void setHeapBlksScanned(@Nullable Long heapBlksScanned) {
        this.heapBlksScanned = heapBlksScanned;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    @Nullable
    public Long getHeapBlksVacuumed() {
        return this.heapBlksVacuumed;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    public void setHeapBlksVacuumed(@Nullable Long heapBlksVacuumed) {
        this.heapBlksVacuumed = heapBlksVacuumed;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    @Nullable
    public Long getIndexVacuumCount() {
        return this.indexVacuumCount;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    public void setIndexVacuumCount(@Nullable Long indexVacuumCount) {
        this.indexVacuumCount = indexVacuumCount;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    @Nullable
    public Long getMaxDeadTuples() {
        return this.maxDeadTuples;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    public void setMaxDeadTuples(@Nullable Long maxDeadTuples) {
        this.maxDeadTuples = maxDeadTuples;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    @Nullable
    public Long getNumDeadTuples() {
        return this.numDeadTuples;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    public void setNumDeadTuples(@Nullable Long numDeadTuples) {
        this.numDeadTuples = numDeadTuples;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatProgressVacuum other = (PgStatProgressVacuum) obj;
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
        if (this.heapBlksTotal == null) {
            if (other.heapBlksTotal != null)
                return false;
        }
        else if (!this.heapBlksTotal.equals(other.heapBlksTotal))
            return false;
        if (this.heapBlksScanned == null) {
            if (other.heapBlksScanned != null)
                return false;
        }
        else if (!this.heapBlksScanned.equals(other.heapBlksScanned))
            return false;
        if (this.heapBlksVacuumed == null) {
            if (other.heapBlksVacuumed != null)
                return false;
        }
        else if (!this.heapBlksVacuumed.equals(other.heapBlksVacuumed))
            return false;
        if (this.indexVacuumCount == null) {
            if (other.indexVacuumCount != null)
                return false;
        }
        else if (!this.indexVacuumCount.equals(other.indexVacuumCount))
            return false;
        if (this.maxDeadTuples == null) {
            if (other.maxDeadTuples != null)
                return false;
        }
        else if (!this.maxDeadTuples.equals(other.maxDeadTuples))
            return false;
        if (this.numDeadTuples == null) {
            if (other.numDeadTuples != null)
                return false;
        }
        else if (!this.numDeadTuples.equals(other.numDeadTuples))
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
        result = prime * result + ((this.heapBlksTotal == null) ? 0 : this.heapBlksTotal.hashCode());
        result = prime * result + ((this.heapBlksScanned == null) ? 0 : this.heapBlksScanned.hashCode());
        result = prime * result + ((this.heapBlksVacuumed == null) ? 0 : this.heapBlksVacuumed.hashCode());
        result = prime * result + ((this.indexVacuumCount == null) ? 0 : this.indexVacuumCount.hashCode());
        result = prime * result + ((this.maxDeadTuples == null) ? 0 : this.maxDeadTuples.hashCode());
        result = prime * result + ((this.numDeadTuples == null) ? 0 : this.numDeadTuples.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatProgressVacuum (");

        sb.append(pid);
        sb.append(", ").append(datid);
        sb.append(", ").append(datname);
        sb.append(", ").append(relid);
        sb.append(", ").append(phase);
        sb.append(", ").append(heapBlksTotal);
        sb.append(", ").append(heapBlksScanned);
        sb.append(", ").append(heapBlksVacuumed);
        sb.append(", ").append(indexVacuumCount);
        sb.append(", ").append(maxDeadTuples);
        sb.append(", ").append(numDeadTuples);

        sb.append(")");
        return sb.toString();
    }
}
