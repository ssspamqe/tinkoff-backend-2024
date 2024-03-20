/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

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
public class PgDefaultAcl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long defaclrole;
    private Long defaclnamespace;
    private String defaclobjtype;
    private String[] defaclacl;

    public PgDefaultAcl() {}

    public PgDefaultAcl(PgDefaultAcl value) {
        this.oid = value.oid;
        this.defaclrole = value.defaclrole;
        this.defaclnamespace = value.defaclnamespace;
        this.defaclobjtype = value.defaclobjtype;
        this.defaclacl = value.defaclacl;
    }

    @ConstructorProperties({ "oid", "defaclrole", "defaclnamespace", "defaclobjtype", "defaclacl" })
    public PgDefaultAcl(
        @NotNull Long oid,
        @NotNull Long defaclrole,
        @NotNull Long defaclnamespace,
        @NotNull String defaclobjtype,
        @NotNull String[] defaclacl
    ) {
        this.oid = oid;
        this.defaclrole = defaclrole;
        this.defaclnamespace = defaclnamespace;
        this.defaclobjtype = defaclobjtype;
        this.defaclacl = defaclacl;
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
    public Long getDefaclrole() {
        return this.defaclrole;
    }

    public void setDefaclrole(@NotNull Long defaclrole) {
        this.defaclrole = defaclrole;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDefaclnamespace() {
        return this.defaclnamespace;
    }

    public void setDefaclnamespace(@NotNull Long defaclnamespace) {
        this.defaclnamespace = defaclnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDefaclobjtype() {
        return this.defaclobjtype;
    }

    public void setDefaclobjtype(@NotNull String defaclobjtype) {
        this.defaclobjtype = defaclobjtype;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String[] getDefaclacl() {
        return this.defaclacl;
    }

    public void setDefaclacl(@NotNull String[] defaclacl) {
        this.defaclacl = defaclacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgDefaultAcl other = (PgDefaultAcl) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.defaclrole == null) {
            if (other.defaclrole != null)
                return false;
        }
        else if (!this.defaclrole.equals(other.defaclrole))
            return false;
        if (this.defaclnamespace == null) {
            if (other.defaclnamespace != null)
                return false;
        }
        else if (!this.defaclnamespace.equals(other.defaclnamespace))
            return false;
        if (this.defaclobjtype == null) {
            if (other.defaclobjtype != null)
                return false;
        }
        else if (!this.defaclobjtype.equals(other.defaclobjtype))
            return false;
        if (this.defaclacl == null) {
            if (other.defaclacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.defaclacl, other.defaclacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.defaclrole == null) ? 0 : this.defaclrole.hashCode());
        result = prime * result + ((this.defaclnamespace == null) ? 0 : this.defaclnamespace.hashCode());
        result = prime * result + ((this.defaclobjtype == null) ? 0 : this.defaclobjtype.hashCode());
        result = prime * result + ((this.defaclacl == null) ? 0 : Arrays.deepHashCode(this.defaclacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgDefaultAcl (");

        sb.append(oid);
        sb.append(", ").append(defaclrole);
        sb.append(", ").append(defaclnamespace);
        sb.append(", ").append(defaclobjtype);
        sb.append(", ").append(Arrays.deepToString(defaclacl));

        sb.append(")");
        return sb.toString();
    }
}
