/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.UserDefinedTypes;

import jakarta.validation.constraints.Size;

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
public class UserDefinedTypesRecord extends TableRecordImpl<UserDefinedTypesRecord> {

    private static final long serialVersionUID = 1L;

    public void setUserDefinedTypeCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getUserDefinedTypeCatalog() {
        return (String) get(0);
    }

    public void setUserDefinedTypeSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getUserDefinedTypeSchema() {
        return (String) get(1);
    }

    public void setUserDefinedTypeName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getUserDefinedTypeName() {
        return (String) get(2);
    }

    public void setUserDefinedTypeCategory(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getUserDefinedTypeCategory() {
        return (String) get(3);
    }

    public void setIsInstantiable(@Nullable String value) {
        set(4, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsInstantiable() {
        return (String) get(4);
    }

    public void setIsFinal(@Nullable String value) {
        set(5, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsFinal() {
        return (String) get(5);
    }

    public void setOrderingForm(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getOrderingForm() {
        return (String) get(6);
    }

    public void setOrderingCategory(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getOrderingCategory() {
        return (String) get(7);
    }

    public void setOrderingRoutineCatalog(@Nullable String value) {
        set(8, value);
    }

    @Nullable
    public String getOrderingRoutineCatalog() {
        return (String) get(8);
    }

    public void setOrderingRoutineSchema(@Nullable String value) {
        set(9, value);
    }

    @Nullable
    public String getOrderingRoutineSchema() {
        return (String) get(9);
    }

    public void setOrderingRoutineName(@Nullable String value) {
        set(10, value);
    }

    @Nullable
    public String getOrderingRoutineName() {
        return (String) get(10);
    }

    public void setReferenceType(@Nullable String value) {
        set(11, value);
    }

    @Nullable
    public String getReferenceType() {
        return (String) get(11);
    }

    public void setDataType(@Nullable String value) {
        set(12, value);
    }

    @Nullable
    public String getDataType() {
        return (String) get(12);
    }

    public void setCharacterMaximumLength(@Nullable Integer value) {
        set(13, value);
    }

    @Nullable
    public Integer getCharacterMaximumLength() {
        return (Integer) get(13);
    }

    public void setCharacterOctetLength(@Nullable Integer value) {
        set(14, value);
    }

    @Nullable
    public Integer getCharacterOctetLength() {
        return (Integer) get(14);
    }

    public void setCharacterSetCatalog(@Nullable String value) {
        set(15, value);
    }

    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(15);
    }

    public void setCharacterSetSchema(@Nullable String value) {
        set(16, value);
    }

    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(16);
    }

    public void setCharacterSetName(@Nullable String value) {
        set(17, value);
    }

    @Nullable
    public String getCharacterSetName() {
        return (String) get(17);
    }

    public void setCollationCatalog(@Nullable String value) {
        set(18, value);
    }

    @Nullable
    public String getCollationCatalog() {
        return (String) get(18);
    }

    public void setCollationSchema(@Nullable String value) {
        set(19, value);
    }

    @Nullable
    public String getCollationSchema() {
        return (String) get(19);
    }

    public void setCollationName(@Nullable String value) {
        set(20, value);
    }

    @Nullable
    public String getCollationName() {
        return (String) get(20);
    }

    public void setNumericPrecision(@Nullable Integer value) {
        set(21, value);
    }

    @Nullable
    public Integer getNumericPrecision() {
        return (Integer) get(21);
    }

    public void setNumericPrecisionRadix(@Nullable Integer value) {
        set(22, value);
    }

    @Nullable
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(22);
    }

    public void setNumericScale(@Nullable Integer value) {
        set(23, value);
    }

    @Nullable
    public Integer getNumericScale() {
        return (Integer) get(23);
    }

    public void setDatetimePrecision(@Nullable Integer value) {
        set(24, value);
    }

    @Nullable
    public Integer getDatetimePrecision() {
        return (Integer) get(24);
    }

    public void setIntervalType(@Nullable String value) {
        set(25, value);
    }

    @Nullable
    public String getIntervalType() {
        return (String) get(25);
    }

    public void setIntervalPrecision(@Nullable Integer value) {
        set(26, value);
    }

    @Nullable
    public Integer getIntervalPrecision() {
        return (Integer) get(26);
    }

    public void setSourceDtdIdentifier(@Nullable String value) {
        set(27, value);
    }

    @Nullable
    public String getSourceDtdIdentifier() {
        return (String) get(27);
    }

    public void setRefDtdIdentifier(@Nullable String value) {
        set(28, value);
    }

    @Nullable
    public String getRefDtdIdentifier() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public UserDefinedTypesRecord() {
        super(UserDefinedTypes.USER_DEFINED_TYPES);
    }

    @ConstructorProperties({ "userDefinedTypeCatalog", "userDefinedTypeSchema", "userDefinedTypeName", "userDefinedTypeCategory", "isInstantiable", "isFinal", "orderingForm", "orderingCategory", "orderingRoutineCatalog", "orderingRoutineSchema", "orderingRoutineName", "referenceType", "dataType", "characterMaximumLength", "characterOctetLength", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "sourceDtdIdentifier", "refDtdIdentifier" })
    public UserDefinedTypesRecord(@Nullable String userDefinedTypeCatalog, @Nullable String userDefinedTypeSchema, @Nullable String userDefinedTypeName, @Nullable String userDefinedTypeCategory, @Nullable String isInstantiable, @Nullable String isFinal, @Nullable String orderingForm, @Nullable String orderingCategory, @Nullable String orderingRoutineCatalog, @Nullable String orderingRoutineSchema, @Nullable String orderingRoutineName, @Nullable String referenceType, @Nullable String dataType, @Nullable Integer characterMaximumLength, @Nullable Integer characterOctetLength, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable Integer numericPrecision, @Nullable Integer numericPrecisionRadix, @Nullable Integer numericScale, @Nullable Integer datetimePrecision, @Nullable String intervalType, @Nullable Integer intervalPrecision, @Nullable String sourceDtdIdentifier, @Nullable String refDtdIdentifier) {
        super(UserDefinedTypes.USER_DEFINED_TYPES);

        setUserDefinedTypeCatalog(userDefinedTypeCatalog);
        setUserDefinedTypeSchema(userDefinedTypeSchema);
        setUserDefinedTypeName(userDefinedTypeName);
        setUserDefinedTypeCategory(userDefinedTypeCategory);
        setIsInstantiable(isInstantiable);
        setIsFinal(isFinal);
        setOrderingForm(orderingForm);
        setOrderingCategory(orderingCategory);
        setOrderingRoutineCatalog(orderingRoutineCatalog);
        setOrderingRoutineSchema(orderingRoutineSchema);
        setOrderingRoutineName(orderingRoutineName);
        setReferenceType(referenceType);
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
        setSourceDtdIdentifier(sourceDtdIdentifier);
        setRefDtdIdentifier(refDtdIdentifier);
        resetChangedOnNotNull();
    }

    public UserDefinedTypesRecord(edu.java.domain.jooq.information_schema.tables.pojos.UserDefinedTypes value) {
        super(UserDefinedTypes.USER_DEFINED_TYPES);

        if (value != null) {
            setUserDefinedTypeCatalog(value.getUserDefinedTypeCatalog());
            setUserDefinedTypeSchema(value.getUserDefinedTypeSchema());
            setUserDefinedTypeName(value.getUserDefinedTypeName());
            setUserDefinedTypeCategory(value.getUserDefinedTypeCategory());
            setIsInstantiable(value.getIsInstantiable());
            setIsFinal(value.getIsFinal());
            setOrderingForm(value.getOrderingForm());
            setOrderingCategory(value.getOrderingCategory());
            setOrderingRoutineCatalog(value.getOrderingRoutineCatalog());
            setOrderingRoutineSchema(value.getOrderingRoutineSchema());
            setOrderingRoutineName(value.getOrderingRoutineName());
            setReferenceType(value.getReferenceType());
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
            setSourceDtdIdentifier(value.getSourceDtdIdentifier());
            setRefDtdIdentifier(value.getRefDtdIdentifier());
            resetChangedOnNotNull();
        }
    }
}
