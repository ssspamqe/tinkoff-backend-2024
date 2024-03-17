/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


/**
 * The table <code>pg_catalog.pg_largeobject</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLargeobject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long loid;
    private Integer pageno;
    private byte[] data;

    public PgLargeobject() {}

    public PgLargeobject(PgLargeobject value) {
        this.loid = value.loid;
        this.pageno = value.pageno;
        this.data = value.data;
    }

    @ConstructorProperties({ "loid", "pageno", "data" })
    public PgLargeobject(
        @NotNull Long loid,
        @NotNull Integer pageno,
        @NotNull byte[] data
    ) {
        this.loid = loid;
        this.pageno = pageno;
        this.data = data;
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.loid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getLoid() {
        return this.loid;
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public void setLoid(@NotNull Long loid) {
        this.loid = loid;
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getPageno() {
        return this.pageno;
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public void setPageno(@NotNull Integer pageno) {
        this.pageno = pageno;
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.data</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public byte[] getData() {
        return this.data;
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject.data</code>.
     */
    public void setData(@NotNull byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLargeobject other = (PgLargeobject) obj;
        if (this.loid == null) {
            if (other.loid != null)
                return false;
        }
        else if (!this.loid.equals(other.loid))
            return false;
        if (this.pageno == null) {
            if (other.pageno != null)
                return false;
        }
        else if (!this.pageno.equals(other.pageno))
            return false;
        if (this.data == null) {
            if (other.data != null)
                return false;
        }
        else if (!Arrays.equals(this.data, other.data))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.loid == null) ? 0 : this.loid.hashCode());
        result = prime * result + ((this.pageno == null) ? 0 : this.pageno.hashCode());
        result = prime * result + ((this.data == null) ? 0 : Arrays.hashCode(this.data));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLargeobject (");

        sb.append(loid);
        sb.append(", ").append(pageno);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
