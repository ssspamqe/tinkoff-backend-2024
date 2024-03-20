/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.StringToTable;

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
public class StringToTableRecord extends TableRecordImpl<StringToTableRecord> {

    private static final long serialVersionUID = 1L;

    public void setStringToTable(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getStringToTable() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public StringToTableRecord() {
        super(StringToTable.STRING_TO_TABLE);
    }

    @ConstructorProperties({ "stringToTable" })
    public StringToTableRecord(@Nullable String stringToTable) {
        super(StringToTable.STRING_TO_TABLE);

        setStringToTable(stringToTable);
        resetChangedOnNotNull();
    }

    public StringToTableRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.StringToTable value) {
        super(StringToTable.STRING_TO_TABLE);

        if (value != null) {
            setStringToTable(value.getStringToTable());
            resetChangedOnNotNull();
        }
    }
}
