/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.RegexpMatches;

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
public class RegexpMatchesRecord extends TableRecordImpl<RegexpMatchesRecord> {

    private static final long serialVersionUID = 1L;

    public void setRegexpMatches(@Nullable String[] value) {
        set(0, value);
    }

    @Nullable
    public String[] getRegexpMatches() {
        return (String[]) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public RegexpMatchesRecord() {
        super(RegexpMatches.REGEXP_MATCHES);
    }

    @ConstructorProperties({ "regexpMatches" })
    public RegexpMatchesRecord(@Nullable String[] regexpMatches) {
        super(RegexpMatches.REGEXP_MATCHES);

        setRegexpMatches(regexpMatches);
        resetChangedOnNotNull();
    }

    public RegexpMatchesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.RegexpMatches value) {
        super(RegexpMatches.REGEXP_MATCHES);

        if (value != null) {
            setRegexpMatches(value.getRegexpMatches());
            resetChangedOnNotNull();
        }
    }
}
