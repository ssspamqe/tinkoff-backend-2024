/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


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
public class DomainUdtUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String udtCatalog;
    private String udtSchema;
    private String udtName;
    private String domainCatalog;
    private String domainSchema;
    private String domainName;

    public DomainUdtUsage() {}

    public DomainUdtUsage(DomainUdtUsage value) {
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
    }

    @ConstructorProperties({ "udtCatalog", "udtSchema", "udtName", "domainCatalog", "domainSchema", "domainName" })
    public DomainUdtUsage(
        @Nullable String udtCatalog,
        @Nullable String udtSchema,
        @Nullable String udtName,
        @Nullable String domainCatalog,
        @Nullable String domainSchema,
        @Nullable String domainName
    ) {
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
    }

    @Nullable
    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    public void setUdtCatalog(@Nullable String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    @Nullable
    public String getUdtSchema() {
        return this.udtSchema;
    }

    public void setUdtSchema(@Nullable String udtSchema) {
        this.udtSchema = udtSchema;
    }

    @Nullable
    public String getUdtName() {
        return this.udtName;
    }

    public void setUdtName(@Nullable String udtName) {
        this.udtName = udtName;
    }

    @Nullable
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    public void setDomainCatalog(@Nullable String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    @Nullable
    public String getDomainSchema() {
        return this.domainSchema;
    }

    public void setDomainSchema(@Nullable String domainSchema) {
        this.domainSchema = domainSchema;
    }

    @Nullable
    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(@Nullable String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final DomainUdtUsage other = (DomainUdtUsage) obj;
        if (this.udtCatalog == null) {
            if (other.udtCatalog != null)
                return false;
        }
        else if (!this.udtCatalog.equals(other.udtCatalog))
            return false;
        if (this.udtSchema == null) {
            if (other.udtSchema != null)
                return false;
        }
        else if (!this.udtSchema.equals(other.udtSchema))
            return false;
        if (this.udtName == null) {
            if (other.udtName != null)
                return false;
        }
        else if (!this.udtName.equals(other.udtName))
            return false;
        if (this.domainCatalog == null) {
            if (other.domainCatalog != null)
                return false;
        }
        else if (!this.domainCatalog.equals(other.domainCatalog))
            return false;
        if (this.domainSchema == null) {
            if (other.domainSchema != null)
                return false;
        }
        else if (!this.domainSchema.equals(other.domainSchema))
            return false;
        if (this.domainName == null) {
            if (other.domainName != null)
                return false;
        }
        else if (!this.domainName.equals(other.domainName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.udtCatalog == null) ? 0 : this.udtCatalog.hashCode());
        result = prime * result + ((this.udtSchema == null) ? 0 : this.udtSchema.hashCode());
        result = prime * result + ((this.udtName == null) ? 0 : this.udtName.hashCode());
        result = prime * result + ((this.domainCatalog == null) ? 0 : this.domainCatalog.hashCode());
        result = prime * result + ((this.domainSchema == null) ? 0 : this.domainSchema.hashCode());
        result = prime * result + ((this.domainName == null) ? 0 : this.domainName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DomainUdtUsage (");

        sb.append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);

        sb.append(")");
        return sb.toString();
    }
}
