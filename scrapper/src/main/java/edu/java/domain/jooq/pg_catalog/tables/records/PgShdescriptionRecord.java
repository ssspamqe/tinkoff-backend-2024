/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgShdescription;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgShdescriptionRecord extends TableRecordImpl<PgShdescriptionRecord> {

    private static final long serialVersionUID = 1L;

    public void setObjoid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getObjoid() {
        return (Long) get(0);
    }

    public void setClassoid(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getClassoid() {
        return (Long) get(1);
    }

    public void setDescription(@NotNull String value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgShdescriptionRecord() {
        super(PgShdescription.PG_SHDESCRIPTION);
    }

    @ConstructorProperties({ "objoid", "classoid", "description" })
    public PgShdescriptionRecord(@NotNull Long objoid, @NotNull Long classoid, @NotNull String description) {
        super(PgShdescription.PG_SHDESCRIPTION);

        setObjoid(objoid);
        setClassoid(classoid);
        setDescription(description);
        resetChangedOnNotNull();
    }

    public PgShdescriptionRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgShdescription value) {
        super(PgShdescription.PG_SHDESCRIPTION);

        if (value != null) {
            setObjoid(value.getObjoid());
            setClassoid(value.getClassoid());
            setDescription(value.getDescription());
            resetChangedOnNotNull();
        }
    }
}