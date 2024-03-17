/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_statio_sys_tables</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatioSysTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private String schemaname;
    private String relname;
    private Long heapBlksRead;
    private Long heapBlksHit;
    private Long idxBlksRead;
    private Long idxBlksHit;
    private Long toastBlksRead;
    private Long toastBlksHit;
    private Long tidxBlksRead;
    private Long tidxBlksHit;

    public PgStatioSysTables() {}

    public PgStatioSysTables(PgStatioSysTables value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.heapBlksRead = value.heapBlksRead;
        this.heapBlksHit = value.heapBlksHit;
        this.idxBlksRead = value.idxBlksRead;
        this.idxBlksHit = value.idxBlksHit;
        this.toastBlksRead = value.toastBlksRead;
        this.toastBlksHit = value.toastBlksHit;
        this.tidxBlksRead = value.tidxBlksRead;
        this.tidxBlksHit = value.tidxBlksHit;
    }

    @ConstructorProperties({ "relid", "schemaname", "relname", "heapBlksRead", "heapBlksHit", "idxBlksRead", "idxBlksHit", "toastBlksRead", "toastBlksHit", "tidxBlksRead", "tidxBlksHit" })
    public PgStatioSysTables(
        @Nullable Long relid,
        @Nullable String schemaname,
        @Nullable String relname,
        @Nullable Long heapBlksRead,
        @Nullable Long heapBlksHit,
        @Nullable Long idxBlksRead,
        @Nullable Long idxBlksHit,
        @Nullable Long toastBlksRead,
        @Nullable Long toastBlksHit,
        @Nullable Long tidxBlksRead,
        @Nullable Long tidxBlksHit
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.heapBlksRead = heapBlksRead;
        this.heapBlksHit = heapBlksHit;
        this.idxBlksRead = idxBlksRead;
        this.idxBlksHit = idxBlksHit;
        this.toastBlksRead = toastBlksRead;
        this.toastBlksHit = toastBlksHit;
        this.tidxBlksRead = tidxBlksRead;
        this.tidxBlksHit = tidxBlksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    @Nullable
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    public void setRelname(@Nullable String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    @Nullable
    public Long getHeapBlksRead() {
        return this.heapBlksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    public void setHeapBlksRead(@Nullable Long heapBlksRead) {
        this.heapBlksRead = heapBlksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    @Nullable
    public Long getHeapBlksHit() {
        return this.heapBlksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    public void setHeapBlksHit(@Nullable Long heapBlksHit) {
        this.heapBlksHit = heapBlksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    @Nullable
    public Long getIdxBlksRead() {
        return this.idxBlksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    public void setIdxBlksRead(@Nullable Long idxBlksRead) {
        this.idxBlksRead = idxBlksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    @Nullable
    public Long getIdxBlksHit() {
        return this.idxBlksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(@Nullable Long idxBlksHit) {
        this.idxBlksHit = idxBlksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    @Nullable
    public Long getToastBlksRead() {
        return this.toastBlksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    public void setToastBlksRead(@Nullable Long toastBlksRead) {
        this.toastBlksRead = toastBlksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    @Nullable
    public Long getToastBlksHit() {
        return this.toastBlksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    public void setToastBlksHit(@Nullable Long toastBlksHit) {
        this.toastBlksHit = toastBlksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    @Nullable
    public Long getTidxBlksRead() {
        return this.tidxBlksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    public void setTidxBlksRead(@Nullable Long tidxBlksRead) {
        this.tidxBlksRead = tidxBlksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    @Nullable
    public Long getTidxBlksHit() {
        return this.tidxBlksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    public void setTidxBlksHit(@Nullable Long tidxBlksHit) {
        this.tidxBlksHit = tidxBlksHit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatioSysTables other = (PgStatioSysTables) obj;
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
        if (this.heapBlksRead == null) {
            if (other.heapBlksRead != null)
                return false;
        }
        else if (!this.heapBlksRead.equals(other.heapBlksRead))
            return false;
        if (this.heapBlksHit == null) {
            if (other.heapBlksHit != null)
                return false;
        }
        else if (!this.heapBlksHit.equals(other.heapBlksHit))
            return false;
        if (this.idxBlksRead == null) {
            if (other.idxBlksRead != null)
                return false;
        }
        else if (!this.idxBlksRead.equals(other.idxBlksRead))
            return false;
        if (this.idxBlksHit == null) {
            if (other.idxBlksHit != null)
                return false;
        }
        else if (!this.idxBlksHit.equals(other.idxBlksHit))
            return false;
        if (this.toastBlksRead == null) {
            if (other.toastBlksRead != null)
                return false;
        }
        else if (!this.toastBlksRead.equals(other.toastBlksRead))
            return false;
        if (this.toastBlksHit == null) {
            if (other.toastBlksHit != null)
                return false;
        }
        else if (!this.toastBlksHit.equals(other.toastBlksHit))
            return false;
        if (this.tidxBlksRead == null) {
            if (other.tidxBlksRead != null)
                return false;
        }
        else if (!this.tidxBlksRead.equals(other.tidxBlksRead))
            return false;
        if (this.tidxBlksHit == null) {
            if (other.tidxBlksHit != null)
                return false;
        }
        else if (!this.tidxBlksHit.equals(other.tidxBlksHit))
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
        result = prime * result + ((this.heapBlksRead == null) ? 0 : this.heapBlksRead.hashCode());
        result = prime * result + ((this.heapBlksHit == null) ? 0 : this.heapBlksHit.hashCode());
        result = prime * result + ((this.idxBlksRead == null) ? 0 : this.idxBlksRead.hashCode());
        result = prime * result + ((this.idxBlksHit == null) ? 0 : this.idxBlksHit.hashCode());
        result = prime * result + ((this.toastBlksRead == null) ? 0 : this.toastBlksRead.hashCode());
        result = prime * result + ((this.toastBlksHit == null) ? 0 : this.toastBlksHit.hashCode());
        result = prime * result + ((this.tidxBlksRead == null) ? 0 : this.tidxBlksRead.hashCode());
        result = prime * result + ((this.tidxBlksHit == null) ? 0 : this.tidxBlksHit.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioSysTables (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(heapBlksRead);
        sb.append(", ").append(heapBlksHit);
        sb.append(", ").append(idxBlksRead);
        sb.append(", ").append(idxBlksHit);
        sb.append(", ").append(toastBlksRead);
        sb.append(", ").append(toastBlksHit);
        sb.append(", ").append(tidxBlksRead);
        sb.append(", ").append(tidxBlksHit);

        sb.append(")");
        return sb.toString();
    }
}
