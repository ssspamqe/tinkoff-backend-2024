/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgAvailableExtensions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class PgAvailableExtensionsRecord extends TableRecordImpl<PgAvailableExtensionsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public void setDefaultVersion(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    @Nullable
    public String getDefaultVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public void setComment(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    @Nullable
    public String getComment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.NAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.DEFAULT_VERSION;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.COMMENT;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public String component2() {
        return getDefaultVersion();
    }

    @Override
    @Nullable
    public String component3() {
        return getComment();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public String value2() {
        return getDefaultVersion();
    }

    @Override
    @Nullable
    public String value3() {
        return getComment();
    }

    @Override
    @NotNull
    public PgAvailableExtensionsRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgAvailableExtensionsRecord value2(@Nullable String value) {
        setDefaultVersion(value);
        return this;
    }

    @Override
    @NotNull
    public PgAvailableExtensionsRecord value3(@Nullable String value) {
        setComment(value);
        return this;
    }

    @Override
    @NotNull
    public PgAvailableExtensionsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord() {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create a detached, initialised PgAvailableExtensionsRecord
     */
    @ConstructorProperties({ "name", "defaultVersion", "comment" })
    public PgAvailableExtensionsRecord(@Nullable String name, @Nullable String defaultVersion, @Nullable String comment) {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);

        setName(name);
        setDefaultVersion(defaultVersion);
        setComment(comment);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgAvailableExtensions value) {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);

        if (value != null) {
            setName(value.getName());
            setDefaultVersion(value.getDefaultVersion());
            setComment(value.getComment());
            resetChangedOnNotNull();
        }
    }
}
