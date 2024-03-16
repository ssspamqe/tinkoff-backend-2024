/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Collations;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CollationsRecord extends TableRecordImpl<CollationsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.collations.collation_catalog</code>.
     */
    public void setCollationCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_catalog</code>.
     */
    @Nullable
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.collations.collation_schema</code>.
     */
    public void setCollationSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_schema</code>.
     */
    @Nullable
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.collations.collation_name</code>.
     */
    public void setCollationName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_name</code>.
     */
    @Nullable
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.collations.pad_attribute</code>.
     */
    public void setPadAttribute(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.collations.pad_attribute</code>.
     */
    @Nullable
    public String getPadAttribute() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return Collations.COLLATIONS.COLLATION_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Collations.COLLATIONS.COLLATION_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return Collations.COLLATIONS.COLLATION_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return Collations.COLLATIONS.PAD_ATTRIBUTE;
    }

    @Override
    @Nullable
    public String component1() {
        return getCollationCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getCollationSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getCollationName();
    }

    @Override
    @Nullable
    public String component4() {
        return getPadAttribute();
    }

    @Override
    @Nullable
    public String value1() {
        return getCollationCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getCollationSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getCollationName();
    }

    @Override
    @Nullable
    public String value4() {
        return getPadAttribute();
    }

    @Override
    @NotNull
    public CollationsRecord value1(@Nullable String value) {
        setCollationCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public CollationsRecord value2(@Nullable String value) {
        setCollationSchema(value);
        return this;
    }

    @Override
    @NotNull
    public CollationsRecord value3(@Nullable String value) {
        setCollationName(value);
        return this;
    }

    @Override
    @NotNull
    public CollationsRecord value4(@Nullable String value) {
        setPadAttribute(value);
        return this;
    }

    @Override
    @NotNull
    public CollationsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationsRecord
     */
    public CollationsRecord() {
        super(Collations.COLLATIONS);
    }

    /**
     * Create a detached, initialised CollationsRecord
     */
    @ConstructorProperties({ "collationCatalog", "collationSchema", "collationName", "padAttribute" })
    public CollationsRecord(@Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable String padAttribute) {
        super(Collations.COLLATIONS);

        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setPadAttribute(padAttribute);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CollationsRecord
     */
    public CollationsRecord(edu.java.domain.jooq.information_schema.tables.pojos.Collations value) {
        super(Collations.COLLATIONS);

        if (value != null) {
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setPadAttribute(value.getPadAttribute());
            resetChangedOnNotNull();
        }
    }
}
