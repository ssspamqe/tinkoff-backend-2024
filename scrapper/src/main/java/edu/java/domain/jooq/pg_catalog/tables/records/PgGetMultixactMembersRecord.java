/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetMultixactMembers;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
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
public class PgGetMultixactMembersRecord extends TableRecordImpl<PgGetMultixactMembersRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    public void setXid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getXid() {
        return (Long) get(0);
    }

    public void setMode(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getMode() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS.XID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS.MODE;
    }

    @Override
    @Nullable
    public Long component1() {
        return getXid();
    }

    @Override
    @Nullable
    public String component2() {
        return getMode();
    }

    @Override
    @Nullable
    public Long value1() {
        return getXid();
    }

    @Override
    @Nullable
    public String value2() {
        return getMode();
    }

    @Override
    @NotNull
    public PgGetMultixactMembersRecord value1(@Nullable Long value) {
        setXid(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetMultixactMembersRecord value2(@Nullable String value) {
        setMode(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetMultixactMembersRecord values(@Nullable Long value1, @Nullable String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgGetMultixactMembersRecord() {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);
    }

    @ConstructorProperties({ "xid", "mode" })
    public PgGetMultixactMembersRecord(@Nullable Long xid, @Nullable String mode) {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);

        setXid(xid);
        setMode(mode);
        resetChangedOnNotNull();
    }

    public PgGetMultixactMembersRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetMultixactMembers value) {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);

        if (value != null) {
            setXid(value.getXid());
            setMode(value.getMode());
            resetChangedOnNotNull();
        }
    }
}
