/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


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
public class Attributes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String udtCatalog;
    private String udtSchema;
    private String udtName;
    private String attributeName;
    private Integer ordinalPosition;
    private String attributeDefault;
    private String isNullable;
    private String dataType;
    private Integer characterMaximumLength;
    private Integer characterOctetLength;
    private String characterSetCatalog;
    private String characterSetSchema;
    private String characterSetName;
    private String collationCatalog;
    private String collationSchema;
    private String collationName;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String intervalType;
    private Integer intervalPrecision;
    private String attributeUdtCatalog;
    private String attributeUdtSchema;
    private String attributeUdtName;
    private String scopeCatalog;
    private String scopeSchema;
    private String scopeName;
    private Integer maximumCardinality;
    private String dtdIdentifier;
    private String isDerivedReferenceAttribute;

    public Attributes() {}

    public Attributes(Attributes value) {
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.attributeName = value.attributeName;
        this.ordinalPosition = value.ordinalPosition;
        this.attributeDefault = value.attributeDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.attributeUdtCatalog = value.attributeUdtCatalog;
        this.attributeUdtSchema = value.attributeUdtSchema;
        this.attributeUdtName = value.attributeUdtName;
        this.scopeCatalog = value.scopeCatalog;
        this.scopeSchema = value.scopeSchema;
        this.scopeName = value.scopeName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.isDerivedReferenceAttribute = value.isDerivedReferenceAttribute;
    }

    @ConstructorProperties({ "udtCatalog", "udtSchema", "udtName", "attributeName", "ordinalPosition", "attributeDefault", "isNullable", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "attributeUdtCatalog", "attributeUdtSchema", "attributeUdtName", "scopeCatalog", "scopeSchema", "scopeName", "maximumCardinality", "dtdIdentifier", "isDerivedReferenceAttribute" })
    public Attributes(
        @Nullable String udtCatalog,
        @Nullable String udtSchema,
        @Nullable String udtName,
        @Nullable String attributeName,
        @Nullable Integer ordinalPosition,
        @Nullable String attributeDefault,
        @Nullable String isNullable,
        @Nullable String dataType,
        @Nullable Integer characterMaximumLength,
        @Nullable Integer characterOctetLength,
        @Nullable String characterSetCatalog,
        @Nullable String characterSetSchema,
        @Nullable String characterSetName,
        @Nullable String collationCatalog,
        @Nullable String collationSchema,
        @Nullable String collationName,
        @Nullable Integer numericPrecision,
        @Nullable Integer numericPrecisionRadix,
        @Nullable Integer numericScale,
        @Nullable Integer datetimePrecision,
        @Nullable String intervalType,
        @Nullable Integer intervalPrecision,
        @Nullable String attributeUdtCatalog,
        @Nullable String attributeUdtSchema,
        @Nullable String attributeUdtName,
        @Nullable String scopeCatalog,
        @Nullable String scopeSchema,
        @Nullable String scopeName,
        @Nullable Integer maximumCardinality,
        @Nullable String dtdIdentifier,
        @Nullable String isDerivedReferenceAttribute
    ) {
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.attributeName = attributeName;
        this.ordinalPosition = ordinalPosition;
        this.attributeDefault = attributeDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.attributeUdtCatalog = attributeUdtCatalog;
        this.attributeUdtSchema = attributeUdtSchema;
        this.attributeUdtName = attributeUdtName;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeName = scopeName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.isDerivedReferenceAttribute = isDerivedReferenceAttribute;
    }

    /**
     * Getter for <code>information_schema.attributes.udt_catalog</code>.
     */
    @Nullable
    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    /**
     * Setter for <code>information_schema.attributes.udt_catalog</code>.
     */
    public void setUdtCatalog(@Nullable String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    /**
     * Getter for <code>information_schema.attributes.udt_schema</code>.
     */
    @Nullable
    public String getUdtSchema() {
        return this.udtSchema;
    }

    /**
     * Setter for <code>information_schema.attributes.udt_schema</code>.
     */
    public void setUdtSchema(@Nullable String udtSchema) {
        this.udtSchema = udtSchema;
    }

    /**
     * Getter for <code>information_schema.attributes.udt_name</code>.
     */
    @Nullable
    public String getUdtName() {
        return this.udtName;
    }

    /**
     * Setter for <code>information_schema.attributes.udt_name</code>.
     */
    public void setUdtName(@Nullable String udtName) {
        this.udtName = udtName;
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_name</code>.
     */
    @Nullable
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_name</code>.
     */
    public void setAttributeName(@Nullable String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Getter for <code>information_schema.attributes.ordinal_position</code>.
     */
    @Nullable
    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Setter for <code>information_schema.attributes.ordinal_position</code>.
     */
    public void setOrdinalPosition(@Nullable Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_default</code>.
     */
    @Nullable
    public String getAttributeDefault() {
        return this.attributeDefault;
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_default</code>.
     */
    public void setAttributeDefault(@Nullable String attributeDefault) {
        this.attributeDefault = attributeDefault;
    }

    /**
     * Getter for <code>information_schema.attributes.is_nullable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsNullable() {
        return this.isNullable;
    }

    /**
     * Setter for <code>information_schema.attributes.is_nullable</code>.
     */
    public void setIsNullable(@Nullable String isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * Getter for <code>information_schema.attributes.data_type</code>.
     */
    @Nullable
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for <code>information_schema.attributes.data_type</code>.
     */
    public void setDataType(@Nullable String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    @Nullable
    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(@Nullable Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    @Nullable
    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    public void setCharacterOctetLength(@Nullable Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    @Nullable
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(@Nullable String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    @Nullable
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    public void setCharacterSetSchema(@Nullable String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    /**
     * Getter for <code>information_schema.attributes.character_set_name</code>.
     */
    @Nullable
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Setter for <code>information_schema.attributes.character_set_name</code>.
     */
    public void setCharacterSetName(@Nullable String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * Getter for <code>information_schema.attributes.collation_catalog</code>.
     */
    @Nullable
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Setter for <code>information_schema.attributes.collation_catalog</code>.
     */
    public void setCollationCatalog(@Nullable String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    /**
     * Getter for <code>information_schema.attributes.collation_schema</code>.
     */
    @Nullable
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Setter for <code>information_schema.attributes.collation_schema</code>.
     */
    public void setCollationSchema(@Nullable String collationSchema) {
        this.collationSchema = collationSchema;
    }

    /**
     * Getter for <code>information_schema.attributes.collation_name</code>.
     */
    @Nullable
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Setter for <code>information_schema.attributes.collation_name</code>.
     */
    public void setCollationName(@Nullable String collationName) {
        this.collationName = collationName;
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_precision</code>.
     */
    @Nullable
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_precision</code>.
     */
    public void setNumericPrecision(@Nullable Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    @Nullable
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(@Nullable Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_scale</code>.
     */
    @Nullable
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_scale</code>.
     */
    public void setNumericScale(@Nullable Integer numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * Getter for <code>information_schema.attributes.datetime_precision</code>.
     */
    @Nullable
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Setter for <code>information_schema.attributes.datetime_precision</code>.
     */
    public void setDatetimePrecision(@Nullable Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    /**
     * Getter for <code>information_schema.attributes.interval_type</code>.
     */
    @Nullable
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Setter for <code>information_schema.attributes.interval_type</code>.
     */
    public void setIntervalType(@Nullable String intervalType) {
        this.intervalType = intervalType;
    }

    /**
     * Getter for <code>information_schema.attributes.interval_precision</code>.
     */
    @Nullable
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Setter for <code>information_schema.attributes.interval_precision</code>.
     */
    public void setIntervalPrecision(@Nullable Integer intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    @Nullable
    public String getAttributeUdtCatalog() {
        return this.attributeUdtCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    public void setAttributeUdtCatalog(@Nullable String attributeUdtCatalog) {
        this.attributeUdtCatalog = attributeUdtCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    @Nullable
    public String getAttributeUdtSchema() {
        return this.attributeUdtSchema;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    public void setAttributeUdtSchema(@Nullable String attributeUdtSchema) {
        this.attributeUdtSchema = attributeUdtSchema;
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    @Nullable
    public String getAttributeUdtName() {
        return this.attributeUdtName;
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    public void setAttributeUdtName(@Nullable String attributeUdtName) {
        this.attributeUdtName = attributeUdtName;
    }

    /**
     * Getter for <code>information_schema.attributes.scope_catalog</code>.
     */
    @Nullable
    public String getScopeCatalog() {
        return this.scopeCatalog;
    }

    /**
     * Setter for <code>information_schema.attributes.scope_catalog</code>.
     */
    public void setScopeCatalog(@Nullable String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    /**
     * Getter for <code>information_schema.attributes.scope_schema</code>.
     */
    @Nullable
    public String getScopeSchema() {
        return this.scopeSchema;
    }

    /**
     * Setter for <code>information_schema.attributes.scope_schema</code>.
     */
    public void setScopeSchema(@Nullable String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    /**
     * Getter for <code>information_schema.attributes.scope_name</code>.
     */
    @Nullable
    public String getScopeName() {
        return this.scopeName;
    }

    /**
     * Setter for <code>information_schema.attributes.scope_name</code>.
     */
    public void setScopeName(@Nullable String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    @Nullable
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(@Nullable Integer maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    /**
     * Getter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    @Nullable
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Setter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    public void setDtdIdentifier(@Nullable String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    /**
     * Getter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsDerivedReferenceAttribute() {
        return this.isDerivedReferenceAttribute;
    }

    /**
     * Setter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    public void setIsDerivedReferenceAttribute(@Nullable String isDerivedReferenceAttribute) {
        this.isDerivedReferenceAttribute = isDerivedReferenceAttribute;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Attributes other = (Attributes) obj;
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
        if (this.attributeName == null) {
            if (other.attributeName != null)
                return false;
        }
        else if (!this.attributeName.equals(other.attributeName))
            return false;
        if (this.ordinalPosition == null) {
            if (other.ordinalPosition != null)
                return false;
        }
        else if (!this.ordinalPosition.equals(other.ordinalPosition))
            return false;
        if (this.attributeDefault == null) {
            if (other.attributeDefault != null)
                return false;
        }
        else if (!this.attributeDefault.equals(other.attributeDefault))
            return false;
        if (this.isNullable == null) {
            if (other.isNullable != null)
                return false;
        }
        else if (!this.isNullable.equals(other.isNullable))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.characterMaximumLength == null) {
            if (other.characterMaximumLength != null)
                return false;
        }
        else if (!this.characterMaximumLength.equals(other.characterMaximumLength))
            return false;
        if (this.characterOctetLength == null) {
            if (other.characterOctetLength != null)
                return false;
        }
        else if (!this.characterOctetLength.equals(other.characterOctetLength))
            return false;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.datetimePrecision == null) {
            if (other.datetimePrecision != null)
                return false;
        }
        else if (!this.datetimePrecision.equals(other.datetimePrecision))
            return false;
        if (this.intervalType == null) {
            if (other.intervalType != null)
                return false;
        }
        else if (!this.intervalType.equals(other.intervalType))
            return false;
        if (this.intervalPrecision == null) {
            if (other.intervalPrecision != null)
                return false;
        }
        else if (!this.intervalPrecision.equals(other.intervalPrecision))
            return false;
        if (this.attributeUdtCatalog == null) {
            if (other.attributeUdtCatalog != null)
                return false;
        }
        else if (!this.attributeUdtCatalog.equals(other.attributeUdtCatalog))
            return false;
        if (this.attributeUdtSchema == null) {
            if (other.attributeUdtSchema != null)
                return false;
        }
        else if (!this.attributeUdtSchema.equals(other.attributeUdtSchema))
            return false;
        if (this.attributeUdtName == null) {
            if (other.attributeUdtName != null)
                return false;
        }
        else if (!this.attributeUdtName.equals(other.attributeUdtName))
            return false;
        if (this.scopeCatalog == null) {
            if (other.scopeCatalog != null)
                return false;
        }
        else if (!this.scopeCatalog.equals(other.scopeCatalog))
            return false;
        if (this.scopeSchema == null) {
            if (other.scopeSchema != null)
                return false;
        }
        else if (!this.scopeSchema.equals(other.scopeSchema))
            return false;
        if (this.scopeName == null) {
            if (other.scopeName != null)
                return false;
        }
        else if (!this.scopeName.equals(other.scopeName))
            return false;
        if (this.maximumCardinality == null) {
            if (other.maximumCardinality != null)
                return false;
        }
        else if (!this.maximumCardinality.equals(other.maximumCardinality))
            return false;
        if (this.dtdIdentifier == null) {
            if (other.dtdIdentifier != null)
                return false;
        }
        else if (!this.dtdIdentifier.equals(other.dtdIdentifier))
            return false;
        if (this.isDerivedReferenceAttribute == null) {
            if (other.isDerivedReferenceAttribute != null)
                return false;
        }
        else if (!this.isDerivedReferenceAttribute.equals(other.isDerivedReferenceAttribute))
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
        result = prime * result + ((this.attributeName == null) ? 0 : this.attributeName.hashCode());
        result = prime * result + ((this.ordinalPosition == null) ? 0 : this.ordinalPosition.hashCode());
        result = prime * result + ((this.attributeDefault == null) ? 0 : this.attributeDefault.hashCode());
        result = prime * result + ((this.isNullable == null) ? 0 : this.isNullable.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.characterMaximumLength == null) ? 0 : this.characterMaximumLength.hashCode());
        result = prime * result + ((this.characterOctetLength == null) ? 0 : this.characterOctetLength.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.datetimePrecision == null) ? 0 : this.datetimePrecision.hashCode());
        result = prime * result + ((this.intervalType == null) ? 0 : this.intervalType.hashCode());
        result = prime * result + ((this.intervalPrecision == null) ? 0 : this.intervalPrecision.hashCode());
        result = prime * result + ((this.attributeUdtCatalog == null) ? 0 : this.attributeUdtCatalog.hashCode());
        result = prime * result + ((this.attributeUdtSchema == null) ? 0 : this.attributeUdtSchema.hashCode());
        result = prime * result + ((this.attributeUdtName == null) ? 0 : this.attributeUdtName.hashCode());
        result = prime * result + ((this.scopeCatalog == null) ? 0 : this.scopeCatalog.hashCode());
        result = prime * result + ((this.scopeSchema == null) ? 0 : this.scopeSchema.hashCode());
        result = prime * result + ((this.scopeName == null) ? 0 : this.scopeName.hashCode());
        result = prime * result + ((this.maximumCardinality == null) ? 0 : this.maximumCardinality.hashCode());
        result = prime * result + ((this.dtdIdentifier == null) ? 0 : this.dtdIdentifier.hashCode());
        result = prime * result + ((this.isDerivedReferenceAttribute == null) ? 0 : this.isDerivedReferenceAttribute.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Attributes (");

        sb.append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(attributeName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(attributeDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(attributeUdtCatalog);
        sb.append(", ").append(attributeUdtSchema);
        sb.append(", ").append(attributeUdtName);
        sb.append(", ").append(scopeCatalog);
        sb.append(", ").append(scopeSchema);
        sb.append(", ").append(scopeName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(isDerivedReferenceAttribute);

        sb.append(")");
        return sb.toString();
    }
}
