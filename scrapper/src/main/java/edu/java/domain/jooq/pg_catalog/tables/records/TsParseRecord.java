/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.TsParse;

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
public class TsParseRecord extends TableRecordImpl<TsParseRecord> {

    private static final long serialVersionUID = 1L;

    public void setTokid(@Nullable Integer value) {
        set(0, value);
    }

    @Nullable
    public Integer getTokid() {
        return (Integer) get(0);
    }

    public void setToken(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getToken() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public TsParseRecord() {
        super(TsParse.TS_PARSE);
    }

    @ConstructorProperties({ "tokid", "token" })
    public TsParseRecord(@Nullable Integer tokid, @Nullable String token) {
        super(TsParse.TS_PARSE);

        setTokid(tokid);
        setToken(token);
        resetChangedOnNotNull();
    }

    public TsParseRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.TsParse value) {
        super(TsParse.TS_PARSE);

        if (value != null) {
            setTokid(value.getTokid());
            setToken(value.getToken());
            resetChangedOnNotNull();
        }
    }
}
