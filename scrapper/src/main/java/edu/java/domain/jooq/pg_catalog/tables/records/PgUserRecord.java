/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgUser;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgUserRecord extends TableRecordImpl<PgUserRecord> implements Record9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> {

    private static final long serialVersionUID = 1L;

    public void setUsename(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getUsename() {
        return (String) get(0);
    }

    public void setUsesysid(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getUsesysid() {
        return (Long) get(1);
    }

    public void setUsecreatedb(@Nullable Boolean value) {
        set(2, value);
    }

    @Nullable
    public Boolean getUsecreatedb() {
        return (Boolean) get(2);
    }

    public void setUsesuper(@Nullable Boolean value) {
        set(3, value);
    }

    @Nullable
    public Boolean getUsesuper() {
        return (Boolean) get(3);
    }

    public void setUserepl(@Nullable Boolean value) {
        set(4, value);
    }

    @Nullable
    public Boolean getUserepl() {
        return (Boolean) get(4);
    }

    public void setUsebypassrls(@Nullable Boolean value) {
        set(5, value);
    }

    @Nullable
    public Boolean getUsebypassrls() {
        return (Boolean) get(5);
    }

    public void setPasswd(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getPasswd() {
        return (String) get(6);
    }

    public void setValuntil(@Nullable OffsetDateTime value) {
        set(7, value);
    }

    @Nullable
    public OffsetDateTime getValuntil() {
        return (OffsetDateTime) get(7);
    }

    public void setUseconfig(@Nullable String[] value) {
        set(8, value);
    }

    @Nullable
    public String[] getUseconfig() {
        return (String[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgUser.PG_USER.USENAME;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgUser.PG_USER.USESYSID;
    }

    @Override
    @NotNull
    public Field<Boolean> field3() {
        return PgUser.PG_USER.USECREATEDB;
    }

    @Override
    @NotNull
    public Field<Boolean> field4() {
        return PgUser.PG_USER.USESUPER;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgUser.PG_USER.USEREPL;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgUser.PG_USER.USEBYPASSRLS;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return PgUser.PG_USER.PASSWD;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field8() {
        return PgUser.PG_USER.VALUNTIL;
    }

    @Override
    @NotNull
    public Field<String[]> field9() {
        return PgUser.PG_USER.USECONFIG;
    }

    @Override
    @Nullable
    public String component1() {
        return getUsename();
    }

    @Override
    @Nullable
    public Long component2() {
        return getUsesysid();
    }

    @Override
    @Nullable
    public Boolean component3() {
        return getUsecreatedb();
    }

    @Override
    @Nullable
    public Boolean component4() {
        return getUsesuper();
    }

    @Override
    @Nullable
    public Boolean component5() {
        return getUserepl();
    }

    @Override
    @Nullable
    public Boolean component6() {
        return getUsebypassrls();
    }

    @Override
    @Nullable
    public String component7() {
        return getPasswd();
    }

    @Override
    @Nullable
    public OffsetDateTime component8() {
        return getValuntil();
    }

    @Override
    @Nullable
    public String[] component9() {
        return getUseconfig();
    }

    @Override
    @Nullable
    public String value1() {
        return getUsename();
    }

    @Override
    @Nullable
    public Long value2() {
        return getUsesysid();
    }

    @Override
    @Nullable
    public Boolean value3() {
        return getUsecreatedb();
    }

    @Override
    @Nullable
    public Boolean value4() {
        return getUsesuper();
    }

    @Override
    @Nullable
    public Boolean value5() {
        return getUserepl();
    }

    @Override
    @Nullable
    public Boolean value6() {
        return getUsebypassrls();
    }

    @Override
    @Nullable
    public String value7() {
        return getPasswd();
    }

    @Override
    @Nullable
    public OffsetDateTime value8() {
        return getValuntil();
    }

    @Override
    @Nullable
    public String[] value9() {
        return getUseconfig();
    }

    @Override
    @NotNull
    public PgUserRecord value1(@Nullable String value) {
        setUsename(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value2(@Nullable Long value) {
        setUsesysid(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value3(@Nullable Boolean value) {
        setUsecreatedb(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value4(@Nullable Boolean value) {
        setUsesuper(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value5(@Nullable Boolean value) {
        setUserepl(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value6(@Nullable Boolean value) {
        setUsebypassrls(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value7(@Nullable String value) {
        setPasswd(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value8(@Nullable OffsetDateTime value) {
        setValuntil(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord value9(@Nullable String[] value) {
        setUseconfig(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserRecord values(@Nullable String value1, @Nullable Long value2, @Nullable Boolean value3, @Nullable Boolean value4, @Nullable Boolean value5, @Nullable Boolean value6, @Nullable String value7, @Nullable OffsetDateTime value8, @Nullable String[] value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgUserRecord() {
        super(PgUser.PG_USER);
    }

    @ConstructorProperties({ "usename", "usesysid", "usecreatedb", "usesuper", "userepl", "usebypassrls", "passwd", "valuntil", "useconfig" })
    public PgUserRecord(@Nullable String usename, @Nullable Long usesysid, @Nullable Boolean usecreatedb, @Nullable Boolean usesuper, @Nullable Boolean userepl, @Nullable Boolean usebypassrls, @Nullable String passwd, @Nullable OffsetDateTime valuntil, @Nullable String[] useconfig) {
        super(PgUser.PG_USER);

        setUsename(usename);
        setUsesysid(usesysid);
        setUsecreatedb(usecreatedb);
        setUsesuper(usesuper);
        setUserepl(userepl);
        setUsebypassrls(usebypassrls);
        setPasswd(passwd);
        setValuntil(valuntil);
        setUseconfig(useconfig);
        resetChangedOnNotNull();
    }

    public PgUserRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgUser value) {
        super(PgUser.PG_USER);

        if (value != null) {
            setUsename(value.getUsename());
            setUsesysid(value.getUsesysid());
            setUsecreatedb(value.getUsecreatedb());
            setUsesuper(value.getUsesuper());
            setUserepl(value.getUserepl());
            setUsebypassrls(value.getUsebypassrls());
            setPasswd(value.getPasswd());
            setValuntil(value.getValuntil());
            setUseconfig(value.getUseconfig());
            resetChangedOnNotNull();
        }
    }
}
