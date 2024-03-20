/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTablespace;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class PgTablespaceRecord extends TableRecordImpl<PgTablespaceRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setSpcname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSpcname() {
        return (String) get(1);
    }

    public void setSpcowner(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSpcowner() {
        return (Long) get(2);
    }

    public void setSpcacl(@Nullable String[] value) {
        set(3, value);
    }

    @Nullable
    public String[] getSpcacl() {
        return (String[]) get(3);
    }

    public void setSpcoptions(@Nullable String[] value) {
        set(4, value);
    }

    @Nullable
    public String[] getSpcoptions() {
        return (String[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTablespaceRecord() {
        super(PgTablespace.PG_TABLESPACE);
    }

    @ConstructorProperties({ "oid", "spcname", "spcowner", "spcacl", "spcoptions" })
    public PgTablespaceRecord(@NotNull Long oid, @NotNull String spcname, @NotNull Long spcowner, @Nullable String[] spcacl, @Nullable String[] spcoptions) {
        super(PgTablespace.PG_TABLESPACE);

        setOid(oid);
        setSpcname(spcname);
        setSpcowner(spcowner);
        setSpcacl(spcacl);
        setSpcoptions(spcoptions);
        resetChangedOnNotNull();
    }

    public PgTablespaceRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTablespace value) {
        super(PgTablespace.PG_TABLESPACE);

        if (value != null) {
            setOid(value.getOid());
            setSpcname(value.getSpcname());
            setSpcowner(value.getSpcowner());
            setSpcacl(value.getSpcacl());
            setSpcoptions(value.getSpcoptions());
            resetChangedOnNotNull();
        }
    }
}