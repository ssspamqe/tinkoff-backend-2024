/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.public_.tables;

import edu.java.domain.jooq.public_.Keys;
import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.LinksRecord;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
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
public class Links extends TableImpl<LinksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.links</code>
     */
    public static final Links LINKS = new Links();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<LinksRecord> getRecordType() {
        return LinksRecord.class;
    }

    /**
     * The column <code>public.links.id</code>.
     */
    public final TableField<LinksRecord, Long> ID =
        createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.links.url</code>.
     */
    public final TableField<LinksRecord, String> URL =
        createField(DSL.name("url"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.links.created_at</code>.
     */
    public final TableField<LinksRecord, LocalDateTime> CREATED_AT =
        createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.links.last_checked_at</code>.
     */
    public final TableField<LinksRecord, LocalDateTime> LAST_CHECKED_AT = createField(DSL.name("last_checked_at"),
        SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(
            DSL.raw("'1970-01-01 00:00:00'::timestamp without time zone"),
            SQLDataType.LOCALDATETIME
        )),
        this,
        ""
    );

    private Links(Name alias, Table<LinksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Links(Name alias, Table<LinksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.links</code> table reference
     */
    public Links(String alias) {
        this(DSL.name(alias), LINKS);
    }

    /**
     * Create an aliased <code>public.links</code> table reference
     */
    public Links(Name alias) {
        this(alias, LINKS);
    }

    /**
     * Create a <code>public.links</code> table reference
     */
    public Links() {
        this(DSL.name("links"), null);
    }

    public <O extends Record> Links(Table<O> child, ForeignKey<O, LinksRecord> key) {
        super(child, key, LINKS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public Identity<LinksRecord, Long> getIdentity() {
        return (Identity<LinksRecord, Long>) super.getIdentity();
    }

    @Override
    @NotNull
    public UniqueKey<LinksRecord> getPrimaryKey() {
        return Keys.LINKS_PKEY;
    }

    @Override
    @NotNull
    public List<UniqueKey<LinksRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.LINKS_URL_KEY);
    }

    @Override
    @NotNull
    public Links as(String alias) {
        return new Links(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Links as(Name alias) {
        return new Links(alias, this);
    }

    @Override
    @NotNull
    public Links as(Table<?> alias) {
        return new Links(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Links rename(String name) {
        return new Links(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Links rename(Name name) {
        return new Links(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Links rename(Table<?> name) {
        return new Links(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(
        Class<U> toType,
        Function4<? super Long, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from
    ) {
        return convertFrom(toType, Records.mapping(from));
    }
}
