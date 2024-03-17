/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Attributes;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>information_schema.attributes</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AttributesRecord extends TableRecordImpl<AttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.attributes.udt_catalog</code>.
     */
    public void setUdtCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_catalog</code>.
     */
    @Nullable
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.attributes.udt_schema</code>.
     */
    public void setUdtSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_schema</code>.
     */
    @Nullable
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.attributes.udt_name</code>.
     */
    public void setUdtName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_name</code>.
     */
    @Nullable
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_name</code>.
     */
    public void setAttributeName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_name</code>.
     */
    @Nullable
    public String getAttributeName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.attributes.ordinal_position</code>.
     */
    public void setOrdinalPosition(@Nullable Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.attributes.ordinal_position</code>.
     */
    @Nullable
    public Integer getOrdinalPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_default</code>.
     */
    public void setAttributeDefault(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_default</code>.
     */
    @Nullable
    public String getAttributeDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.attributes.is_nullable</code>.
     */
    public void setIsNullable(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.attributes.is_nullable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.attributes.data_type</code>.
     */
    public void setDataType(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.attributes.data_type</code>.
     */
    @Nullable
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(@Nullable Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    @Nullable
    public Integer getCharacterMaximumLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    public void setCharacterOctetLength(@Nullable Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    @Nullable
    public Integer getCharacterOctetLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    public void setCharacterSetSchema(@Nullable String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.attributes.character_set_name</code>.
     */
    public void setCharacterSetName(@Nullable String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.attributes.character_set_name</code>.
     */
    @Nullable
    public String getCharacterSetName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_catalog</code>.
     */
    public void setCollationCatalog(@Nullable String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_catalog</code>.
     */
    @Nullable
    public String getCollationCatalog() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_schema</code>.
     */
    public void setCollationSchema(@Nullable String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_schema</code>.
     */
    @Nullable
    public String getCollationSchema() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_name</code>.
     */
    public void setCollationName(@Nullable String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_name</code>.
     */
    @Nullable
    public String getCollationName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_precision</code>.
     */
    public void setNumericPrecision(@Nullable Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_precision</code>.
     */
    @Nullable
    public Integer getNumericPrecision() {
        return (Integer) get(16);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(@Nullable Integer value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    @Nullable
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_scale</code>.
     */
    public void setNumericScale(@Nullable Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_scale</code>.
     */
    @Nullable
    public Integer getNumericScale() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>information_schema.attributes.datetime_precision</code>.
     */
    public void setDatetimePrecision(@Nullable Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.attributes.datetime_precision</code>.
     */
    @Nullable
    public Integer getDatetimePrecision() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>information_schema.attributes.interval_type</code>.
     */
    public void setIntervalType(@Nullable String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.attributes.interval_type</code>.
     */
    @Nullable
    public String getIntervalType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.attributes.interval_precision</code>.
     */
    public void setIntervalPrecision(@Nullable Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.attributes.interval_precision</code>.
     */
    @Nullable
    public Integer getIntervalPrecision() {
        return (Integer) get(21);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    public void setAttributeUdtCatalog(@Nullable String value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    @Nullable
    public String getAttributeUdtCatalog() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    public void setAttributeUdtSchema(@Nullable String value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    @Nullable
    public String getAttributeUdtSchema() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    public void setAttributeUdtName(@Nullable String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    @Nullable
    public String getAttributeUdtName() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_catalog</code>.
     */
    public void setScopeCatalog(@Nullable String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_catalog</code>.
     */
    @Nullable
    public String getScopeCatalog() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_schema</code>.
     */
    public void setScopeSchema(@Nullable String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_schema</code>.
     */
    @Nullable
    public String getScopeSchema() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_name</code>.
     */
    public void setScopeName(@Nullable String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_name</code>.
     */
    @Nullable
    public String getScopeName() {
        return (String) get(27);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(@Nullable Integer value) {
        set(28, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    @Nullable
    public Integer getMaximumCardinality() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    public void setDtdIdentifier(@Nullable String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    @Nullable
    public String getDtdIdentifier() {
        return (String) get(29);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    public void setIsDerivedReferenceAttribute(@Nullable String value) {
        set(30, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsDerivedReferenceAttribute() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttributesRecord
     */
    public AttributesRecord() {
        super(Attributes.ATTRIBUTES);
    }

    /**
     * Create a detached, initialised AttributesRecord
     */
    @ConstructorProperties({ "udtCatalog", "udtSchema", "udtName", "attributeName", "ordinalPosition", "attributeDefault", "isNullable", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "attributeUdtCatalog", "attributeUdtSchema", "attributeUdtName", "scopeCatalog", "scopeSchema", "scopeName", "maximumCardinality", "dtdIdentifier", "isDerivedReferenceAttribute" })
    public AttributesRecord(@Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String attributeName, @Nullable Integer ordinalPosition, @Nullable String attributeDefault, @Nullable String isNullable, @Nullable String dataType, @Nullable Integer characterMaximumLength, @Nullable Integer characterOctetLength, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable Integer numericPrecision, @Nullable Integer numericPrecisionRadix, @Nullable Integer numericScale, @Nullable Integer datetimePrecision, @Nullable String intervalType, @Nullable Integer intervalPrecision, @Nullable String attributeUdtCatalog, @Nullable String attributeUdtSchema, @Nullable String attributeUdtName, @Nullable String scopeCatalog, @Nullable String scopeSchema, @Nullable String scopeName, @Nullable Integer maximumCardinality, @Nullable String dtdIdentifier, @Nullable String isDerivedReferenceAttribute) {
        super(Attributes.ATTRIBUTES);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setAttributeName(attributeName);
        setOrdinalPosition(ordinalPosition);
        setAttributeDefault(attributeDefault);
        setIsNullable(isNullable);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setAttributeUdtCatalog(attributeUdtCatalog);
        setAttributeUdtSchema(attributeUdtSchema);
        setAttributeUdtName(attributeUdtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        setIsDerivedReferenceAttribute(isDerivedReferenceAttribute);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AttributesRecord
     */
    public AttributesRecord(edu.java.domain.jooq.information_schema.tables.pojos.Attributes value) {
        super(Attributes.ATTRIBUTES);

        if (value != null) {
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setAttributeName(value.getAttributeName());
            setOrdinalPosition(value.getOrdinalPosition());
            setAttributeDefault(value.getAttributeDefault());
            setIsNullable(value.getIsNullable());
            setDataType(value.getDataType());
            setCharacterMaximumLength(value.getCharacterMaximumLength());
            setCharacterOctetLength(value.getCharacterOctetLength());
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setNumericPrecision(value.getNumericPrecision());
            setNumericPrecisionRadix(value.getNumericPrecisionRadix());
            setNumericScale(value.getNumericScale());
            setDatetimePrecision(value.getDatetimePrecision());
            setIntervalType(value.getIntervalType());
            setIntervalPrecision(value.getIntervalPrecision());
            setAttributeUdtCatalog(value.getAttributeUdtCatalog());
            setAttributeUdtSchema(value.getAttributeUdtSchema());
            setAttributeUdtName(value.getAttributeUdtName());
            setScopeCatalog(value.getScopeCatalog());
            setScopeSchema(value.getScopeSchema());
            setScopeName(value.getScopeName());
            setMaximumCardinality(value.getMaximumCardinality());
            setDtdIdentifier(value.getDtdIdentifier());
            setIsDerivedReferenceAttribute(value.getIsDerivedReferenceAttribute());
            resetChangedOnNotNull();
        }
    }
}
