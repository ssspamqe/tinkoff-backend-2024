/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.AclexplodeRecord;

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
public class Aclexplode extends TableImpl<AclexplodeRecord> {

    private static final long serialVersionUID = 1L;

    public static final Aclexplode ACLEXPLODE = new Aclexplode();

    @Override
    @NotNull
    public Class<AclexplodeRecord> getRecordType() {
        return AclexplodeRecord.class;
    }

    public final TableField<AclexplodeRecord, Long> GRANTOR = createField(DSL.name("grantor"), SQLDataType.BIGINT, this, "");

    public final TableField<AclexplodeRecord, Long> GRANTEE = createField(DSL.name("grantee"), SQLDataType.BIGINT, this, "");

    public final TableField<AclexplodeRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), SQLDataType.CLOB, this, "");

    public final TableField<AclexplodeRecord, Boolean> IS_GRANTABLE = createField(DSL.name("is_grantable"), SQLDataType.BOOLEAN, this, "");

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR.array())
        });
    }

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public Aclexplode(String alias) {
        this(DSL.name(alias), ACLEXPLODE);
    }

    public Aclexplode(Name alias) {
        this(alias, ACLEXPLODE);
    }

    public Aclexplode() {
        this(DSL.name("aclexplode"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public Aclexplode as(String alias) {
        return new Aclexplode(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public Aclexplode as(Name alias) {
        return new Aclexplode(alias, this, parameters);
    }

    @Override
    @NotNull
    public Aclexplode as(Table<?> alias) {
        return new Aclexplode(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public Aclexplode rename(String name) {
        return new Aclexplode(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public Aclexplode rename(Name name) {
        return new Aclexplode(name, null, parameters);
    }

    @Override
    @NotNull
    public Aclexplode rename(Table<?> name) {
        return new Aclexplode(name.getQualifiedName(), null, parameters);
    }

    public Aclexplode call(
          String[] acl
    ) {
        Aclexplode result = new Aclexplode(DSL.name("aclexplode"), null, new Field[] {
            DSL.val(acl, SQLDataType.VARCHAR.array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public Aclexplode call(
          Field<String[]> acl
    ) {
        Aclexplode result = new Aclexplode(DSL.name("aclexplode"), null, new Field[] {
            acl
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}