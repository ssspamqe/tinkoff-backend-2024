/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgDbRoleSetting;

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
public class PgDbRoleSettingRecord extends TableRecordImpl<PgDbRoleSettingRecord> {

    private static final long serialVersionUID = 1L;

    public void setSetdatabase(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSetdatabase() {
        return (Long) get(0);
    }

    public void setSetrole(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSetrole() {
        return (Long) get(1);
    }

    public void setSetconfig(@Nullable String[] value) {
        set(2, value);
    }

    @Nullable
    public String[] getSetconfig() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgDbRoleSettingRecord() {
        super(PgDbRoleSetting.PG_DB_ROLE_SETTING);
    }

    @ConstructorProperties({ "setdatabase", "setrole", "setconfig" })
    public PgDbRoleSettingRecord(@NotNull Long setdatabase, @NotNull Long setrole, @Nullable String[] setconfig) {
        super(PgDbRoleSetting.PG_DB_ROLE_SETTING);

        setSetdatabase(setdatabase);
        setSetrole(setrole);
        setSetconfig(setconfig);
        resetChangedOnNotNull();
    }

    public PgDbRoleSettingRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgDbRoleSetting value) {
        super(PgDbRoleSetting.PG_DB_ROLE_SETTING);

        if (value != null) {
            setSetdatabase(value.getSetdatabase());
            setSetrole(value.getSetrole());
            setSetconfig(value.getSetconfig());
            resetChangedOnNotNull();
        }
    }
}
