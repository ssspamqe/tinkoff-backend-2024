/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgAttribute;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAttributeRecord extends UpdatableRecordImpl<PgAttributeRecord> {

    private static final long serialVersionUID = 1L;

    public void setAttrelid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAttrelid() {
        return (Long) get(0);
    }

    public void setAttname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttname() {
        return (String) get(1);
    }

    public void setAtttypid(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAtttypid() {
        return (Long) get(2);
    }

    public void setAttlen(@NotNull Short value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAttlen() {
        return (Short) get(3);
    }

    public void setAttnum(@NotNull Short value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAttnum() {
        return (Short) get(4);
    }

    public void setAttcacheoff(@NotNull Integer value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getAttcacheoff() {
        return (Integer) get(5);
    }

    public void setAtttypmod(@NotNull Integer value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getAtttypmod() {
        return (Integer) get(6);
    }

    public void setAttndims(@NotNull Short value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAttndims() {
        return (Short) get(7);
    }

    public void setAttbyval(@NotNull Boolean value) {
        set(8, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAttbyval() {
        return (Boolean) get(8);
    }

    public void setAttalign(@NotNull String value) {
        set(9, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttalign() {
        return (String) get(9);
    }

    public void setAttstorage(@NotNull String value) {
        set(10, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttstorage() {
        return (String) get(10);
    }

    public void setAttcompression(@NotNull String value) {
        set(11, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttcompression() {
        return (String) get(11);
    }

    public void setAttnotnull(@NotNull Boolean value) {
        set(12, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAttnotnull() {
        return (Boolean) get(12);
    }

    public void setAtthasdef(@NotNull Boolean value) {
        set(13, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAtthasdef() {
        return (Boolean) get(13);
    }

    public void setAtthasmissing(@NotNull Boolean value) {
        set(14, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAtthasmissing() {
        return (Boolean) get(14);
    }

    public void setAttidentity(@NotNull String value) {
        set(15, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttidentity() {
        return (String) get(15);
    }

    public void setAttgenerated(@NotNull String value) {
        set(16, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAttgenerated() {
        return (String) get(16);
    }

    public void setAttisdropped(@NotNull Boolean value) {
        set(17, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAttisdropped() {
        return (Boolean) get(17);
    }

    public void setAttislocal(@NotNull Boolean value) {
        set(18, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAttislocal() {
        return (Boolean) get(18);
    }

    public void setAttinhcount(@NotNull Short value) {
        set(19, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAttinhcount() {
        return (Short) get(19);
    }

    public void setAttstattarget(@NotNull Short value) {
        set(20, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAttstattarget() {
        return (Short) get(20);
    }

    public void setAttcollation(@NotNull Long value) {
        set(21, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAttcollation() {
        return (Long) get(21);
    }

    public void setAttacl(@Nullable String[] value) {
        set(22, value);
    }

    @Nullable
    public String[] getAttacl() {
        return (String[]) get(22);
    }

    public void setAttoptions(@Nullable String[] value) {
        set(23, value);
    }

    @Nullable
    public String[] getAttoptions() {
        return (String[]) get(23);
    }

    public void setAttfdwoptions(@Nullable String[] value) {
        set(24, value);
    }

    @Nullable
    public String[] getAttfdwoptions() {
        return (String[]) get(24);
    }

    public void setAttmissingval(@Nullable Object[] value) {
        set(25, value);
    }

    @Nullable
    public Object[] getAttmissingval() {
        return (Object[]) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record2<Long, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgAttributeRecord() {
        super(PgAttribute.PG_ATTRIBUTE);
    }

    @ConstructorProperties({ "attrelid", "attname", "atttypid", "attlen", "attnum", "attcacheoff", "atttypmod", "attndims", "attbyval", "attalign", "attstorage", "attcompression", "attnotnull", "atthasdef", "atthasmissing", "attidentity", "attgenerated", "attisdropped", "attislocal", "attinhcount", "attstattarget", "attcollation", "attacl", "attoptions", "attfdwoptions", "attmissingval" })
    public PgAttributeRecord(@NotNull Long attrelid, @NotNull String attname, @NotNull Long atttypid, @NotNull Short attlen, @NotNull Short attnum, @NotNull Integer attcacheoff, @NotNull Integer atttypmod, @NotNull Short attndims, @NotNull Boolean attbyval, @NotNull String attalign, @NotNull String attstorage, @NotNull String attcompression, @NotNull Boolean attnotnull, @NotNull Boolean atthasdef, @NotNull Boolean atthasmissing, @NotNull String attidentity, @NotNull String attgenerated, @NotNull Boolean attisdropped, @NotNull Boolean attislocal, @NotNull Short attinhcount, @NotNull Short attstattarget, @NotNull Long attcollation, @Nullable String[] attacl, @Nullable String[] attoptions, @Nullable String[] attfdwoptions, @Nullable Object[] attmissingval) {
        super(PgAttribute.PG_ATTRIBUTE);

        setAttrelid(attrelid);
        setAttname(attname);
        setAtttypid(atttypid);
        setAttlen(attlen);
        setAttnum(attnum);
        setAttcacheoff(attcacheoff);
        setAtttypmod(atttypmod);
        setAttndims(attndims);
        setAttbyval(attbyval);
        setAttalign(attalign);
        setAttstorage(attstorage);
        setAttcompression(attcompression);
        setAttnotnull(attnotnull);
        setAtthasdef(atthasdef);
        setAtthasmissing(atthasmissing);
        setAttidentity(attidentity);
        setAttgenerated(attgenerated);
        setAttisdropped(attisdropped);
        setAttislocal(attislocal);
        setAttinhcount(attinhcount);
        setAttstattarget(attstattarget);
        setAttcollation(attcollation);
        setAttacl(attacl);
        setAttoptions(attoptions);
        setAttfdwoptions(attfdwoptions);
        setAttmissingval(attmissingval);
        resetChangedOnNotNull();
    }

    public PgAttributeRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgAttribute value) {
        super(PgAttribute.PG_ATTRIBUTE);

        if (value != null) {
            setAttrelid(value.getAttrelid());
            setAttname(value.getAttname());
            setAtttypid(value.getAtttypid());
            setAttlen(value.getAttlen());
            setAttnum(value.getAttnum());
            setAttcacheoff(value.getAttcacheoff());
            setAtttypmod(value.getAtttypmod());
            setAttndims(value.getAttndims());
            setAttbyval(value.getAttbyval());
            setAttalign(value.getAttalign());
            setAttstorage(value.getAttstorage());
            setAttcompression(value.getAttcompression());
            setAttnotnull(value.getAttnotnull());
            setAtthasdef(value.getAtthasdef());
            setAtthasmissing(value.getAtthasmissing());
            setAttidentity(value.getAttidentity());
            setAttgenerated(value.getAttgenerated());
            setAttisdropped(value.getAttisdropped());
            setAttislocal(value.getAttislocal());
            setAttinhcount(value.getAttinhcount());
            setAttstattarget(value.getAttstattarget());
            setAttcollation(value.getAttcollation());
            setAttacl(value.getAttacl());
            setAttoptions(value.getAttoptions());
            setAttfdwoptions(value.getAttfdwoptions());
            setAttmissingval(value.getAttmissingval());
            resetChangedOnNotNull();
        }
    }
}
