/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgListeningChannels;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgListeningChannelsRecord extends TableRecordImpl<PgListeningChannelsRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    public void setPgListeningChannels(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getPgListeningChannels() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgListeningChannels.PG_LISTENING_CHANNELS.PG_LISTENING_CHANNELS_;
    }

    @Override
    @Nullable
    public String component1() {
        return getPgListeningChannels();
    }

    @Override
    @Nullable
    public String value1() {
        return getPgListeningChannels();
    }

    @Override
    @NotNull
    public PgListeningChannelsRecord value1(@Nullable String value) {
        setPgListeningChannels(value);
        return this;
    }

    @Override
    @NotNull
    public PgListeningChannelsRecord values(@Nullable String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgListeningChannelsRecord() {
        super(PgListeningChannels.PG_LISTENING_CHANNELS);
    }

    @ConstructorProperties({ "pgListeningChannels" })
    public PgListeningChannelsRecord(@Nullable String pgListeningChannels) {
        super(PgListeningChannels.PG_LISTENING_CHANNELS);

        setPgListeningChannels(pgListeningChannels);
        resetChangedOnNotNull();
    }

    public PgListeningChannelsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgListeningChannels value) {
        super(PgListeningChannels.PG_LISTENING_CHANNELS);

        if (value != null) {
            setPgListeningChannels(value.getPgListeningChannels());
            resetChangedOnNotNull();
        }
    }
}
