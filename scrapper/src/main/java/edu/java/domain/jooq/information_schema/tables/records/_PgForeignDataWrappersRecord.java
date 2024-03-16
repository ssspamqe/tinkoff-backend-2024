/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables._PgForeignDataWrappers;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class _PgForeignDataWrappersRecord extends TableRecordImpl<_PgForeignDataWrappersRecord> implements Record7<Long, Long, String[], String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema._pg_foreign_data_wrappers.oid</code>.
     */
    public void setOid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_data_wrappers.oid</code>.
     */
    @Nullable
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>.
     */
    public void setFdwowner(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>.
     */
    @Nullable
    public Long getFdwowner() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>.
     */
    public void setFdwoptions(@Nullable String[] value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>.
     */
    @Nullable
    public String[] getFdwoptions() {
        return (String[]) get(2);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    @Nullable
    public String getForeignDataWrapperCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    @Nullable
    public String getForeignDataWrapperName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>.
     */
    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public void setForeignDataWrapperLanguage(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    @Nullable
    public String getForeignDataWrapperLanguage() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, Long, String[], String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<Long, Long, String[], String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.OID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FDWOWNER;
    }

    @Override
    @NotNull
    public Field<String[]> field3() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FDWOPTIONS;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_LANGUAGE;
    }

    @Override
    @Nullable
    public Long component1() {
        return getOid();
    }

    @Override
    @Nullable
    public Long component2() {
        return getFdwowner();
    }

    @Override
    @Nullable
    public String[] component3() {
        return getFdwoptions();
    }

    @Override
    @Nullable
    public String component4() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String component6() {
        return getAuthorizationIdentifier();
    }

    @Override
    @Nullable
    public String component7() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    @Nullable
    public Long value1() {
        return getOid();
    }

    @Override
    @Nullable
    public Long value2() {
        return getFdwowner();
    }

    @Override
    @Nullable
    public String[] value3() {
        return getFdwoptions();
    }

    @Override
    @Nullable
    public String value4() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String value6() {
        return getAuthorizationIdentifier();
    }

    @Override
    @Nullable
    public String value7() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value1(@Nullable Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value2(@Nullable Long value) {
        setFdwowner(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value3(@Nullable String[] value) {
        setFdwoptions(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value4(@Nullable String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value5(@Nullable String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value6(@Nullable String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord value7(@Nullable String value) {
        setForeignDataWrapperLanguage(value);
        return this;
    }

    @Override
    @NotNull
    public _PgForeignDataWrappersRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable String[] value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgForeignDataWrappersRecord
     */
    public _PgForeignDataWrappersRecord() {
        super(_PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create a detached, initialised _PgForeignDataWrappersRecord
     */
    @ConstructorProperties({ "oid", "fdwowner", "fdwoptions", "foreignDataWrapperCatalog", "foreignDataWrapperName", "authorizationIdentifier", "foreignDataWrapperLanguage" })
    public _PgForeignDataWrappersRecord(@Nullable Long oid, @Nullable Long fdwowner, @Nullable String[] fdwoptions, @Nullable String foreignDataWrapperCatalog, @Nullable String foreignDataWrapperName, @Nullable String authorizationIdentifier, @Nullable String foreignDataWrapperLanguage) {
        super(_PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);

        setOid(oid);
        setFdwowner(fdwowner);
        setFdwoptions(fdwoptions);
        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setAuthorizationIdentifier(authorizationIdentifier);
        setForeignDataWrapperLanguage(foreignDataWrapperLanguage);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised _PgForeignDataWrappersRecord
     */
    public _PgForeignDataWrappersRecord(edu.java.domain.jooq.information_schema.tables.pojos._PgForeignDataWrappers value) {
        super(_PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);

        if (value != null) {
            setOid(value.getOid());
            setFdwowner(value.getFdwowner());
            setFdwoptions(value.getFdwoptions());
            setForeignDataWrapperCatalog(value.getForeignDataWrapperCatalog());
            setForeignDataWrapperName(value.getForeignDataWrapperName());
            setAuthorizationIdentifier(value.getAuthorizationIdentifier());
            setForeignDataWrapperLanguage(value.getForeignDataWrapperLanguage());
            resetChangedOnNotNull();
        }
    }
}
