/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonEach;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonEachRecord extends TableRecordImpl<JsonEachRecord> implements Record2<String, JSON> {

    private static final long serialVersionUID = 1L;

    public void setKey(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getKey() {
        return (String) get(0);
    }

    public void setValue(@Nullable JSON value) {
        set(1, value);
    }

    @Nullable
    public JSON getValue() {
        return (JSON) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row2<String, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<String, JSON> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return JsonEach.JSON_EACH.KEY;
    }

    @Override
    @NotNull
    public Field<JSON> field2() {
        return JsonEach.JSON_EACH.VALUE;
    }

    @Override
    @Nullable
    public String component1() {
        return getKey();
    }

    @Override
    @Nullable
    public JSON component2() {
        return getValue();
    }

    @Override
    @Nullable
    public String value1() {
        return getKey();
    }

    @Override
    @Nullable
    public JSON value2() {
        return getValue();
    }

    @Override
    @NotNull
    public JsonEachRecord value1(@Nullable String value) {
        setKey(value);
        return this;
    }

    @Override
    @NotNull
    public JsonEachRecord value2(@Nullable JSON value) {
        setValue(value);
        return this;
    }

    @Override
    @NotNull
    public JsonEachRecord values(@Nullable String value1, @Nullable JSON value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonEachRecord() {
        super(JsonEach.JSON_EACH);
    }

    @ConstructorProperties({ "key", "value" })
    public JsonEachRecord(@Nullable String key, @Nullable JSON value) {
        super(JsonEach.JSON_EACH);

        setKey(key);
        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonEachRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonEach value) {
        super(JsonEach.JSON_EACH);

        if (value != null) {
            setKey(value.getKey());
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
