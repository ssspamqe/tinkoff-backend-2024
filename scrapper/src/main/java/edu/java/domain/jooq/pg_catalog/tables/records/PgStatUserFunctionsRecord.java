/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatUserFunctions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatUserFunctionsRecord extends TableRecordImpl<PgStatUserFunctionsRecord> implements Record6<Long, String, String, Long, Double, Double> {

    private static final long serialVersionUID = 1L;

    public void setFuncid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getFuncid() {
        return (Long) get(0);
    }

    public void setSchemaname(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(1);
    }

    public void setFuncname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getFuncname() {
        return (String) get(2);
    }

    public void setCalls(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getCalls() {
        return (Long) get(3);
    }

    public void setTotalTime(@Nullable Double value) {
        set(4, value);
    }

    @Nullable
    public Double getTotalTime() {
        return (Double) get(4);
    }

    public void setSelfTime(@Nullable Double value) {
        set(5, value);
    }

    @Nullable
    public Double getSelfTime() {
        return (Double) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, String, String, Long, Double, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Long, String, String, Long, Double, Double> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCNAME;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.CALLS;
    }

    @Override
    @NotNull
    public Field<Double> field5() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.TOTAL_TIME;
    }

    @Override
    @NotNull
    public Field<Double> field6() {
        return PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SELF_TIME;
    }

    @Override
    @Nullable
    public Long component1() {
        return getFuncid();
    }

    @Override
    @Nullable
    public String component2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component3() {
        return getFuncname();
    }

    @Override
    @Nullable
    public Long component4() {
        return getCalls();
    }

    @Override
    @Nullable
    public Double component5() {
        return getTotalTime();
    }

    @Override
    @Nullable
    public Double component6() {
        return getSelfTime();
    }

    @Override
    @Nullable
    public Long value1() {
        return getFuncid();
    }

    @Override
    @Nullable
    public String value2() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value3() {
        return getFuncname();
    }

    @Override
    @Nullable
    public Long value4() {
        return getCalls();
    }

    @Override
    @Nullable
    public Double value5() {
        return getTotalTime();
    }

    @Override
    @Nullable
    public Double value6() {
        return getSelfTime();
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value1(@Nullable Long value) {
        setFuncid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value2(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value3(@Nullable String value) {
        setFuncname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value4(@Nullable Long value) {
        setCalls(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value5(@Nullable Double value) {
        setTotalTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord value6(@Nullable Double value) {
        setSelfTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatUserFunctionsRecord values(@Nullable Long value1, @Nullable String value2, @Nullable String value3, @Nullable Long value4, @Nullable Double value5, @Nullable Double value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatUserFunctionsRecord() {
        super(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);
    }

    @ConstructorProperties({ "funcid", "schemaname", "funcname", "calls", "totalTime", "selfTime" })
    public PgStatUserFunctionsRecord(@Nullable Long funcid, @Nullable String schemaname, @Nullable String funcname, @Nullable Long calls, @Nullable Double totalTime, @Nullable Double selfTime) {
        super(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);

        setFuncid(funcid);
        setSchemaname(schemaname);
        setFuncname(funcname);
        setCalls(calls);
        setTotalTime(totalTime);
        setSelfTime(selfTime);
        resetChangedOnNotNull();
    }

    public PgStatUserFunctionsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatUserFunctions value) {
        super(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);

        if (value != null) {
            setFuncid(value.getFuncid());
            setSchemaname(value.getSchemaname());
            setFuncname(value.getFuncname());
            setCalls(value.getCalls());
            setTotalTime(value.getTotalTime());
            setSelfTime(value.getSelfTime());
            resetChangedOnNotNull();
        }
    }
}
