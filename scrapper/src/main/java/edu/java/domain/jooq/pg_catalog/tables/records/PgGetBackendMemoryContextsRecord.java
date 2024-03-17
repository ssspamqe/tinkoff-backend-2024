/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetBackendMemoryContexts;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>pg_catalog.pg_get_backend_memory_contexts</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetBackendMemoryContextsRecord extends TableRecordImpl<PgGetBackendMemoryContextsRecord> implements Record9<String, String, String, Integer, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_backend_memory_contexts.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_backend_memory_contexts.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_backend_memory_contexts.ident</code>.
     */
    public void setIdent(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_backend_memory_contexts.ident</code>.
     */
    @Nullable
    public String getIdent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_backend_memory_contexts.parent</code>.
     */
    public void setParent(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_backend_memory_contexts.parent</code>.
     */
    @Nullable
    public String getParent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_backend_memory_contexts.level</code>.
     */
    public void setLevel(@Nullable Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_backend_memory_contexts.level</code>.
     */
    @Nullable
    public Integer getLevel() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.total_bytes</code>.
     */
    public void setTotalBytes(@Nullable Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.total_bytes</code>.
     */
    @Nullable
    public Long getTotalBytes() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.total_nblocks</code>.
     */
    public void setTotalNblocks(@Nullable Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.total_nblocks</code>.
     */
    @Nullable
    public Long getTotalNblocks() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.free_bytes</code>.
     */
    public void setFreeBytes(@Nullable Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.free_bytes</code>.
     */
    @Nullable
    public Long getFreeBytes() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.free_chunks</code>.
     */
    public void setFreeChunks(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.free_chunks</code>.
     */
    @Nullable
    public Long getFreeChunks() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.used_bytes</code>.
     */
    public void setUsedBytes(@Nullable Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_backend_memory_contexts.used_bytes</code>.
     */
    @Nullable
    public Long getUsedBytes() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, String, String, Integer, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<String, String, String, Integer, Long, Long, Long, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.NAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.IDENT;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.PARENT;
    }

    @Override
    @NotNull
    public Field<Integer> field4() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.LEVEL;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.TOTAL_BYTES;
    }

    @Override
    @NotNull
    public Field<Long> field6() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.TOTAL_NBLOCKS;
    }

    @Override
    @NotNull
    public Field<Long> field7() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.FREE_BYTES;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.FREE_CHUNKS;
    }

    @Override
    @NotNull
    public Field<Long> field9() {
        return PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS.USED_BYTES;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public String component2() {
        return getIdent();
    }

    @Override
    @Nullable
    public String component3() {
        return getParent();
    }

    @Override
    @Nullable
    public Integer component4() {
        return getLevel();
    }

    @Override
    @Nullable
    public Long component5() {
        return getTotalBytes();
    }

    @Override
    @Nullable
    public Long component6() {
        return getTotalNblocks();
    }

    @Override
    @Nullable
    public Long component7() {
        return getFreeBytes();
    }

    @Override
    @Nullable
    public Long component8() {
        return getFreeChunks();
    }

    @Override
    @Nullable
    public Long component9() {
        return getUsedBytes();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public String value2() {
        return getIdent();
    }

    @Override
    @Nullable
    public String value3() {
        return getParent();
    }

    @Override
    @Nullable
    public Integer value4() {
        return getLevel();
    }

    @Override
    @Nullable
    public Long value5() {
        return getTotalBytes();
    }

    @Override
    @Nullable
    public Long value6() {
        return getTotalNblocks();
    }

    @Override
    @Nullable
    public Long value7() {
        return getFreeBytes();
    }

    @Override
    @Nullable
    public Long value8() {
        return getFreeChunks();
    }

    @Override
    @Nullable
    public Long value9() {
        return getUsedBytes();
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value2(@Nullable String value) {
        setIdent(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value3(@Nullable String value) {
        setParent(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value4(@Nullable Integer value) {
        setLevel(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value5(@Nullable Long value) {
        setTotalBytes(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value6(@Nullable Long value) {
        setTotalNblocks(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value7(@Nullable Long value) {
        setFreeBytes(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value8(@Nullable Long value) {
        setFreeChunks(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord value9(@Nullable Long value) {
        setUsedBytes(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetBackendMemoryContextsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable Integer value4, @Nullable Long value5, @Nullable Long value6, @Nullable Long value7, @Nullable Long value8, @Nullable Long value9) {
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

    /**
     * Create a detached PgGetBackendMemoryContextsRecord
     */
    public PgGetBackendMemoryContextsRecord() {
        super(PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS);
    }

    /**
     * Create a detached, initialised PgGetBackendMemoryContextsRecord
     */
    @ConstructorProperties({ "name", "ident", "parent", "level", "totalBytes", "totalNblocks", "freeBytes", "freeChunks", "usedBytes" })
    public PgGetBackendMemoryContextsRecord(@Nullable String name, @Nullable String ident, @Nullable String parent, @Nullable Integer level, @Nullable Long totalBytes, @Nullable Long totalNblocks, @Nullable Long freeBytes, @Nullable Long freeChunks, @Nullable Long usedBytes) {
        super(PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS);

        setName(name);
        setIdent(ident);
        setParent(parent);
        setLevel(level);
        setTotalBytes(totalBytes);
        setTotalNblocks(totalNblocks);
        setFreeBytes(freeBytes);
        setFreeChunks(freeChunks);
        setUsedBytes(usedBytes);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetBackendMemoryContextsRecord
     */
    public PgGetBackendMemoryContextsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetBackendMemoryContexts value) {
        super(PgGetBackendMemoryContexts.PG_GET_BACKEND_MEMORY_CONTEXTS);

        if (value != null) {
            setName(value.getName());
            setIdent(value.getIdent());
            setParent(value.getParent());
            setLevel(value.getLevel());
            setTotalBytes(value.getTotalBytes());
            setTotalNblocks(value.getTotalNblocks());
            setFreeBytes(value.getFreeBytes());
            setFreeChunks(value.getFreeChunks());
            setUsedBytes(value.getUsedBytes());
            resetChangedOnNotNull();
        }
    }
}
