/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPartitionedTable;

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
public class PgPartitionedTableRecord extends TableRecordImpl<PgPartitionedTableRecord> {

    private static final long serialVersionUID = 1L;

    public void setPartrelid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPartrelid() {
        return (Long) get(0);
    }

    public void setPartstrat(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPartstrat() {
        return (String) get(1);
    }

    public void setPartnatts(@NotNull Short value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getPartnatts() {
        return (Short) get(2);
    }

    public void setPartdefid(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPartdefid() {
        return (Long) get(3);
    }

    public void setPartattrs(@NotNull Object[] value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getPartattrs() {
        return (Object[]) get(4);
    }

    public void setPartclass(@NotNull Object[] value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getPartclass() {
        return (Object[]) get(5);
    }

    public void setPartcollation(@NotNull Object[] value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getPartcollation() {
        return (Object[]) get(6);
    }

    @Deprecated
    public void setPartexprs(@Nullable Object value) {
        set(7, value);
    }

    @Deprecated
    @Nullable
    public Object getPartexprs() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgPartitionedTableRecord() {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);
    }

    @ConstructorProperties({ "partrelid", "partstrat", "partnatts", "partdefid", "partattrs", "partclass", "partcollation", "partexprs" })
    public PgPartitionedTableRecord(@NotNull Long partrelid, @NotNull String partstrat, @NotNull Short partnatts, @NotNull Long partdefid, @NotNull Object[] partattrs, @NotNull Object[] partclass, @NotNull Object[] partcollation, @Nullable Object partexprs) {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);

        setPartrelid(partrelid);
        setPartstrat(partstrat);
        setPartnatts(partnatts);
        setPartdefid(partdefid);
        setPartattrs(partattrs);
        setPartclass(partclass);
        setPartcollation(partcollation);
        setPartexprs(partexprs);
        resetChangedOnNotNull();
    }

    public PgPartitionedTableRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPartitionedTable value) {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);

        if (value != null) {
            setPartrelid(value.getPartrelid());
            setPartstrat(value.getPartstrat());
            setPartnatts(value.getPartnatts());
            setPartdefid(value.getPartdefid());
            setPartattrs(value.getPartattrs());
            setPartclass(value.getPartclass());
            setPartcollation(value.getPartcollation());
            setPartexprs(value.getPartexprs());
            resetChangedOnNotNull();
        }
    }
}