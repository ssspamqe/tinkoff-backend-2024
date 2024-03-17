/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgUserMapping;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgUserMappingRecord extends UpdatableRecordImpl<PgUserMappingRecord> implements Record4<Long, Long, Long, String[]> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setUmuser(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getUmuser() {
        return (Long) get(1);
    }

    public void setUmserver(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getUmserver() {
        return (Long) get(2);
    }

    public void setUmoptions(@Nullable String[] value) {
        set(3, value);
    }

    @Nullable
    public String[] getUmoptions() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Long, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<Long, Long, Long, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgUserMapping.PG_USER_MAPPING.OID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgUserMapping.PG_USER_MAPPING.UMUSER;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgUserMapping.PG_USER_MAPPING.UMSERVER;
    }

    @Override
    @NotNull
    public Field<String[]> field4() {
        return PgUserMapping.PG_USER_MAPPING.UMOPTIONS;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getUmuser();
    }

    @Override
    @NotNull
    public Long component3() {
        return getUmserver();
    }

    @Override
    @Nullable
    public String[] component4() {
        return getUmoptions();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getUmuser();
    }

    @Override
    @NotNull
    public Long value3() {
        return getUmserver();
    }

    @Override
    @Nullable
    public String[] value4() {
        return getUmoptions();
    }

    @Override
    @NotNull
    public PgUserMappingRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingRecord value2(@NotNull Long value) {
        setUmuser(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingRecord value3(@NotNull Long value) {
        setUmserver(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingRecord value4(@Nullable String[] value) {
        setUmoptions(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Long value3, @Nullable String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgUserMappingRecord() {
        super(PgUserMapping.PG_USER_MAPPING);
    }

    @ConstructorProperties({ "oid", "umuser", "umserver", "umoptions" })
    public PgUserMappingRecord(@NotNull Long oid, @NotNull Long umuser, @NotNull Long umserver, @Nullable String[] umoptions) {
        super(PgUserMapping.PG_USER_MAPPING);

        setOid(oid);
        setUmuser(umuser);
        setUmserver(umserver);
        setUmoptions(umoptions);
        resetChangedOnNotNull();
    }

    public PgUserMappingRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgUserMapping value) {
        super(PgUserMapping.PG_USER_MAPPING);

        if (value != null) {
            setOid(value.getOid());
            setUmuser(value.getUmuser());
            setUmserver(value.getUmserver());
            setUmoptions(value.getUmoptions());
            resetChangedOnNotNull();
        }
    }
}
