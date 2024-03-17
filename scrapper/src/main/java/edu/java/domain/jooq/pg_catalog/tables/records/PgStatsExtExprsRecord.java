/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatsExtExprs;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatsExtExprsRecord extends TableRecordImpl<PgStatsExtExprsRecord> implements Record17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> {

    private static final long serialVersionUID = 1L;

    public void setSchemaname(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(0);
    }

    public void setTablename(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getTablename() {
        return (String) get(1);
    }

    public void setStatisticsSchemaname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getStatisticsSchemaname() {
        return (String) get(2);
    }

    public void setStatisticsName(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getStatisticsName() {
        return (String) get(3);
    }

    public void setStatisticsOwner(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getStatisticsOwner() {
        return (String) get(4);
    }

    public void setExpr(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getExpr() {
        return (String) get(5);
    }

    public void setInherited(@Nullable Boolean value) {
        set(6, value);
    }

    @Nullable
    public Boolean getInherited() {
        return (Boolean) get(6);
    }

    public void setNullFrac(@Nullable Float value) {
        set(7, value);
    }

    @Nullable
    public Float getNullFrac() {
        return (Float) get(7);
    }

    public void setAvgWidth(@Nullable Integer value) {
        set(8, value);
    }

    @Nullable
    public Integer getAvgWidth() {
        return (Integer) get(8);
    }

    public void setNDistinct(@Nullable Float value) {
        set(9, value);
    }

    @Nullable
    public Float getNDistinct() {
        return (Float) get(9);
    }

    public void setMostCommonVals(@Nullable Object[] value) {
        set(10, value);
    }

    @Nullable
    public Object[] getMostCommonVals() {
        return (Object[]) get(10);
    }

    public void setMostCommonFreqs(@Nullable Float[] value) {
        set(11, value);
    }

    @Nullable
    public Float[] getMostCommonFreqs() {
        return (Float[]) get(11);
    }

    public void setHistogramBounds(@Nullable Object[] value) {
        set(12, value);
    }

    @Nullable
    public Object[] getHistogramBounds() {
        return (Object[]) get(12);
    }

    public void setCorrelation(@Nullable Float value) {
        set(13, value);
    }

    @Nullable
    public Float getCorrelation() {
        return (Float) get(13);
    }

    public void setMostCommonElems(@Nullable Object[] value) {
        set(14, value);
    }

    @Nullable
    public Object[] getMostCommonElems() {
        return (Object[]) get(14);
    }

    public void setMostCommonElemFreqs(@Nullable Float[] value) {
        set(15, value);
    }

    @Nullable
    public Float[] getMostCommonElemFreqs() {
        return (Float[]) get(15);
    }

    public void setElemCountHistogram(@Nullable Float[] value) {
        set(16, value);
    }

    @Nullable
    public Float[] getElemCountHistogram() {
        return (Float[]) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.TABLENAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_NAME;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_OWNER;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.EXPR;
    }

    @Override
    @NotNull
    public Field<Boolean> field7() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.INHERITED;
    }

    @Override
    @NotNull
    public Field<Float> field8() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.NULL_FRAC;
    }

    @Override
    @NotNull
    public Field<Integer> field9() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.AVG_WIDTH;
    }

    @Override
    @NotNull
    public Field<Float> field10() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.N_DISTINCT;
    }

    @Override
    @NotNull
    public Field<Object[]> field11() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_VALS;
    }

    @Override
    @NotNull
    public Field<Float[]> field12() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_FREQS;
    }

    @Override
    @NotNull
    public Field<Object[]> field13() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.HISTOGRAM_BOUNDS;
    }

    @Override
    @NotNull
    public Field<Float> field14() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.CORRELATION;
    }

    @Override
    @NotNull
    public Field<Object[]> field15() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_ELEMS;
    }

    @Override
    @NotNull
    public Field<Float[]> field16() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_ELEM_FREQS;
    }

    @Override
    @NotNull
    public Field<Float[]> field17() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.ELEM_COUNT_HISTOGRAM;
    }

    @Override
    @Nullable
    public String component1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component2() {
        return getTablename();
    }

    @Override
    @Nullable
    public String component3() {
        return getStatisticsSchemaname();
    }

    @Override
    @Nullable
    public String component4() {
        return getStatisticsName();
    }

    @Override
    @Nullable
    public String component5() {
        return getStatisticsOwner();
    }

    @Override
    @Nullable
    public String component6() {
        return getExpr();
    }

    @Override
    @Nullable
    public Boolean component7() {
        return getInherited();
    }

    @Override
    @Nullable
    public Float component8() {
        return getNullFrac();
    }

    @Override
    @Nullable
    public Integer component9() {
        return getAvgWidth();
    }

    @Override
    @Nullable
    public Float component10() {
        return getNDistinct();
    }

    @Override
    @Nullable
    public Object[] component11() {
        return getMostCommonVals();
    }

    @Override
    @Nullable
    public Float[] component12() {
        return getMostCommonFreqs();
    }

    @Override
    @Nullable
    public Object[] component13() {
        return getHistogramBounds();
    }

    @Override
    @Nullable
    public Float component14() {
        return getCorrelation();
    }

    @Override
    @Nullable
    public Object[] component15() {
        return getMostCommonElems();
    }

    @Override
    @Nullable
    public Float[] component16() {
        return getMostCommonElemFreqs();
    }

    @Override
    @Nullable
    public Float[] component17() {
        return getElemCountHistogram();
    }

    @Override
    @Nullable
    public String value1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value2() {
        return getTablename();
    }

    @Override
    @Nullable
    public String value3() {
        return getStatisticsSchemaname();
    }

    @Override
    @Nullable
    public String value4() {
        return getStatisticsName();
    }

    @Override
    @Nullable
    public String value5() {
        return getStatisticsOwner();
    }

    @Override
    @Nullable
    public String value6() {
        return getExpr();
    }

    @Override
    @Nullable
    public Boolean value7() {
        return getInherited();
    }

    @Override
    @Nullable
    public Float value8() {
        return getNullFrac();
    }

    @Override
    @Nullable
    public Integer value9() {
        return getAvgWidth();
    }

    @Override
    @Nullable
    public Float value10() {
        return getNDistinct();
    }

    @Override
    @Nullable
    public Object[] value11() {
        return getMostCommonVals();
    }

    @Override
    @Nullable
    public Float[] value12() {
        return getMostCommonFreqs();
    }

    @Override
    @Nullable
    public Object[] value13() {
        return getHistogramBounds();
    }

    @Override
    @Nullable
    public Float value14() {
        return getCorrelation();
    }

    @Override
    @Nullable
    public Object[] value15() {
        return getMostCommonElems();
    }

    @Override
    @Nullable
    public Float[] value16() {
        return getMostCommonElemFreqs();
    }

    @Override
    @Nullable
    public Float[] value17() {
        return getElemCountHistogram();
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value1(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value2(@Nullable String value) {
        setTablename(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value3(@Nullable String value) {
        setStatisticsSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value4(@Nullable String value) {
        setStatisticsName(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value5(@Nullable String value) {
        setStatisticsOwner(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value6(@Nullable String value) {
        setExpr(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value7(@Nullable Boolean value) {
        setInherited(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value8(@Nullable Float value) {
        setNullFrac(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value9(@Nullable Integer value) {
        setAvgWidth(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value10(@Nullable Float value) {
        setNDistinct(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value11(@Nullable Object[] value) {
        setMostCommonVals(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value12(@Nullable Float[] value) {
        setMostCommonFreqs(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value13(@Nullable Object[] value) {
        setHistogramBounds(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value14(@Nullable Float value) {
        setCorrelation(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value15(@Nullable Object[] value) {
        setMostCommonElems(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value16(@Nullable Float[] value) {
        setMostCommonElemFreqs(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord value17(@Nullable Float[] value) {
        setElemCountHistogram(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatsExtExprsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable Boolean value7, @Nullable Float value8, @Nullable Integer value9, @Nullable Float value10, @Nullable Object[] value11, @Nullable Float[] value12, @Nullable Object[] value13, @Nullable Float value14, @Nullable Object[] value15, @Nullable Float[] value16, @Nullable Float[] value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatsExtExprsRecord() {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);
    }

    @ConstructorProperties({ "schemaname", "tablename", "statisticsSchemaname", "statisticsName", "statisticsOwner", "expr", "inherited", "nullFrac", "avgWidth", "nDistinct", "mostCommonVals", "mostCommonFreqs", "histogramBounds", "correlation", "mostCommonElems", "mostCommonElemFreqs", "elemCountHistogram" })
    public PgStatsExtExprsRecord(@Nullable String schemaname, @Nullable String tablename, @Nullable String statisticsSchemaname, @Nullable String statisticsName, @Nullable String statisticsOwner, @Nullable String expr, @Nullable Boolean inherited, @Nullable Float nullFrac, @Nullable Integer avgWidth, @Nullable Float nDistinct, @Nullable Object[] mostCommonVals, @Nullable Float[] mostCommonFreqs, @Nullable Object[] histogramBounds, @Nullable Float correlation, @Nullable Object[] mostCommonElems, @Nullable Float[] mostCommonElemFreqs, @Nullable Float[] elemCountHistogram) {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);

        setSchemaname(schemaname);
        setTablename(tablename);
        setStatisticsSchemaname(statisticsSchemaname);
        setStatisticsName(statisticsName);
        setStatisticsOwner(statisticsOwner);
        setExpr(expr);
        setInherited(inherited);
        setNullFrac(nullFrac);
        setAvgWidth(avgWidth);
        setNDistinct(nDistinct);
        setMostCommonVals(mostCommonVals);
        setMostCommonFreqs(mostCommonFreqs);
        setHistogramBounds(histogramBounds);
        setCorrelation(correlation);
        setMostCommonElems(mostCommonElems);
        setMostCommonElemFreqs(mostCommonElemFreqs);
        setElemCountHistogram(elemCountHistogram);
        resetChangedOnNotNull();
    }

    public PgStatsExtExprsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatsExtExprs value) {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);

        if (value != null) {
            setSchemaname(value.getSchemaname());
            setTablename(value.getTablename());
            setStatisticsSchemaname(value.getStatisticsSchemaname());
            setStatisticsName(value.getStatisticsName());
            setStatisticsOwner(value.getStatisticsOwner());
            setExpr(value.getExpr());
            setInherited(value.getInherited());
            setNullFrac(value.getNullFrac());
            setAvgWidth(value.getAvgWidth());
            setNDistinct(value.getNDistinct());
            setMostCommonVals(value.getMostCommonVals());
            setMostCommonFreqs(value.getMostCommonFreqs());
            setHistogramBounds(value.getHistogramBounds());
            setCorrelation(value.getCorrelation());
            setMostCommonElems(value.getMostCommonElems());
            setMostCommonElemFreqs(value.getMostCommonElemFreqs());
            setElemCountHistogram(value.getElemCountHistogram());
            resetChangedOnNotNull();
        }
    }
}
