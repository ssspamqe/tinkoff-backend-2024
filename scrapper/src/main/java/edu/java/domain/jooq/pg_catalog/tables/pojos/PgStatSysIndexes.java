/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


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
public class PgStatSysIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private Long indexrelid;
    private String schemaname;
    private String relname;
    private String indexrelname;
    private Long idxScan;
    private OffsetDateTime lastIdxScan;
    private Long idxTupRead;
    private Long idxTupFetch;

    public PgStatSysIndexes() {}

    public PgStatSysIndexes(PgStatSysIndexes value) {
        this.relid = value.relid;
        this.indexrelid = value.indexrelid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.indexrelname = value.indexrelname;
        this.idxScan = value.idxScan;
        this.lastIdxScan = value.lastIdxScan;
        this.idxTupRead = value.idxTupRead;
        this.idxTupFetch = value.idxTupFetch;
    }

    @ConstructorProperties({ "relid", "indexrelid", "schemaname", "relname", "indexrelname", "idxScan", "lastIdxScan", "idxTupRead", "idxTupFetch" })
    public PgStatSysIndexes(
        @Nullable Long relid,
        @Nullable Long indexrelid,
        @Nullable String schemaname,
        @Nullable String relname,
        @Nullable String indexrelname,
        @Nullable Long idxScan,
        @Nullable OffsetDateTime lastIdxScan,
        @Nullable Long idxTupRead,
        @Nullable Long idxTupFetch
    ) {
        this.relid = relid;
        this.indexrelid = indexrelid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.indexrelname = indexrelname;
        this.idxScan = idxScan;
        this.lastIdxScan = lastIdxScan;
        this.idxTupRead = idxTupRead;
        this.idxTupFetch = idxTupFetch;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.indexrelid</code>.
     */
    @Nullable
    public Long getIndexrelid() {
        return this.indexrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.indexrelid</code>.
     */
    public void setIndexrelid(@Nullable Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.schemaname</code>.
     */
    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.relname</code>.
     */
    public void setRelname(@Nullable String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.indexrelname</code>.
     */
    @Nullable
    public String getIndexrelname() {
        return this.indexrelname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.indexrelname</code>.
     */
    public void setIndexrelname(@Nullable String indexrelname) {
        this.indexrelname = indexrelname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.idx_scan</code>.
     */
    @Nullable
    public Long getIdxScan() {
        return this.idxScan;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.idx_scan</code>.
     */
    public void setIdxScan(@Nullable Long idxScan) {
        this.idxScan = idxScan;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.last_idx_scan</code>.
     */
    @Nullable
    public OffsetDateTime getLastIdxScan() {
        return this.lastIdxScan;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.last_idx_scan</code>.
     */
    public void setLastIdxScan(@Nullable OffsetDateTime lastIdxScan) {
        this.lastIdxScan = lastIdxScan;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.idx_tup_read</code>.
     */
    @Nullable
    public Long getIdxTupRead() {
        return this.idxTupRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.idx_tup_read</code>.
     */
    public void setIdxTupRead(@Nullable Long idxTupRead) {
        this.idxTupRead = idxTupRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_indexes.idx_tup_fetch</code>.
     */
    @Nullable
    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_indexes.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(@Nullable Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatSysIndexes other = (PgStatSysIndexes) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.indexrelid == null) {
            if (other.indexrelid != null)
                return false;
        }
        else if (!this.indexrelid.equals(other.indexrelid))
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
        if (this.indexrelname == null) {
            if (other.indexrelname != null)
                return false;
        }
        else if (!this.indexrelname.equals(other.indexrelname))
            return false;
        if (this.idxScan == null) {
            if (other.idxScan != null)
                return false;
        }
        else if (!this.idxScan.equals(other.idxScan))
            return false;
        if (this.lastIdxScan == null) {
            if (other.lastIdxScan != null)
                return false;
        }
        else if (!this.lastIdxScan.equals(other.lastIdxScan))
            return false;
        if (this.idxTupRead == null) {
            if (other.idxTupRead != null)
                return false;
        }
        else if (!this.idxTupRead.equals(other.idxTupRead))
            return false;
        if (this.idxTupFetch == null) {
            if (other.idxTupFetch != null)
                return false;
        }
        else if (!this.idxTupFetch.equals(other.idxTupFetch))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.indexrelid == null) ? 0 : this.indexrelid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.indexrelname == null) ? 0 : this.indexrelname.hashCode());
        result = prime * result + ((this.idxScan == null) ? 0 : this.idxScan.hashCode());
        result = prime * result + ((this.lastIdxScan == null) ? 0 : this.lastIdxScan.hashCode());
        result = prime * result + ((this.idxTupRead == null) ? 0 : this.idxTupRead.hashCode());
        result = prime * result + ((this.idxTupFetch == null) ? 0 : this.idxTupFetch.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSysIndexes (");

        sb.append(relid);
        sb.append(", ").append(indexrelid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(indexrelname);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(lastIdxScan);
        sb.append(", ").append(idxTupRead);
        sb.append(", ").append(idxTupFetch);

        sb.append(")");
        return sb.toString();
    }
}
