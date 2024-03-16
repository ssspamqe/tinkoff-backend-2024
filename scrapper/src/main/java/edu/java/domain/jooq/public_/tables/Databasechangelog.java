/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.public_.tables;

import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.DatabasechangelogRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class Databasechangelog extends TableImpl<DatabasechangelogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.databasechangelog</code>
     */
    public static final Databasechangelog DATABASECHANGELOG = new Databasechangelog();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<DatabasechangelogRecord> getRecordType() {
        return DatabasechangelogRecord.class;
    }

    /**
     * The column <code>public.databasechangelog.id</code>.
     */
    public final TableField<DatabasechangelogRecord, String> ID =
        createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.author</code>.
     */
    public final TableField<DatabasechangelogRecord, String> AUTHOR =
        createField(DSL.name("author"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.filename</code>.
     */
    public final TableField<DatabasechangelogRecord, String> FILENAME =
        createField(DSL.name("filename"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.dateexecuted</code>.
     */
    public final TableField<DatabasechangelogRecord, LocalDateTime> DATEEXECUTED =
        createField(DSL.name("dateexecuted"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.orderexecuted</code>.
     */
    public final TableField<DatabasechangelogRecord, Integer> ORDEREXECUTED =
        createField(DSL.name("orderexecuted"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.exectype</code>.
     */
    public final TableField<DatabasechangelogRecord, String> EXECTYPE =
        createField(DSL.name("exectype"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>public.databasechangelog.md5sum</code>.
     */
    public final TableField<DatabasechangelogRecord, String> MD5SUM =
        createField(DSL.name("md5sum"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>public.databasechangelog.description</code>.
     */
    public final TableField<DatabasechangelogRecord, String> DESCRIPTION =
        createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.databasechangelog.comments</code>.
     */
    public final TableField<DatabasechangelogRecord, String> COMMENTS =
        createField(DSL.name("comments"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.databasechangelog.tag</code>.
     */
    public final TableField<DatabasechangelogRecord, String> TAG =
        createField(DSL.name("tag"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.databasechangelog.liquibase</code>.
     */
    public final TableField<DatabasechangelogRecord, String> LIQUIBASE =
        createField(DSL.name("liquibase"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.databasechangelog.contexts</code>.
     */
    public final TableField<DatabasechangelogRecord, String> CONTEXTS =
        createField(DSL.name("contexts"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.databasechangelog.labels</code>.
     */
    public final TableField<DatabasechangelogRecord, String> LABELS =
        createField(DSL.name("labels"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.databasechangelog.deployment_id</code>.
     */
    public final TableField<DatabasechangelogRecord, String> DEPLOYMENT_ID =
        createField(DSL.name("deployment_id"), SQLDataType.VARCHAR(10), this, "");

    private Databasechangelog(Name alias, Table<DatabasechangelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Databasechangelog(Name alias, Table<DatabasechangelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.databasechangelog</code> table reference
     */
    public Databasechangelog(String alias) {
        this(DSL.name(alias), DATABASECHANGELOG);
    }

    /**
     * Create an aliased <code>public.databasechangelog</code> table reference
     */
    public Databasechangelog(Name alias) {
        this(alias, DATABASECHANGELOG);
    }

    /**
     * Create a <code>public.databasechangelog</code> table reference
     */
    public Databasechangelog() {
        this(DSL.name("databasechangelog"), null);
    }

    public <O extends Record> Databasechangelog(Table<O> child, ForeignKey<O, DatabasechangelogRecord> key) {
        super(child, key, DATABASECHANGELOG);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public Databasechangelog as(String alias) {
        return new Databasechangelog(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Databasechangelog as(Name alias) {
        return new Databasechangelog(alias, this);
    }

    @Override
    @NotNull
    public Databasechangelog as(Table<?> alias) {
        return new Databasechangelog(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangelog rename(String name) {
        return new Databasechangelog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangelog rename(Name name) {
        return new Databasechangelog(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangelog rename(Table<?> name) {
        return new Databasechangelog(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row14<String, String, String, LocalDateTime, Integer, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super String, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(
        Class<U> toType,
        Function14<? super String, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from
    ) {
        return convertFrom(toType, Records.mapping(from));
    }
}
