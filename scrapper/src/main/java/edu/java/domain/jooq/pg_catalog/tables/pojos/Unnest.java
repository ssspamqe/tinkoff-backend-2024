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
public class Unnest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object unnest;

    public Unnest() {}

    public Unnest(Unnest value) {
        this.unnest = value.unnest;
    }

    @ConstructorProperties({ "unnest" })
    public Unnest(
        @Nullable Object unnest
    ) {
        this.unnest = unnest;
    }

    @Deprecated
    @Nullable
    public Object getUnnest() {
        return this.unnest;
    }

    @Deprecated
    public void setUnnest(@Nullable Object unnest) {
        this.unnest = unnest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Unnest other = (Unnest) obj;
        if (this.unnest == null) {
            if (other.unnest != null)
                return false;
        }
        else if (!this.unnest.equals(other.unnest))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.unnest == null) ? 0 : this.unnest.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Unnest (");

        sb.append(unnest);

        sb.append(")");
        return sb.toString();
    }
}
