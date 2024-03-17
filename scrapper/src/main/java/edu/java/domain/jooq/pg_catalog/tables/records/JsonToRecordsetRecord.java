/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonToRecordset;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.json_to_recordset</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonToRecordsetRecord extends TableRecordImpl<JsonToRecordsetRecord> implements Record1<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    public void setJsonToRecordset(@Nullable Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    @Nullable
    public Record getJsonToRecordset() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Record> field1() {
        return JsonToRecordset.JSON_TO_RECORDSET.JSON_TO_RECORDSET_;
    }

    @Override
    @Nullable
    public Record component1() {
        return getJsonToRecordset();
    }

    @Override
    @Nullable
    public Record value1() {
        return getJsonToRecordset();
    }

    @Override
    @NotNull
    public JsonToRecordsetRecord value1(@Nullable Record value) {
        setJsonToRecordset(value);
        return this;
    }

    @Override
    @NotNull
    public JsonToRecordsetRecord values(@Nullable Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonToRecordsetRecord
     */
    public JsonToRecordsetRecord() {
        super(JsonToRecordset.JSON_TO_RECORDSET);
    }

    /**
     * Create a detached, initialised JsonToRecordsetRecord
     */
    @ConstructorProperties({ "jsonToRecordset" })
    public JsonToRecordsetRecord(@Nullable Record jsonToRecordset) {
        super(JsonToRecordset.JSON_TO_RECORDSET);

        setJsonToRecordset(jsonToRecordset);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised JsonToRecordsetRecord
     */
    public JsonToRecordsetRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonToRecordset value) {
        super(JsonToRecordset.JSON_TO_RECORDSET);

        if (value != null) {
            setJsonToRecordset(value.getJsonToRecordset());
            resetChangedOnNotNull();
        }
    }
}
