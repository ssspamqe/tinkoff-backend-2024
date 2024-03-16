/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


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
public class PgSequence implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long seqrelid;
    private Long seqtypid;
    private Long seqstart;
    private Long seqincrement;
    private Long seqmax;
    private Long seqmin;
    private Long seqcache;
    private Boolean seqcycle;

    public PgSequence() {}

    public PgSequence(PgSequence value) {
        this.seqrelid = value.seqrelid;
        this.seqtypid = value.seqtypid;
        this.seqstart = value.seqstart;
        this.seqincrement = value.seqincrement;
        this.seqmax = value.seqmax;
        this.seqmin = value.seqmin;
        this.seqcache = value.seqcache;
        this.seqcycle = value.seqcycle;
    }

    @ConstructorProperties({ "seqrelid", "seqtypid", "seqstart", "seqincrement", "seqmax", "seqmin", "seqcache", "seqcycle" })
    public PgSequence(
        @NotNull Long seqrelid,
        @NotNull Long seqtypid,
        @NotNull Long seqstart,
        @NotNull Long seqincrement,
        @NotNull Long seqmax,
        @NotNull Long seqmin,
        @NotNull Long seqcache,
        @NotNull Boolean seqcycle
    ) {
        this.seqrelid = seqrelid;
        this.seqtypid = seqtypid;
        this.seqstart = seqstart;
        this.seqincrement = seqincrement;
        this.seqmax = seqmax;
        this.seqmin = seqmin;
        this.seqcache = seqcache;
        this.seqcycle = seqcycle;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqrelid() {
        return this.seqrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public void setSeqrelid(@NotNull Long seqrelid) {
        this.seqrelid = seqrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqtypid() {
        return this.seqtypid;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public void setSeqtypid(@NotNull Long seqtypid) {
        this.seqtypid = seqtypid;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqstart() {
        return this.seqstart;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public void setSeqstart(@NotNull Long seqstart) {
        this.seqstart = seqstart;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqincrement() {
        return this.seqincrement;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public void setSeqincrement(@NotNull Long seqincrement) {
        this.seqincrement = seqincrement;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqmax() {
        return this.seqmax;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public void setSeqmax(@NotNull Long seqmax) {
        this.seqmax = seqmax;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqmin() {
        return this.seqmin;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public void setSeqmin(@NotNull Long seqmin) {
        this.seqmin = seqmin;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSeqcache() {
        return this.seqcache;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public void setSeqcache(@NotNull Long seqcache) {
        this.seqcache = seqcache;
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSeqcycle() {
        return this.seqcycle;
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public void setSeqcycle(@NotNull Boolean seqcycle) {
        this.seqcycle = seqcycle;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgSequence other = (PgSequence) obj;
        if (this.seqrelid == null) {
            if (other.seqrelid != null)
                return false;
        }
        else if (!this.seqrelid.equals(other.seqrelid))
            return false;
        if (this.seqtypid == null) {
            if (other.seqtypid != null)
                return false;
        }
        else if (!this.seqtypid.equals(other.seqtypid))
            return false;
        if (this.seqstart == null) {
            if (other.seqstart != null)
                return false;
        }
        else if (!this.seqstart.equals(other.seqstart))
            return false;
        if (this.seqincrement == null) {
            if (other.seqincrement != null)
                return false;
        }
        else if (!this.seqincrement.equals(other.seqincrement))
            return false;
        if (this.seqmax == null) {
            if (other.seqmax != null)
                return false;
        }
        else if (!this.seqmax.equals(other.seqmax))
            return false;
        if (this.seqmin == null) {
            if (other.seqmin != null)
                return false;
        }
        else if (!this.seqmin.equals(other.seqmin))
            return false;
        if (this.seqcache == null) {
            if (other.seqcache != null)
                return false;
        }
        else if (!this.seqcache.equals(other.seqcache))
            return false;
        if (this.seqcycle == null) {
            if (other.seqcycle != null)
                return false;
        }
        else if (!this.seqcycle.equals(other.seqcycle))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.seqrelid == null) ? 0 : this.seqrelid.hashCode());
        result = prime * result + ((this.seqtypid == null) ? 0 : this.seqtypid.hashCode());
        result = prime * result + ((this.seqstart == null) ? 0 : this.seqstart.hashCode());
        result = prime * result + ((this.seqincrement == null) ? 0 : this.seqincrement.hashCode());
        result = prime * result + ((this.seqmax == null) ? 0 : this.seqmax.hashCode());
        result = prime * result + ((this.seqmin == null) ? 0 : this.seqmin.hashCode());
        result = prime * result + ((this.seqcache == null) ? 0 : this.seqcache.hashCode());
        result = prime * result + ((this.seqcycle == null) ? 0 : this.seqcycle.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSequence (");

        sb.append(seqrelid);
        sb.append(", ").append(seqtypid);
        sb.append(", ").append(seqstart);
        sb.append(", ").append(seqincrement);
        sb.append(", ").append(seqmax);
        sb.append(", ").append(seqmin);
        sb.append(", ").append(seqcache);
        sb.append(", ").append(seqcycle);

        sb.append(")");
        return sb.toString();
    }
}
