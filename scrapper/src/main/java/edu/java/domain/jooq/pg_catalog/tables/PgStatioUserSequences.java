/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatioUserSequencesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
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
public class PgStatioUserSequences extends TableImpl<PgStatioUserSequencesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatioUserSequences PG_STATIO_USER_SEQUENCES = new PgStatioUserSequences();

    @Override
    @NotNull
    public Class<PgStatioUserSequencesRecord> getRecordType() {
        return PgStatioUserSequencesRecord.class;
    }

    public final TableField<PgStatioUserSequencesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioUserSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioUserSequencesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatioUserSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatioUserSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioUserSequences(Name alias, Table<PgStatioUserSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioUserSequences(Name alias, Table<PgStatioUserSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatioUserSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_USER_SEQUENCES);
    }

    public PgStatioUserSequences(Name alias) {
        this(alias, PG_STATIO_USER_SEQUENCES);
    }

    public PgStatioUserSequences() {
        this(DSL.name("pg_statio_user_sequences"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatioUserSequences as(String alias) {
        return new PgStatioUserSequences(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatioUserSequences as(Name alias) {
        return new PgStatioUserSequences(alias, this);
    }

    @Override
    @NotNull
    public PgStatioUserSequences as(Table<?> alias) {
        return new PgStatioUserSequences(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatioUserSequences rename(String name) {
        return new PgStatioUserSequences(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatioUserSequences rename(Name name) {
        return new PgStatioUserSequences(name, null);
    }

    @Override
    @NotNull
    public PgStatioUserSequences rename(Table<?> name) {
        return new PgStatioUserSequences(name.getQualifiedName(), null);
    }
}
