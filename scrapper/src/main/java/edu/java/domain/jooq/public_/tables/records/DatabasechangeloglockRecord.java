/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.records;


import edu.java.domain.jooq.public_.tables.Databasechangeloglock;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

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
public class DatabasechangeloglockRecord extends TableRecordImpl<DatabasechangeloglockRecord> {

    private static final long serialVersionUID = 1L;

    public void setId(@NotNull Integer value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    public void setLocked(@NotNull Boolean value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getLocked() {
        return (Boolean) get(1);
    }

    public void setLockgranted(@Nullable LocalDateTime value) {
        set(2, value);
    }

    @Nullable
    public LocalDateTime getLockgranted() {
        return (LocalDateTime) get(2);
    }

    public void setLockedby(@Nullable String value) {
        set(3, value);
    }

    @Size(max = 255)
    @Nullable
    public String getLockedby() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public DatabasechangeloglockRecord() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);
    }

    @ConstructorProperties({ "id", "locked", "lockgranted", "lockedby" })
    public DatabasechangeloglockRecord(@NotNull Integer id, @NotNull Boolean locked, @Nullable LocalDateTime lockgranted, @Nullable String lockedby) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);

        setId(id);
        setLocked(locked);
        setLockgranted(lockgranted);
        setLockedby(lockedby);
        resetChangedOnNotNull();
    }

    public DatabasechangeloglockRecord(edu.java.domain.jooq.public_.tables.pojos.Databasechangeloglock value) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);

        if (value != null) {
            setId(value.getId());
            setLocked(value.getLocked());
            setLockgranted(value.getLockgranted());
            setLockedby(value.getLockedby());
            resetChangedOnNotNull();
        }
    }
}
