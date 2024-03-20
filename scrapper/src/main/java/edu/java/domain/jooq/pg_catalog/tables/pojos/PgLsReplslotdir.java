/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class PgLsReplslotdir implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Long size;
    private OffsetDateTime modification;

    public PgLsReplslotdir() {}

    public PgLsReplslotdir(PgLsReplslotdir value) {
        this.name = value.name;
        this.size = value.size;
        this.modification = value.modification;
    }

    @ConstructorProperties({ "name", "size", "modification" })
    public PgLsReplslotdir(
        @Nullable String name,
        @Nullable Long size,
        @Nullable OffsetDateTime modification
    ) {
        this.name = name;
        this.size = size;
        this.modification = modification;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public Long getSize() {
        return this.size;
    }

    public void setSize(@Nullable Long size) {
        this.size = size;
    }

    @Nullable
    public OffsetDateTime getModification() {
        return this.modification;
    }

    public void setModification(@Nullable OffsetDateTime modification) {
        this.modification = modification;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLsReplslotdir other = (PgLsReplslotdir) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.size == null) {
            if (other.size != null)
                return false;
        }
        else if (!this.size.equals(other.size))
            return false;
        if (this.modification == null) {
            if (other.modification != null)
                return false;
        }
        else if (!this.modification.equals(other.modification))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.size == null) ? 0 : this.size.hashCode());
        result = prime * result + ((this.modification == null) ? 0 : this.modification.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLsReplslotdir (");

        sb.append(name);
        sb.append(", ").append(size);
        sb.append(", ").append(modification);

        sb.append(")");
        return sb.toString();
    }
}
