/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLogicalSlotPeekChangesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLogicalSlotPeekChanges extends TableImpl<PgLogicalSlotPeekChangesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgLogicalSlotPeekChanges PG_LOGICAL_SLOT_PEEK_CHANGES = new PgLogicalSlotPeekChanges();

    @Override
    @NotNull
    public Class<PgLogicalSlotPeekChangesRecord> getRecordType() {
        return PgLogicalSlotPeekChangesRecord.class;
    }

    @Deprecated
    public final TableField<PgLogicalSlotPeekChangesRecord, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgLogicalSlotPeekChangesRecord, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgLogicalSlotPeekChangesRecord, String> DATA = createField(DSL.name("data"), SQLDataType.CLOB, this, "");

    private PgLogicalSlotPeekChanges(Name alias, Table<PgLogicalSlotPeekChangesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });
    }

    private PgLogicalSlotPeekChanges(Name alias, Table<PgLogicalSlotPeekChangesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgLogicalSlotPeekChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_PEEK_CHANGES);
    }

    public PgLogicalSlotPeekChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_PEEK_CHANGES);
    }

    public PgLogicalSlotPeekChanges() {
        this(DSL.name("pg_logical_slot_peek_changes"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges as(String alias) {
        return new PgLogicalSlotPeekChanges(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges as(Name alias) {
        return new PgLogicalSlotPeekChanges(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges as(Table<?> alias) {
        return new PgLogicalSlotPeekChanges(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges rename(String name) {
        return new PgLogicalSlotPeekChanges(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges rename(Name name) {
        return new PgLogicalSlotPeekChanges(name, null, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotPeekChanges rename(Table<?> name) {
        return new PgLogicalSlotPeekChanges(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Object, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    public PgLogicalSlotPeekChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotPeekChanges result = new PgLogicalSlotPeekChanges(DSL.name("pg_logical_slot_peek_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgLogicalSlotPeekChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotPeekChanges result = new PgLogicalSlotPeekChanges(DSL.name("pg_logical_slot_peek_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public <U> SelectField<U> mapping(Function3<? super Object, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Object, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
