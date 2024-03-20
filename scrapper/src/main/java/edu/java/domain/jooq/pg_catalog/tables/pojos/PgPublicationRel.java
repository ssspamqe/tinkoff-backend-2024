/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPublicationRel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long prpubid;
    private Long prrelid;
    private Object prqual;
    private Object[] prattrs;

    public PgPublicationRel() {}

    public PgPublicationRel(PgPublicationRel value) {
        this.oid = value.oid;
        this.prpubid = value.prpubid;
        this.prrelid = value.prrelid;
        this.prqual = value.prqual;
        this.prattrs = value.prattrs;
    }

    @ConstructorProperties({ "oid", "prpubid", "prrelid", "prqual", "prattrs" })
    public PgPublicationRel(
        @NotNull Long oid,
        @NotNull Long prpubid,
        @NotNull Long prrelid,
        @Nullable Object prqual,
        @Nullable Object[] prattrs
    ) {
        this.oid = oid;
        this.prpubid = prpubid;
        this.prrelid = prrelid;
        this.prqual = prqual;
        this.prattrs = prattrs;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPrpubid() {
        return this.prpubid;
    }

    public void setPrpubid(@NotNull Long prpubid) {
        this.prpubid = prpubid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPrrelid() {
        return this.prrelid;
    }

    public void setPrrelid(@NotNull Long prrelid) {
        this.prrelid = prrelid;
    }

    @Deprecated
    @Nullable
    public Object getPrqual() {
        return this.prqual;
    }

    @Deprecated
    public void setPrqual(@Nullable Object prqual) {
        this.prqual = prqual;
    }

    @Nullable
    public Object[] getPrattrs() {
        return this.prattrs;
    }

    public void setPrattrs(@Nullable Object[] prattrs) {
        this.prattrs = prattrs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPublicationRel other = (PgPublicationRel) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.prpubid == null) {
            if (other.prpubid != null)
                return false;
        }
        else if (!this.prpubid.equals(other.prpubid))
            return false;
        if (this.prrelid == null) {
            if (other.prrelid != null)
                return false;
        }
        else if (!this.prrelid.equals(other.prrelid))
            return false;
        if (this.prqual == null) {
            if (other.prqual != null)
                return false;
        }
        else if (!this.prqual.equals(other.prqual))
            return false;
        if (this.prattrs == null) {
            if (other.prattrs != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.prattrs, other.prattrs))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.prpubid == null) ? 0 : this.prpubid.hashCode());
        result = prime * result + ((this.prrelid == null) ? 0 : this.prrelid.hashCode());
        result = prime * result + ((this.prqual == null) ? 0 : this.prqual.hashCode());
        result = prime * result + ((this.prattrs == null) ? 0 : Arrays.deepHashCode(this.prattrs));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPublicationRel (");

        sb.append(oid);
        sb.append(", ").append(prpubid);
        sb.append(", ").append(prrelid);
        sb.append(", ").append(prqual);
        sb.append(", ").append(Arrays.deepToString(prattrs));

        sb.append(")");
        return sb.toString();
    }
}
