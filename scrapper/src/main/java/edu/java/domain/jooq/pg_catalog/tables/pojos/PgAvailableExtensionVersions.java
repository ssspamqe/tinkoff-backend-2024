/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

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
public class PgAvailableExtensionVersions implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String version;
    private Boolean superuser;
    private Boolean trusted;
    private Boolean relocatable;
    private String schema;
    private String[] requires;
    private String comment;

    public PgAvailableExtensionVersions() {}

    public PgAvailableExtensionVersions(PgAvailableExtensionVersions value) {
        this.name = value.name;
        this.version = value.version;
        this.superuser = value.superuser;
        this.trusted = value.trusted;
        this.relocatable = value.relocatable;
        this.schema = value.schema;
        this.requires = value.requires;
        this.comment = value.comment;
    }

    @ConstructorProperties({ "name", "version", "superuser", "trusted", "relocatable", "schema", "requires", "comment" })
    public PgAvailableExtensionVersions(
        @Nullable String name,
        @Nullable String version,
        @Nullable Boolean superuser,
        @Nullable Boolean trusted,
        @Nullable Boolean relocatable,
        @Nullable String schema,
        @Nullable String[] requires,
        @Nullable String comment
    ) {
        this.name = name;
        this.version = version;
        this.superuser = superuser;
        this.trusted = trusted;
        this.relocatable = relocatable;
        this.schema = schema;
        this.requires = requires;
        this.comment = comment;
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    @Nullable
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    public void setVersion(@Nullable String version) {
        this.version = version;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    @Nullable
    public Boolean getSuperuser() {
        return this.superuser;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    public void setSuperuser(@Nullable Boolean superuser) {
        this.superuser = superuser;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    @Nullable
    public Boolean getTrusted() {
        return this.trusted;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    public void setTrusted(@Nullable Boolean trusted) {
        this.trusted = trusted;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    @Nullable
    public Boolean getRelocatable() {
        return this.relocatable;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    public void setRelocatable(@Nullable Boolean relocatable) {
        this.relocatable = relocatable;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    @Nullable
    public String getSchema() {
        return this.schema;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    public void setSchema(@Nullable String schema) {
        this.schema = schema;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    @Nullable
    public String[] getRequires() {
        return this.requires;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    public void setRequires(@Nullable String[] requires) {
        this.requires = requires;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    public void setComment(@Nullable String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAvailableExtensionVersions other = (PgAvailableExtensionVersions) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.superuser == null) {
            if (other.superuser != null)
                return false;
        }
        else if (!this.superuser.equals(other.superuser))
            return false;
        if (this.trusted == null) {
            if (other.trusted != null)
                return false;
        }
        else if (!this.trusted.equals(other.trusted))
            return false;
        if (this.relocatable == null) {
            if (other.relocatable != null)
                return false;
        }
        else if (!this.relocatable.equals(other.relocatable))
            return false;
        if (this.schema == null) {
            if (other.schema != null)
                return false;
        }
        else if (!this.schema.equals(other.schema))
            return false;
        if (this.requires == null) {
            if (other.requires != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.requires, other.requires))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.superuser == null) ? 0 : this.superuser.hashCode());
        result = prime * result + ((this.trusted == null) ? 0 : this.trusted.hashCode());
        result = prime * result + ((this.relocatable == null) ? 0 : this.relocatable.hashCode());
        result = prime * result + ((this.schema == null) ? 0 : this.schema.hashCode());
        result = prime * result + ((this.requires == null) ? 0 : Arrays.deepHashCode(this.requires));
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAvailableExtensionVersions (");

        sb.append(name);
        sb.append(", ").append(version);
        sb.append(", ").append(superuser);
        sb.append(", ").append(trusted);
        sb.append(", ").append(relocatable);
        sb.append(", ").append(schema);
        sb.append(", ").append(Arrays.deepToString(requires));
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}
