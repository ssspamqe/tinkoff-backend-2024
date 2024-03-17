/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_file_settings</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgFileSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sourcefile;
    private Integer sourceline;
    private Integer seqno;
    private String name;
    private String setting;
    private Boolean applied;
    private String error;

    public PgFileSettings() {}

    public PgFileSettings(PgFileSettings value) {
        this.sourcefile = value.sourcefile;
        this.sourceline = value.sourceline;
        this.seqno = value.seqno;
        this.name = value.name;
        this.setting = value.setting;
        this.applied = value.applied;
        this.error = value.error;
    }

    @ConstructorProperties({ "sourcefile", "sourceline", "seqno", "name", "setting", "applied", "error" })
    public PgFileSettings(
        @Nullable String sourcefile,
        @Nullable Integer sourceline,
        @Nullable Integer seqno,
        @Nullable String name,
        @Nullable String setting,
        @Nullable Boolean applied,
        @Nullable String error
    ) {
        this.sourcefile = sourcefile;
        this.sourceline = sourceline;
        this.seqno = seqno;
        this.name = name;
        this.setting = setting;
        this.applied = applied;
        this.error = error;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.sourcefile</code>.
     */
    @Nullable
    public String getSourcefile() {
        return this.sourcefile;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.sourcefile</code>.
     */
    public void setSourcefile(@Nullable String sourcefile) {
        this.sourcefile = sourcefile;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.sourceline</code>.
     */
    @Nullable
    public Integer getSourceline() {
        return this.sourceline;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.sourceline</code>.
     */
    public void setSourceline(@Nullable Integer sourceline) {
        this.sourceline = sourceline;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.seqno</code>.
     */
    @Nullable
    public Integer getSeqno() {
        return this.seqno;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.seqno</code>.
     */
    public void setSeqno(@Nullable Integer seqno) {
        this.seqno = seqno;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.name</code>.
     */
    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.name</code>.
     */
    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.setting</code>.
     */
    @Nullable
    public String getSetting() {
        return this.setting;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.setting</code>.
     */
    public void setSetting(@Nullable String setting) {
        this.setting = setting;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.applied</code>.
     */
    @Nullable
    public Boolean getApplied() {
        return this.applied;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.applied</code>.
     */
    public void setApplied(@Nullable Boolean applied) {
        this.applied = applied;
    }

    /**
     * Getter for <code>pg_catalog.pg_file_settings.error</code>.
     */
    @Nullable
    public String getError() {
        return this.error;
    }

    /**
     * Setter for <code>pg_catalog.pg_file_settings.error</code>.
     */
    public void setError(@Nullable String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgFileSettings other = (PgFileSettings) obj;
        if (this.sourcefile == null) {
            if (other.sourcefile != null)
                return false;
        }
        else if (!this.sourcefile.equals(other.sourcefile))
            return false;
        if (this.sourceline == null) {
            if (other.sourceline != null)
                return false;
        }
        else if (!this.sourceline.equals(other.sourceline))
            return false;
        if (this.seqno == null) {
            if (other.seqno != null)
                return false;
        }
        else if (!this.seqno.equals(other.seqno))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.setting == null) {
            if (other.setting != null)
                return false;
        }
        else if (!this.setting.equals(other.setting))
            return false;
        if (this.applied == null) {
            if (other.applied != null)
                return false;
        }
        else if (!this.applied.equals(other.applied))
            return false;
        if (this.error == null) {
            if (other.error != null)
                return false;
        }
        else if (!this.error.equals(other.error))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sourcefile == null) ? 0 : this.sourcefile.hashCode());
        result = prime * result + ((this.sourceline == null) ? 0 : this.sourceline.hashCode());
        result = prime * result + ((this.seqno == null) ? 0 : this.seqno.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.setting == null) ? 0 : this.setting.hashCode());
        result = prime * result + ((this.applied == null) ? 0 : this.applied.hashCode());
        result = prime * result + ((this.error == null) ? 0 : this.error.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgFileSettings (");

        sb.append(sourcefile);
        sb.append(", ").append(sourceline);
        sb.append(", ").append(seqno);
        sb.append(", ").append(name);
        sb.append(", ").append(setting);
        sb.append(", ").append(applied);
        sb.append(", ").append(error);

        sb.append(")");
        return sb.toString();
    }
}
