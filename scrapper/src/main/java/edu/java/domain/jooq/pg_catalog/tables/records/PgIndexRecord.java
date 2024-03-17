/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgIndex;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgIndexRecord extends UpdatableRecordImpl<PgIndexRecord> implements Record21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> {

    private static final long serialVersionUID = 1L;

    public void setIndexrelid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getIndexrelid() {
        return (Long) get(0);
    }

    public void setIndrelid(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getIndrelid() {
        return (Long) get(1);
    }

    public void setIndnatts(@NotNull Short value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getIndnatts() {
        return (Short) get(2);
    }

    public void setIndnkeyatts(@NotNull Short value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getIndnkeyatts() {
        return (Short) get(3);
    }

    public void setIndisunique(@NotNull Boolean value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisunique() {
        return (Boolean) get(4);
    }

    public void setIndnullsnotdistinct(@NotNull Boolean value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndnullsnotdistinct() {
        return (Boolean) get(5);
    }

    public void setIndisprimary(@NotNull Boolean value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisprimary() {
        return (Boolean) get(6);
    }

    public void setIndisexclusion(@NotNull Boolean value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisexclusion() {
        return (Boolean) get(7);
    }

    public void setIndimmediate(@NotNull Boolean value) {
        set(8, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndimmediate() {
        return (Boolean) get(8);
    }

    public void setIndisclustered(@NotNull Boolean value) {
        set(9, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisclustered() {
        return (Boolean) get(9);
    }

    public void setIndisvalid(@NotNull Boolean value) {
        set(10, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisvalid() {
        return (Boolean) get(10);
    }

    public void setIndcheckxmin(@NotNull Boolean value) {
        set(11, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndcheckxmin() {
        return (Boolean) get(11);
    }

    public void setIndisready(@NotNull Boolean value) {
        set(12, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisready() {
        return (Boolean) get(12);
    }

    public void setIndislive(@NotNull Boolean value) {
        set(13, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndislive() {
        return (Boolean) get(13);
    }

    public void setIndisreplident(@NotNull Boolean value) {
        set(14, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisreplident() {
        return (Boolean) get(14);
    }

    public void setIndkey(@NotNull Object[] value) {
        set(15, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndkey() {
        return (Object[]) get(15);
    }

    public void setIndcollation(@NotNull Object[] value) {
        set(16, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndcollation() {
        return (Object[]) get(16);
    }

    public void setIndclass(@NotNull Object[] value) {
        set(17, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndclass() {
        return (Object[]) get(17);
    }

    public void setIndoption(@NotNull Object[] value) {
        set(18, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndoption() {
        return (Object[]) get(18);
    }

    @Deprecated
    public void setIndexprs(@Nullable Object value) {
        set(19, value);
    }

    @Deprecated
    @Nullable
    public Object getIndexprs() {
        return get(19);
    }

    @Deprecated
    public void setIndpred(@Nullable Object value) {
        set(20, value);
    }

    @Deprecated
    @Nullable
    public Object getIndpred() {
        return get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgIndex.PG_INDEX.INDEXRELID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgIndex.PG_INDEX.INDRELID;
    }

    @Override
    @NotNull
    public Field<Short> field3() {
        return PgIndex.PG_INDEX.INDNATTS;
    }

    @Override
    @NotNull
    public Field<Short> field4() {
        return PgIndex.PG_INDEX.INDNKEYATTS;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgIndex.PG_INDEX.INDISUNIQUE;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgIndex.PG_INDEX.INDNULLSNOTDISTINCT;
    }

    @Override
    @NotNull
    public Field<Boolean> field7() {
        return PgIndex.PG_INDEX.INDISPRIMARY;
    }

    @Override
    @NotNull
    public Field<Boolean> field8() {
        return PgIndex.PG_INDEX.INDISEXCLUSION;
    }

    @Override
    @NotNull
    public Field<Boolean> field9() {
        return PgIndex.PG_INDEX.INDIMMEDIATE;
    }

    @Override
    @NotNull
    public Field<Boolean> field10() {
        return PgIndex.PG_INDEX.INDISCLUSTERED;
    }

    @Override
    @NotNull
    public Field<Boolean> field11() {
        return PgIndex.PG_INDEX.INDISVALID;
    }

    @Override
    @NotNull
    public Field<Boolean> field12() {
        return PgIndex.PG_INDEX.INDCHECKXMIN;
    }

    @Override
    @NotNull
    public Field<Boolean> field13() {
        return PgIndex.PG_INDEX.INDISREADY;
    }

    @Override
    @NotNull
    public Field<Boolean> field14() {
        return PgIndex.PG_INDEX.INDISLIVE;
    }

    @Override
    @NotNull
    public Field<Boolean> field15() {
        return PgIndex.PG_INDEX.INDISREPLIDENT;
    }

    @Override
    @NotNull
    public Field<Object[]> field16() {
        return PgIndex.PG_INDEX.INDKEY;
    }

    @Override
    @NotNull
    public Field<Object[]> field17() {
        return PgIndex.PG_INDEX.INDCOLLATION;
    }

    @Override
    @NotNull
    public Field<Object[]> field18() {
        return PgIndex.PG_INDEX.INDCLASS;
    }

    @Override
    @NotNull
    public Field<Object[]> field19() {
        return PgIndex.PG_INDEX.INDOPTION;
    }

    @Deprecated
    @Override
    @NotNull
    public Field<Object> field20() {
        return PgIndex.PG_INDEX.INDEXPRS;
    }

    @Deprecated
    @Override
    @NotNull
    public Field<Object> field21() {
        return PgIndex.PG_INDEX.INDPRED;
    }

    @Override
    @NotNull
    public Long component1() {
        return getIndexrelid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getIndrelid();
    }

    @Override
    @NotNull
    public Short component3() {
        return getIndnatts();
    }

    @Override
    @NotNull
    public Short component4() {
        return getIndnkeyatts();
    }

    @Override
    @NotNull
    public Boolean component5() {
        return getIndisunique();
    }

    @Override
    @NotNull
    public Boolean component6() {
        return getIndnullsnotdistinct();
    }

    @Override
    @NotNull
    public Boolean component7() {
        return getIndisprimary();
    }

    @Override
    @NotNull
    public Boolean component8() {
        return getIndisexclusion();
    }

    @Override
    @NotNull
    public Boolean component9() {
        return getIndimmediate();
    }

    @Override
    @NotNull
    public Boolean component10() {
        return getIndisclustered();
    }

    @Override
    @NotNull
    public Boolean component11() {
        return getIndisvalid();
    }

    @Override
    @NotNull
    public Boolean component12() {
        return getIndcheckxmin();
    }

    @Override
    @NotNull
    public Boolean component13() {
        return getIndisready();
    }

    @Override
    @NotNull
    public Boolean component14() {
        return getIndislive();
    }

    @Override
    @NotNull
    public Boolean component15() {
        return getIndisreplident();
    }

    @Override
    @NotNull
    public Object[] component16() {
        return getIndkey();
    }

    @Override
    @NotNull
    public Object[] component17() {
        return getIndcollation();
    }

    @Override
    @NotNull
    public Object[] component18() {
        return getIndclass();
    }

    @Override
    @NotNull
    public Object[] component19() {
        return getIndoption();
    }

    @Deprecated
    @Override
    @Nullable
    public Object component20() {
        return getIndexprs();
    }

    @Deprecated
    @Override
    @Nullable
    public Object component21() {
        return getIndpred();
    }

    @Override
    @NotNull
    public Long value1() {
        return getIndexrelid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getIndrelid();
    }

    @Override
    @NotNull
    public Short value3() {
        return getIndnatts();
    }

    @Override
    @NotNull
    public Short value4() {
        return getIndnkeyatts();
    }

    @Override
    @NotNull
    public Boolean value5() {
        return getIndisunique();
    }

    @Override
    @NotNull
    public Boolean value6() {
        return getIndnullsnotdistinct();
    }

    @Override
    @NotNull
    public Boolean value7() {
        return getIndisprimary();
    }

    @Override
    @NotNull
    public Boolean value8() {
        return getIndisexclusion();
    }

    @Override
    @NotNull
    public Boolean value9() {
        return getIndimmediate();
    }

    @Override
    @NotNull
    public Boolean value10() {
        return getIndisclustered();
    }

    @Override
    @NotNull
    public Boolean value11() {
        return getIndisvalid();
    }

    @Override
    @NotNull
    public Boolean value12() {
        return getIndcheckxmin();
    }

    @Override
    @NotNull
    public Boolean value13() {
        return getIndisready();
    }

    @Override
    @NotNull
    public Boolean value14() {
        return getIndislive();
    }

    @Override
    @NotNull
    public Boolean value15() {
        return getIndisreplident();
    }

    @Override
    @NotNull
    public Object[] value16() {
        return getIndkey();
    }

    @Override
    @NotNull
    public Object[] value17() {
        return getIndcollation();
    }

    @Override
    @NotNull
    public Object[] value18() {
        return getIndclass();
    }

    @Override
    @NotNull
    public Object[] value19() {
        return getIndoption();
    }

    @Deprecated
    @Override
    @Nullable
    public Object value20() {
        return getIndexprs();
    }

    @Deprecated
    @Override
    @Nullable
    public Object value21() {
        return getIndpred();
    }

    @Override
    @NotNull
    public PgIndexRecord value1(@NotNull Long value) {
        setIndexrelid(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value2(@NotNull Long value) {
        setIndrelid(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value3(@NotNull Short value) {
        setIndnatts(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value4(@NotNull Short value) {
        setIndnkeyatts(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value5(@NotNull Boolean value) {
        setIndisunique(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value6(@NotNull Boolean value) {
        setIndnullsnotdistinct(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value7(@NotNull Boolean value) {
        setIndisprimary(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value8(@NotNull Boolean value) {
        setIndisexclusion(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value9(@NotNull Boolean value) {
        setIndimmediate(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value10(@NotNull Boolean value) {
        setIndisclustered(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value11(@NotNull Boolean value) {
        setIndisvalid(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value12(@NotNull Boolean value) {
        setIndcheckxmin(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value13(@NotNull Boolean value) {
        setIndisready(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value14(@NotNull Boolean value) {
        setIndislive(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value15(@NotNull Boolean value) {
        setIndisreplident(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value16(@NotNull Object[] value) {
        setIndkey(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value17(@NotNull Object[] value) {
        setIndcollation(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value18(@NotNull Object[] value) {
        setIndclass(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord value19(@NotNull Object[] value) {
        setIndoption(value);
        return this;
    }

    @Deprecated
    @Override
    @NotNull
    public PgIndexRecord value20(@Nullable Object value) {
        setIndexprs(value);
        return this;
    }

    @Deprecated
    @Override
    @NotNull
    public PgIndexRecord value21(@Nullable Object value) {
        setIndpred(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Short value3, @NotNull Short value4, @NotNull Boolean value5, @NotNull Boolean value6, @NotNull Boolean value7, @NotNull Boolean value8, @NotNull Boolean value9, @NotNull Boolean value10, @NotNull Boolean value11, @NotNull Boolean value12, @NotNull Boolean value13, @NotNull Boolean value14, @NotNull Boolean value15, @NotNull Object[] value16, @NotNull Object[] value17, @NotNull Object[] value18, @NotNull Object[] value19, @Nullable Object value20, @Nullable Object value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgIndexRecord() {
        super(PgIndex.PG_INDEX);
    }

    @ConstructorProperties({ "indexrelid", "indrelid", "indnatts", "indnkeyatts", "indisunique", "indnullsnotdistinct", "indisprimary", "indisexclusion", "indimmediate", "indisclustered", "indisvalid", "indcheckxmin", "indisready", "indislive", "indisreplident", "indkey", "indcollation", "indclass", "indoption", "indexprs", "indpred" })
    public PgIndexRecord(@NotNull Long indexrelid, @NotNull Long indrelid, @NotNull Short indnatts, @NotNull Short indnkeyatts, @NotNull Boolean indisunique, @NotNull Boolean indnullsnotdistinct, @NotNull Boolean indisprimary, @NotNull Boolean indisexclusion, @NotNull Boolean indimmediate, @NotNull Boolean indisclustered, @NotNull Boolean indisvalid, @NotNull Boolean indcheckxmin, @NotNull Boolean indisready, @NotNull Boolean indislive, @NotNull Boolean indisreplident, @NotNull Object[] indkey, @NotNull Object[] indcollation, @NotNull Object[] indclass, @NotNull Object[] indoption, @Nullable Object indexprs, @Nullable Object indpred) {
        super(PgIndex.PG_INDEX);

        setIndexrelid(indexrelid);
        setIndrelid(indrelid);
        setIndnatts(indnatts);
        setIndnkeyatts(indnkeyatts);
        setIndisunique(indisunique);
        setIndnullsnotdistinct(indnullsnotdistinct);
        setIndisprimary(indisprimary);
        setIndisexclusion(indisexclusion);
        setIndimmediate(indimmediate);
        setIndisclustered(indisclustered);
        setIndisvalid(indisvalid);
        setIndcheckxmin(indcheckxmin);
        setIndisready(indisready);
        setIndislive(indislive);
        setIndisreplident(indisreplident);
        setIndkey(indkey);
        setIndcollation(indcollation);
        setIndclass(indclass);
        setIndoption(indoption);
        setIndexprs(indexprs);
        setIndpred(indpred);
        resetChangedOnNotNull();
    }

    public PgIndexRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgIndex value) {
        super(PgIndex.PG_INDEX);

        if (value != null) {
            setIndexrelid(value.getIndexrelid());
            setIndrelid(value.getIndrelid());
            setIndnatts(value.getIndnatts());
            setIndnkeyatts(value.getIndnkeyatts());
            setIndisunique(value.getIndisunique());
            setIndnullsnotdistinct(value.getIndnullsnotdistinct());
            setIndisprimary(value.getIndisprimary());
            setIndisexclusion(value.getIndisexclusion());
            setIndimmediate(value.getIndimmediate());
            setIndisclustered(value.getIndisclustered());
            setIndisvalid(value.getIndisvalid());
            setIndcheckxmin(value.getIndcheckxmin());
            setIndisready(value.getIndisready());
            setIndislive(value.getIndislive());
            setIndisreplident(value.getIndisreplident());
            setIndkey(value.getIndkey());
            setIndcollation(value.getIndcollation());
            setIndclass(value.getIndclass());
            setIndoption(value.getIndoption());
            setIndexprs(value.getIndexprs());
            setIndpred(value.getIndpred());
            resetChangedOnNotNull();
        }
    }
}
