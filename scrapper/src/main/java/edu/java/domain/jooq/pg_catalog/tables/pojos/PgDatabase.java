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
public class PgDatabase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String datname;
    private Long datdba;
    private Integer encoding;
    private String datlocprovider;
    private Boolean datistemplate;
    private Boolean datallowconn;
    private Integer datconnlimit;
    private Long datfrozenxid;
    private Long datminmxid;
    private Long dattablespace;
    private String datcollate;
    private String datctype;
    private String daticulocale;
    private String daticurules;
    private String datcollversion;
    private String[] datacl;

    public PgDatabase() {}

    public PgDatabase(PgDatabase value) {
        this.oid = value.oid;
        this.datname = value.datname;
        this.datdba = value.datdba;
        this.encoding = value.encoding;
        this.datlocprovider = value.datlocprovider;
        this.datistemplate = value.datistemplate;
        this.datallowconn = value.datallowconn;
        this.datconnlimit = value.datconnlimit;
        this.datfrozenxid = value.datfrozenxid;
        this.datminmxid = value.datminmxid;
        this.dattablespace = value.dattablespace;
        this.datcollate = value.datcollate;
        this.datctype = value.datctype;
        this.daticulocale = value.daticulocale;
        this.daticurules = value.daticurules;
        this.datcollversion = value.datcollversion;
        this.datacl = value.datacl;
    }

    @ConstructorProperties({ "oid", "datname", "datdba", "encoding", "datlocprovider", "datistemplate", "datallowconn", "datconnlimit", "datfrozenxid", "datminmxid", "dattablespace", "datcollate", "datctype", "daticulocale", "daticurules", "datcollversion", "datacl" })
    public PgDatabase(
        @NotNull Long oid,
        @NotNull String datname,
        @NotNull Long datdba,
        @NotNull Integer encoding,
        @NotNull String datlocprovider,
        @NotNull Boolean datistemplate,
        @NotNull Boolean datallowconn,
        @NotNull Integer datconnlimit,
        @NotNull Long datfrozenxid,
        @NotNull Long datminmxid,
        @NotNull Long dattablespace,
        @NotNull String datcollate,
        @NotNull String datctype,
        @Nullable String daticulocale,
        @Nullable String daticurules,
        @Nullable String datcollversion,
        @Nullable String[] datacl
    ) {
        this.oid = oid;
        this.datname = datname;
        this.datdba = datdba;
        this.encoding = encoding;
        this.datlocprovider = datlocprovider;
        this.datistemplate = datistemplate;
        this.datallowconn = datallowconn;
        this.datconnlimit = datconnlimit;
        this.datfrozenxid = datfrozenxid;
        this.datminmxid = datminmxid;
        this.dattablespace = dattablespace;
        this.datcollate = datcollate;
        this.datctype = datctype;
        this.daticulocale = daticulocale;
        this.daticurules = daticurules;
        this.datcollversion = datcollversion;
        this.datacl = datacl;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDatname() {
        return this.datname;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datname</code>.
     */
    public void setDatname(@NotNull String datname) {
        this.datname = datname;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datdba</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDatdba() {
        return this.datdba;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public void setDatdba(@NotNull Long datdba) {
        this.datdba = datdba;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.encoding</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getEncoding() {
        return this.encoding;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public void setEncoding(@NotNull Integer encoding) {
        this.encoding = encoding;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datlocprovider</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDatlocprovider() {
        return this.datlocprovider;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datlocprovider</code>.
     */
    public void setDatlocprovider(@NotNull String datlocprovider) {
        this.datlocprovider = datlocprovider;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getDatistemplate() {
        return this.datistemplate;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public void setDatistemplate(@NotNull Boolean datistemplate) {
        this.datistemplate = datistemplate;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getDatallowconn() {
        return this.datallowconn;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public void setDatallowconn(@NotNull Boolean datallowconn) {
        this.datallowconn = datallowconn;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getDatconnlimit() {
        return this.datconnlimit;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public void setDatconnlimit(@NotNull Integer datconnlimit) {
        this.datconnlimit = datconnlimit;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDatfrozenxid() {
        return this.datfrozenxid;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public void setDatfrozenxid(@NotNull Long datfrozenxid) {
        this.datfrozenxid = datfrozenxid;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDatminmxid() {
        return this.datminmxid;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public void setDatminmxid(@NotNull Long datminmxid) {
        this.datminmxid = datminmxid;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDattablespace() {
        return this.dattablespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public void setDattablespace(@NotNull Long dattablespace) {
        this.dattablespace = dattablespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDatcollate() {
        return this.datcollate;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public void setDatcollate(@NotNull String datcollate) {
        this.datcollate = datcollate;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datctype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDatctype() {
        return this.datctype;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public void setDatctype(@NotNull String datctype) {
        this.datctype = datctype;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.daticulocale</code>.
     */
    @Nullable
    public String getDaticulocale() {
        return this.daticulocale;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.daticulocale</code>.
     */
    public void setDaticulocale(@Nullable String daticulocale) {
        this.daticulocale = daticulocale;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.daticurules</code>.
     */
    @Nullable
    public String getDaticurules() {
        return this.daticurules;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.daticurules</code>.
     */
    public void setDaticurules(@Nullable String daticurules) {
        this.daticurules = daticurules;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollversion</code>.
     */
    @Nullable
    public String getDatcollversion() {
        return this.datcollversion;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollversion</code>.
     */
    public void setDatcollversion(@Nullable String datcollversion) {
        this.datcollversion = datcollversion;
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datacl</code>.
     */
    @Nullable
    public String[] getDatacl() {
        return this.datacl;
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public void setDatacl(@Nullable String[] datacl) {
        this.datacl = datacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgDatabase other = (PgDatabase) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.datname == null) {
            if (other.datname != null)
                return false;
        }
        else if (!this.datname.equals(other.datname))
            return false;
        if (this.datdba == null) {
            if (other.datdba != null)
                return false;
        }
        else if (!this.datdba.equals(other.datdba))
            return false;
        if (this.encoding == null) {
            if (other.encoding != null)
                return false;
        }
        else if (!this.encoding.equals(other.encoding))
            return false;
        if (this.datlocprovider == null) {
            if (other.datlocprovider != null)
                return false;
        }
        else if (!this.datlocprovider.equals(other.datlocprovider))
            return false;
        if (this.datistemplate == null) {
            if (other.datistemplate != null)
                return false;
        }
        else if (!this.datistemplate.equals(other.datistemplate))
            return false;
        if (this.datallowconn == null) {
            if (other.datallowconn != null)
                return false;
        }
        else if (!this.datallowconn.equals(other.datallowconn))
            return false;
        if (this.datconnlimit == null) {
            if (other.datconnlimit != null)
                return false;
        }
        else if (!this.datconnlimit.equals(other.datconnlimit))
            return false;
        if (this.datfrozenxid == null) {
            if (other.datfrozenxid != null)
                return false;
        }
        else if (!this.datfrozenxid.equals(other.datfrozenxid))
            return false;
        if (this.datminmxid == null) {
            if (other.datminmxid != null)
                return false;
        }
        else if (!this.datminmxid.equals(other.datminmxid))
            return false;
        if (this.dattablespace == null) {
            if (other.dattablespace != null)
                return false;
        }
        else if (!this.dattablespace.equals(other.dattablespace))
            return false;
        if (this.datcollate == null) {
            if (other.datcollate != null)
                return false;
        }
        else if (!this.datcollate.equals(other.datcollate))
            return false;
        if (this.datctype == null) {
            if (other.datctype != null)
                return false;
        }
        else if (!this.datctype.equals(other.datctype))
            return false;
        if (this.daticulocale == null) {
            if (other.daticulocale != null)
                return false;
        }
        else if (!this.daticulocale.equals(other.daticulocale))
            return false;
        if (this.daticurules == null) {
            if (other.daticurules != null)
                return false;
        }
        else if (!this.daticurules.equals(other.daticurules))
            return false;
        if (this.datcollversion == null) {
            if (other.datcollversion != null)
                return false;
        }
        else if (!this.datcollversion.equals(other.datcollversion))
            return false;
        if (this.datacl == null) {
            if (other.datacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.datacl, other.datacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.datname == null) ? 0 : this.datname.hashCode());
        result = prime * result + ((this.datdba == null) ? 0 : this.datdba.hashCode());
        result = prime * result + ((this.encoding == null) ? 0 : this.encoding.hashCode());
        result = prime * result + ((this.datlocprovider == null) ? 0 : this.datlocprovider.hashCode());
        result = prime * result + ((this.datistemplate == null) ? 0 : this.datistemplate.hashCode());
        result = prime * result + ((this.datallowconn == null) ? 0 : this.datallowconn.hashCode());
        result = prime * result + ((this.datconnlimit == null) ? 0 : this.datconnlimit.hashCode());
        result = prime * result + ((this.datfrozenxid == null) ? 0 : this.datfrozenxid.hashCode());
        result = prime * result + ((this.datminmxid == null) ? 0 : this.datminmxid.hashCode());
        result = prime * result + ((this.dattablespace == null) ? 0 : this.dattablespace.hashCode());
        result = prime * result + ((this.datcollate == null) ? 0 : this.datcollate.hashCode());
        result = prime * result + ((this.datctype == null) ? 0 : this.datctype.hashCode());
        result = prime * result + ((this.daticulocale == null) ? 0 : this.daticulocale.hashCode());
        result = prime * result + ((this.daticurules == null) ? 0 : this.daticurules.hashCode());
        result = prime * result + ((this.datcollversion == null) ? 0 : this.datcollversion.hashCode());
        result = prime * result + ((this.datacl == null) ? 0 : Arrays.deepHashCode(this.datacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgDatabase (");

        sb.append(oid);
        sb.append(", ").append(datname);
        sb.append(", ").append(datdba);
        sb.append(", ").append(encoding);
        sb.append(", ").append(datlocprovider);
        sb.append(", ").append(datistemplate);
        sb.append(", ").append(datallowconn);
        sb.append(", ").append(datconnlimit);
        sb.append(", ").append(datfrozenxid);
        sb.append(", ").append(datminmxid);
        sb.append(", ").append(dattablespace);
        sb.append(", ").append(datcollate);
        sb.append(", ").append(datctype);
        sb.append(", ").append(daticulocale);
        sb.append(", ").append(daticurules);
        sb.append(", ").append(datcollversion);
        sb.append(", ").append(Arrays.deepToString(datacl));

        sb.append(")");
        return sb.toString();
    }
}
