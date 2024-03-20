/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignServerOptions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ForeignServerOptionsRecord extends TableRecordImpl<ForeignServerOptionsRecord> {

    private static final long serialVersionUID = 1L;

    public void setForeignServerCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(0);
    }

    public void setForeignServerName(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getForeignServerName() {
        return (String) get(1);
    }

    public void setOptionName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getOptionName() {
        return (String) get(2);
    }

    public void setOptionValue(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ForeignServerOptionsRecord() {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);
    }

    @ConstructorProperties({ "foreignServerCatalog", "foreignServerName", "optionName", "optionValue" })
    public ForeignServerOptionsRecord(@Nullable String foreignServerCatalog, @Nullable String foreignServerName, @Nullable String optionName, @Nullable String optionValue) {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);

        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }

    public ForeignServerOptionsRecord(edu.java.domain.jooq.information_schema.tables.pojos.ForeignServerOptions value) {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);

        if (value != null) {
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            setOptionName(value.getOptionName());
            setOptionValue(value.getOptionValue());
            resetChangedOnNotNull();
        }
    }
}