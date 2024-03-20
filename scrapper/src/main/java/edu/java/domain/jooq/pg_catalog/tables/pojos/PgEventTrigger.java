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
public class PgEventTrigger implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String evtname;
    private String evtevent;
    private Long evtowner;
    private Long evtfoid;
    private String evtenabled;
    private String[] evttags;

    public PgEventTrigger() {}

    public PgEventTrigger(PgEventTrigger value) {
        this.oid = value.oid;
        this.evtname = value.evtname;
        this.evtevent = value.evtevent;
        this.evtowner = value.evtowner;
        this.evtfoid = value.evtfoid;
        this.evtenabled = value.evtenabled;
        this.evttags = value.evttags;
    }

    @ConstructorProperties({ "oid", "evtname", "evtevent", "evtowner", "evtfoid", "evtenabled", "evttags" })
    public PgEventTrigger(
        @NotNull Long oid,
        @NotNull String evtname,
        @NotNull String evtevent,
        @NotNull Long evtowner,
        @NotNull Long evtfoid,
        @NotNull String evtenabled,
        @Nullable String[] evttags
    ) {
        this.oid = oid;
        this.evtname = evtname;
        this.evtevent = evtevent;
        this.evtowner = evtowner;
        this.evtfoid = evtfoid;
        this.evtenabled = evtenabled;
        this.evttags = evttags;
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
    public String getEvtname() {
        return this.evtname;
    }

    public void setEvtname(@NotNull String evtname) {
        this.evtname = evtname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getEvtevent() {
        return this.evtevent;
    }

    public void setEvtevent(@NotNull String evtevent) {
        this.evtevent = evtevent;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getEvtowner() {
        return this.evtowner;
    }

    public void setEvtowner(@NotNull Long evtowner) {
        this.evtowner = evtowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getEvtfoid() {
        return this.evtfoid;
    }

    public void setEvtfoid(@NotNull Long evtfoid) {
        this.evtfoid = evtfoid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getEvtenabled() {
        return this.evtenabled;
    }

    public void setEvtenabled(@NotNull String evtenabled) {
        this.evtenabled = evtenabled;
    }

    @Nullable
    public String[] getEvttags() {
        return this.evttags;
    }

    public void setEvttags(@Nullable String[] evttags) {
        this.evttags = evttags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgEventTrigger other = (PgEventTrigger) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.evtname == null) {
            if (other.evtname != null)
                return false;
        }
        else if (!this.evtname.equals(other.evtname))
            return false;
        if (this.evtevent == null) {
            if (other.evtevent != null)
                return false;
        }
        else if (!this.evtevent.equals(other.evtevent))
            return false;
        if (this.evtowner == null) {
            if (other.evtowner != null)
                return false;
        }
        else if (!this.evtowner.equals(other.evtowner))
            return false;
        if (this.evtfoid == null) {
            if (other.evtfoid != null)
                return false;
        }
        else if (!this.evtfoid.equals(other.evtfoid))
            return false;
        if (this.evtenabled == null) {
            if (other.evtenabled != null)
                return false;
        }
        else if (!this.evtenabled.equals(other.evtenabled))
            return false;
        if (this.evttags == null) {
            if (other.evttags != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.evttags, other.evttags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.evtname == null) ? 0 : this.evtname.hashCode());
        result = prime * result + ((this.evtevent == null) ? 0 : this.evtevent.hashCode());
        result = prime * result + ((this.evtowner == null) ? 0 : this.evtowner.hashCode());
        result = prime * result + ((this.evtfoid == null) ? 0 : this.evtfoid.hashCode());
        result = prime * result + ((this.evtenabled == null) ? 0 : this.evtenabled.hashCode());
        result = prime * result + ((this.evttags == null) ? 0 : Arrays.deepHashCode(this.evttags));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgEventTrigger (");

        sb.append(oid);
        sb.append(", ").append(evtname);
        sb.append(", ").append(evtevent);
        sb.append(", ").append(evtowner);
        sb.append(", ").append(evtfoid);
        sb.append(", ").append(evtenabled);
        sb.append(", ").append(Arrays.deepToString(evttags));

        sb.append(")");
        return sb.toString();
    }
}