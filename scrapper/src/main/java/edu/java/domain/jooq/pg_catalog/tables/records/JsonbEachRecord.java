/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonbEach;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.JSONB;
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
public class JsonbEachRecord extends TableRecordImpl<JsonbEachRecord> implements Record2<String, JSONB> {

    private static final long serialVersionUID = 1L;

    public void setKey(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getKey() {
        return (String) get(0);
    }

    public void setValue(@Nullable JSONB value) {
        set(1, value);
    }

    @Nullable
    public JSONB getValue() {
        return (JSONB) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row2<String, JSONB> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<String, JSONB> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return JsonbEach.JSONB_EACH.KEY;
    }

    @Override
    @NotNull
    public Field<JSONB> field2() {
        return JsonbEach.JSONB_EACH.VALUE;
    }

    @Override
    @Nullable
    public String component1() {
        return getKey();
    }

    @Override
    @Nullable
    public JSONB component2() {
        return getValue();
    }

    @Override
    @Nullable
    public String value1() {
        return getKey();
    }

    @Override
    @Nullable
    public JSONB value2() {
        return getValue();
    }

    @Override
    @NotNull
    public JsonbEachRecord value1(@Nullable String value) {
        setKey(value);
        return this;
    }

    @Override
    @NotNull
    public JsonbEachRecord value2(@Nullable JSONB value) {
        setValue(value);
        return this;
    }

    @Override
    @NotNull
    public JsonbEachRecord values(@Nullable String value1, @Nullable JSONB value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonbEachRecord() {
        super(JsonbEach.JSONB_EACH);
    }

    @ConstructorProperties({ "key", "value" })
    public JsonbEachRecord(@Nullable String key, @Nullable JSONB value) {
        super(JsonbEach.JSONB_EACH);

        setKey(key);
        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonbEachRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonbEach value) {
        super(JsonbEach.JSONB_EACH);

        if (value != null) {
            setKey(value.getKey());
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
