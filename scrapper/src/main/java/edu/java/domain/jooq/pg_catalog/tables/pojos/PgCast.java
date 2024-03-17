/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


/**
 * The table <code>pg_catalog.pg_cast</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgCast implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long castsource;
    private Long casttarget;
    private Long castfunc;
    private String castcontext;
    private String castmethod;

    public PgCast() {}

    public PgCast(PgCast value) {
        this.oid = value.oid;
        this.castsource = value.castsource;
        this.casttarget = value.casttarget;
        this.castfunc = value.castfunc;
        this.castcontext = value.castcontext;
        this.castmethod = value.castmethod;
    }

    @ConstructorProperties({ "oid", "castsource", "casttarget", "castfunc", "castcontext", "castmethod" })
    public PgCast(
        @NotNull Long oid,
        @NotNull Long castsource,
        @NotNull Long casttarget,
        @NotNull Long castfunc,
        @NotNull String castcontext,
        @NotNull String castmethod
    ) {
        this.oid = oid;
        this.castsource = castsource;
        this.casttarget = casttarget;
        this.castfunc = castfunc;
        this.castcontext = castcontext;
        this.castmethod = castmethod;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCastsource() {
        return this.castsource;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    public void setCastsource(@NotNull Long castsource) {
        this.castsource = castsource;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCasttarget() {
        return this.casttarget;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public void setCasttarget(@NotNull Long casttarget) {
        this.casttarget = casttarget;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCastfunc() {
        return this.castfunc;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public void setCastfunc(@NotNull Long castfunc) {
        this.castfunc = castfunc;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getCastcontext() {
        return this.castcontext;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public void setCastcontext(@NotNull String castcontext) {
        this.castcontext = castcontext;
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getCastmethod() {
        return this.castmethod;
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public void setCastmethod(@NotNull String castmethod) {
        this.castmethod = castmethod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgCast other = (PgCast) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.castsource == null) {
            if (other.castsource != null)
                return false;
        }
        else if (!this.castsource.equals(other.castsource))
            return false;
        if (this.casttarget == null) {
            if (other.casttarget != null)
                return false;
        }
        else if (!this.casttarget.equals(other.casttarget))
            return false;
        if (this.castfunc == null) {
            if (other.castfunc != null)
                return false;
        }
        else if (!this.castfunc.equals(other.castfunc))
            return false;
        if (this.castcontext == null) {
            if (other.castcontext != null)
                return false;
        }
        else if (!this.castcontext.equals(other.castcontext))
            return false;
        if (this.castmethod == null) {
            if (other.castmethod != null)
                return false;
        }
        else if (!this.castmethod.equals(other.castmethod))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.castsource == null) ? 0 : this.castsource.hashCode());
        result = prime * result + ((this.casttarget == null) ? 0 : this.casttarget.hashCode());
        result = prime * result + ((this.castfunc == null) ? 0 : this.castfunc.hashCode());
        result = prime * result + ((this.castcontext == null) ? 0 : this.castcontext.hashCode());
        result = prime * result + ((this.castmethod == null) ? 0 : this.castmethod.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgCast (");

        sb.append(oid);
        sb.append(", ").append(castsource);
        sb.append(", ").append(casttarget);
        sb.append(", ").append(castfunc);
        sb.append(", ").append(castcontext);
        sb.append(", ").append(castmethod);

        sb.append(")");
        return sb.toString();
    }
}
