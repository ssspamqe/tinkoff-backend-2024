/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonbEachText;

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
public class JsonbEachTextRecord extends TableRecordImpl<JsonbEachTextRecord> {

    private static final long serialVersionUID = 1L;

    public void setKey(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getKey() {
        return (String) get(0);
    }

    public void setValue(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonbEachTextRecord() {
        super(JsonbEachText.JSONB_EACH_TEXT);
    }

    @ConstructorProperties({ "key", "value" })
    public JsonbEachTextRecord(@Nullable String key, @Nullable String value) {
        super(JsonbEachText.JSONB_EACH_TEXT);

        setKey(key);
        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonbEachTextRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonbEachText value) {
        super(JsonbEachText.JSONB_EACH_TEXT);

        if (value != null) {
            setKey(value.getKey());
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}