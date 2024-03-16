/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.InformationSchemaCatalogName;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class InformationSchemaCatalogNameRecord extends TableRecordImpl<InformationSchemaCatalogNameRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    public void setCatalogName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    @Nullable
    public String getCatalogName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME.CATALOG_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getCatalogName();
    }

    @Override
    @Nullable
    public String value1() {
        return getCatalogName();
    }

    @Override
    @NotNull
    public InformationSchemaCatalogNameRecord value1(@Nullable String value) {
        setCatalogName(value);
        return this;
    }

    @Override
    @NotNull
    public InformationSchemaCatalogNameRecord values(@Nullable String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InformationSchemaCatalogNameRecord
     */
    public InformationSchemaCatalogNameRecord() {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);
    }

    /**
     * Create a detached, initialised InformationSchemaCatalogNameRecord
     */
    @ConstructorProperties({ "catalogName" })
    public InformationSchemaCatalogNameRecord(@Nullable String catalogName) {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);

        setCatalogName(catalogName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised InformationSchemaCatalogNameRecord
     */
    public InformationSchemaCatalogNameRecord(edu.java.domain.jooq.information_schema.tables.pojos.InformationSchemaCatalogName value) {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);

        if (value != null) {
            setCatalogName(value.getCatalogName());
            resetChangedOnNotNull();
        }
    }
}
