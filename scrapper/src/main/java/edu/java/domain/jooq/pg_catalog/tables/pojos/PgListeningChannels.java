/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

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
public class PgListeningChannels implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pgListeningChannels;

    public PgListeningChannels() {}

    public PgListeningChannels(PgListeningChannels value) {
        this.pgListeningChannels = value.pgListeningChannels;
    }

    @ConstructorProperties({ "pgListeningChannels" })
    public PgListeningChannels(
        @Nullable String pgListeningChannels
    ) {
        this.pgListeningChannels = pgListeningChannels;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_listening_channels.pg_listening_channels</code>.
     */
    @Nullable
    public String getPgListeningChannels() {
        return this.pgListeningChannels;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_listening_channels.pg_listening_channels</code>.
     */
    public void setPgListeningChannels(@Nullable String pgListeningChannels) {
        this.pgListeningChannels = pgListeningChannels;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgListeningChannels other = (PgListeningChannels) obj;
        if (this.pgListeningChannels == null) {
            if (other.pgListeningChannels != null)
                return false;
        }
        else if (!this.pgListeningChannels.equals(other.pgListeningChannels))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pgListeningChannels == null) ? 0 : this.pgListeningChannels.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgListeningChannels (");

        sb.append(pgListeningChannels);

        sb.append(")");
        return sb.toString();
    }
}
