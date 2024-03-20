/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPartitionTree;

import java.beans.ConstructorProperties;

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
public class PgPartitionTreeRecord extends TableRecordImpl<PgPartitionTreeRecord> {

    private static final long serialVersionUID = 1L;

    @Deprecated
    public void setRelid(@Nullable Object value) {
        set(0, value);
    }

    @Deprecated
    @Nullable
    public Object getRelid() {
        return get(0);
    }

    @Deprecated
    public void setParentrelid(@Nullable Object value) {
        set(1, value);
    }

    @Deprecated
    @Nullable
    public Object getParentrelid() {
        return get(1);
    }

    public void setIsleaf(@Nullable Boolean value) {
        set(2, value);
    }

    @Nullable
    public Boolean getIsleaf() {
        return (Boolean) get(2);
    }

    public void setLevel(@Nullable Integer value) {
        set(3, value);
    }

    @Nullable
    public Integer getLevel() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgPartitionTreeRecord() {
        super(PgPartitionTree.PG_PARTITION_TREE);
    }

    @ConstructorProperties({ "relid", "parentrelid", "isleaf", "level" })
    public PgPartitionTreeRecord(@Nullable Object relid, @Nullable Object parentrelid, @Nullable Boolean isleaf, @Nullable Integer level) {
        super(PgPartitionTree.PG_PARTITION_TREE);

        setRelid(relid);
        setParentrelid(parentrelid);
        setIsleaf(isleaf);
        setLevel(level);
        resetChangedOnNotNull();
    }

    public PgPartitionTreeRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPartitionTree value) {
        super(PgPartitionTree.PG_PARTITION_TREE);

        if (value != null) {
            setRelid(value.getRelid());
            setParentrelid(value.getParentrelid());
            setIsleaf(value.getIsleaf());
            setLevel(value.getLevel());
            resetChangedOnNotNull();
        }
    }
}
