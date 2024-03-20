/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgOpfamily implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long opfmethod;
    private String opfname;
    private Long opfnamespace;
    private Long opfowner;

    public PgOpfamily() {}

    public PgOpfamily(PgOpfamily value) {
        this.oid = value.oid;
        this.opfmethod = value.opfmethod;
        this.opfname = value.opfname;
        this.opfnamespace = value.opfnamespace;
        this.opfowner = value.opfowner;
    }

    @ConstructorProperties({ "oid", "opfmethod", "opfname", "opfnamespace", "opfowner" })
    public PgOpfamily(
        @NotNull Long oid,
        @NotNull Long opfmethod,
        @NotNull String opfname,
        @NotNull Long opfnamespace,
        @NotNull Long opfowner
    ) {
        this.oid = oid;
        this.opfmethod = opfmethod;
        this.opfname = opfname;
        this.opfnamespace = opfnamespace;
        this.opfowner = opfowner;
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
    public Long getOpfmethod() {
        return this.opfmethod;
    }

    public void setOpfmethod(@NotNull Long opfmethod) {
        this.opfmethod = opfmethod;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getOpfname() {
        return this.opfname;
    }

    public void setOpfname(@NotNull String opfname) {
        this.opfname = opfname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOpfnamespace() {
        return this.opfnamespace;
    }

    public void setOpfnamespace(@NotNull Long opfnamespace) {
        this.opfnamespace = opfnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOpfowner() {
        return this.opfowner;
    }

    public void setOpfowner(@NotNull Long opfowner) {
        this.opfowner = opfowner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgOpfamily other = (PgOpfamily) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.opfmethod == null) {
            if (other.opfmethod != null)
                return false;
        }
        else if (!this.opfmethod.equals(other.opfmethod))
            return false;
        if (this.opfname == null) {
            if (other.opfname != null)
                return false;
        }
        else if (!this.opfname.equals(other.opfname))
            return false;
        if (this.opfnamespace == null) {
            if (other.opfnamespace != null)
                return false;
        }
        else if (!this.opfnamespace.equals(other.opfnamespace))
            return false;
        if (this.opfowner == null) {
            if (other.opfowner != null)
                return false;
        }
        else if (!this.opfowner.equals(other.opfowner))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.opfmethod == null) ? 0 : this.opfmethod.hashCode());
        result = prime * result + ((this.opfname == null) ? 0 : this.opfname.hashCode());
        result = prime * result + ((this.opfnamespace == null) ? 0 : this.opfnamespace.hashCode());
        result = prime * result + ((this.opfowner == null) ? 0 : this.opfowner.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgOpfamily (");

        sb.append(oid);
        sb.append(", ").append(opfmethod);
        sb.append(", ").append(opfname);
        sb.append(", ").append(opfnamespace);
        sb.append(", ").append(opfowner);

        sb.append(")");
        return sb.toString();
    }
}
