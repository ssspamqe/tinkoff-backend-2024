/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.SqlImplementationInfo;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SqlImplementationInfoRecord extends TableRecordImpl<SqlImplementationInfoRecord> implements Record5<String, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public void setImplementationInfoId(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    @Nullable
    public String getImplementationInfoId() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public void setImplementationInfoName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    @Nullable
    public String getImplementationInfoName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public void setIntegerValue(@Nullable Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    @Nullable
    public Integer getIntegerValue() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public void setCharacterValue(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    @Nullable
    public String getCharacterValue() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public void setComments(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    @Nullable
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<String, String, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.IMPLEMENTATION_INFO_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.IMPLEMENTATION_INFO_NAME;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.INTEGER_VALUE;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.CHARACTER_VALUE;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.COMMENTS;
    }

    @Override
    @Nullable
    public String component1() {
        return getImplementationInfoId();
    }

    @Override
    @Nullable
    public String component2() {
        return getImplementationInfoName();
    }

    @Override
    @Nullable
    public Integer component3() {
        return getIntegerValue();
    }

    @Override
    @Nullable
    public String component4() {
        return getCharacterValue();
    }

    @Override
    @Nullable
    public String component5() {
        return getComments();
    }

    @Override
    @Nullable
    public String value1() {
        return getImplementationInfoId();
    }

    @Override
    @Nullable
    public String value2() {
        return getImplementationInfoName();
    }

    @Override
    @Nullable
    public Integer value3() {
        return getIntegerValue();
    }

    @Override
    @Nullable
    public String value4() {
        return getCharacterValue();
    }

    @Override
    @Nullable
    public String value5() {
        return getComments();
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord value1(@Nullable String value) {
        setImplementationInfoId(value);
        return this;
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord value2(@Nullable String value) {
        setImplementationInfoName(value);
        return this;
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord value3(@Nullable Integer value) {
        setIntegerValue(value);
        return this;
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord value4(@Nullable String value) {
        setCharacterValue(value);
        return this;
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord value5(@Nullable String value) {
        setComments(value);
        return this;
    }

    @Override
    @NotNull
    public SqlImplementationInfoRecord values(@Nullable String value1, @Nullable String value2, @Nullable Integer value3, @Nullable String value4, @Nullable String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlImplementationInfoRecord
     */
    public SqlImplementationInfoRecord() {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);
    }

    /**
     * Create a detached, initialised SqlImplementationInfoRecord
     */
    @ConstructorProperties({ "implementationInfoId", "implementationInfoName", "integerValue", "characterValue", "comments" })
    public SqlImplementationInfoRecord(@Nullable String implementationInfoId, @Nullable String implementationInfoName, @Nullable Integer integerValue, @Nullable String characterValue, @Nullable String comments) {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);

        setImplementationInfoId(implementationInfoId);
        setImplementationInfoName(implementationInfoName);
        setIntegerValue(integerValue);
        setCharacterValue(characterValue);
        setComments(comments);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SqlImplementationInfoRecord
     */
    public SqlImplementationInfoRecord(edu.java.domain.jooq.information_schema.tables.pojos.SqlImplementationInfo value) {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);

        if (value != null) {
            setImplementationInfoId(value.getImplementationInfoId());
            setImplementationInfoName(value.getImplementationInfoName());
            setIntegerValue(value.getIntegerValue());
            setCharacterValue(value.getCharacterValue());
            setComments(value.getComments());
            resetChangedOnNotNull();
        }
    }
}
