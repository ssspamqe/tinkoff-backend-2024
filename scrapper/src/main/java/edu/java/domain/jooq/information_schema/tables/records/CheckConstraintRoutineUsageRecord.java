/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.CheckConstraintRoutineUsage;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CheckConstraintRoutineUsageRecord extends TableRecordImpl<CheckConstraintRoutineUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    public void setConstraintCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    public void setConstraintSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getConstraintSchema() {
        return (String) get(1);
    }

    public void setConstraintName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getConstraintName() {
        return (String) get(2);
    }

    public void setSpecificCatalog(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    public void setSpecificSchema(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getSpecificSchema() {
        return (String) get(4);
    }

    public void setSpecificName(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getSpecificName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getConstraintName();
    }

    @Override
    @Nullable
    public String component4() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getSpecificName();
    }

    @Override
    @Nullable
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getConstraintName();
    }

    @Override
    @Nullable
    public String value4() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getSpecificName();
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value1(@Nullable String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value2(@Nullable String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value3(@Nullable String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value4(@Nullable String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value5(@Nullable String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord value6(@Nullable String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsageRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public CheckConstraintRoutineUsageRecord() {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    @ConstructorProperties({ "constraintCatalog", "constraintSchema", "constraintName", "specificCatalog", "specificSchema", "specificName" })
    public CheckConstraintRoutineUsageRecord(@Nullable String constraintCatalog, @Nullable String constraintSchema, @Nullable String constraintName, @Nullable String specificCatalog, @Nullable String specificSchema, @Nullable String specificName) {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        resetChangedOnNotNull();
    }

    public CheckConstraintRoutineUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.CheckConstraintRoutineUsage value) {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            resetChangedOnNotNull();
        }
    }
}
