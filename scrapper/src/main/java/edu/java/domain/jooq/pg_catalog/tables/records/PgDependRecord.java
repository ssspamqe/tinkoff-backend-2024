/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgDepend;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_depend</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgDependRecord extends TableRecordImpl<PgDependRecord> implements Record7<Long, Long, Integer, Long, Long, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_depend.classid</code>.
     */
    public void setClassid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.classid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getClassid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objid</code>.
     */
    public void setObjid(@NotNull Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getObjid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public void setObjsubid(@NotNull Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public void setRefclassid(@NotNull Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRefclassid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public void setRefobjid(@NotNull Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRefobjid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public void setRefobjsubid(@NotNull Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getRefobjsubid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    public void setDeptype(@NotNull String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDeptype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<Long, Long, Integer, Long, Long, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<Long, Long, Integer, Long, Long, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgDepend.PG_DEPEND.CLASSID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgDepend.PG_DEPEND.OBJID;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return PgDepend.PG_DEPEND.OBJSUBID;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgDepend.PG_DEPEND.REFCLASSID;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgDepend.PG_DEPEND.REFOBJID;
    }

    @Override
    @NotNull
    public Field<Integer> field6() {
        return PgDepend.PG_DEPEND.REFOBJSUBID;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return PgDepend.PG_DEPEND.DEPTYPE;
    }

    @Override
    @NotNull
    public Long component1() {
        return getClassid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getObjid();
    }

    @Override
    @NotNull
    public Integer component3() {
        return getObjsubid();
    }

    @Override
    @NotNull
    public Long component4() {
        return getRefclassid();
    }

    @Override
    @NotNull
    public Long component5() {
        return getRefobjid();
    }

    @Override
    @NotNull
    public Integer component6() {
        return getRefobjsubid();
    }

    @Override
    @NotNull
    public String component7() {
        return getDeptype();
    }

    @Override
    @NotNull
    public Long value1() {
        return getClassid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getObjid();
    }

    @Override
    @NotNull
    public Integer value3() {
        return getObjsubid();
    }

    @Override
    @NotNull
    public Long value4() {
        return getRefclassid();
    }

    @Override
    @NotNull
    public Long value5() {
        return getRefobjid();
    }

    @Override
    @NotNull
    public Integer value6() {
        return getRefobjsubid();
    }

    @Override
    @NotNull
    public String value7() {
        return getDeptype();
    }

    @Override
    @NotNull
    public PgDependRecord value1(@NotNull Long value) {
        setClassid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value2(@NotNull Long value) {
        setObjid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value3(@NotNull Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value4(@NotNull Long value) {
        setRefclassid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value5(@NotNull Long value) {
        setRefobjid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value6(@NotNull Integer value) {
        setRefobjsubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord value7(@NotNull String value) {
        setDeptype(value);
        return this;
    }

    @Override
    @NotNull
    public PgDependRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Integer value3, @NotNull Long value4, @NotNull Long value5, @NotNull Integer value6, @NotNull String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDependRecord
     */
    public PgDependRecord() {
        super(PgDepend.PG_DEPEND);
    }

    /**
     * Create a detached, initialised PgDependRecord
     */
    @ConstructorProperties({ "classid", "objid", "objsubid", "refclassid", "refobjid", "refobjsubid", "deptype" })
    public PgDependRecord(@NotNull Long classid, @NotNull Long objid, @NotNull Integer objsubid, @NotNull Long refclassid, @NotNull Long refobjid, @NotNull Integer refobjsubid, @NotNull String deptype) {
        super(PgDepend.PG_DEPEND);

        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setRefclassid(refclassid);
        setRefobjid(refobjid);
        setRefobjsubid(refobjsubid);
        setDeptype(deptype);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgDependRecord
     */
    public PgDependRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgDepend value) {
        super(PgDepend.PG_DEPEND);

        if (value != null) {
            setClassid(value.getClassid());
            setObjid(value.getObjid());
            setObjsubid(value.getObjsubid());
            setRefclassid(value.getRefclassid());
            setRefobjid(value.getRefobjid());
            setRefobjsubid(value.getRefobjsubid());
            setDeptype(value.getDeptype());
            resetChangedOnNotNull();
        }
    }
}
