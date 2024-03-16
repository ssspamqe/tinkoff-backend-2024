/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

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
public class PgSubscriptionRel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long srsubid;
    private Long srrelid;
    private String srsubstate;
    private Object srsublsn;

    public PgSubscriptionRel() {}

    public PgSubscriptionRel(PgSubscriptionRel value) {
        this.srsubid = value.srsubid;
        this.srrelid = value.srrelid;
        this.srsubstate = value.srsubstate;
        this.srsublsn = value.srsublsn;
    }

    @ConstructorProperties({ "srsubid", "srrelid", "srsubstate", "srsublsn" })
    public PgSubscriptionRel(
        @NotNull Long srsubid,
        @NotNull Long srrelid,
        @NotNull String srsubstate,
        @Nullable Object srsublsn
    ) {
        this.srsubid = srsubid;
        this.srrelid = srrelid;
        this.srsubstate = srsubstate;
        this.srsublsn = srsublsn;
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrsubid() {
        return this.srsubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    public void setSrsubid(@NotNull Long srsubid) {
        this.srsubid = srsubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrrelid() {
        return this.srrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    public void setSrrelid(@NotNull Long srrelid) {
        this.srrelid = srrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSrsubstate() {
        return this.srsubstate;
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    public void setSrsubstate(@NotNull String srsubstate) {
        this.srsubstate = srsubstate;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getSrsublsn() {
        return this.srsublsn;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setSrsublsn(@Nullable Object srsublsn) {
        this.srsublsn = srsublsn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgSubscriptionRel other = (PgSubscriptionRel) obj;
        if (this.srsubid == null) {
            if (other.srsubid != null)
                return false;
        }
        else if (!this.srsubid.equals(other.srsubid))
            return false;
        if (this.srrelid == null) {
            if (other.srrelid != null)
                return false;
        }
        else if (!this.srrelid.equals(other.srrelid))
            return false;
        if (this.srsubstate == null) {
            if (other.srsubstate != null)
                return false;
        }
        else if (!this.srsubstate.equals(other.srsubstate))
            return false;
        if (this.srsublsn == null) {
            if (other.srsublsn != null)
                return false;
        }
        else if (!this.srsublsn.equals(other.srsublsn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.srsubid == null) ? 0 : this.srsubid.hashCode());
        result = prime * result + ((this.srrelid == null) ? 0 : this.srrelid.hashCode());
        result = prime * result + ((this.srsubstate == null) ? 0 : this.srsubstate.hashCode());
        result = prime * result + ((this.srsublsn == null) ? 0 : this.srsublsn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSubscriptionRel (");

        sb.append(srsubid);
        sb.append(", ").append(srrelid);
        sb.append(", ").append(srsubstate);
        sb.append(", ").append(srsublsn);

        sb.append(")");
        return sb.toString();
    }
}
