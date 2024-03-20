/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetMultixactMembers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long xid;
    private String mode;

    public PgGetMultixactMembers() {}

    public PgGetMultixactMembers(PgGetMultixactMembers value) {
        this.xid = value.xid;
        this.mode = value.mode;
    }

    @ConstructorProperties({ "xid", "mode" })
    public PgGetMultixactMembers(
        @Nullable Long xid,
        @Nullable String mode
    ) {
        this.xid = xid;
        this.mode = mode;
    }

    @Nullable
    public Long getXid() {
        return this.xid;
    }

    public void setXid(@Nullable Long xid) {
        this.xid = xid;
    }

    @Nullable
    public String getMode() {
        return this.mode;
    }

    public void setMode(@Nullable String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgGetMultixactMembers other = (PgGetMultixactMembers) obj;
        if (this.xid == null) {
            if (other.xid != null)
                return false;
        }
        else if (!this.xid.equals(other.xid))
            return false;
        if (this.mode == null) {
            if (other.mode != null)
                return false;
        }
        else if (!this.mode.equals(other.mode))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.xid == null) ? 0 : this.xid.hashCode());
        result = prime * result + ((this.mode == null) ? 0 : this.mode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgGetMultixactMembers (");

        sb.append(xid);
        sb.append(", ").append(mode);

        sb.append(")");
        return sb.toString();
    }
}