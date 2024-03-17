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
public class ForeignDataWrappers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foreignDataWrapperCatalog;
    private String foreignDataWrapperName;
    private String authorizationIdentifier;
    private String libraryName;
    private String foreignDataWrapperLanguage;

    public ForeignDataWrappers() {}

    public ForeignDataWrappers(ForeignDataWrappers value) {
        this.foreignDataWrapperCatalog = value.foreignDataWrapperCatalog;
        this.foreignDataWrapperName = value.foreignDataWrapperName;
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.libraryName = value.libraryName;
        this.foreignDataWrapperLanguage = value.foreignDataWrapperLanguage;
    }

    @ConstructorProperties({ "foreignDataWrapperCatalog", "foreignDataWrapperName", "authorizationIdentifier", "libraryName", "foreignDataWrapperLanguage" })
    public ForeignDataWrappers(
        @Nullable String foreignDataWrapperCatalog,
        @Nullable String foreignDataWrapperName,
        @Nullable String authorizationIdentifier,
        @Nullable String libraryName,
        @Nullable String foreignDataWrapperLanguage
    ) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
        this.foreignDataWrapperName = foreignDataWrapperName;
        this.authorizationIdentifier = authorizationIdentifier;
        this.libraryName = libraryName;
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    @Nullable
    public String getForeignDataWrapperCatalog() {
        return this.foreignDataWrapperCatalog;
    }

    public void setForeignDataWrapperCatalog(@Nullable String foreignDataWrapperCatalog) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
    }

    @Nullable
    public String getForeignDataWrapperName() {
        return this.foreignDataWrapperName;
    }

    public void setForeignDataWrapperName(@Nullable String foreignDataWrapperName) {
        this.foreignDataWrapperName = foreignDataWrapperName;
    }

    @Nullable
    public String getAuthorizationIdentifier() {
        return this.authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(@Nullable String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    @Nullable
    public String getLibraryName() {
        return this.libraryName;
    }

    public void setLibraryName(@Nullable String libraryName) {
        this.libraryName = libraryName;
    }

    @Nullable
    public String getForeignDataWrapperLanguage() {
        return this.foreignDataWrapperLanguage;
    }

    public void setForeignDataWrapperLanguage(@Nullable String foreignDataWrapperLanguage) {
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ForeignDataWrappers other = (ForeignDataWrappers) obj;
        if (this.foreignDataWrapperCatalog == null) {
            if (other.foreignDataWrapperCatalog != null)
                return false;
        }
        else if (!this.foreignDataWrapperCatalog.equals(other.foreignDataWrapperCatalog))
            return false;
        if (this.foreignDataWrapperName == null) {
            if (other.foreignDataWrapperName != null)
                return false;
        }
        else if (!this.foreignDataWrapperName.equals(other.foreignDataWrapperName))
            return false;
        if (this.authorizationIdentifier == null) {
            if (other.authorizationIdentifier != null)
                return false;
        }
        else if (!this.authorizationIdentifier.equals(other.authorizationIdentifier))
            return false;
        if (this.libraryName == null) {
            if (other.libraryName != null)
                return false;
        }
        else if (!this.libraryName.equals(other.libraryName))
            return false;
        if (this.foreignDataWrapperLanguage == null) {
            if (other.foreignDataWrapperLanguage != null)
                return false;
        }
        else if (!this.foreignDataWrapperLanguage.equals(other.foreignDataWrapperLanguage))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.foreignDataWrapperCatalog == null) ? 0 : this.foreignDataWrapperCatalog.hashCode());
        result = prime * result + ((this.foreignDataWrapperName == null) ? 0 : this.foreignDataWrapperName.hashCode());
        result = prime * result + ((this.authorizationIdentifier == null) ? 0 : this.authorizationIdentifier.hashCode());
        result = prime * result + ((this.libraryName == null) ? 0 : this.libraryName.hashCode());
        result = prime * result + ((this.foreignDataWrapperLanguage == null) ? 0 : this.foreignDataWrapperLanguage.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignDataWrappers (");

        sb.append(foreignDataWrapperCatalog);
        sb.append(", ").append(foreignDataWrapperName);
        sb.append(", ").append(authorizationIdentifier);
        sb.append(", ").append(libraryName);
        sb.append(", ").append(foreignDataWrapperLanguage);

        sb.append(")");
        return sb.toString();
    }
}
