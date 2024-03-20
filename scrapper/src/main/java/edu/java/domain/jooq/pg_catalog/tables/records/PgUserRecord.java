/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgUser;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

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
public class PgUserRecord extends TableRecordImpl<PgUserRecord> {

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
