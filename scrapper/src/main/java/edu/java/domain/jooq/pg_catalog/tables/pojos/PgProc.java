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
public class PgProc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String proname;
    private Long pronamespace;
    private Long proowner;
    private Long prolang;
    private Float procost;
    private Float prorows;
    private Long provariadic;
    private String prosupport;
    private String prokind;
    private Boolean prosecdef;
    private Boolean proleakproof;
    private Boolean proisstrict;
    private Boolean proretset;
    private String provolatile;
    private String proparallel;
    private Short pronargs;
    private Short pronargdefaults;
    private Long prorettype;
    private Object[] proargtypes;
    private Long[] proallargtypes;
    private String[] proargmodes;
    private String[] proargnames;
    private Object proargdefaults;
    private Long[] protrftypes;
    private String prosrc;
    private String probin;
    private Object prosqlbody;
    private String[] proconfig;
    private String[] proacl;

    public PgProc() {}

    public PgProc(PgProc value) {
        this.oid = value.oid;
        this.proname = value.proname;
        this.pronamespace = value.pronamespace;
        this.proowner = value.proowner;
        this.prolang = value.prolang;
        this.procost = value.procost;
        this.prorows = value.prorows;
        this.provariadic = value.provariadic;
        this.prosupport = value.prosupport;
        this.prokind = value.prokind;
        this.prosecdef = value.prosecdef;
        this.proleakproof = value.proleakproof;
        this.proisstrict = value.proisstrict;
        this.proretset = value.proretset;
        this.provolatile = value.provolatile;
        this.proparallel = value.proparallel;
        this.pronargs = value.pronargs;
        this.pronargdefaults = value.pronargdefaults;
        this.prorettype = value.prorettype;
        this.proargtypes = value.proargtypes;
        this.proallargtypes = value.proallargtypes;
        this.proargmodes = value.proargmodes;
        this.proargnames = value.proargnames;
        this.proargdefaults = value.proargdefaults;
        this.protrftypes = value.protrftypes;
        this.prosrc = value.prosrc;
        this.probin = value.probin;
        this.prosqlbody = value.prosqlbody;
        this.proconfig = value.proconfig;
        this.proacl = value.proacl;
    }

    @ConstructorProperties({ "oid", "proname", "pronamespace", "proowner", "prolang", "procost", "prorows", "provariadic", "prosupport", "prokind", "prosecdef", "proleakproof", "proisstrict", "proretset", "provolatile", "proparallel", "pronargs", "pronargdefaults", "prorettype", "proargtypes", "proallargtypes", "proargmodes", "proargnames", "proargdefaults", "protrftypes", "prosrc", "probin", "prosqlbody", "proconfig", "proacl" })
    public PgProc(
        @NotNull Long oid,
        @NotNull String proname,
        @NotNull Long pronamespace,
        @NotNull Long proowner,
        @NotNull Long prolang,
        @NotNull Float procost,
        @NotNull Float prorows,
        @NotNull Long provariadic,
        @NotNull String prosupport,
        @NotNull String prokind,
        @NotNull Boolean prosecdef,
        @NotNull Boolean proleakproof,
        @NotNull Boolean proisstrict,
        @NotNull Boolean proretset,
        @NotNull String provolatile,
        @NotNull String proparallel,
        @NotNull Short pronargs,
        @NotNull Short pronargdefaults,
        @NotNull Long prorettype,
        @NotNull Object[] proargtypes,
        @Nullable Long[] proallargtypes,
        @Nullable String[] proargmodes,
        @Nullable String[] proargnames,
        @Nullable Object proargdefaults,
        @Nullable Long[] protrftypes,
        @NotNull String prosrc,
        @Nullable String probin,
        @Nullable Object prosqlbody,
        @Nullable String[] proconfig,
        @Nullable String[] proacl
    ) {
        this.oid = oid;
        this.proname = proname;
        this.pronamespace = pronamespace;
        this.proowner = proowner;
        this.prolang = prolang;
        this.procost = procost;
        this.prorows = prorows;
        this.provariadic = provariadic;
        this.prosupport = prosupport;
        this.prokind = prokind;
        this.prosecdef = prosecdef;
        this.proleakproof = proleakproof;
        this.proisstrict = proisstrict;
        this.proretset = proretset;
        this.provolatile = provolatile;
        this.proparallel = proparallel;
        this.pronargs = pronargs;
        this.pronargdefaults = pronargdefaults;
        this.prorettype = prorettype;
        this.proargtypes = proargtypes;
        this.proallargtypes = proallargtypes;
        this.proargmodes = proargmodes;
        this.proargnames = proargnames;
        this.proargdefaults = proargdefaults;
        this.protrftypes = protrftypes;
        this.prosrc = prosrc;
        this.probin = probin;
        this.prosqlbody = prosqlbody;
        this.proconfig = proconfig;
        this.proacl = proacl;
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
    public String getProname() {
        return this.proname;
    }

    public void setProname(@NotNull String proname) {
        this.proname = proname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPronamespace() {
        return this.pronamespace;
    }

    public void setPronamespace(@NotNull Long pronamespace) {
        this.pronamespace = pronamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getProowner() {
        return this.proowner;
    }

    public void setProowner(@NotNull Long proowner) {
        this.proowner = proowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getProlang() {
        return this.prolang;
    }

    public void setProlang(@NotNull Long prolang) {
        this.prolang = prolang;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Float getProcost() {
        return this.procost;
    }

    public void setProcost(@NotNull Float procost) {
        this.procost = procost;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Float getProrows() {
        return this.prorows;
    }

    public void setProrows(@NotNull Float prorows) {
        this.prorows = prorows;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getProvariadic() {
        return this.provariadic;
    }

    public void setProvariadic(@NotNull Long provariadic) {
        this.provariadic = provariadic;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getProsupport() {
        return this.prosupport;
    }

    public void setProsupport(@NotNull String prosupport) {
        this.prosupport = prosupport;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getProkind() {
        return this.prokind;
    }

    public void setProkind(@NotNull String prokind) {
        this.prokind = prokind;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getProsecdef() {
        return this.prosecdef;
    }

    public void setProsecdef(@NotNull Boolean prosecdef) {
        this.prosecdef = prosecdef;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getProleakproof() {
        return this.proleakproof;
    }

    public void setProleakproof(@NotNull Boolean proleakproof) {
        this.proleakproof = proleakproof;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getProisstrict() {
        return this.proisstrict;
    }

    public void setProisstrict(@NotNull Boolean proisstrict) {
        this.proisstrict = proisstrict;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getProretset() {
        return this.proretset;
    }

    public void setProretset(@NotNull Boolean proretset) {
        this.proretset = proretset;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getProvolatile() {
        return this.provolatile;
    }

    public void setProvolatile(@NotNull String provolatile) {
        this.provolatile = provolatile;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getProparallel() {
        return this.proparallel;
    }

    public void setProparallel(@NotNull String proparallel) {
        this.proparallel = proparallel;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getPronargs() {
        return this.pronargs;
    }

    public void setPronargs(@NotNull Short pronargs) {
        this.pronargs = pronargs;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getPronargdefaults() {
        return this.pronargdefaults;
    }

    public void setPronargdefaults(@NotNull Short pronargdefaults) {
        this.pronargdefaults = pronargdefaults;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getProrettype() {
        return this.prorettype;
    }

    public void setProrettype(@NotNull Long prorettype) {
        this.prorettype = prorettype;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getProargtypes() {
        return this.proargtypes;
    }

    public void setProargtypes(@NotNull Object[] proargtypes) {
        this.proargtypes = proargtypes;
    }

    @Nullable
    public Long[] getProallargtypes() {
        return this.proallargtypes;
    }

    public void setProallargtypes(@Nullable Long[] proallargtypes) {
        this.proallargtypes = proallargtypes;
    }

    @Nullable
    public String[] getProargmodes() {
        return this.proargmodes;
    }

    public void setProargmodes(@Nullable String[] proargmodes) {
        this.proargmodes = proargmodes;
    }

    @Nullable
    public String[] getProargnames() {
        return this.proargnames;
    }

    public void setProargnames(@Nullable String[] proargnames) {
        this.proargnames = proargnames;
    }

    @Deprecated
    @Nullable
    public Object getProargdefaults() {
        return this.proargdefaults;
    }

    @Deprecated
    public void setProargdefaults(@Nullable Object proargdefaults) {
        this.proargdefaults = proargdefaults;
    }

    @Nullable
    public Long[] getProtrftypes() {
        return this.protrftypes;
    }

    public void setProtrftypes(@Nullable Long[] protrftypes) {
        this.protrftypes = protrftypes;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getProsrc() {
        return this.prosrc;
    }

    public void setProsrc(@NotNull String prosrc) {
        this.prosrc = prosrc;
    }

    @Nullable
    public String getProbin() {
        return this.probin;
    }

    public void setProbin(@Nullable String probin) {
        this.probin = probin;
    }

    @Deprecated
    @Nullable
    public Object getProsqlbody() {
        return this.prosqlbody;
    }

    @Deprecated
    public void setProsqlbody(@Nullable Object prosqlbody) {
        this.prosqlbody = prosqlbody;
    }

    @Nullable
    public String[] getProconfig() {
        return this.proconfig;
    }

    public void setProconfig(@Nullable String[] proconfig) {
        this.proconfig = proconfig;
    }

    @Nullable
    public String[] getProacl() {
        return this.proacl;
    }

    public void setProacl(@Nullable String[] proacl) {
        this.proacl = proacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgProc other = (PgProc) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.proname == null) {
            if (other.proname != null)
                return false;
        }
        else if (!this.proname.equals(other.proname))
            return false;
        if (this.pronamespace == null) {
            if (other.pronamespace != null)
                return false;
        }
        else if (!this.pronamespace.equals(other.pronamespace))
            return false;
        if (this.proowner == null) {
            if (other.proowner != null)
                return false;
        }
        else if (!this.proowner.equals(other.proowner))
            return false;
        if (this.prolang == null) {
            if (other.prolang != null)
                return false;
        }
        else if (!this.prolang.equals(other.prolang))
            return false;
        if (this.procost == null) {
            if (other.procost != null)
                return false;
        }
        else if (!this.procost.equals(other.procost))
            return false;
        if (this.prorows == null) {
            if (other.prorows != null)
                return false;
        }
        else if (!this.prorows.equals(other.prorows))
            return false;
        if (this.provariadic == null) {
            if (other.provariadic != null)
                return false;
        }
        else if (!this.provariadic.equals(other.provariadic))
            return false;
        if (this.prosupport == null) {
            if (other.prosupport != null)
                return false;
        }
        else if (!this.prosupport.equals(other.prosupport))
            return false;
        if (this.prokind == null) {
            if (other.prokind != null)
                return false;
        }
        else if (!this.prokind.equals(other.prokind))
            return false;
        if (this.prosecdef == null) {
            if (other.prosecdef != null)
                return false;
        }
        else if (!this.prosecdef.equals(other.prosecdef))
            return false;
        if (this.proleakproof == null) {
            if (other.proleakproof != null)
                return false;
        }
        else if (!this.proleakproof.equals(other.proleakproof))
            return false;
        if (this.proisstrict == null) {
            if (other.proisstrict != null)
                return false;
        }
        else if (!this.proisstrict.equals(other.proisstrict))
            return false;
        if (this.proretset == null) {
            if (other.proretset != null)
                return false;
        }
        else if (!this.proretset.equals(other.proretset))
            return false;
        if (this.provolatile == null) {
            if (other.provolatile != null)
                return false;
        }
        else if (!this.provolatile.equals(other.provolatile))
            return false;
        if (this.proparallel == null) {
            if (other.proparallel != null)
                return false;
        }
        else if (!this.proparallel.equals(other.proparallel))
            return false;
        if (this.pronargs == null) {
            if (other.pronargs != null)
                return false;
        }
        else if (!this.pronargs.equals(other.pronargs))
            return false;
        if (this.pronargdefaults == null) {
            if (other.pronargdefaults != null)
                return false;
        }
        else if (!this.pronargdefaults.equals(other.pronargdefaults))
            return false;
        if (this.prorettype == null) {
            if (other.prorettype != null)
                return false;
        }
        else if (!this.prorettype.equals(other.prorettype))
            return false;
        if (this.proargtypes == null) {
            if (other.proargtypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargtypes, other.proargtypes))
            return false;
        if (this.proallargtypes == null) {
            if (other.proallargtypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proallargtypes, other.proallargtypes))
            return false;
        if (this.proargmodes == null) {
            if (other.proargmodes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargmodes, other.proargmodes))
            return false;
        if (this.proargnames == null) {
            if (other.proargnames != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargnames, other.proargnames))
            return false;
        if (this.proargdefaults == null) {
            if (other.proargdefaults != null)
                return false;
        }
        else if (!this.proargdefaults.equals(other.proargdefaults))
            return false;
        if (this.protrftypes == null) {
            if (other.protrftypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.protrftypes, other.protrftypes))
            return false;
        if (this.prosrc == null) {
            if (other.prosrc != null)
                return false;
        }
        else if (!this.prosrc.equals(other.prosrc))
            return false;
        if (this.probin == null) {
            if (other.probin != null)
                return false;
        }
        else if (!this.probin.equals(other.probin))
            return false;
        if (this.prosqlbody == null) {
            if (other.prosqlbody != null)
                return false;
        }
        else if (!this.prosqlbody.equals(other.prosqlbody))
            return false;
        if (this.proconfig == null) {
            if (other.proconfig != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proconfig, other.proconfig))
            return false;
        if (this.proacl == null) {
            if (other.proacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proacl, other.proacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.proname == null) ? 0 : this.proname.hashCode());
        result = prime * result + ((this.pronamespace == null) ? 0 : this.pronamespace.hashCode());
        result = prime * result + ((this.proowner == null) ? 0 : this.proowner.hashCode());
        result = prime * result + ((this.prolang == null) ? 0 : this.prolang.hashCode());
        result = prime * result + ((this.procost == null) ? 0 : this.procost.hashCode());
        result = prime * result + ((this.prorows == null) ? 0 : this.prorows.hashCode());
        result = prime * result + ((this.provariadic == null) ? 0 : this.provariadic.hashCode());
        result = prime * result + ((this.prosupport == null) ? 0 : this.prosupport.hashCode());
        result = prime * result + ((this.prokind == null) ? 0 : this.prokind.hashCode());
        result = prime * result + ((this.prosecdef == null) ? 0 : this.prosecdef.hashCode());
        result = prime * result + ((this.proleakproof == null) ? 0 : this.proleakproof.hashCode());
        result = prime * result + ((this.proisstrict == null) ? 0 : this.proisstrict.hashCode());
        result = prime * result + ((this.proretset == null) ? 0 : this.proretset.hashCode());
        result = prime * result + ((this.provolatile == null) ? 0 : this.provolatile.hashCode());
        result = prime * result + ((this.proparallel == null) ? 0 : this.proparallel.hashCode());
        result = prime * result + ((this.pronargs == null) ? 0 : this.pronargs.hashCode());
        result = prime * result + ((this.pronargdefaults == null) ? 0 : this.pronargdefaults.hashCode());
        result = prime * result + ((this.prorettype == null) ? 0 : this.prorettype.hashCode());
        result = prime * result + ((this.proargtypes == null) ? 0 : Arrays.deepHashCode(this.proargtypes));
        result = prime * result + ((this.proallargtypes == null) ? 0 : Arrays.deepHashCode(this.proallargtypes));
        result = prime * result + ((this.proargmodes == null) ? 0 : Arrays.deepHashCode(this.proargmodes));
        result = prime * result + ((this.proargnames == null) ? 0 : Arrays.deepHashCode(this.proargnames));
        result = prime * result + ((this.proargdefaults == null) ? 0 : this.proargdefaults.hashCode());
        result = prime * result + ((this.protrftypes == null) ? 0 : Arrays.deepHashCode(this.protrftypes));
        result = prime * result + ((this.prosrc == null) ? 0 : this.prosrc.hashCode());
        result = prime * result + ((this.probin == null) ? 0 : this.probin.hashCode());
        result = prime * result + ((this.prosqlbody == null) ? 0 : this.prosqlbody.hashCode());
        result = prime * result + ((this.proconfig == null) ? 0 : Arrays.deepHashCode(this.proconfig));
        result = prime * result + ((this.proacl == null) ? 0 : Arrays.deepHashCode(this.proacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgProc (");

        sb.append(oid);
        sb.append(", ").append(proname);
        sb.append(", ").append(pronamespace);
        sb.append(", ").append(proowner);
        sb.append(", ").append(prolang);
        sb.append(", ").append(procost);
        sb.append(", ").append(prorows);
        sb.append(", ").append(provariadic);
        sb.append(", ").append(prosupport);
        sb.append(", ").append(prokind);
        sb.append(", ").append(prosecdef);
        sb.append(", ").append(proleakproof);
        sb.append(", ").append(proisstrict);
        sb.append(", ").append(proretset);
        sb.append(", ").append(provolatile);
        sb.append(", ").append(proparallel);
        sb.append(", ").append(pronargs);
        sb.append(", ").append(pronargdefaults);
        sb.append(", ").append(prorettype);
        sb.append(", ").append(Arrays.deepToString(proargtypes));
        sb.append(", ").append(Arrays.deepToString(proallargtypes));
        sb.append(", ").append(Arrays.deepToString(proargmodes));
        sb.append(", ").append(Arrays.deepToString(proargnames));
        sb.append(", ").append(proargdefaults);
        sb.append(", ").append(Arrays.deepToString(protrftypes));
        sb.append(", ").append(prosrc);
        sb.append(", ").append(probin);
        sb.append(", ").append(prosqlbody);
        sb.append(", ").append(Arrays.deepToString(proconfig));
        sb.append(", ").append(Arrays.deepToString(proacl));

        sb.append(")");
        return sb.toString();
    }
}
